package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
	private Scanner sc=new Scanner(System.in);
	private DBHandler handler=new DBHandler();
	
	
	private void addproduct() {
		System.out.println("Enter Product Id:");
		int productId=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Product Name:");
		String productName=sc.nextLine();
		System.out.println("Enter Product Quantity");
		int quantity=sc.nextInt();
		System.out.println("Enter Product Price");
		int price=sc.nextInt();
		
		Product product=new Product(productId,productName,quantity,price);
		
		if(handler.insertProduct(product)) {
			System.out.println("Product has been saved into database");
		}
		else {
			System.out.println("Failed to add product into database");
		}
	}
	
	private void updateProduct() {
		System.out.println("Product Id:");
		int id=sc.nextInt();
		
		Product product=handler.getProduct(id);
		if(product==null) {
			System.out.println("No such product with id"+id);
			return;
		}
		System.out.println("\nProduct ID:"+product.getProductId());
		System.out.println("\nProduct Name:"+product.getProductName());
		System.out.println("\nProduct Quantity:"+product.getQuantity());
		System.out.println("\nProduct Price:"+product.getPrice());
		
		System.out.println();
		System.out.println("Please enter new quantity: ");
		int quantity=sc.nextInt();
		System.out.println("Enter new Price");
		int price =sc.nextInt();
		
		product.setQuantity(quantity);
		product.setPrice(price);
		
		if(handler.updateProduct(product)) {
			System.out.println("Product has been updated");
		}
		else {
			System.out.println("Product has not been updated");
		}
	}
	
	public void displaystore() {
		ArrayList<Product> products=handler.getProducts();
		
		System.out.print(String.format("%-12s %-30s %-10s %.s%n","Product Id","Product Name","Quantity","Price"));
		
		for(Product p: products) {
			System.out.print(p);
		}
	}
	
	private void deleteProduct() {
		System.out.println("Product Id:");
		int id=sc.nextInt();
		
		if(handler.deleteProduct(id)) {
			System.out.println("Product with id"+id+"has been deleted");
		}
		else {
			System.out.println("Product with id"+id+"has not been deleted");
		}
		
	}
	
	
	private int menu() {
		
	
		System.out.println("Store Management ");
		System.out.println("1. Add a new Product");
		System.out.println("2. Delete a Product");
		System.out.println("3. Update a Product");
		System.out.println("4. Display all the Product");
		System.out.println("5. Quit");
		
		int choice;
		do {
			System.out.print("Enter option: ");
			choice=sc.nextInt();

		}while(choice<1 || choice>5);
		return choice;
	}
	public void run() {
		int choice;
		do {
			choice=menu();
			System.out.println();
			
			if(choice==1) {
				addproduct();
			}else if(choice==2) {
				deleteProduct();
			}
			else if(choice==3) {
				updateProduct();
			}
			else if(choice==4) {
				displaystore();
			}
			System.out.println();
		}while(choice!=5);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package main;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
	
	private static Scanner sc;
	private static ArrayList<Shop> shopList=new ArrayList<Shop>();
	private static ArrayList<Customer> custList=new ArrayList<Customer>();
	
	static void menu() {
		System.out.println("1- Add New Item");
		System.out.println("2- Display All Item");
		System.out.println("3- Add Customer Details");
		System.out.println("0- Exit");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opt;
		sc = new Scanner(System.in);
		
		do 
		{
			Shop s=new Shop();
			Customer c=new Customer();
			menu();
			opt=sc.nextInt();
			switch(opt) {
			case 1:
				System.out.println("Enter Item No:");
				s.setNo(sc.nextInt());
				System.out.println("Enter Item Name:");
				sc=new Scanner(System.in);
				s.setName(sc.nextLine());
				System.out.println("Enter Item Price");
				s.setPrice(sc.nextInt());
				s.addNewItem(s);
				c.AddCustomerDetails(c);
				//scustList.add(c);
				shopList.add(s);
				break;
			case 2:
				s.DisplayItems(shopList);
				break;
			case 3:
				_sellOutDetails();
				break;
			default :
				break;
			}
		}
		while(opt!=0);
		

	}
	private static void _sellOutDetails() {
		sc=new Scanner(System.in);
		Customer c=new Customer();
		//String cus_name = "";
		
		//if(cus_name=="") {
			//System.out.println("Enter Customer name");
			//c.setCustomer_name(sc.nextLine());
			//cus_name=c.getCustomer_name();
			//}
		//else
			//c.setCustomer_name(cus_name);
			
		System.out.println("Enter Customer Name");
		c.setCustomer_name(sc.nextLine());
		System.out.println("Enter Item No");
		c.setItem_no(sc.nextInt());
		System.out.println("Enter Product Name");
		sc=new Scanner(System.in);
		c.setItem_name(sc.nextLine());
		System.out.println("Enter Item Qty:");
		c.setPurchase_qty(sc.nextInt());
		//c.getItem_price();
		
		c.AddCustomerDetails(c);
		custList.add(c);
		
		System.out.println("Do you Have More Items? (yes/no)");
		String choice="";
		
		choice=sc.next();
		if(choice.contains("yes")) {
			//again same process of input taking
			_sellOutDetails();
		}
		else {
			//display bill
			//String cus_name="";
			c.DisplayCustomerBill(custList,c.getCustomer_name(),shopList);
			
		}
		
		
		
		
		
	}
	

}

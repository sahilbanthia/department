package main;

import java.util.ArrayList;

public class Shop {
	private int item_no;
	private String item_name;
	private int item_price;
	
	
	
	public int getNo() {
		return item_no;
	}
	public void setNo(int item_no) {
		this.item_no = item_no;
	}
	public String getName() {
		return item_name;
	}
	public void setName(String item_name) {
		this.item_name = item_name;
	}
	public int getPrice() {
		return item_price;
	}
	public void setPrice(int item_price) {
		this.item_price = item_price;
	}
	public void addNewItem(Shop s) {
		this.item_name=s.item_name;
		this.item_no=s.item_no;
		this.item_price=s.item_price;
		
		
	}
	public void DisplayItems(ArrayList<Shop>arr) {
		System.out.println("\n\n");
		if(arr.isEmpty()) {
			System.out.println("No Items");
			return;
		}
		System.out.println("Item No\t\tItem Name\t\tItem Price");
		System.out.println("--------------------------------------------------------------------");
		for(Shop shop:arr) {
			System.out.println(shop.item_no+"\t\t"+shop.item_name+"\t\t\t"+shop.item_price);
		}
		System.out.println("\n\n");
		
	}

}

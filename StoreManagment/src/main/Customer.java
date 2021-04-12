package main;

import java.util.ArrayList;

public class Customer {
	private int customer_id;
	private String customer_name;
	private int purchase_qty;
	private String item_name;
	private int item_no;
	private int item_price;
	private float total_Bill;
	
	//function
	public void AddCustomerDetails(Customer c) 
	{
		
		this.customer_name=customer_name;
		this.item_no=item_no;
		this.purchase_qty=purchase_qty;
		this.item_price=item_price;
		this.item_name=item_name;
		}
	

	public float DisplayCustomerBill(ArrayList<Customer> arr,String cus_name,ArrayList<Shop> shopList) {
		float total=0;

		System.out.println("Item No\t\tItem Quantity\t\tItem Name\t\tItem Price");
		System.out.println("--------------------------------------------------------------------------");
		
		for(Customer c:arr) {
			if(c.customer_name.equals(cus_name)) {
		
				//System.out.println(c.item_no+"\t\t\t"+c.purchase_qty+"\t\t");
		
		for(Shop shop:shopList)
		{
			
			if(shop.getNo()==c.item_no)
			{
				System.out.println(c.item_no+"\t\t\t"+c.purchase_qty+"\t\t"+shop.getName()+"\t\t\t"+shop.getPrice());
		total+=c.getPurchase_qty()*shop.getPrice();
		    }
		}
		}
		}
		System.out.println("--------------------------------------------------------------------------");
		
		System.out.println("Total Bill Before Discount =="+total);
		float dis=0;
		if(total<200) {
			dis=(total*15)/100;
		}
		else if(total>=200 && total <700) {
			dis=(total*25)/100;
		}
		else 
			if(total>700) {
				dis=(total*50)/100;
			}
			System.out.println("--------------------------------------------------------------------------");
			
			System.out.println("Total Bill After Discount =="+(total-dis));
			for(Customer cus:arr) {
				if(cus.getCustomer_name().equals(cus_name)) {
					cus.setTotal_Bill(total);
				}
		}
		System.out.println("--------------------------------------------------------------------------");
		return(total -dis);
	}


	//getter setter
	public int getCustomer_id() {
		return customer_id;
	}
	public int getPurchase_qty() {
		return purchase_qty;
	}

	public void setPurchase_qty(int purchase_qty) {
		this.purchase_qty = purchase_qty;
	}

	public int getItem_no() {
		return item_no;
	}

	public void setItem_no(int item_no) {
		this.item_no = item_no;
	}

	public float getTotal_Bill() {
		return total_Bill;
	}

	public void setTotal_Bill(float total_Bill) {
		this.total_Bill = total_Bill;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public int getItem_price() {
		return item_price;
	}


	public void setItem_price(int item_price) {
		this.item_price = item_price;
	}
	public String getItem_name() {
		return item_name;
	}


	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}


}

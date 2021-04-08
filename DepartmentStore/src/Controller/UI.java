package Controller;
import java.util.*;

import Model.Admin;
import Model.productData;

public class UI extends ProductDetail implements AdminDetail{
	Scanner sc=new Scanner(System.in);
	Admin ad=new Admin();
	productData pd=new productData();
	@Override
	public void adminDetail() {
		System.out.println("Enter your AdminId");
		ad.setAdminId(sc.next());
		System.out.println("Enter your Password");
		ad.setAdminPassword(sc.next());
		System.out.println("Enter Admin name");
		ad.setAdminName(sc.next());
		System.out.println("Enter Your Phone No");
		ad.setPhoneNumber(sc.nextLong());
	}	
	@Override
	public productData ProductDetail() {
		System.out.println("Product id");
		pd.setProductId(sc.nextInt());
		System.out.print("Which type of Product");
		pd.setProductName(sc.next());
		System.out.println("Quantity of the Product");
		pd.setProductQuantity(sc.nextInt());
		System.out.println("Price of the product");
		pd.setProductPrice(sc.nextInt());
		
		
		
		return pd;
		
	
		
	}
}

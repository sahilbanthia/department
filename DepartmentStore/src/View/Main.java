package View;
import Controller.*;
import Model.*;

import BussinessLogic.BillCalculator;


public class Main {

	public static void main(String[] args) {
		productData obj1=new productData();
		UI obj=new UI();
		obj.adminDetail();
		obj1=obj.ProductDetail();
		BillCalculator billcalculator=new BillCalculator();
		billcalculator.BillCalculator(obj1);
		// TODO Auto-generated method stub

	}

}

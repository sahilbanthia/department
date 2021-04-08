package BussinessLogic;
import Model.productData;

public class BillCalculator {
	int quantity=0;
	int price=0;
	int totalbill=0;
	public void BillCalculator(productData obj) {
		totalbill=obj.getProductQuantity()*obj.getProductPrice();
		System.out.println("Total amount to be paid is"+totalbill);
		
	}

}

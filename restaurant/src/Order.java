import java.util.Date;
import java.util.Scanner;
public class Order {
     int orderId;
	Date orderDate=new Date();
	item ordercart[];
	int customerId;
	Scanner s1=new Scanner(System.in);
	int h;
	public Order(int id,int n)
	{
	   orderId=id;
	   ordercart=new item[n];
	  for(int i=0;i<ordercart.length;i++)
	  {
		  System.out.println("enter itemId");
		  h=s1.nextInt();  
	  

		
		
		 for(int q=0;q<Menu.itemMenu.length;q++)
		 {
		 if(h==Menu.itemMenu[q].itemId)
			 
		 	{
			 ordercart[i]=Menu.itemMenu[q];
		
			break;
		 	}
			 
 }
	  }	
 }
}
	
	
	

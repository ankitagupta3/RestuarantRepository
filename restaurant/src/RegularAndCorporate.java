
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.Scanner;

public class RegularAndCorporate implements Serializable{

	
	   
		int customerId;
		String firstName;
		String custType;
		transient int age;
		transient String email;
		
public RegularAndCorporate(int customerId, String firstName,String custType,int age,String email)
	{
		this.customerId = customerId;
		this.firstName = firstName;
		this.custType=custType;
		this.age = age;
		this.email = email;
			
	}
/*public String toString() {
	return "customer [customerId=" + customerId + ", firstName=" + firstName
			+ ", lastName=" + lastName + ", age=" + age
			 + ", email=" + email + "]";
}	

*/
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter customerid");
	int customerId=sc.nextInt();
	System.out.println("enter first name");
	String firstName=sc.next(); 
	
	System.out.println("enter customer type");
	System.out.println("enter (regular) for regular customer and (corporate) for corporate customer ");
	String custType=sc.next();
	System.out.println("enter customer age");
	int age=sc.nextInt();
	System.out.println("enter customer email");
	String email=sc.next();
	
	if(custType.equals("corporate"))
	{
		ObjectOutputStream dout = null;
		try {
			
			
			
			RegularAndCorporate cm= new RegularAndCorporate( customerId,firstName,custType,age,email);
	
			
			dout = new ObjectOutputStream(new FileOutputStream("D:/java/restaurant/src/corporateCustomer.txt"));
		
			dout.writeObject(cm);
			

			dout.close();
			System.out.println("Object serialized successfully in a file");
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	else
	{
		ObjectOutputStream dout1 = null;
		try {
			
			
			
			RegularAndCorporate cm1= new RegularAndCorporate( customerId,firstName,custType,age,email);
	
			
			dout1 = new ObjectOutputStream(new FileOutputStream("D:/java/restaurant/src/regularCustomer.txt"));
		
			dout1.writeObject(cm1);
			

			dout1.close();
			System.out.println("Object serialized successfully in a file");
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
		
}
	
}
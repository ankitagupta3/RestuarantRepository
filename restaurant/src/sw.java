import java.util.*;

public class sw {
	public static void main(String[] args) {
		int result=0;
	System.out.println("app");
	System.out.println("enter 2 numbers");
	Scanner sc=new Scanner(System.in);
	int first=sc.nextInt();
	int second=sc.nextInt();
	try{
	/* first=Integer.parseInt(args[0]);
	 second=Integer.parseInt(args[1]);*/
	result=first/second;
	System.out.println(result);
	}
	catch(Exception ex){
	
		System.err.println("provide 2 arguements");
		System.out.println(ex);
	 }
	finally
	{
		System.out.println("sahi kr itna paisa mai tujhe yha pr jhak marna ka liya deta hai");
	}
	System.out.println(result);
}
}


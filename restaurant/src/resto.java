import java.util.*;

public class resto implements IRestaurant {
	static int count = 0;
	static Order orderlist[] = new Order[10];
	static int orderId = 1000;
	double cost=0;
	double bill=0;
	Customer customerList[] = {
			new RegularCustomer(1, "riya", "11-10-1992", 476547578, "regular",
					"56 huda", 10),
			new RegularCustomer(2, "ravi", "18-5-1889", 476546578, "regular",
					"57 huda", 10),
			new CorporateCustomer(3, "rajat", "19-4-1994", 6666666,
					"corporate", "45 delhi", 12, 5),
			new CorporateCustomer(4, "raja", "19-4-1990", 6666677, "corporate",
					"49delhi", 14, 6), };

	public void showmenu() {
		/*for (int i = 0; i <= 3; i++) {
			System.out.println(Menu.itemMenu[i].itemId + "\t");
			System.out.println(Menu.itemMenu[i].itemName + "\t");
			System.out.println(Menu.itemMenu[i].itemPrepTime + "\n");

		}*/

		
		Iterator<item>itr=Menucol.a1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());		
			//System.out.println(ref.length());
		}
		
		
		
		
		
	}

	public void takeorder(){
			System.out.println("enter the no. of items");
			int n;
			Scanner sc=new Scanner(System.in);
			n=sc.nextInt();
	orderlist[count]=new Order(orderId,n);
	System.out.println(orderlist[count].orderDate + "\t" +orderlist[count].orderId);
	for(item K:orderlist[count].ordercart){
		System.out.println(K.itemName);
		if(K.itemId==10)
		{
			bill=500;
		}
		
		else if(K.itemId==11)
		{
			bill=1000;
		}
		
		else if(K.itemId==12)
		{
			bill=2000;
		}
		
		else if(K.itemId==13)
		{
			bill=3000;
		}
		
	cost=cost+bill;
	
	}
	
	
	
	
	
	orderId++;
	count++;
	System.out.println("enter customerid");
int customerId1;
	Scanner sc2=new Scanner(System.in);
	customerId1=sc2.nextInt();
	for(int j=0;j<customerList.length;j++)
	{
		if(customerId1==customerList[j].customerId)
		{
			String l=customerList[j].custType;
			 if(l.equals("regular"))
			 {
				 System.out.println("you are a regular customer");
					showRegCustomerOffer(customerId1); 
			 }
				
             else
		   {
        	 System.out.println("you are a corporate customer");
        	 showCorpCustomerOffer(customerId1);
				 
		   }
		
		}
	}

	}

	public void checkstatus(int orderid) {

		int p1 = orderid;

		for (int p = 0; p < count; p++) {
			if (p1 == orderlist[p].orderId) {
				System.out.println(orderlist[p].orderDate + "\t"
						+ orderlist[p].orderId);
				for (item K : orderlist[p].ordercart) {
					System.out.println(K.itemName);

				}
			}

		}
	}

	public void showRegCustomerOffer(int custId) {
		double cost1;
		Date d2=new Date();
		System.out.println("offer");
		if((d2.getDay()==6||d2.getDate()==7)&&cost>1000)
		{
			cost1=0.90*cost;
			System.out.println("your total cost:");
			System.out.println(cost1);
			
		}
		

	}

	public void showCorpCustomerOffer(int corpId) {System.out.println("corp");
	int discount=0;
	if(cost>1000)
	   {
		discount=(int)(cost/1000)*50;
		cost=cost-discount;
	   }
	System.out.println("your bill is" +cost);

	}

	public static void main(String[] args) {
		resto r = new resto();
		int choice = 0;
		String choice2;
		System.out.println("1:show menu");
		System.out.println("2:takeorder");
		System.out.println("3:status called");
		System.out.println("4:show offer");
		System.out.println("5:show corporate offer");
		System.out.println("enter ur choice");

		do {
			Scanner scanner = new Scanner(System.in);

			choice = scanner.nextInt();

			switch (choice) {
			case 1: // System.out.println("1:show menu");
				r.showmenu();
				break;
			case 2:// System.out.println("takeorder");
				r.takeorder();
				break;
			case 3:
				System.out.println("enter the orderid");
				Scanner s2 = new Scanner(System.in);
				int d;
				d = s2.nextInt();// System.out.println("status called");
				r.checkstatus(d);
				break;
			case 4:// System.out.println("status called");
				r.showRegCustomerOffer(1);
				break;
			case 5: // System.out.println("show corporate offer");
				r.showCorpCustomerOffer(2);
				break;

			default:
				System.out.println("wrong input enter.....");
				System.exit(1);
			}
			System.out.println("press y to continue and n to exit");
			choice2 = scanner.next();

		} while (choice2.equals("y"));
	}
}
import java.util.*;


public class Collection {
	public static void main(String[] args) {
		/*String[] arr={"noida","delhi","gurgaon"};
		System.out.println(arr);*/
	//ArrayList a1=new ArrayList();  //growable
//ArrayList<String> a1=new ArrayList<String>();
//Set<String> a1=new HashSet<String>();
		//LinkedList<String> a1=new LinkedList<String>();
		TreeSet<String> a1=new TreeSet<String>();
		
		
	
	a1.add("noida");
	a1.add("delhi");
	a1.add("gurgaon");
	a1.add("mumbai");
	a1.add("panipat");
	/*System.out.println(a1);
	a1.remove(1);
	System.out.println(a1);
	System.out.println(a1.size());
	a1.add(10);
	System.out.println(a1);
	a1.add(10.65f);
	System.out.println(a1);
	a1.add("panipat");
	a1.remove("gurgaon");
	System.out.println(a1);
	for (Object object : a1) {
		System.out.println(object);
		
	}*/
	
/*Iterator itr=a1.iterator();
while(itr.hasNext())
{
	Object ref=itr.next();
	System.out.println(ref);
}*/
	
/*Iterator itr=a1.iterator();
while(itr.hasNext())
{
	String ref=(String) itr.next();
	System.out.println(ref.length());
}
	*/
	
	
	System.out.println(a1);
	
	System.out.println(a1.descendingSet());
	
	
	
	
	
	
	}
	
	
	

}


 import java.util.LinkedList;
import java.util.*;


public class User {
	public static void main(String[] args) {
		//ArrayList<Emp> a1=new ArrayList<Emp>();
		HashSet<Emp> a1=new HashSet<Emp>();
		a1.add(new Emp(1000,"frfr"));
		a1.add(new Emp(2400,"sshjh"));
		a1.add(new Emp(7004,"frfrfrfr"));
		System.out.println(a1);
		boolean exist=a1.contains(new Emp(1000,"frfr"));
		System.out.println(exist);


	
	}	

}


public class Emp implements Comparable  {
	int Salary;
	String name;
	public Emp(int salary, String name) {
		super();
		this.Salary = salary;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Emp [Salary=" + Salary + ", name=" + name + "]";
	}
	
	public boolean equals(Object obj)//override equals
	{
		Emp paramObject=(Emp)obj;
		if(this.Salary==paramObject.Salary &&(this.name==paramObject.name))
			return true;
		return false;
			
		
	}
	
	public int hashCode()//override hashcode
	{
		return this.Salary+this.name.hashCode();	}
public static void main(String[] args) {
	Emp e1=new Emp(10000,"abc");
	Emp e2=new Emp(10000,"abc");
	//System.out.println(e1==e2);
	System.out.println(e1.equals(e2));
	System.out.println(e1.hashCode());
	
	
	
	
	
}
}

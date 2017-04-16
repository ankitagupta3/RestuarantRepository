
public abstract class Customer {
	int customerId;
	String custName,custDOB;
	int custMobile;
	String custType,custAddress;
	Customer(int customerId,String custName,String custDOB,int custMobile,String custType,String custAddress)
	{
		this.customerId=customerId;
		this.custName=custName;
		this.custDOB=custDOB;
		this.custMobile=custMobile;
		this.custType=custType;
		this.custAddress=custAddress;
	}

}

class RegularCustomer extends Customer
{
	int customerPoints;
	RegularCustomer(int customerId1,String custName1,String custDOB1,int custMobile1,String custType1,String custAddress1,int customerPoints)
	{
	super(customerId1,custName1,custDOB1,custMobile1,custType1,custAddress1);
	this.customerPoints=customerPoints;
	}
}

class CorporateCustomer extends Customer
{
	int regNo;
	float discountPercent;
	CorporateCustomer(int customerId,String custName,String custDOB,int custMobile,String custType,String custAddress,int regNo,
	float discountPercent)
	{
		super(customerId,custName,custDOB,custMobile,custType,custAddress);
		this.regNo=regNo;
		this.discountPercent=discountPercent;
		
	}
	
	
}
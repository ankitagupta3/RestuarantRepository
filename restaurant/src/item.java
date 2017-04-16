
public class item {

		
	int itemId,itemPrepTime; 
	 String itemName;
	 item(int itemId,String itemName,int itemPrepTime)
	 {
		 this.itemId=itemId;
		 this.itemName=itemName;
		 this.itemPrepTime=itemPrepTime;
		 
	 }
	@Override
	public String toString() {
		return "item [itemId=" + itemId + ", itemPrepTime=" + itemPrepTime
				+ ", itemName=" + itemName + "]";
	}
	

}
	

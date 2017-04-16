import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class Menucol {

		
	
	 static ArrayList<item> a1=new ArrayList<item>();
	item itemMenu[]=new item[5];
	 static {
			BufferedReader br=null;
			try
			{
				String arr[];
				String scurrentLine;
				br=new BufferedReader(new FileReader("D:/java/question4/src/Item.txt"));
				for(int i=0;i<4;i++)
				{
				while((scurrentLine=br.readLine())!=null)
				{
					arr=scurrentLine.split(",");
					int ar=Integer.parseInt(arr[0]);
					int ar1=Integer.parseInt(arr[2]);
			
				a1.add(new item(ar,arr[1],ar1));
				i++;
			
				}
				}
			/*	for(int j=0;j<4;j++)
				{
					System.out.println(itemMenu[j].itemIditemId,itemPrepTime; 
	 String itemName;);
				}
				*/
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			
			finally{
				
			try
			{
				if(br!=null)br.close();
			}
			catch(IOException ex)
			{
				ex.printStackTrace();
			}
		}
	 
	
	

}
	@Override
	public String toString() {
		return "Menucol [itemMenu=" + Arrays.toString(itemMenu) + "]";
	}
}


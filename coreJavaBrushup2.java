import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class coreJavaBrushup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] arr2= {1,2,3,4,5,6,7,8,9,10};
		//get the output for multiples of 2 from array -->2,4,6,8,10
		for(int i=0;i<arr2.length;i++)
		{
			if(arr2[i] %2==0)
			{
				System.out.println(arr2[i]);
			}
			else
			{
				System.out.println(arr2[i] +" is not multiple of 2");
			}
		}
			
			//check if an array has atleast one multiple of 2-- use break
			for(int j=0;j<arr2.length;j++)
			{
				if(arr2[j] %2==0)
				{
					System.out.println(arr2[j]);
					break;
				}
				else
				{
					System.out.println(arr2[j] +" is not multiple of 2");
				}
			}
	/* assignment
	 * 
	 * 	int[] numbers= new int[5];
	 
		 numbers[0]=5;
		 numbers[1]=6;
		 numbers[2]=7;
		 numbers[3]=8;
		 numbers[4]=9;
		 int j=numbers.length;
		 
		 //printing the first Element
		 System.out.println(numbers[0]);
		 //printing the last Element
		 System.out.println(numbers[4]);
		 
		 //Reverse  order of array
		  for(int i=j-1;i>0;i--)
		  {
		      System.out.println(numbers[i]);
		  }
		  //element count
		  System.out.println(j);
			*/	
			
			//array list--> grow dynamically in size of array
			ArrayList<String> a= new ArrayList<String>();
			a.add("sreeja");
			a.add("dasari");
			a.add("selenium");
			a.addFirst("highlight");
			a.add("srej");
			a.remove(4);
			System.out.println(a.get(3));
			System.out.println("*******");
			//For loop to arraylist
			for(int k=0;k<a.size();k++)
			{
				System.out.println(a.get(k));
			}
			System.out.println("*******");
			//enhanced for loop to array list
			for(String str:a)
			{
				System.out.println(str);
			}
			System.out.println("*******");
			//item is present 
			System.out.println(a.contains("dasari"));
			
			System.out.println("*******");
			//Convert Array into arraylist
			String [] Name= {"sreeja","dasari","selenium"};	
			List<String> NAL =Arrays.asList(Name);
		Boolean ans	=NAL.contains("seleniu=m");
		System.out.println(ans);
			
	}
}
		
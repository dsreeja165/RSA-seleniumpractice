
public class coreJavaBrushup1 {

	
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	        int integer=3;
			String stri= "sreeja";
			Boolean Bool= true;
			char character='c';
			Double flo= 8.99;
		
	System.out.println(integer + " is the integer");
	System.out.println(stri);
	System.out.println(Bool);
	System.out.println(character);
	System.out.println(flo);
	
	//Arrays-
	//array built with integers are called integer arrays
	int[] arr= new int[5];
	arr[0]=5;
	arr[1]=6;
	arr[2]=7;
	arr[3]=8;
	arr[4]=9;
	//System.out.println(arr[0]);
	
	int[] arr2= {1,2,3,4,5,6,7,8,9};
	
	//for loop
	for(int i=0; i<arr.length; i ++)
	{
		System.out.println(arr[i]);	
	}
	
	//for loop for arr2
	for(int j=0;j<arr2.length;j++) 
	{
		System.out.println(arr2[j]);	
	}
	//enchanced for loop for integer array
	for(int m:arr) {
		System.out.println(m);
	}
	
	
	//array built with strings are called are string arrays
	String [] Name= {"sreeja","dasari","selenium"};	
	for(int k=0;k<Name.length;k++)
	{
	System.out.println(Name[k]);
	}
	
	//enhanced for loop for string array
	for(String s: Name)
	{
		System.out.println(s);
	}
		
	}

}

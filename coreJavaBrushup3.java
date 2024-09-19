
public class coreJavaBrushup3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //string is a object that represents  sequence of characters
		//string literal
		String s = "sreeja dasari selenium";
		String s1= "sreeja dasari selenium";
		//New operator
		String s2= new String("selenium");
		String s3= new String("selenium");
		
		String[] Splitedarray = s.split("dasari");
		System.out.println(Splitedarray[0]);
		System.out.println(Splitedarray[1]);
		//System.out.println(Splitedarray[2]);
		System.out.println(Splitedarray[1].trim());
		
		for(int i =0;i<s.length();i++) 
		{
			System.out.println(s.charAt(i));
			
		}
		for(int j=s.length()-1;j>=0;j--) 
		{
			System.out.println(s.charAt(j));
		}
		
	}

}

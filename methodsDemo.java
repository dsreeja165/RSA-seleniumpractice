
public class methodsDemo {

	 public String getData() {
		 System.out.println("Hello world");
		 return "sreeja";
	 }
	 public static String getData2() {
		 return "sreeja2";
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		methodsDemo D= new methodsDemo();
		String NAME=D.getData();
		System.out.println(NAME);
		methodsDemo2 D2= new methodsDemo2();
		String NAME1=D2.setData();
		System.out.println(NAME1);
		System.out.println(getData2());

	}

}

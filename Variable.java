package gec;

public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Muhammad";
		System.out.println(name);
		System.out.println("Hello "+name);
		
		int myNum=18;
		System.out.println(myNum);
		//changing the value from 18 to 20
		myNum=20;
		//myNum is now 20
		System.out.println(myNum);
		final int myNum = 18;
		myNum = 20;
		//an error will be generated; values cannot be assigned to a final variable
		
		String first_name="Muhammad ";
		String last_name="Kuna ";
		String surn_name="Muhammad";
		String full_name=first_name +last_name +surn_name;
		System.out.println(full_name);
		
		int x=18;
		int y=06;
		int z=04;
		System.out.println(x+y+z);
		
		int real = 5;
		float oat = 5.99f;
		char Letter = 'D';
		boolean Bool = true;
		String ring = "Hello";
		
	}

}
	



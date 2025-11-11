package object_task;

public class Define_Object {

// instance variables   
// or a non static field 
	int a;
	int b;

// here method with int return type 
	public int add() {
		return a + b;
	}

// method with void return type (prints only)	
	public void showdata() {
		System.out.println("return type due to put void :" + (a + b));
	}

	public static void main(String[] args) {
// creating a object 		
		Define_Object A1 = new Define_Object();
// Assingning a values
		A1.a = 12;
		A1.b = 24;

		int sum = A1.add();
		System.out.println("no return value int datatype :" + sum);

		A1.showdata();
		
// it gives error while println not show void s println
		
//		System.out.println("third print"+(A1.showdata));
		
//		println() needs a value to print — like:
//
//			number
//
//			string
//
//			boolean
//
//			object reference
		
		
	}

}

 //--------------------------Notes---------------------------//
// declared inside class but outside any method, constructor, block.


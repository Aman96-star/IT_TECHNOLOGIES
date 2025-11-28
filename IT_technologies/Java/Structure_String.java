package String_task;

public class Structure_String {

	public static void main(String [] args) {

		//1 ways to string object intalize
//		
//		String s1="Aman";
//		String s2 =new String("Aman");
//		
//		// itern method
//		String s2intern =s2.intern();
//		String s3 =String.valueOf("Aman");
//		
//		System.out.println(s1==s2);
//		System.out.println(s1==s2intern);
//		System.out.println(s1==s3);

	
		//2 intern() method
		
		// [case 1]
//		String s1 = "Java";  
//		String s2 = new String("Java");
//		System.out.println(s1 == s2); // false
//		String s3 = s2.intern();
//		System.out.println(s1 == s3); // true
		
		// [case 2]
//		String s1 = "Java";
//		String s2 = new String("Java");
//		String s3 = s2.intern();
//		System.out.println(s1 == s3); // true
//		System.out.println(s1 == s2); // false
		
		// [case 3]
//      s1 literal moved in SCP memory 
//		s2 new keyword stored in heap memory
//		never ==
		
		// [case 4]
		String s1 =new String("Aman");
		String s2 =new String("Aman");
		System.out.println(s1==s2);   //false
		System.out.println(s1.equals(s2));   //true same content thats way

		// here two new object created in heap memory named Aman string while one obj in scp area 
	}
	
}

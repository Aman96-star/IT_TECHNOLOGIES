package inheritence_task;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
	Dog A1=new Dog();
//	A1.bark();
		Scanner ob =new Scanner(System.in);
		int choice =ob.nextInt();
		switch(choice) {
		case 1:A1.bark();
		break;
		case 2:A1.walk();
		break;
		case 3:A1.eat();
		break;
		default:System.out.println("invalid input");
		}
	}
}





// Main class where i call all the class
// import from multilevel inheritence
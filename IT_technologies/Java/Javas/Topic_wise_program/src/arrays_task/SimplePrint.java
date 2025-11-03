package arrays_task;
import java.util.*;

public class SimplePrint {

	public static void main(String[] args) {
		Scanner ob =new Scanner(System.in);
		int x =ob.nextInt();
		int arr[]=new int[x];
		for(int i=0;i<x;i++) {
			arr[i]=ob.nextInt();
			System.out.println(arr[i]);

		}
		
	}

}

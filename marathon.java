import java.util.*;

public class marathon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int distance;
		do {
			System.out.println("Enter a starting distance(between 5km to 8km):");
			distance = sc.nextInt();
		}while(distance<5 || distance>8);
		
		for(int i=distance;i > 0;i--) {
			System.out.println("Distance to run: " + i);
			if(i==distance-1) {
				System.out.println("Good start, keep it up!");
			}
			else if(i < 3) {
				System.out.println("Almost there!");
			}
		}
		System.out.println("Done for the day!");
	}

}

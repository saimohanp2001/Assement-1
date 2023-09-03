import java.util.*;
public class profitLoss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter profit,loss values: ");
		for(int i=0;i < size;i++) {
			arr[i] = sc.nextInt();
		}
		int maximum = Integer.MIN_VALUE;
		int sum = arr[0];
		for(int i=1;i < size;i++) {
			sum = Math.max(arr[i], (sum+arr[i]));
			maximum = Math.max(maximum, sum);
			if(maximum < 0) {
				maximum = 0;
			}
		}
		System.out.println(maximum);
	}

}

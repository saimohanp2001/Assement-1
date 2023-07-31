import java.util.*;
public class fairTreasure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter treasure values: ");
		for(int i=0;i < size;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int leftSum=arr[0];
		int rightSum=arr[size-1];
		int i=0;
		int j=size-1;
		while(i < j) {
			if(leftSum < rightSum) {
				i++;
				leftSum+=arr[i];
			}
			else if(leftSum > rightSum) {
				j++;
				rightSum+=arr[j];
			}
			else {
				break;
			}
		}
		if(i == j-1) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}

}

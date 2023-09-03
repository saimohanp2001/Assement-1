import java.util.*;
public class nameOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students: ");
		int size = sc.nextInt();
		String[] str = new String[size];
		System.out.println("Enter names of students: ");
		for(int i=0;i < size;i++) {
			str[i] = sc.next();
		}
		for(int i=0;i < size;i++) {
			for(int j=i+1;j < size;j++) {
				if(str[i].compareTo(str[j])>0) {
					String temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		for(int i=0;i < size;i++) {
			System.out.println(str[i]);
		}
	}

}

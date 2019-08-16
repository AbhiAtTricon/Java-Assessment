import java.util.Scanner;

public class AdditivePrimes {
	static boolean checkPrime(int no) {
		int c = 0;
		for (int i = 1; i <= no; i++) {
			if (no % i == 0)
				c++;
		}
		if (c == 2)
			return true;
		else
			return false;
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements in array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter elements of array");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int temp[] = new int[n];
		int p = 0;
		for (int i = 0; i < arr.length; i++) {
			if (checkPrime(arr[i]) == true) {
				temp[p] = arr[i];

			}
			p++;
		}

		/*
		 * for(int i=0;i<temp.length;i++) System.out.println(temp[i]);
		 */

		for (int i = 0; i < temp.length; i++) {
			if (temp[i] > 0) {
				int sum = 0, r = 0;
				int var = temp[i];
				while (var != 0) {
					r = var % 10;
					sum += r;
					var = var / 10;
				}

				if (checkPrime(sum) == true) {
					System.out.print(temp[i] + " ");
				}

			}
		}

	}

}

//Time Complexity: O(n^2)
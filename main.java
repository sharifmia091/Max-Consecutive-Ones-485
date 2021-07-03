import java.util.Scanner;
public class MaxConsecutiveOnes485 {

	public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			System.out.println("input the number arr: ");
			String num = input.nextLine();
			String[] number= num.split(",");
			int[] arr = new int[number.length];
			for(int i=0;i<arr.length;i++) {
				arr[i]=Integer.parseInt(number[i]);
			}
			maxConsecutiveOne(arr);
	}
	
	public static void maxConsecutiveOne(int[] arr) {
		int globlaMax=0;
		int localMax=0;
		
		for (int i=0; i<arr.length; i++) {
			if (arr[i]==0) {
				globlaMax= Math.max(localMax, globlaMax);
				localMax=0;
			}
			else
				localMax++;
		}
		globlaMax=Math.max(localMax, globlaMax);
		
		System.out.printf("the max Consecutive One : %d", globlaMax);
		
	}

}

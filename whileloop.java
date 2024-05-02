package corejava;

public class whileloop {
	public static void main(String[] args) {
//		int LOWERBOUND = 9;
//		int UPPERBOUND = 899;
//		int sum = 0;
//		int number  = LOWERBOUND;
//		while(number<=UPPERBOUND) {
//			sum+= number;
//			number ++;
//		}
		
//		System.out.println(sum);
//		int LOWERBOUND = 1;
//		int UPPERBOUND = 1000;
//		int sum = 0;
//		int number  = LOWERBOUND;
//		while(number<=UPPERBOUND) {
//			sum+= number*number;
//			number++;
//		}
//		System.out.println(sum);
		
		int LOWERBOUND = 0;
		int UPPERBOUND = 10;
		int sumOdd = 0, sumEven =0;
		int number  = LOWERBOUND;
		for (int i=0;i<=UPPERBOUND;i++) {
			if(i%2==0) {
				sumEven+= i;
			}else {
				sumOdd+= i;
			}
		}
		System.out.println(sumEven);
		System.out.println(sumOdd);
	}
}

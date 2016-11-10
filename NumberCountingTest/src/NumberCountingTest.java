import java.util.*;

public class NumberCountingTest {
	public static void main(String[] argv) {
		NumberCounter numberCounter = new NumberCounter();
		Scanner scan = new Scanner(System.in);
		int num1, num2, num3;
		int[] numberCountArray = new int[10];
		
		num1 = Integer.parseInt(scan.nextLine().trim());
		num2 = Integer.parseInt(scan.nextLine().trim());
		num3 = Integer.parseInt(scan.nextLine().trim());
		
		numberCounter.setNumbers(num1, num2, num3);
		numberCountArray = numberCounter.countNumber();
		
		for (int i = 0; i < 10; i++) {
			System.out.println(numberCountArray[i]);
		}
		
		scan.close();
	}
}

class NumberCounter {
	int num1, num2, num3;
	int multiple;
	int[] count = new int[10];
	
	NumberCounter() {
		
	}
	
	void setNumbers(int num1, int num2, int num3) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}
	
	int[] countNumber() {
		multipleNumbers();
		String temp = "" + multiple;
		String sumString[] = temp.split("");
		for (int i = 0; i < sumString.length; i++) {
			count[Integer.parseInt(sumString[i])]++;
		}
		return count;
	}
	
	void multipleNumbers() {
		multiple = num1 * num2 * num3;
	}
}
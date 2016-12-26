import java.util.Scanner;

public class CheckSortedTest {
	public static void main(String[] argv) {
		Scanner scan = new Scanner(System.in);
		int[] inputArray = new int[8];
		int result;
		
		for(int i = 0; i < 8; i++) {
			inputArray[i] = scan.nextInt();
		}
		CheckSort checkSort = new CheckSort(inputArray);
		result = checkSort.getSortType();
		if(result == 7) {
			System.out.println("ascending");
		} else if(result == -7) {
			System.out.println("descending");
		} else {
			System.out.println("mixed");
		}
		
		
		scan.close();
	}
}

class CheckSort {
	private int[] array = new int[8];
	int tempType = 0;
	int sortType;
	
	public CheckSort(int[] targetArray) {
		array = targetArray;
	}
	public int getSortType() {
		for(int i = 0; i < 7; i++) {
			if(array[i] + 1 == array[i + 1]) {
				tempType++;
			} else if(array[i] - 1 == array[i + 1]) {
				tempType--;
			} else {
				
			}
		}
		
		return tempType;
	}
}

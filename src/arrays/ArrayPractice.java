package arrays;

import java.util.Random;

public class ArrayPractice {
public static void main(String[] args) {

	Random ran = new Random();
	int sum = 0;
	int Int;
	int array[] = new int [50];
	for(int i = 0;i < array.length; i++) {
		Int = ran.nextInt(100);
		array[i] = Int;
	}
	for(int m = 0; m < array.length; m++) {
	sum += array[m];
	}
	System.out.println("The average is..." + (sum/array.length));
}
}

package utils;

public class Math {
	
	public static long factorial(int num) {
		if(num <= 0) {
			return 1;
		}
		return num * factorial(num-1);
	}
	public static long factorialLoop(int num) {
		int total = 1;
		for(int i=0; i < num; i++) {
			total = total * (num-i);
		}
		return total;
	}
}



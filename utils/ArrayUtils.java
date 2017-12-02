package utils;

public class ArrayUtils {
	

	
	
	public static int[] reverse(int[] arr) {
		int a = arr.length;
		int[] arr2 = new int[a];
		for(int j= a-1,i = 0; i<a; i++, j--) {
			arr2[i] = arr[j]; 
		}
		return(arr2);
	}
	



	static String empty = "";
	public static String stringifyArray(int[] args) {
		for(int i = 0; i< args.length ; i++ ) {
			if(i != args.length - 1) {
			empty = empty  + args[i] + ",";
			
			}	else {
					empty = empty  + args[i];
				}
		}
		return empty;
	}

}


	

	
import animal.Puppy; 
import utils.ArrayUtils;
import utils.Math;


public class Driver {
	public static void main(String[] args) {
		Puppy Joey = new Puppy("Joey");
		Puppy Chandler = new Puppy("Chandler");
		Puppy Ross = new Puppy("Ross");
		
		String result1 = Joey.getName();
		String result2 = Chandler.getName();
		String result3 = Ross.getName();
	
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		
		int[] array = {9, 20, 3, 44, 88, 300};
		int[] rev = ArrayUtils.reverse(array);
		System.out.println(ArrayUtils.stringifyArray(rev));
		
		
		double num = 15.4;
	    int inum = (int) num;
	    long result4 = Math.factorial(inum);
	    System.out.println(result4);
	    
	}

}

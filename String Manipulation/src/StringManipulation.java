
public class StringManipulation {

	public static void main(String[] args) {
		int max = max3(7, 9, 5);
		System.out.println(max);
		int min = min3(9, 7, 3);
		System.out.println(min);
		int median = median3(9, 11, 45);
		System.out.println(median);
		int results = countXX("xxxx");
		System.out.println(results);
		String times = stringTimes("hi", 5);
		System.out.println("THe output is " + times);

	}
	public static int max3(int num1, int num2, int num3) {

		int total = num2;

		if(num1 > num2) {
			total = num1;


			if (num3 > total) {
				total = num3;

			}
		}
		return total;



	}
	public static int min3(int num1, int num2, int num3) {

		int total = num2;	


		if(num1<num2) {
			total = num1;

			if(num3<total) {

				total = num3;
			}
		}
		return total;}
	
	
	public static int median3(int num1, int num2, int num3) {
		int max = num2;
		
		if(num1 > num2)
			max = num1;
		if(num3 > max)
			max = num3;
		
		int min = num2;
		if(num1 < num2)
			min = num1;
		if(num3 < min)
			min = num3;
		
		int total = min + max;
		int results = num1+num2+num3;
		int median = results - total;
		return median;
		
		
	}
	

	public static int countXX(String name) {
		int total = 0;
		for( int i = 0; i < name.length()-1; i++) {
			if( name.charAt(i)== 'x' && name.charAt(i+1) == 'x') {
				total++;
				
			}
		}
		return total;
		
		
			
			
		
	}
	
	public static String stringTimes(String name, int n) {
		
		
		String results = "";
		
		
		 for(int i =0; i < n; i++) {
			 
			results = results + name;
		 }
		return results;
		
		
		
		
	}

}

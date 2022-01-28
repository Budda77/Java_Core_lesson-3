package myProject01;

public class lesson01 {
public static void main(String[] args) {
		
		byte a1 = 10;
		short a2 =11;
		int a3 = 12;
		long a4 = 13L;
		
		float a5 = 14F;
		double a6 = 15;

		boolean a7 = true;
		
		Byte aa1= a1;
		Short aa2 = a2;
		Integer aa3 = a3;
		Long aa4 = a4;
		Float aa5 =a5;
		Double aa6 = a6;
		Boolean aa7 = a7;
		
		System.out.println("Byte = " + Byte.MIN_VALUE);
		System.out.println("Short = " + Byte.MIN_VALUE);
		System.out.println("Short = " + Short.MIN_VALUE);
		System.out.println("Short = " + Short.MIN_VALUE);
		System.out.println("Integer = " + Integer.MIN_VALUE);
		System.out.println("Integer = " + Integer.MIN_VALUE);
		System.out.println("Long = " + Long.MIN_VALUE);
		System.out.println("Long = " + Long.MIN_VALUE);
		System.out.println("Float = " + Float.MIN_VALUE);
		System.out.println("Float = " + Float.MIN_VALUE);
		System.out.println("Double = " + Double.MIN_VALUE);
		System.out.println("Double = " + Double.MIN_VALUE);
		System.out.println("Boolean = " + aa7);
		
		
		int [] arr = new int[10];

		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*50);
		}
		
		for(int i = 0; i < arr.length ; i++){
			System.out.println(arr[i]);
		}
		
		int min = arr[0];
		int max = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
	 System.out.println("max value = " + max);

     System.out.println("min value = " + min);
		
     
     // First commit to Git Hub
     
	}

}

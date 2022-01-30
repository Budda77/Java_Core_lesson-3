package lesson04;

public class HomeTask1 {
	public static void main(String[] args) {
		
// Task 1		
		// код, що виводить на екран перші 55 елементів послідовності 1 3 5 7 9 11 13 15 17
		
			int number = 1;
			task_1(number);
		
			System.out.println();
			System.out.println();
// Task 2
//код, що виводить на екран всі невід'ємні елементи послідовності 90 85 80 75 70 65 60 ...
		
				int total = 90;
				task_2(total);

				System.out.println();	
				System.out.println();
				
// Task 3				
// код, що перевіряє і повідомляє на екран, чи є ціле число записане в змінну n, парним або непарним.
				int num = 78;
				task_3(num);

				System.out.println();	
// Task 4				
// код, що виводить на екран найближче до 10 з двох чисел, записаних в змінні m і n. 
// Наприклад, серед чисел 8,5 і 11,45 найближче до десяти 11,45.
	
				double n = 5.5;
				double m = 13.45;
				task_4(n, m);
				System.out.println();
				
// Task 5
				int [] array = new int[10];
				fillArrays(array);
				System.out.println();
				findMaxMinNumber(array);
				
				
			
		
	}
	
	static void task_1(int number) {
		System.out.println("Task 1");
		int count = 0;
		while(count < 55){
		System.out.print(number + " ");
		    number +=2;
			count +=1;	
		}	
	}
	
	static void task_2(int total) {
		System.out.println("Task 2");
		while(total >  0 ) {
			System.out.print(total + " ");
			 total -= 5;
		}
	}
	
	static void task_3(int num) {
		System.out.println("Task 3");
		if(num % 2 == 0) {
			System.out.println("число парне");
		}else {
			System.out.println("число Не парне");
		}
	}

	
	
	static void task_4(double n, double m) {
		System.out.println("Task 4");
		double resultOne = 0;
		double resultTwo = 0;
		
		if (n > 10 ){
			resultOne = n - 10;				
		} else {
			resultOne = 10 - n;
		}
		
		if (m > 10 ){
			resultTwo = m - 10;	
		} else {
			resultTwo = 10 - m;
		}
		
		if (resultOne > resultTwo ){
			
			System.out.println(m);
		} else {
			System.out.println(n);
		}
	}
	
	static void fillArrays(int [] array) {
		System.out.println("filled array:");
		for (int i = 0; i < array.length; i++) {
			array [i] = 10 + (int)(Math.random()*90);
			
			System.out.println(array[i]);
		}	
	}

	static void findMaxMinNumber(int [] array) {
		System.out.println("Task 5");
		int max = array[0];
		int min = array[0];
	for (int i = 0; i < array.length; i++) {
		if(max < array[i]) {
			max = array[i];
		}
		if(array[i] < min) {
			min = array[i];
		}
	}
		System.out.println("найбільше значення масиву: " + max);
		System.out.println("найменше значення масиву: " + min);
	}
	
}

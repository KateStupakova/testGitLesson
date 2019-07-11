package work5;

import java.util.Scanner;
import java.util.Arrays;
public class work5 {

	public static void main(String[] args) {
		{
	        

	        Scanner input = new Scanner(System.in);
	        System.out.println("Заполните массив");
	        int mas[] = new int[10];//создаем  массив размером 10
	        for (int i = 0; i < mas.length; i++) {
	            mas[i] = input.nextInt();// заполняем массив с клавиатуры
	        }
	 
	 
	        System.out.println("Заполненый массив");
	        for (int i=0;i < mas.length;i++){
	            System.out.println(maxArr(mas));// Выводим заполненый массив на экран
	        }
	        System.out.println();
		 
		 

	    }
}
	 
	 public static int maxArr(int[] array) {
	        int max = 0;
	        for (int i = 0; i < array.length; i++) {
	            if (max < array[i]) {
	                max = array[i];
	            }
	        }

	        return max;

	}

}

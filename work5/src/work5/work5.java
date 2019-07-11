package work5;

import java.util.Scanner;
import java.util.Arrays;
public class work5 {

	public static void main(String[] args) {
		 {
		        

		        Scanner input = new Scanner(System.in);
		        System.out.println("Заполните массив");
		        int mas[] = new int[10];
		        for (int i = 0; i < mas.length; i++) {
		            mas[i] = input.nextInt();
		        }
		 
		 
		        System.out.println("Заполненый массив");
		        for (int i=0;i < mas.length;i++){
		            System.out.println(maxArr(mas));
		        }
		        System.out.println();
			 
			 

		    }
	}

}

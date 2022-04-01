package gec;

import java.util.Scanner;

public class even_numbers {


	public static void main(String[] args) {
		//TODO Auto-generated method stub
        //number
		int number;
        Scanner num = new Scanner (System.in);
        System.out.println("TYPE A NUMBER");
        number = num.nextInt();
         //print all even numbers <=n
        int even=2;
        while (even <= number) {
            System.out.print(even+"  ");
            even += 2;
		 }
	}
 } 


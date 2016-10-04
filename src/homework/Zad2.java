package homework;

import java.util.Scanner;

public class Zad2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        System.out.println("Enter your score:");
        int result = input.nextInt();
        input.close();
        
        switch(result){
        	case 1:
        	case 2:
        	case 3:
        		System.out.println("Score " + result*5);
        		break;
        	case 4:
        	case 5:
        	case 6:
        		System.out.println("Score " + result*10);
        		break;
        	case 7:
        	case 8:
        	case 9:
        		System.out.println("Score " + result*50);
        		break;
        	default:
        		System.out.println("Not a valid score!");
        		break;
        }
	}

}

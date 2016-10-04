package homework;

import java.util.Scanner;

public class Zad3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        System.out.println("Enter a card:");
        String card = input.nextLine();
        input.close();
        card+=" ";
        switch(card.charAt(0)){
        	case '2':
        	case '3':
        	case '4':
        	case '5':
        	case '6':
        	case '7':
        	case '8':
        	case '9':
        	case 'J':
        	case 'Q':
        	case 'K':
        	case 'A':
        		System.out.println("Valid card!");
        		break;
        	case '1':
        		if(card.charAt(1)== '0'){
            		System.out.println("Valid card!");
            		break;
        		}
        	default:
        		System.out.println("Not a valid card!");
        		break;
        }
	}

}

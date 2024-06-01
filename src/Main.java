import java.util.*;

import static java.lang.Character.toUpperCase;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char c;
        do {
            System.out.print("Enter a number:");
            float a= sc.nextFloat();
            System.out.print("Enter a number:");
            float b= sc.nextFloat();
            System.out.println("Enter:\n1 for addition\n2 for subtraction\n3 for multiplication\n4 for division\n5 for reminder");
            System.out.print("Enter a operator:");
            int op= sc.nextInt();
            switch (op){
                case 1: System.out.println(a+b);
                    break;
                case 2: System.out.println(a-b);
                    break;
                case 3: System.out.println(a*b);
                    break;
                case 4: System.out.println(a/b);
                    break;
                case 5: System.out.println(a%b);
                    break;
                default: System.out.println("sorry, INVALID OPERATIPON.");
            }
            System.out.println("enter \"yes\" if you want more operation else enter \"no\"");
            char ch = sc.next().charAt(0);
            c = ch;
            c = toUpperCase(c);
        }while(c != 'N');

        System.out.println("Operation over!\n***************************** THANK YOU ********************************");

    }
}
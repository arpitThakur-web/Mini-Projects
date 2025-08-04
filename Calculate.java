import java.util.Scanner;

import util.java.*;

public class Calculate {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num1");
        double num1 = sc.nextDouble();
        System.out.println("Enter operator(+,  -, *,  /,  % )");
        char operator = sc.next().charAt(0);
        System.out.println("Enter num2");
        double num2 = sc.nextDouble();

        switch(operator) {
            case '+' : double result = num1 + num2;
        System.out.println(result);
        break;
        case '-' : result = num1 - num2;
        System.out.println(result);
        break;
        case '*' : result = num1 * num2;
        System.out.println(result);
        break;
        case '/' : result = num1 / num2;
        if ( num2 != 0) {
        System.out.println(result);
        } else {
            System.out.println("Cannot divide by 0");
        }
        case '%' : result = num1 % num2;
        System.out.println(result);
        break;
        default : 
        System.out.println("Invalid operator");
        }
        sc.close();
    }
}
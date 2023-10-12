import java.util.Scanner;
public class Main
    {
    public static void main(String[] args)
    {
        double num1, num2, ans;
        char choose;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter num1 and num2: ");
        num1 = reader.nextDouble();
        num2 = reader.nextDouble();
        System.out.print("\nEnter operator. Operators available (+, -, *, /): ");
        choose = reader.next().charAt(0);
        switch(choose){

            //Sum
            case '+': {
            ans = num1 + num2;
            System.out.printf("\nSum of " + num1 + " and " + num2 + " = " + ans);
            break;
            }

            //Diff
            case '-': {
                ans = num1 - num2;
                System.out.printf("\nDiff of " + num1 + " and " + num2 + " = " + ans);
                break;
            }

            //Multiply
            case '*': {
                ans = num1 * num2;
                System.out.printf("\nMultiply of " + num1 + " and " + num2 + " = " + ans);
                break;
            }

            //Div
            case '/': {
                ans = num1 / num2;
                System.out.printf("\nDiv of " + num1 + " and " + num2 + " = " + ans);
                break;
            }
            default:  System.out.printf("Error! Enter correct operator");
                return;
    }
    }
    }
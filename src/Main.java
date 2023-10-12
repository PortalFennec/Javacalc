public class Main
    {
    public static void main(String[] args)
    {
        double num1, num2, ans;
        char choose;
        num1 = 5.0; num2 = 9.0;
        choose = '+';
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
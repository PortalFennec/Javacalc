import java.util.Scanner;
class Calc{
    double num1, ans;
    public static double Sum(double num1, double num2){
        num1 = num1 + num2;
        return num1;
    }
    public static double Diff(double num1, double num2){
        num1 = num1 - num2;
        return num1;
    }
    public static double Multiply(double num1, double num2){
        num1 = num1 * num2;
        return num1;
    }
    public static double Div(double num1, double num2){
        num1 = num1 / num2;
        return num1;
    }
}

public class Main
{
    public static void main(String[] args)
    {
        boolean decision;
        char choose, con;
        Calc Eval = new Calc();
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter number you want operate with: ");
        Eval.ans = reader.nextDouble();
        decision = true;
        while (decision)
        {
            System.out.print("\nEnter operator. Operators available (+, -, *, /): ");
            choose = reader.next().charAt(0);
            switch (choose)
            {
                //Sum
                case '+': {
                    System.out.print("\nEnter the number with which you want to add: ");
                    Eval.num1 = reader.nextDouble();
                    Eval.ans = Calc.Sum(Eval.ans, Eval.num1);
                    System.out.print("\nResult: " + Eval.ans);
                    break;
                }

                //Diff
                case '-': {
                    System.out.print("\nEnter the number you want to subtract: ");
                    Eval.num1 = reader.nextDouble();
                    Eval.ans = Calc.Diff(Eval.ans, Eval.num1);
                    System.out.print("\nResult: " + Eval.ans);
                    break;
                }

                //Multiply
                case '*': {
                    System.out.print("\nEnter the number you want to multiply by: ");
                    Eval.num1 = reader.nextDouble();
                    Eval.ans = Calc.Multiply(Eval.ans, Eval.num1);
                    System.out.print("\nResult: " + Eval.ans);
                    break;
                }

                //Div
                case '/': {
                    System.out.print("\nEnter the number with which you want to divide by: ");
                    Eval.num1 = reader.nextDouble();
                    Eval.ans = Calc.Div(Eval.ans, Eval.num1);
                    System.out.print("\nResult: " + Eval.ans);
                    break;
                }
                default:  System.out.print("Error! Enter correct operator");
                    return;
            }
            System.out.print("\nContinue evaluation? y/n: ");
            con = reader.next().charAt(0);
            if (con == 'n')
                decision = false;
        }
    }
}
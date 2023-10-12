import java.util.Scanner;
public class Main
    {
    public static void main(String[] args)
    {
        double num1, num2, ans, ans2;
        boolean decision;
        char choose, con;
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
            System.out.print("\nSum of " + num1 + " and " + num2 + " = " + ans);
            break;
            }

            //Diff
            case '-': {
                ans = num1 - num2;
                System.out.print("\nDiff of " + num1 + " and " + num2 + " = " + ans);
                break;
            }

            //Multiply
            case '*': {
                ans = num1 * num2;
                System.out.print("\nMultiply of " + num1 + " and " + num2 + " = " + ans);
                break;
            }

            //Div
            case '/': {
                ans = num1 / num2;
                System.out.print("\nDiv of " + num1 + " and " + num2 + " = " + ans);
                break;
            }
            default:  System.out.print("Error! Enter correct operator");
                return;
    }
        System.out.print("\nContinue evaluation? y/n: ");
        con = reader.next().charAt(0);
        if (con == 'y') {
            decision = true;
            while (decision) {
                System.out.print("\nEnter operator. Operators available (+, -, *, /): ");
                choose = reader.next().charAt(0);
                switch (choose) {

                    //Sum
                    case '+': {
                        System.out.print("\nEnter the number with which you want to add: ");
                        num2 = reader.nextDouble();
                        ans2 = ans + num2;
                        System.out.print("\nSum of " + ans + " and " + num2 + " = " + ans2);
                        System.out.print("\nContinue evaluation? y/n: ");
                        con = reader.next().charAt(0);
                        ans = ans2;
                        if (con == 'n') {
                            decision = false;
                        }
                        break;
                    }

                    //Diff
                    case '-': {
                        System.out.print("\nEnter the number you want to subtract: ");
                        num2 = reader.nextDouble();
                        ans2 = ans - num2;
                        System.out.print("\nDiff of " + ans + " and " + num2 + " = " + ans2);
                        System.out.print("\nContinue evaluation? y/n: ");
                        con = reader.next().charAt(0);
                        if (con == 'n') {
                            decision = false;
                        }
                        else {
                            ans = ans2;
                        }
                        break;
                    }

                    //Multiply
                    case '*': {
                        System.out.print("\nEnter the number you want to multiply by: ");
                        num2 = reader.nextDouble();
                        ans2 = ans * num2;
                        System.out.print("\nMultiply of " + ans + " and " + num2 + " = " + ans2);
                        System.out.print("\nContinue evaluation? y/n: ");
                        con = reader.next().charAt(0);
                        if (con == 'n') {
                            decision = false;
                        }
                        else {
                            ans = ans2;
                        }
                        break;
                    }

                    //Div
                    case '/': {
                        System.out.print("\nEnter the number with which you want to add: ");
                        num2 = reader.nextDouble();
                        ans2 = ans / num2;
                        System.out.print("\nDiv of " + ans + " and " + num2 + " = " + ans2);
                        System.out.print("\nContinue evaluation? y/n: ");
                        con = reader.next().charAt(0);
                        if (con == 'n') {
                            decision = false;
                        }
                        else {
                            ans = ans2;
                        }
                        break;
                    }
                    }
                }
            }
        }
        }
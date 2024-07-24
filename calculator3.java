import java.util.Scanner;

public class calculator3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your choice:");
        System.out.println("+ Addition");
        System.out.println("- Substraction");
        System.out.println("* Multiplivcation");
        System.out.println("/ Division");

        char ch = sc.next().charAt(0);

        System.out.println("Enter 1st number:");
        double num1 = sc.nextDouble();

        System.out.println("Enter 2nd number:");
        double num2 = sc.nextDouble();

        double result = 0;

        if (ch == '+') {
            System.out.println("Addition is=" + (num1 + num2));

        } else if (ch == '-') {
            System.out.println("Substraction is=" + (num1 - num2));
        }

        else if (ch == '*') {

            System.out.println("Multiplication is =" + (num1 * num2));
        }

        else if (ch == '/') {
            System.out.println("Division is=" + (num1 / num2));
        }

        else {
            System.out.println("Invalid input");
        }

    }

}

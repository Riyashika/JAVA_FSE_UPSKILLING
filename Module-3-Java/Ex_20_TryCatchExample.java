import java.util.Scanner;
public class Ex_20_TryCatchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed");
        }
    }
}
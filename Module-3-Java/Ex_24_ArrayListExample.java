import java.util.ArrayList;
import java.util.Scanner;
public class Ex_24_ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++)
            names.add(sc.nextLine());
        System.out.println(names);
    }
}
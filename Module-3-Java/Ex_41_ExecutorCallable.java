import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
public class Ex_41_ExecutorCallable {
    public static void main(String[] args) {
        try {
            ExecutorService executor = Executors.newFixedThreadPool(3);
            Callable<Integer> task1 = () -> 10 * 10;
            Callable<Integer> task2 = () -> 20 * 20;
            Callable<Integer> task3 = () -> 30 * 30;
            Future<Integer> result1 = executor.submit(task1);
            Future<Integer> result2 = executor.submit(task2);
            Future<Integer> result3 = executor.submit(task3);
            System.out.println("Result 1 = " + result1.get());
            System.out.println("Result 2 = " + result2.get());
            System.out.println("Result 3 = " + result3.get());
            executor.shutdown();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
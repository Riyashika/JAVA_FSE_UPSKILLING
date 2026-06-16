import java.lang.reflect.Method;
public class Ex_39_ReflectionExample {
    public void showMessage() {
        System.out.println("Reflection Method Invoked");
    }
    public static void main(String[] args) {
        try {
            Class<?> cls = Class.forName("Ex_39_ReflectionExample");
            Object obj = cls.getDeclaredConstructor().newInstance();
            Method[] methods = cls.getDeclaredMethods();
            System.out.println("Methods Available:");
            for(Method method : methods) {
                System.out.println(method.getName());
            }
            Method method = cls.getDeclaredMethod("showMessage");
            method.invoke(obj);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
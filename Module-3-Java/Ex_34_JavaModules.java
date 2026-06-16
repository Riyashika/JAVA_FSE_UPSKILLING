module com.utils {
    exports com.utils;
}
package com.utils;
public class Utility {
    public static void greet() {
        System.out.println("Welcome to Java Modules");
    }
}
module com.greetings {
    requires com.utils;
}
package com.greetings;
import com.utils.Utility;
public class Main {
    public static void main(String[] args) {
        Utility.greet();
    }
}
public class Ex_30_PatternMatchingSwitch {
    public static void identifyType(Object obj) {
        String result = switch (obj) {
            case Integer i -> "Integer Value: " + i;
            case String s -> "String Value: " + s;
            case Double d -> "Double Value: " + d;
            case Boolean b -> "Boolean Value: " + b;
            case null -> "Null Value";
            default -> "Unknown Type";
        };
        System.out.println(result);
    }
    public static void main(String[] args) {
        identifyType(100);
        identifyType("Java 21");
        identifyType(99.99);
        identifyType(true);
    }
}
public class BoxingUnboxingDemo {
    public static void main(String[] args) {
        // Boxing: Converting primitives to wrapper objects
        Integer intObject = Integer.valueOf(10);  // Explicit boxing
        Double doubleObject = Double.valueOf(20.5);
        Character charObject = Character.valueOf('A');

        // Auto-boxing: Java automatically converts primitive to object
        Integer autoIntObject = 15;
        Double autoDoubleObject = 30.75;
        Character autoCharObject = 'B';

        // Display boxed values
        System.out.println("Boxed Values:");
        System.out.println("Integer Object: " + intObject);
        System.out.println("Double Object: " + doubleObject);
        System.out.println("Character Object: " + charObject);
        System.out.println("Auto-boxed Integer: " + autoIntObject);
        System.out.println("Auto-boxed Double: " + autoDoubleObject);
        System.out.println("Auto-boxed Character: " + autoCharObject);

        // Unboxing: Converting wrapper objects back to primitives
        int intValue = intObject.intValue();  // Explicit unboxing
        double doubleValue = doubleObject.doubleValue();
        char charValue = charObject.charValue();

        // Auto-unboxing: Java automatically converts object to primitive
        int autoIntValue = autoIntObject;
        double autoDoubleValue = autoDoubleObject;
        char autoCharValue = autoCharObject;

        // Display unboxed values
        System.out.println("\nUnboxed Values:");
        System.out.println("Primitive int: " + intValue);
        System.out.println("Primitive double: " + doubleValue);
        System.out.println("Primitive char: " + charValue);
        System.out.println("Auto-unboxed int: " + autoIntValue);
        System.out.println("Auto-unboxed double: " + autoDoubleValue);
        System.out.println("Auto-unboxed char: " + autoCharValue);
    }
}
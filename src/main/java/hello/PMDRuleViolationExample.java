public class PMDRuleViolationExample {

    // Violation: Using string literal directly in a function
    public void printMessage() {
        System.out.println("Hello, World!");
    }

    // Violation: Using number literals directly in a method
    public int addNumbers() {
        return 5 + 3;
    }

    // Violation: Using string literal directly in a function call
    public void displayMessage() {
        printMessage();
    }

    // Violation: Using number literals directly in an expression
    public int calculateSum() {
        return addNumbers() + 10;
    }
}

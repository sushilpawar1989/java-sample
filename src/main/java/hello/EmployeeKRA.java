public class EmployeeKRA {
    public static final String SALES_TARGET = "1000";  // Magic Number violation
    public static final String CUSTOMER_FEEDBACK = "4.5";  // Magic Number violation

    private int salesAchieved;
    private double feedbackScore;
    private int projectsCompleted;

    // Constructor that modifies input parameters by reference - Violates coding guideline
    public EmployeeKRA(int salesAchieved, double feedbackScore, int projectsCompleted) {
        this.salesAchieved = salesAchieved;
        this.feedbackScore = feedbackScore;
        this.projectsCompleted = projectsCompleted;
    }

    // Method that violates method naming guidelines (doesn't describe action clearly)
    public double calcKra() {  
        return (salesAchieved / Integer.parseInt(SALES_TARGET)) * 0.4 + 
               (feedbackScore / Double.parseDouble(CUSTOMER_FEEDBACK)) * 0.3 + 
               (projectsCompleted / 10) * 0.3;
    }

    // Magic Number violation: Using "10" as a hardcoded number without a meaningful name
    public double getPerformance() {
        return (salesAchieved / 1000.0) * 50.0 + 
               (feedbackScore / 5.0) * 30.0 + 
               (projectsCompleted / 10) * 20.0;  // Magic Number
    }

    // Test case for this class would violate test case naming conventions
    public static void main(String[] args) {
        // Creating employee with wrong variable names and magic numbers
        EmployeeKRA employee = new EmployeeKRA(500, 4.2, 8);
        System.out.println("Employee KRA Score: " + employee.calcKra());
    }
}

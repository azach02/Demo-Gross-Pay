// Chap 3 Example (pg124)

public class DemoGrossPay {
    public static void main(String[] args) {

        double hours = 25;
        double yourHoursWorked = 37.5;
        double normalPay = 23.50;
        double highPay = 32.99;

        calculateGross(10, 20);
        calculateGross(hours, normalPay);
        calculateGross(yourHoursWorked, highPay); 
        System.out.println("Exiting Program...");
    }

    public static void calculateGross(double hours, double payRate) {
        // Fix: Remove the redeclaration of payRate here
        double grossPay = payRate * hours;

        System.out.println(hours + " hours at $" + payRate + " per hour is $" + grossPay);
    }
}

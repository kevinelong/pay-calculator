import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double MAX_REGULAR_HOURS = 40;
        double OVERTIME_FACTOR = 1.5;

        System.out.println("ENTER HOURS:");
        double hours = scanner.nextDouble();

        System.out.println("ENTER RATE:");
        double rate = scanner.nextDouble();
        double regularHours = 0;
        double overtimeHours = 0;
        double overtimeRate = OVERTIME_FACTOR * rate;

        if(hours > MAX_REGULAR_HOURS){
            regularHours = MAX_REGULAR_HOURS;
            overtimeHours = hours - MAX_REGULAR_HOURS;
        }else{
            regularHours = hours;
        }

        double regularTimeTotal = regularHours * rate;
        double overtimeTotal = overtimeHours * overtimeRate;
        double total = regularTimeTotal + overtimeTotal;
        System.out.printf("overtime rate: %s \n", overtimeRate);
        System.out.printf("regular total: %s \n", regularTimeTotal);
        System.out.printf("overtime total: %s \n", overtimeTotal);

        System.out.printf("TOTAL: %.2f \n", total);
    }
}
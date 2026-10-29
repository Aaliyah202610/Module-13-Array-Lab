public class WeeklyTemperatures {
    public static void main(String[] args) {

        int[] temperatures = {72, 75, 70, 68, 74, 77, 73};
        int sum = 0;

        for (int i = 0; i < temperatures.length; i++) {
            System.out.println("Day " + (i + 1) + ": " + temperatures[i]);
            sum = sum + temperatures[i];
        }

        double average = (double) sum / temperatures.length;

        System.out.println("Sum: " + sum);
        System.out.printf("Average: %.2f%n", average);
    }
}

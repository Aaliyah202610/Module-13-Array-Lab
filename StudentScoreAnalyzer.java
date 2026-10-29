public class StudentScoreAnalyzer {

    public static int countPassing(int[] scores) {
        int count = 0;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 70) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] scores = {88, 64, 91, 73, 59, 80};

        System.out.println("Passing students: " + countPassing(scores));
        System.out.println("Total students: " + scores.length);
    }
}

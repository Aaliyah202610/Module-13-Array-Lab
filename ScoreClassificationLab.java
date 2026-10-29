public class ScoreClassificationLab {
    public static void main(String[] args) {
        int[] scores = {45, 72, 90, 58, 83, 35};

        int passCount = 0;
        int failCount = 0;

        for (int i = 0; i < scores.length; i++) {
            System.out.println("Score: " + scores[i]);

            if (scores[i] >= 60) {
                passCount++;
            } else {
                failCount++;
            }
        }

        System.out.println("Passing students: " + passCount);
        System.out.println("Failing students: " + failCount);
    }
}

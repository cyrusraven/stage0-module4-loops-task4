package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int sum1 = 0;
        int sum2 = 0;
        if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bugger then the last");
        } else if (lastInRow < 0) {
            System.out.println("last number in row is negative");
        } else {
            for (int i = 1; i <= lastInRow; i++) {
                if (i > numberToSkip) {
                    sum1 += i;
                    continue;
                }
                sum2 += i;
            }
            System.out.println("skipped sum is " + sum2);
            System.out.println("counted sum is " + sum1);
        }

    }
}

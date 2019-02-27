package exercises;

public class AlmostIncreasingSequence {

    public static void main(String[] args) {

        int[] test = {1, 4, 10, 4, 2};

        int[] test2 = {1, 2, 1, 2};

        int[] test3 = {1, 3};

        int[] test4 = {1, 3, 2, 1};

        System.out.println("almostIncreasingSequence = [" + almostIncreasingSequence(test) + "]");

        System.out.println("almostIncreasingSequence = [" + almostIncreasingSequence(test2) + "]");

        System.out.println("almostIncreasingSequence = [" + almostIncreasingSequence(test3) + "]");

        System.out.println("almostIncreasingSequence = [" + almostIncreasingSequence(test4) + "]");
    }

    public static boolean almostIncreasingSequence(int[] sequence) {
        if (sequence.length < 3) return true;

        boolean removed = false;
        int current = 0;
        if (sequence[0] > sequence[1]) {
            removed = true;
        } else {
            current = 1;
        }

        for (int i = 2; i < sequence.length; i++) {
            if (sequence[current] < sequence[i]) {
                if (i < sequence.length - 1 && sequence[i] < sequence[i+1]) {
                    current = i;
                } else {
                    removed = true;
                }
            } else {
                if (removed) return false;
                removed = true;
            }
        }
        return true;
    }
}

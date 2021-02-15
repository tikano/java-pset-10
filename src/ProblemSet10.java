public class ProblemSet10 {

    public static void main(String[] args) {

    }

    public String[] fizzBuzz(int start, int end) {
        try {
            if (start >= end) return null;

            int len = end-start;
            String arr[] = new String[len];
            int startVal = start;

            for (int i=0; i<len; i++) {
                if ( ((startVal % 3) == 0) && ((startVal % 5) == 0) )
                    arr[i] = "FizzBuzz";
                else if ((startVal % 3) == 0)
                    arr[i] = "Fizz";
                else if ((startVal % 5) == 0)
                    arr[i] = "Buzz";
                else
                    arr[i] = String.valueOf(startVal);

                startVal++;
            }

            return arr;
        }
        catch (Exception e) {
            return null;
        }
    }

    public int maxSpan(int[] numbers) {
        return -1;
    }

    public int[] fix34(int[] numbers) {
        return null;
    }

    public int[] fix45(int[] numbers) {
        return null;
    }

    public boolean canBalance(int[] numbers) {
        return false;
    }

    public boolean linearIn(int[] outer, int[] inner) {
        return false;
    }

    public int[] squareUp(int n) {
        return null;
    }

    public int[] seriesUp(int n) {
        return null;
    }

    public int maxMirror(int[] numbers) {
        return -1;
    }

    public int countClumps(int[] numbers) {
        return -1;
    }
}

import java.util.Arrays;

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
        try {
            if (numbers == null) return -1;
            if (numbers.length == 1) return 1;
            if (numbers.length <= 0) return 0;

            int len = numbers.length;
            int maxSpan = 0;

            String strNumbers = Arrays.toString(numbers);
            strNumbers = strNumbers.replace(" ", "").replace(",", "");

            for (int i=0; i<len; i++) {
                int fOccurance, lOccurance;
                
                fOccurance = strNumbers.indexOf(String.valueOf(numbers[i]));
                lOccurance = strNumbers.lastIndexOf(String.valueOf(numbers[i]));

                int span = (lOccurance - fOccurance) + 1;
                
                if (maxSpan < span)
                    maxSpan = span;
            }

            return maxSpan;
        }
        catch (Exception e) {
            return -1;
        }
    }

    public int[] fix34(int[] numbers) {
        try {
            if (numbers == null) return null;   //The array must not be null

            boolean flgThreeAppeared = false;
            int cnt3 = 0, cnt4 = 0;
            int len = numbers.length;

            for (int i=0; i<len; i++) {
                if (numbers[i] == 3) {
                    flgThreeAppeared = true;
                    cnt3++;

                    if (i < len-1) {
                        if (numbers[i+1] == 4)
                            return null;    //Every 3 has a number after it that is not a 4
                    }
                    else
                        return null;    //3 is a last element; Every 3 has a number after it that is not a 4
                }                       
                
                if (numbers[i] == 4) {
                    cnt4++;

                    if (!flgThreeAppeared) 
                        return null;    //At least one 3 must appear in the array before the first 4
                }
            }

            if (cnt3 != cnt4)
                return null;    //There must be an equal number of 3s and 4s in the array

            for (int i=0; i<len; i++) {
                if (numbers[i] == 3) {
                    int fourIndex = findXNotRightNextToY(numbers, 4, 3);
                    
                    if (i < len-1)
                        if (fourIndex != -1) {
                            int temp = numbers[i+1];
                            numbers[i+1] = numbers[fourIndex];
                            numbers[fourIndex] = temp;
                        }
                }
            }

            return numbers;
        }
        catch (Exception e) {
            return null;
        }
    }

    private int findXNotRightNextToY(int[] numbers, int x, int y) {
        try {
            int len = numbers.length;

            for (int i=0; i<len; i++) {
                if (i == 0) {
                    if (numbers[i] == x)
                        return i;
                }
                else if ( (numbers[i] == x) && (numbers[i-1] != y) )
                    return i;
            }

            return -1;
        }
        catch (Exception e) {
            return -1;
        }
    }

    public int[] fix45(int[] numbers) {
        try {
            if (numbers == null) return null;   //The array must not be null

            int cnt4 = 0, cnt5 = 0;
            int len = numbers.length;

            for (int i=0; i<len; i++) {
                if (numbers[i] == 4) {
                    cnt4++;

                    if (i < len-1) {
                        if (numbers[i+1] == 4)
                            return null;    //Every 4 has a number after it that is not a 4
                    }
                    else
                        return null;    //4 is a last element; Every 4 has a number after it that is not a 5
                }                       
                
                if (numbers[i] == 5)
                    cnt5++;
            }

            if (cnt4 != cnt5)
                return null;    //There must be an equal number of 4s and 5s in the array

            for (int i=0; i<len; i++) {
                if (numbers[i] == 4) {
                    int fiveIndex = findXNotRightNextToY(numbers, 5, 4);
                    
                    if (i < len-1)
                        if (fiveIndex != -1) {
                            int temp = numbers[i+1];
                            numbers[i+1] = numbers[fiveIndex];
                            numbers[fiveIndex] = temp;
                        }
                }
            }

            return numbers;
        }
        catch (Exception e) {
            return null;
        }
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

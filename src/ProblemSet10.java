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
                        if (numbers[i+1] == 3)
                            return null;    //Every 3 has a number after it that is not a 3
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
        try {
            if (numbers == null) return false;

            int len = numbers.length;

            if (len <= 0) return false;

            int sumI = 0;

            for (int i=0; i<len; i++) {
                sumI = sumI + numbers[i];
                int sumJ = 0;

                for (int j=i+1; j<len; j++)
                    sumJ = sumJ + numbers[j];

                if (sumI == sumJ)
                    return true;
            }

            return false;
        }
        catch (Exception e) {
            return false;
        }
    }

    public boolean linearIn(int[] outer, int[] inner) {
        try {
            if (outer == null) return false;
            if (inner == null) return false;

            int lenO = outer.length;
            int lenI = inner.length;

            if (lenO <= 0) return false;
            if (lenI <= 0) return false;

            if (!isArraySorted(outer)) return false;
            if (!isArraySorted(inner)) return false;

            int j = 0;

            for (int i=0; i<lenO; i++)
                if (j < lenI)
                    if (inner[j] == outer[i])
                        j++;

            if (j == lenI) 
                return true;
            else 
                return false;
        }
        catch (Exception e) {
            return false;
        }
    }

    private boolean isArraySorted(int[] arr) {
        try {
            int len = arr.length;

            for (int i=0; i<len; i++)
                if (i < len-1)
                    if (arr[i] > arr[i+1])
                        return false;

            return true;
        }
        catch (Exception e) {
            return false;
        }
    }

    public int[] squareUp(int n) {
        try {
            if (n < 0) return null;

            int len = n * n;
            int[] arr = new int[len];

            for (int i=0; i<len; i++)
                arr[i] = 0;

            if(n == 0)
                return arr;

            for(int i=n-1; i<len; i=i+n)
                for(int j=i; j>=(i-(i/n)); j--)
                    arr[j] = i - j + 1;
                                    
            return arr;
        }
        catch (Exception e) {
            return null;
        }
    }

    public int[] seriesUp(int n) {
        try {
            if (n < 0) return null;

            int len = (n * (n+1)) / 2;
            int[] arr = new int[len];

            int k = 0;

            for(int i=0; i<n; i++) {
                for(int j=0; j<i+1; j++) {
                        int indx = k + j;
                        arr[indx] = j + 1;
                }
                k += (i + 1);
            }

            return arr;
        }
        catch (Exception e) {
            return null;
        }
    }

    public int maxMirror(int[] numbers) {
        try {
            if (numbers == null) return -1;

            int maxMirror = 0;
            int len = numbers.length;
    
            for(int i=0; i<len; i++) {
                for(int j=len-1; j>=0; j--) {
                    int maxSize = 0;
                    int maxJ = j;
                    
                    for (int maxI=i; (maxI<len && maxJ>=0); maxI++) {
                        if (numbers[maxI] == numbers[maxJ]) {
                            maxSize++;
                            maxJ--;    
                        }
                        else
                            break;
                    }
                          
                    if (maxMirror <= maxSize)
                        maxMirror = maxSize;                    
                }
            }
                                                                                                    
            return maxMirror;
        }
        catch (Exception e) {
            return -1;
        }
    }

    public int countClumps(int[] numbers) {
        try {
            if (numbers == null) return -1;

            int cnt = 0;
            int len = numbers.length;
    
            for(int i=0; i<len; i++) {
                int temp = numbers[i];
                int cLen = 1;

                for(int j=i+1; (j<len && numbers[i+1]==temp); j++) {
                    i++;
                    cLen++;
                }                    

                if (cLen > 1)
                    cnt++;                    
            }
                                                                                                    
            return cnt;
        }
        catch (Exception e) {
            return -1;
        }
    }
}

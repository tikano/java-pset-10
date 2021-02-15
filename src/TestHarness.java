import java.util.Arrays;

public class TestHarness {
    public static void main(String[] args) {
        ProblemSet10 ps = new ProblemSet10();
    
        int[] iArr = {};
        String[] sArr = {};

        boolean b = false;
        int i = 0;

        int[] input1 = {1, 4, 2, 1, 4, 4, 4};
        int[] input2 = {1, 2, 3};

        int int1 = 1;
        int int2 = 11;

        //Exercise 1
        //sArr = ps.fizzBuzz(int1, int2);
        //System.out.printf("%s\n", Arrays.toString(sArr)); 

        //Exercise 2
        i = ps.maxSpan(input1);
        System.out.printf("%d\n", i);        

        //Exercise 3
        //iArr = ps.fix34(input1);
        //System.out.printf("%s\n", Arrays.toString(iArr));        

        //Exercise 4
        //iArr = ps.fix45(input1);
        //System.out.printf("%s\n", Arrays.toString(iArr));        

        //Exercise 5
        //b = ps.canBalance(input1);
        //System.out.printf("%s\n", b);   

        //Exercise 6
        //b = ps.linearIn(input1, input2);
        //System.out.printf("%s\n", b);      

        //Exercise 7
        //iArr = ps.squareUp(int1);
        //System.out.printf("%s\n", Arrays.toString(iArr));        

        //Exercise 8
        //iArr = ps.seriesUp(int1);
        //System.out.printf("%s\n", Arrays.toString(iArr));        

        //Exercise 9
        //i = ps.maxMirror(input1);
        //System.out.printf("%d\n", i);        

        //Exercise 10
        //i = ps.countClumps(input1);
        //System.out.printf("%d\n", i);        
        
    }

}


/*
NAME:	JINXIN ZHANG
V#:	V00810275
 * ArrayOperationsTester
 *
 * A class to test the functions in ArrayOperations class
 *
 */
public class ArrayOperationsTester {
    
    private static int  	testPassCount = 0;
    private static int      testCount = 0;
    
    private static int a1[] = {2};
    private static int a2[] = {1, 0, 3, 2};
    private static int a3[] = {-1, 2, 4, 3, 0};
    private static int a1NotEqual[] = {3};
    private static int a1Equal[] = {2};
    private static int a3Equal[] = {-1, 2, 4, 3, 0};
    private static int a3NotEqual[] = {-1, 2, 4, 3};
    
    
    public static void main(String[] args) {
        System.out.print("a1: ");
        ArrayOperations.printArray(a1);
        System.out.print("a2: ");
        ArrayOperations.printArray(a2);
        System.out.print("a3: ");
        ArrayOperations.printArray(a3);
        
        testSumArray();
        testMaxArray();
        testMinArray();
        testAvgArray();
        testEqualArrays();
        
        System.out.println("Passed " + testPassCount + "/" + testCount + " tests");
        
    }
    
    public static void displayResults (boolean passed, String testName)
    {
        /* There is some magic going on here getting the line number
         * Borrowed from:
         * http://blog.taragana.com/index.php/archive/core-java-how-to-get-java-source-code-line-number-file-name-in-code/
         *
         * Once we've discussed Exceptions in more detail this won't be required.
         */
        
        testCount++;
        if (passed)
        {
            System.out.println ("Passed test: " + testName);
            testPassCount++;
        }
        else
        {
            System.out.println ("Failed test: " + testName + " at line "
                                + Thread.currentThread().getStackTrace()[2].getLineNumber());
        }
        
    }
    
    public static void testSumArray() {
        int result = 0;
        
        result = ArrayOperations.arraySum(a1);
        System.out.println("should be 2: " + result);
        displayResults(result==2, "testSumArray");
        
        result = ArrayOperations.arraySum(a2);
        System.out.println("should be 6: " + result);
        displayResults(result==6, "testSumArray");
        
        result = ArrayOperations.arraySum(a3);
        System.out.println("should be 8: " + result);
        displayResults(result==8, "testSumArray");
        
    }
    
    public static void testMaxArray() {
        int result = 0;
        
        result = ArrayOperations.arrayMax(a1);
        System.out.println("should be 2: " + result);
        displayResults(result==2, "testMaxArray");
        
        
        result = ArrayOperations.arrayMax(a2);
        System.out.println("should be 3: " + result);
        displayResults(result==3, "testMaxArray");
        
        result = ArrayOperations.arrayMax(a3);
        System.out.println("should be 4: " + result);
        displayResults(result==4, "testMaxArray");
         
        
    }
    
    public static void testMinArray() {
        int result = 0;
        
        result = ArrayOperations.arrayMin(a1);
        System.out.println("should be 2: " + result);
        displayResults(result==2, "testMinArray");
        
        result = ArrayOperations.arrayMin(a2);
        System.out.println("should be 0: " + result);
        displayResults(result==0, "testMinArray");
        
        result = ArrayOperations.arrayMin(a3);
        System.out.println("should be -1: " + result);
        displayResults(result==-1, "testMinArray");
        
    }
    
    public static void testAvgArray() {
        double result = 0;
        
        result = ArrayOperations.arrayAvg(a1);
        System.out.println("should be 2: " + result);
        displayResults(result==2, "testAvgArray");
        
        result = ArrayOperations.arrayAvg(a2);
        System.out.println("should be 1.5: " + result);
        displayResults(result==1.5, "testAvgArray");
        
        result = ArrayOperations.arrayAvg(a3);
        System.out.println("should be 1.6: " + result);
        displayResults(result==1.6, "testAvgArray");
        
    }
    
    public static void testEqualArrays() {
        boolean result = true;
        
        result = ArrayOperations.arraysEqual(a1, a1Equal);
        System.out.println("should be true: " + result);
        displayResults(result, "testEqualArrays");
        
        result = ArrayOperations.arraysEqual(a1, a1NotEqual);
        System.out.println("should be false: " + result);
        displayResults(!result, "testEqualArrays");;
        
        result = ArrayOperations.arraysEqual(a3, a3Equal);
        System.out.println("should be true: " + result);
        displayResults(result, "testEqualArrays");
        
        result = ArrayOperations.arraysEqual(a3, a3NotEqual);
        System.out.println("should be false: " + result);
        displayResults(!result, "testEqualArrays");
        
        result = ArrayOperations.arraysEqual(a3NotEqual, a3);
        System.out.println("should be false: " + result);
        displayResults(!result, "testEqualArrays");
        
    }

}

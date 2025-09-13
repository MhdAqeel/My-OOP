public class Factorial {
    public static int nonRecursiveFactorial(int i) {
        int fact = 1;
        while (i > 1) {
            fact *= i;
            i--;
        }
        return fact;
    }

    public static int recursiveFactorial(int j) {
        if (j == 0 || j == 1) {
            return 1; 
        } else {
            return j * recursiveFactorial(j - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(nonRecursiveFactorial(0));   
        System.out.println(nonRecursiveFactorial(5)); 
        System.out.println(recursiveFactorial(5));     
        System.out.println(recursiveFactorial(6));     
        System.out.println(recursiveFactorial(7));     
        System.out.println(recursiveFactorial(8));      
        System.out.println(recursiveFactorial(9));      
        System.out.println(recursiveFactorial(10));     
    }
}

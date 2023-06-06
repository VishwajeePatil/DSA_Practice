public class find_factorial {
    public static void main(String[] args){
        int n = 4;
        int ans = factorial(n);
        System.out.println("The Factorial For " + n + " Is " + ans);
    }

    // This is the function to find the factorial for given number
    private static int factorial(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact*=i;
        }
        return fact;
    }
}

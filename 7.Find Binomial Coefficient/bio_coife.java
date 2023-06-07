public class bio_coife {
    public static void main(String[] args){
        int n = 5;
        int r = 2;
        int ans = findbiocoife(n,r);
        System.out.println("Binomial Coefficient For " + n + " And " + r + " Is " + ans);
    }

    // This is the function to find the Binomial Coefficient
    private static int findbiocoife(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
        int ans = fact_n/(fact_r*fact_nmr);
        return ans;

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

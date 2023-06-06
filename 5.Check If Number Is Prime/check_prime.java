public class check_prime {
    public static void main(String[] args){
        int n = 48;
        boolean ans = checkprime(n);
        if(ans){
            System.out.println(n + " Is A Prime Number");
        }
        else{
            System.out.println(n + " Is Not A Prime Number");
        }
    }

    // This is the function to check the number is prime or not
    private static boolean checkprime(int n){
        for(int i=2; i<n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}

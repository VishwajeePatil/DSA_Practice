public class reverse_num {
    public static void main(String[] args){
        int n = 15102002; 
        int ans = reverse(n);
        System.out.println("The Reverse Of " + n + " is " + ans);
        print_reverse(n);
    }
     // This is the function to return reverse of given number
     private static int reverse(int n){
        // String ans = "";
        int ans = 0;
        while(n>0){
            int rem = n % 10;
            // ans += rem;
            ans = (ans*10)+rem;
            n /= 10;
        }
        // return Integer.parseInt(ans);
        return ans;
     }


     
    // This is the function to Print reverse of given number
    private static void print_reverse(int n){
        while(n>0){
            int rem = n%10;
            System.out.print(rem);
            n=n/10;
        }
    }
}

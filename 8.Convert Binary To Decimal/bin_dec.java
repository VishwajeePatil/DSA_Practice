public class bin_dec {
    public static void main(String[] args){
        int n = 101;
        int ans = binarytodecimal(n);
        System.out.println("Decimal No For " + n + " Is " + ans);
    }
    // This Is The Function to convert any binary number into decimal number
    private static int binarytodecimal(int n){
        int dec_num = 0;
        int pow = 0;
        while(n>0){
            int lastdigit = n%10;
            dec_num += lastdigit * (int)Math.pow(2, pow);
            n /= 10;
            pow++;

        }
        return dec_num;
    }
}

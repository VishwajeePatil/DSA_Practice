public class dec_bin {
    public static void main(String[] args){
        int n = 5;
        int ans = decimaltobinary(n);
        System.out.println("Binary Number for " + n + " Is " + ans);
    }

    // This is the function to convert any decimal number into decimal 

    private static int decimaltobinary(int n){
        int bin_num = 0;
        int pow = 0;
        while(n > 0){
            int lastdigit = n%2;
            bin_num += lastdigit * (int)Math.pow(10, pow);
            n /= 2;
            pow ++;
        }
        return bin_num;
    }
}

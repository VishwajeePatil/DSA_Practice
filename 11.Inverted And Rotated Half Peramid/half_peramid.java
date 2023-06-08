public class half_peramid {
    public static void main(String[] args) {
        int n = 5;
        printhalfperamid(n);
    }
    // This is the function to print half peramid
    private static void printhalfperamid(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print("  ");
            }
            for(int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

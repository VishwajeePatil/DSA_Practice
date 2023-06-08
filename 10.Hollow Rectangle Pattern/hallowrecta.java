public class hallowrecta {
    public static void main(String[] args){
        int rows = 8;
        int cols = 5;
        printhallowrectangle(rows,cols);
    }

    // This is the function to print Hallow REctangle

    private static void printhallowrectangle(int rows, int cols){
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(i==0 || i==rows-1 || j==0 || j==cols-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

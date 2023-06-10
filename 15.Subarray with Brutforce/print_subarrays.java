public class print_subarrays {
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6,7};
        printsubarr(arr);
    }

    // This is the function to print the subarrayss
    private static void printsubarr(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

public class pairs_arr {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        printpairs(arr);
    }
    // This is the function to count and print all the pairs in Array
    private static void printpairs(int[] arr){
        int n = arr.length;
        int pairs = 0;
        for(int i=0; i<n; i++){
            int curr = arr[i];
            for(int j=i+1; j<n; j++){
                System.out.print("(" + curr + " ," + arr[j]  + " ) , ");
                pairs++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs For This Array IS " + pairs);
    }
}

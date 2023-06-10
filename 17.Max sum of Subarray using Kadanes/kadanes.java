public class kadanes {
    public static void main(String[] args){
        int[] arr = {7,-4,6,-9,3,2,-5};
        maxsum(arr);
    }

    // This is the function to pritn maximum sum of subarray using Kadanes Algo
    private static void maxsum(int[] arr){
        int currsum=0;
        int maxsum=0;
        for(int i=0; i<arr.length; i++){
            currsum+=arr[i];
            if(currsum<0){
                currsum=0;
            }
            maxsum=Math.max(currsum, maxsum);
        }
        System.out.print("Maxixmum Sum Of SubArray Is = " + maxsum);
    }
}

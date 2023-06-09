public class reversearray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        reversearr(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    // This is the function To reverse the array
    private static void reversearr(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

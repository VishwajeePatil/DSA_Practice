public class reversearr {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        reverse(arr);
    }
    // This is the function to reverse and print the array
    private static void reverse(int[] arr){
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int k=0; k<n; k++){
            System.out.print(arr[k]+" ");
        }
    }
}

public class binary_search {
    public static void main(String[] args){
        int[] arr = {2,4,3,1,9,5,6,8};
        int key = 1;
        int index = binsearch(arr,key);
        if(index==-1){
            System.out.println("Given Key Is Not Present In The Array");
        }
        else{
            System.out.println("Given Key Is Present At Index "+ index);
        }
    }

    // This is the binary search function to search a given elememt in Array
    private static int binsearch(int[] arr, int key){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(key==arr[mid]){
                return mid;
            }
            else if(key<mid){
                end = mid -1;
            }
            else{
                start = mid +1;
            }
        }
        return -1;
    }
}

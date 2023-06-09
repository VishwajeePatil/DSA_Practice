import java.util.*;
public class commonintwo {
    public static void main(String[] args){
        int[] arr = {7,6,2,0,8,0,2,3,5};
        int[] arr2 = {6,7,4,2,5,6,7,9,22};
        findcommon(arr,arr2);
    }
    // This is the function to find common elemnt in two array
    private static void findcommon(int[] arr, int[] arr2){
        HashSet<Integer> map = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            map.add(arr[i]);
        }
        int count=0;
        for(int i=0; i<arr2.length; i++){
            if(map.contains(arr2[i])){
                System.out.print(arr2[i] + " ");
                map.remove(arr2[i]);
                count++;
            }
        }
        System.out.println("Total Common Elements Are " + count);
    }
}

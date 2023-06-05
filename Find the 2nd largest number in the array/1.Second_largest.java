class Main{
    public static void main(String[] args){
        int[] arr = {3,5,4,6,2,9,7};
        int ans = first(arr);
        System.out.println("Second Largest Number In This Array Is - "+ ans);
        ans = second(arr);
        System.out.println("Second Largest Number In This Array Is - "+ ans); 
    }

    // This Is The First Method To Find Second Largest Number In Array
    private static int first(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){ 
            for(int j=0; j<n-i-1; j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr[1];
    }
    // This Is The Second Method To Find Second Largest Number In Array
    private static int second(int[] arr){
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        int Second_largest = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i]>largest){
                Second_largest = largest;
                largest = arr[i];
            }
            else if(arr[i] > Second_largest && arr[i]!= largest){
                Second_largest=arr[i];
            }
        }
        return Second_largest;
    }
}
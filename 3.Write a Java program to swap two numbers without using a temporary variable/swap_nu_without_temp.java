public class swap_nu_without_temp {
    public static void main(String[] args){
        int a = 23;
        int b = 45;
        swap(a,b);

    }
    // This Is The Function To Swap Two Numbers Without Temparory Variable

    private static void swap(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.print("The Value Of a Becomes - " + a + " & The Value Of b Becomes - " + b);
    }
}

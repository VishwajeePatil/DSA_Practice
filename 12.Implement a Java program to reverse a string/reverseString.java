public class reverseString {
    public static void main(String[] args){
        String str = "Vishwajeet Patil";
        reverseString(str);
    }

    // This is the function to reverse the given String
    private static void reverseString(String str){
        String rev = "";
        for(int i=str.length()-1; i>=0; i--){
            rev += str.charAt(i);
        }
        System.out.println(rev);
    }
}

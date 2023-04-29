public class ValidPalindromeString {

    public static void main(String[] args){
        String str = "A man, a plan, a canal: Panama";
        System.out.print(equal(str));
    }
    public static boolean equal(String str) {
        if (str.isEmpty()) return true;
        int start = 0;
        int end = str.length()-1;
        while (start<=end){
            char first = str.charAt(start);
            char last = str.charAt(end);
            if (!Character.isLetterOrDigit(first)) start++;  // Check the character is alphanumeric
            else if (!Character.isLetterOrDigit(last)) end--;
            else {
                if (Character.toLowerCase(first) != Character.toLowerCase(last)) return false;
                start++;
                end--;
            }
        }
        return true;
    }
}

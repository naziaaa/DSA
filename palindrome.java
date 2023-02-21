import java.util.*;
class palindrome{

    public static void main(String argd[]) {
        Scanner s =new Scanner(System.in);
        String word=s.nextLine();
        System.out.println("is"+word+"palindrome"+isWordPalindrome(word));  
    }

    public static boolean isWordPalindrome(String word){
        String rword=getReverseWord(word);
        if(word.equals(rword)) return true;
        else return false;
    }

    public static String getReverseWord(String word){
        if(word==null || word.isEmpty()) return word;
        return word.charAt(word.length()-1) + getReverseWord(word.substring(0, word.length()-1));

    }
}
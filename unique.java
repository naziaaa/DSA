import java.util.*;

public class unique {

    static boolean oneEditAway(String s1, String s2){
        if(s1.length()==s2.length())
        return oneEditReplace(s1,s2);
        else if(s1.length()-1==s2.length()) //insertion
        return oneInsertion(s2,s1);
        else if(s1.length()+1==s2.length())
        return oneInsertion(s1,s2); //Deletion
        else return false;
    }

    static boolean oneEditReplace(String s1,String s2){
        boolean isDiffer=false;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                if(isDiffer){
                    return false;
                }
                isDiffer=true;
            }
        }
        return true;
    }
    static boolean oneInsertion(String s1, String s2){
        int idx1=0,idx2=0;
        while(idx2<s2.length() && idx1<s1.length()){
            if(s1.charAt(idx1) != s2.charAt(idx2)){
                if(idx1!=idx2){
                    return false;
                }
               else idx2++;

            }
            else{
                idx1++;
                idx2++;
            }
        }
        return true;
    }


    public static void main(String ar[]) {
      //  unique obj=new unique();
        String s1="bake",s2="pale";
        System.out.print(oneEditAway(s1,s2));
        
    }
    
}

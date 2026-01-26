import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        
        // Scanner scan = new Scanner(System.in);
        //  s = scan.nextLine();
        //  t = scan.nextLine();

        s = s.replaceAll("//s"," ").toLowerCase();
        t = t.replaceAll("//s"," ").toLowerCase();

        if(s.length()!=t.length()){
            return false;
        }

        char[]a1 = s.toCharArray();
        char[]a2 = t.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        if(Arrays.equals(a1,a2)){
            return true;
        }
        else{
           return false;
        }
    }
}
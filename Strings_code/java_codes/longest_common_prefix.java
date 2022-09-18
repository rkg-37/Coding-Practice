import java.io.*;
class  longest_common_prefix {

    public String longestCommonPrefix1(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        
        for (int i = 1; i < strs.length; i++){
            while (strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length()-1);
            }
            if (prefix.isEmpty()) return "";
        }
        
    return prefix;    
    }

    public String longestCommonPrefix2(String[] strs) {
        
        int index=0;
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()<strs[index].length()){
                index=i;
            }
        }
    
        int max_length = strs[index].length();
        
        String prefix = "";
        while(max_length>0){
            boolean flag = true;
            for(int i=0;i<strs.length;i++){
                if(strs[0].substring(0,max_length).equals(strs[i].substring(0,max_length))){
                    continue;
                }else{
                    flag=false;
                    break;
                }
            }
            if(flag==true){
                prefix = strs[0].substring(0,max_length);
                break;
            }
            max_length--;
        }
        return prefix;
    }

    public static void main(String[] args){
        longest_common_prefix cr = new longest_common_prefix();
        String[] s = {"flower","flow","flight"};
        // String[] s = {"","cbc","c","ca"};
        String ans2 = cr.longestCommonPrefix2(s);
        String ans1 = cr.longestCommonPrefix1(s);
        System.out.println(ans1);
        System.out.println(ans2);
    }
}
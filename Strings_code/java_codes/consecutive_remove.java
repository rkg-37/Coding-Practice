class consecutive_remove{
    public String removeConsecutiveCharacter(String S){
        if(S.length()==1)  return S;
        StringBuilder st = new StringBuilder();
        int n = S.length();
        char prev = S.charAt(0);
        st.append(prev);
        for(int i=1;i<n;i++){
            if(S.charAt(i)==prev){
                continue;
            }
            else{
                prev = S.charAt(i);
                st.append(prev);
            }
        }
        return st.toString();
    }
    public static void main(String[] args){
        consecutive_remove cr = new consecutive_remove();
        String s = cr.removeConsecutiveCharacter("aabb");
        System.out.println(s);
    }
}
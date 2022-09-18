class count_consecutive {
    public int maxPower(String S) {
        if(S.length()==1)  return 1;
               
        int n = S.length();
        char prev = S.charAt(0);
        int cmax = 1,c=0;
        for(int i=0;i<n;i++){
            if(S.charAt(i)==prev){
                c++;
            }
            else{
                cmax = (cmax < c )?c:cmax;
                prev = S.charAt(i);
                c=1;
            }
        }
        return (cmax < c )?c:cmax;
    }
    public static void main(String[] args){
        count_consecutive cr = new count_consecutive();
        int s = cr.maxPower("aabb");
        System.out.println(s);
    }
}
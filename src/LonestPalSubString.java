public class LonestPalSubString {
    public static void main(String[] args){
        String s="jayaj";
        System.out.println(longestPalSubString(s));
    }
    public static String longestPalSubString(String s){
        int n=s.length();
        int maxLen=1,start=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(checkPal(s,i,j)&&(j-i+1)>maxLen){
                    start=i;
                    maxLen=j-i+1;
                }
            }
        }
        return s.substring(start,start+maxLen);
    }
    public static boolean checkPal(String s,int low ,int high){
        while(low<high){
            if(s.charAt(low)!=s.charAt(high))
                return false;
            low++;
            high--;
        }
        return true;
    }
}

class Solution {
    public String truncateSentence(String s, int k) {
        String s1="";
        String arr[]=s.split(" ");
        for(int i=0; i<k;i++){
           s1+=arr[i];
           s1 += " ";

}
return s1.trim();
        
    }
}
class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for (int i = 0; i < details.length; i++) {
            if (details[i].charAt(11) -'0'== 6 &&
                    details[i].charAt(12)-'0' >= 1) {
                count++;
            }
            else if(details[i].charAt(11)-'0'>6 ){
                count++;
            }
        }
        return count;
    }
}  
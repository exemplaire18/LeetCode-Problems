//https://leetcode.com/problems/longest-common-prefix/

class longestCommonPrefix {

    public String getPrefix(String s1, String s2){
        String prefix = "";
        for(int i = 0, j =0; i<s1.length() && j<s2.length(); i++, j++){
            if(s1.charAt(i)!=s2.charAt(j)){
                break;
            }
            prefix+=s1.charAt(i);
        }
        return prefix;
    }

    public String commonPrefix(String[] str, int low, int high){
        if(high>low){
            int mid = low+ (high-low)/2;
            String pre1 = commonPrefix(str, low, mid);
            String pre2 = commonPrefix(str, mid+1, high);
            String prefix = getPrefix(pre1, pre2);
            return prefix;
        }
        if(high==low){
            return str[low];
        }
        return "";
    }

    public String longestCommonPrefix(String[] strs) {
        return commonPrefix(strs, 0, strs.length-1);
    }
}

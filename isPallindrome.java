//https://leetcode.com/problems/palindrome-number/

class isPallindrome {
    public boolean isPalindrome(int x) {
        int copy = x;
        int sum = 0;
        while(copy>0){
            int r = copy%10;
            copy = copy/10;
            sum= sum*10 + copy%10;
            
        }
        if (sum==x){
            return true;
        }
        else{
            return false;
        }
    }
}

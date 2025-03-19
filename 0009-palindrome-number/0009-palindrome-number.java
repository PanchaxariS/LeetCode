class Solution {
    public boolean isPalindrome(int x) {
        int number = x;

        int sum = 0;
        while(x>0){
            int temp = x%10;
            sum = sum * 10 + temp;
            x = x/10;
        }

        if(number == sum){
            return true;
        }else{
            return false;
        }
        
    }
}
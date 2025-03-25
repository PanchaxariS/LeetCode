class Solution {
    public boolean isPerfectSquare(int num) {
       if(num < 0 ) return false;
       if(num ==0 || num==1) return true;
       
        long left = 1;
        long right = num/2;

        while(left<=right){
            long mid = (left+right)/2;
            long sq = mid*mid;

            if(sq==num){
                return true;
            }else if(sq>num){
                right = mid-1;
            }else{
                left = mid+1;
            }

        }
        return false;
        
    }
}
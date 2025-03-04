class Solution {
    public int missingNumber(int[] nums) {
        int allXOR = nums.length; 
        
        for (int i = 0; i < nums.length; i++) {
            allXOR ^= i;       
            allXOR ^= nums[i]; 
        }

        return allXOR;
    }
}

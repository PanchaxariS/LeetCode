class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> usedNumber = new HashSet<>();

        while(true){
        int sum =0;
        while(n>0){
            int lastDigit = n%10;
            sum = sum + (lastDigit*lastDigit);
            n = n/10;
        }
        if(sum ==1) return true;
        n = sum;

        if(usedNumber.contains(n)){
            return false;
        }
        usedNumber.add(n);
        }

        
    }
}
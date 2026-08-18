class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c = 0;
        int max = 0;
        for(int x : nums){
            if(x == 1){
                c++;
            }
            else{
                c = 0;
            }
            max = Math.max(max,c);
        }
        return max;
    }
}
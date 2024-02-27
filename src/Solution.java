class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int sum = nums[0] + nums[1] + nums[2];
        int minDiff = Math.abs(sum - target);
        int closest = sum;
        for(int i = 3; i < nums.length; i++){
            sum += nums[i] - nums[i - 3];
            if(Math.abs(sum - target) < minDiff){
                minDiff = Math.abs(sum - target);
                closest = sum;
            }
        }
        return closest;
    }
}
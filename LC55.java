class LC55 {
    public boolean canJump(int[] nums) {
       int i= 0;
    int maxReach=0;
    while(i<nums.length && i<=maxReach){
        maxReach = Math.max(i + nums[i], maxReach);
        i++;
    }
    if(i == nums.length){
        return true;
    }
    return false; 
    }
}

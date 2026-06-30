class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(count.getOrDefault(nums[i], 0) == 1) return true;
            count.put(nums[i], 1);
        }

        return false;
    }
}
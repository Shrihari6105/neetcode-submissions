class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product_total = 1;
        int n = nums.length;
        int[] output = new int[n];
        int zero_ct = 0;
        for(int num: nums){
            if(num != 0) product_total *= num;
            else zero_ct++;
        }

        for(int i = 0; i < n; i++){
            if(zero_ct == 1) 
                output[i] = (nums[i] == 0) ? product_total : 0;
            else if(zero_ct > 1) 
                output[i] = 0;
            else 
                output[i] = product_total/nums[i];
            
        }

        return output;
    }
}  

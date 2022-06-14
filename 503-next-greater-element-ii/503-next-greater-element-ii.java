class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        int len = nums.length;
        int[] res = new int[len];
        
        for (int i=0; i<len; i++) {

            int max = -1;

            for (int j=i; j<i+len; j++) {
                if (j<len && nums[i] < nums[j]) {
                    max = nums[j];
                    break;
                } else if (j>=len && nums[i] < nums[j%len]) {
                    max = nums[j%len];
                    break;
                } else if (i==j && (nums[i] >= nums[j] && max != -1)) {
                    continue;
                } else {
                    max = -1;
                }
            }
            res[i] = max;
        }
        
        return res;
    }
}
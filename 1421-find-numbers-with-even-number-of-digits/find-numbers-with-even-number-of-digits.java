class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;

        for(int i = 0; i<nums.length; i++){
            int c =0; 
            while(nums[i]>0){
                int d = nums[i]%10;
                c++;
                nums[i] /= 10;
            }
            if(c%2==0){
                count++;
            }
        }
        return count;
        
    }
}
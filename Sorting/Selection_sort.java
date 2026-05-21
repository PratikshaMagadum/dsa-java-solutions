class Solution {
    public int minimumDifference(int[] nums, int k) {
        
        if(nums.length == 1 || k==1){
            return 0;
        }

        if(nums.length==2 ){

            if(k==2){
                return Math.abs(nums[1]-nums[0]);
            }
        
        }
        for(int i=0; i<nums.length-1 ; i++){

            int min=i;

            for(int j=i ; j<=nums.length-1 ; j++){

                if(nums[min] > nums[j]){

                    min=j;

                }

            }

            int r=nums[min];
            nums[min]=nums[i];
            nums[i]=r;

        }

        int ans=nums[1]-nums[0];

        for(int i=2;i<nums.length;i++){

            if(Math.abs(nums[i]-nums[i-1])<ans){
                ans=nums[i]-nums[i-1];
            }
        }

        return ans;
    }
}

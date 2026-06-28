
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>mpp=new HashMap<>();
        int []ans=new int[2];
        int n=nums.length;
        for(int i=0;i<n;i++){
            int req=target-nums[i];
            if(mpp.containsKey(req)){
                ans[0]=mpp.get(req);
                ans[1]=i;
            }
            mpp.put(nums[i],i);
        }
        return ans;
    }
}

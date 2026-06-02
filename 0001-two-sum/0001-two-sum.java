class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> numbMap = new HashMap<>();
        int n =nums.length;
        for(int i=0;i<nums.length;i++){
            int difference= target - nums[i];
            if(numbMap.containsKey(difference)){
                return new int []{i,numbMap.get(difference)};
            }
            numbMap.put(nums[i],i);
        }
        
    
    return new int []{};
    }
}
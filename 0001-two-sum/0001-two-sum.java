class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer,Integer>map=new HashMap<>();
       int[] res = new int[2];
       for(int i=0;i<nums.length;i++){
        int find = target-nums[i];
        if(map.containsKey(find)){
            int index = map.get(find);
            res[0]=i;
            res[1]=index;
            break;
        }
        map.put(nums[i],i);
       } 
       return res;
    }
}
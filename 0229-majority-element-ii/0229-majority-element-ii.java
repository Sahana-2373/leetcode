class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> map= new HashMap<>();
        for(int num:nums){
            if(!map.containsKey(num)){
                map.put(num,1);
            }else{
                map.put(num,map.get(num)+1);
            }
        }
        Set<Integer>set = new HashSet<>();
        List<Integer>lst=new ArrayList<>();
        int n=nums.length;
        for(int num:nums){
            if(map.get(num)>n/3 && !set.contains(num)){
            set.add(num);
            lst.add(num);
            }
        }
        return lst;
    }
}
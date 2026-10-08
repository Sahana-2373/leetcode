class Solution {
    public void sortColors(int[] nums) {
        int zero=0;
        int one=0;
        int two=0;
    for(int val:nums){
    if(val==0)zero++;
    if(val==1)one++;
    if(val==2)two++;
    }
    int idx=0;
    for(int i=0;i<zero;i++){
     nums[idx]=0;
     idx++;
    }
    for(int i=0;i<one;i++){
        nums[idx]=1;
        idx++;
    }
    for(int i=0;i<two;i++){
        nums[idx]=2;
        idx++;
    }
    }
}
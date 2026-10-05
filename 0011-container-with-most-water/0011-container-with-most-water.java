class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int left = 0;
        int right = height.length - 1;
        
        // Move pointers toward each other until they meet
        while (left < right) {
            // 1. Calculate the width between the walls
            int width = right - left;
            
            // 2. The water height is limited by the shorter wall
            int currentHeight = Math.min(height[left], height[right]);
            
            // 3. Calculate current area and track the maximum champion
            int currentWater = width * currentHeight;
            maxWater = Math.max(maxWater, currentWater);
            
            // 4. Move the pointer belonging to the shorter wall inward
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        
        return maxWater;
    }
}

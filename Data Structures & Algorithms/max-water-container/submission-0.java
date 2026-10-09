class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length -1;
        int maxArea = Integer.MIN_VALUE;
        while(left < right){
            int height = 0;
            if(heights[left] <= heights[right]){
                height = heights[left];
            }else{
                height = heights[right];
            }
            
            int width = Math.abs(left - right);
            int area = width * height;
            maxArea = Math.max(maxArea , area);

            if (heights[left] < heights[right]) { left++; } else { right--; }
        }
        return maxArea;
    }
}

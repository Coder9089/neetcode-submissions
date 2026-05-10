class Solution {
    public int maxArea(int[] heights) {
        int max =0;
        int left = 0;
        int right = heights.length - 1;
        int water = 0;
        while(left < right)
        {
           if(heights[left] <= heights[right])
           {
                 water = heights[left] * (right - left);
                 left++;
           }
           else
           {
                  water = heights[right] * (right - left);
                  right--;
           }

           max = max>water ? max : water;
           
        }

        return max;
    }
}

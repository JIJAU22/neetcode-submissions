class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ps[] = new int [n];
        int sp[] = new int [n];
        int result [] = new int [n];
        ps[0] = 1;
        sp[n-1] = 1;
        for(int i=1; i<n ; i++){
            ps[i] = ps[i-1] * nums[i-1];
        }
        for(int i=n-2; i>=0 ; i--){
            sp[i] = sp[i+1] * nums[i+1];
        }
        for(int i=0 ; i<n ; i++){
            result [i] = ps[i] * sp[i];
        }
        return result;
    }
}  

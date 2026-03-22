class Solution {
    public int[] singleNumber(int[] nums) {
        // optimal
        int xor = 0;
        for(int num : nums){
            xor ^= num;
        }

        int mask = (xor & (xor - 1))^xor;
        int b1 = 0 , b2 = 0;
        for(int ele : nums){
            if((ele & mask) != 0) b1^=ele;
            else b2^=ele;
        }
        int[] res = {b1,b2};
        Arrays.sort(res);
        return res;

         
    }
}
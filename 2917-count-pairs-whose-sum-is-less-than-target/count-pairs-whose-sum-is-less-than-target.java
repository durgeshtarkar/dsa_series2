class Solution {
    public int countPairs(List<Integer> nums, int target) {
        // Collections.sort(nums);
        // int start = 0;
        // int end = nums.size() -1;
        // int count = 0;
        // int sum = 0;
        // while(start < end){
        //     sum = nums.get(start) + nums.get(end);
        //     if(sum < target){
        //         count++;
        //         end--;
        //     }else if(sum > target){
        //         start++;
        //     }else{
        //         end--;
        //     }
        // }
        // return count;
        int count = 0;
        for(int i = 0; i < nums.size() ; i++){
            int sum = 0;
            for(int j = i+1; j < nums.size() ;j++){
                sum = nums.get(i) + nums.get(j);
                if(sum < target){
                    count++;
                }
            }
        }
        return count;
    }
}
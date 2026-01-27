class Solution {
    public int[] twoSum(int[] numbers, int target) {
      int start = 0;
      int end = numbers.length-1;
      int sum = 0;
      while(start < end){
        int mid = (start + end)/2;
        sum = numbers[start] + numbers[end];
        if(sum == target){
            return new int[]{start+1,end+1};
        }
        if(target < sum){
            end--;
        }else{
           start++;
        }
        
       
      }
      return new int[]{-1,-1};
    }
}
class Solution {
    public int mostFrequentEven(int[] nums) {
        int max = Integer.MIN_VALUE;
        int res = -1;
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int num : nums){
            if(num%2==0){
                map.put(num, map.getOrDefault(num,0)+1);
                int freq = map.get(num);
                if(freq > max || (freq == max && num < res)){
                    max = freq;
                    res = num;
                }
            }
        }
        return res;
        

    }
}
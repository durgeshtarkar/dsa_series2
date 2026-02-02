class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> l1 = new ArrayList<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
            if(map.get(num) > 1){
                l1.add(num);
            }
        }
        Collections.sort(l1);

        return l1;
    }
}
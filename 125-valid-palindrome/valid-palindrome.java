class Solution {
    public boolean isPalindrome(String s) {
        String one = s.toLowerCase();
        String two = one.replaceAll(",","");
        String res = two.replaceAll("[^a-z0-9]","");
        int i = 0;
        int j = res.length()-1;
        while(i < j){
            if(res.charAt(i)!=res.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;

    }
}
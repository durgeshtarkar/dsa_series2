class Solution {
    public String firstPalindrome(String[] words) {
        for(String word : words ){
            int i = 0 ;
            int j = word.length() - 1;
            String rev = new StringBuilder(word).reverse().toString();
            if(rev.equals(word)){
                return word;
            }
        }

        return "";

    }
}
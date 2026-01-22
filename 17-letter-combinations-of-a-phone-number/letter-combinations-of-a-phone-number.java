class Solution {
    static void letterCombination(String digits , String curr ,int index ,List<String> res){
        String[] map = {
            "",
            "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
        };
        if(curr.length()== digits.length()){
            res.add(curr);
            return;
        }

        int letter = digits.charAt(index) - '0';
        String d = map[letter];
        char[] dArray = d.toCharArray();
        for(char de : dArray){
            letterCombination(digits,curr+de,index+1,res);
        }
        
        
    }
    public List<String> letterCombinations(String digits) {
        List<String>  res = new ArrayList<>();
        letterCombination(digits,"",0,res);
        return res;
    }
}
class Solution {
    public int myAtoi(String s) {
        if(s.length() == 0){
            return 0;
        }
        int i = 0;
        while(i < s.length() && s.charAt(i) == ' '){
            i++;
        }
        if (i == s.length()) return 0;
        int sign = 1;
        if(s.charAt(i)=='-' || s.charAt(i)=='+'){
            sign = (s.charAt(i)=='-')? -1 : 1;
            i++;
        }
        long res = 0;
        while(i < s.length() && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i) - '0';
            res = 10*res + digit;
            if(sign == 1 && res > Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(sign == -1 && -res < Integer.MIN_VALUE){
                return  Integer.MIN_VALUE;
            }
            i++;
        }
        
        return (int)(sign*res);  
    }
}
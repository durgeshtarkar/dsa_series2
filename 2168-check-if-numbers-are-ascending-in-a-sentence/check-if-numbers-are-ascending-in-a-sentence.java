import java.util.StringTokenizer;

class Solution {
    public boolean areNumbersAscending(String s) {
        StringTokenizer st = new StringTokenizer(s, " ");
        int prev = 0;
        while(st.hasMoreTokens()){
            String token = st.nextToken();
            if(isNum(token)){
                int num = Integer.parseInt(token);

                if(num <= prev){
                    return false;
                }
                prev = num;
            }
            
        }
        return true;
    }

    static boolean isNum(String str){
        for(char c : str.toCharArray()){
            if(!Character.isDigit(c)){
                return false;
            }
        }
        return str.length() > 0;
    }
}
import java.util.StringTokenizer;
//- Imports the StringTokenizer class from java.util.
//- StringTokenizer is used to split a string into tokens (substrings) based on a delimiter (here: whitespace " ").

class Solution {
    public boolean areNumbersAscending(String s) {
        StringTokenizer st = new StringTokenizer(s, " ");
        int prev = 0;
        while(st.hasMoreTokens()){ // iterate over all token 
            String token = st.nextToken(); //- Retrieves the next token (word or number) from the string.

            if(isNum(token)){
                int num = Integer.parseInt(token); // convert numeric string to integer

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
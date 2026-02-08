class Solution {
    public int percentageLetter(String s, char letter) {
        char[] ch = s.toCharArray();
        int count = 0;
        int total = ch.length;
        for(int i = 0; i < ch.length ; i++){
            if(ch[i] == letter){
                count++;
            }
        }
        double avg = 0;
        if(count>0){
             avg = (count*100)/(total);
        }
        return  (int)avg;
    }
}
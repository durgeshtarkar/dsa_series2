class Solution {
    public String intToRoman(int num) {
        String[] thousand = {"","M","MM","MMM"};
        String[] hundred = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] tens = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] ones ={"","I","II","III","IV","V","VI","VII","VIII","IX"};

        int th = num/1000;
        int h = (num%1000)/100;
        int t = (num%100)/10;
        int o = (num%10);

        String res = thousand[th]+hundred[h]+tens[t]+ones[o];

        return res;
    }
}
class Solution {
    public int romanToInt(String s) { // IV, IX, XL, XC, CD, CM
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case 'I':
                    sum+= 1;
                    break;
                case 'V':
                    if (i > 0 && s.charAt(i-1) == 'I') {
                        sum += 3;
                    } else {
                        sum += 5;
                    }
                    break;
                case 'X' :
                    if (i > 0 && s.charAt(i-1) == 'I') {
                        sum += 8;
                    } else {
                        sum += 10;
                    }
                    break;
                case 'L' :
                    if (i > 0 && s.charAt(i-1) == 'X') {
                        sum += 30;
                    } else {
                        sum += 50;
                    }
                    break;
                case 'C' :
                    if (i > 0 && s.charAt(i-1) == 'X') {
                        sum += 80;
                    } else {
                        sum += 100;
                    }
                    break;
                case 'D' :
                    if (i > 0 && s.charAt(i-1) == 'C') {
                        sum += 300;
                    } else {
                        sum += 500;
                    }
                    break;                
                case 'M' :
                    if (i > 0 && s.charAt(i-1) == 'C') {
                        sum += 800;
                    } else {
                        sum += 1000;
                    }
                    break;
                }
            }
            return sum;
        }
}
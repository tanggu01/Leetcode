class Solution {
    public boolean judgeCircle(String moves) {
        int[] ori = new int[2];

        for (char c : moves.toCharArray()) {
            switch (c) {
                case 'U':
                    ori[1] += 1;
                    break;
                case 'D':
                    ori[1] -= 1;
                    break;
                case 'L':
                    ori[0] -= 1;
                    break;                    
                case 'R':
                    ori[0] += 1;
                    break;
            }
        }
        if (ori[0] == 0 && ori[1] == 0) return true;
        return false;
    }
}
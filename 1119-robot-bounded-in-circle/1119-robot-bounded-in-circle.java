class Solution {
    public boolean isRobotBounded(String instructions) {
        //cycle: return to (0,0)
        int x = 0;
        int y = 0;
        int[][] dir = {{0, 1}, {-1, 0}, {0, -1}, {1, 0}};

        int currDir = 0; // north

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < instructions.length(); j++) {
                if (instructions.charAt(j) == 'L') { 
                    // currDir += 1;
                    currDir = (currDir + 1) % 4;
                }
                else if (instructions.charAt(j) == 'R') {
                    // currDir -= 1;
                    currDir = (currDir + 3) % 4; //same as -1
                } else {
                    x += dir[currDir][0];
                    y += dir[currDir][1];
                }
            }
            if (x == 0 && y == 0) return true;
        }
        return (x == 0 && y == 0);
    }
}
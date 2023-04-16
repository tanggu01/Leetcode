class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> resList = new ArrayList<>();
        List<Integer> initialList = new ArrayList<>();
        initialList.add(1);
        resList.add(initialList);
        for (int i = 0; i < numRows-1; i++) {
            List<Integer> lastArr = resList.get(i);
            List<Integer> newArr = new ArrayList<>();
            newArr.add(1);
            for (int j = 0; j < i; j++) { // 1. 0+1: 2/ 2. 0+1 1+2  
                newArr.add(lastArr.get(j) + lastArr.get(j+1));
            }
            newArr.add(1);
            resList.add(newArr);
        }
        return resList;
    }
}
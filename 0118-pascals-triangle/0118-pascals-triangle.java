class Solution { //using array
    // public List<List<Integer>> generate(int numRows) {
    //     List<List<Integer>> resList = new ArrayList<>();
    //     int[] lastRow = new int[1];
    //     lastRow[0] = 1;
    //     resList.add(Arrays.stream(lastRow).boxed().collect(Collectors.toList()));
    //     for (int i = 1; i < numRows; i++) {
    //         int[] newRow = new int[i+1];
    //         newRow[0] = 1;
    //         newRow[i] = 1;
    //         for (int j = 1; j < i; j++) {
    //             newRow[j] = lastRow[j-1] + lastRow[j];
    //         }
    //         resList.add(Arrays.stream(newRow).boxed().collect(Collectors.toList()));
    //         lastRow = newRow;
    //     }
    //     return resList;
    // }


    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> resList = new ArrayList<>();
        List<Integer> initialList = new ArrayList<>();
        initialList.add(1);
        resList.add(initialList);
        for (int i = 0; i < numRows-1; i++) {
            //List<Integer> lastArr = resList.get(i);
            List<Integer> newArr = new ArrayList<>();
            newArr.add(1);
            for (int j = 0; j < i; j++) { 
                newArr.add(resList.get(i).get(j) + resList.get(i).get(j+1)); 
                // newArr.add(lastArr.get(j) + lastArr.get(j+1));
            }
            newArr.add(1);
            resList.add(newArr);
        }
        return resList;
    }
}

/* not working [[1,0,0,0,0],[1,1,0,0,0],[1,2,1,0,0],[1,3,3,1,0],[1,4,6,4,1]]

class Solution {
    public List<List<Integer>> generate(int numRows) {
        int[][] resList = new int[numRows][numRows];
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            //int[] lastArr = resList[i-1];
            int[] row = resList[i]; //int[] newArr = new int[i];
            row[0] = 1;
            for (int j = 1; j < i; j++) {  // i-1: 하나 전 Array
                row[j] = resList[i-1][j-1] + resList[i-1][j];  //newArr[j] = lastArr[j-1] + lastArr[j];
            }
            row[i] = 1;
            ArrayList<Integer> arr = new ArrayList<>();
            for (int num : row) {
                arr.add(num);
            }
            res.add(arr); //resList[i] = newArr;
        }
        return res;
    }
    */
        
    

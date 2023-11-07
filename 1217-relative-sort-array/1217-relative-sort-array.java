class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr1) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        int index = 0;
        for (int num : arr2) {
            for (int i = 0; i < frequencyMap.get(num); i++) {
                arr1[index++] = num;
            }
            frequencyMap.remove(num);
        }

        List<Integer> leftovers = new ArrayList<>(frequencyMap.keySet());
        Collections.sort(leftovers);
        for (int num : leftovers) {
            for (int i = 0; i < frequencyMap.get(num); i++) {
                arr1[index++] = num;
            }
        }
        return arr1;
    }        
}
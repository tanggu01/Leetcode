class Solution { 
    public boolean containsDuplicate(int[] nums) { //2. Hashset
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) { 
            if (set.contains(nums[i]))
                return true;
            set.add(nums[i]);
        }
    return false;
    }
    
    /*
    for (int i = 0; i < nums.length; i++) { 
        set.add(nums[i]);
    }
    if (set.size() == nums.length) 
        return false;
    else 
        return true;
    } */
    
    
    /*1. Sorting
    public boolean containsDuplicate(int[] nums) { 
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i+1]) 
                return true;
        }
        return false;
    } */
}
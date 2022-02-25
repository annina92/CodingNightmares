class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length == 0 || nums.length == 1){
            return false;
        }
        
        Map<Integer, Boolean> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i]) && map.get(nums[i]) == true){
                return true;
            } 
            map.put(nums[i], true);
        }
        
        return false;
    }
}
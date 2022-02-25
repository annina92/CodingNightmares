class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for(int j =0; j< nums.length;j++){
            int i =  Math.abs(nums[j])-1;
            nums[i] = Math.abs(nums[i])*-1;
        }
        
        List<Integer> res = new ArrayList<>();
        for(int i =0; i< nums.length;i++){
            
            if(nums[i] >0){
                res.add(i+1);
            }
        }
        return res;
    }
}
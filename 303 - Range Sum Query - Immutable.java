class NumArray {

    public int arr[];
    
    public NumArray(int[] nums) {
        this.arr = new int[nums.length];
        int sum = 0;
        for(int i =0; i<nums.length; i++){
            sum+= nums[i];
            arr[i] = sum;
        }
        
    }
    
    public int sumRange(int left, int right) {
        if(left == 0){
            return this.arr[right];
        }
        else{
            return this.arr[right] - this.arr[left-1];
        }
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
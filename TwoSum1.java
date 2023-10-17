class TwoSum1 {
    public int[] twoSum(int[] nums, int target) {
        
        int[] indicesResult = new int[2];

        int i = 0;
        int j = 1;
        while(i < nums.length-1) {

            for(j = 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    
                    //add indices of numbers
                    indicesResult[0] = i;
                    indicesResult[1] = j;
                    return indicesResult;
                }
            }
            i++;

        }

        return indicesResult;
        
    }
}
class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
       int leftHighestCount = 0;
       int leftTempCounter = 1;
       int rightHighestCount = 0;
       int rightTempCounter = 1;
       for(int i =0; i< nums.length; i++)
        {
           if(nums[i] == 0 )
           {
               if( nums[i] > leftHighestCount)
               {
                  leftHighestCount = nums[i];
               }
              leftTempCounter = 1 ;
           } else {
            leftTempCounter = nums[i] * leftTempCounter;
           
             if(leftTempCounter > leftHighestCount)
           {
              leftHighestCount = leftTempCounter;
           }
           }
          
          
       }

        for(int i = nums.length - 1 ; i >= 0; i--)
        {
            if(nums[i] == 0 )
           {
                if( nums[i] > rightHighestCount)
               {
                  rightHighestCount = nums[i];
               }
              rightTempCounter = 1 ;
           } else {
            rightTempCounter = nums[i] * rightTempCounter;
    
             if(rightTempCounter > rightHighestCount)
           {
              rightHighestCount = rightTempCounter;
           }
           }
        }
        System.out.print(rightHighestCount);
        System.out.print(leftHighestCount);
       if(rightHighestCount > leftHighestCount)
       {
           return rightHighestCount;
       }

       return leftHighestCount;
       
    }
}
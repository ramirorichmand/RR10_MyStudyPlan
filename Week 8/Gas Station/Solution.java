class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int extraFuel=0, reqiuredFuel=0,start=0;
        for(int i=0;i<gas.length;i++){
            extraFuel+=(gas[i]-cost[i]);
            if(extraFuel<0){
                start=i+1;
                reqiuredFuel+=extraFuel;
                extraFuel=0;
            }
        }
        if(reqiuredFuel+extraFuel>=0){
            return start;
        }
        return -1;
    }
}
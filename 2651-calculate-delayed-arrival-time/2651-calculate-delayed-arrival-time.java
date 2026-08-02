class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
       return (arrivalTime + delayedTime) % 24;
    }
}

// public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
//         int reachTime = 0;
//         if(arrivalTime < 24 && delayedTime <= 24){
//             reachTime = (arrivalTime + delayedTime) % 24;
//         }else {
//             return 0;
//         }
//         return reachTime;
// }
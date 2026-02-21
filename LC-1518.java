class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drinked = 0;
        int empBottles = 0;
        while (numBottles > 0) {
            drinked += numBottles;
            empBottles += numBottles;

            numBottles = empBottles/numExchange;
            empBottles = empBottles % numExchange;
        }
        return drinked;
    }
} 
    



class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {

                  int ans=numBottles;

             while ( numBottles >= numExchange){
                  
                int newbottles=numBottles/numExchange;
  
                int remBottles=numBottles % numExchange;

                ans=ans + newbottles;
                
                numBottles= newbottles + remBottles;

            
           
             }

          return ans;
        
    }
}


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = Arrays.stream(candies).max().getAsInt();
        for (int i = 0; i < candies.length; i++) {
            result.add(isGreaterThanMax(candies[i] + extraCandies,max));


        }
        return result;
    }

    public boolean isGreaterThanMax(int value,int max){
       return value>=max;
    }
}
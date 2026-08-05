import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr = new ArrayList<>();
        
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    int leftValue = arr.get(i - 1).get(j - 1);
                    int rightValue = arr.get(i - 1).get(j);
                    row.add(leftValue + rightValue);
                }
            }
            arr.add(row);
        }
        
        return arr;
    }
}

import java.util.*;
public class Solution {

	public static Pair<Integer, Integer> missingAndRepeating(ArrayList<Integer> arr, int n) {
		int sOfn=(n*(n+1))/2;
        int sofnS=((n*(n+1))*(2*n+1))/6;
        int SumA=0;
        int SumB=0;
        for(int i=0;i<arr.size();i++){
           sumA+=arr.get(i);
        }
         for(int i=0;i<arr.size();i++){
           sumA+=arr.get(i)*arr.get(i);
        }
        int X_Y=sumA-sOfn;
        int X2Y=sumA-sofnS;
        int xy=X2Y-X_Y;
        int missing=X_Y+ xy;
        int repeating=xy-missing;
        
Pair<Integer, Integer> p = new Pair<>(missing,repeating);  
        return p;

	}
}
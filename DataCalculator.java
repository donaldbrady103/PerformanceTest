import java.util.*;

public class DataCalculator {

    
    public DataCalculator() {
    }
    
    private int getSize(String[] arr) {
	int toReturn = 0;
	for (int j = 0; j < arr.length; j++) {
	    toReturn++;
	}
	return toReturn;
    }
    
    public int[] calculate(StrategyInterface strategy, ArrayList<String> strings) {
	int size = strings.size();
	int[] toReturn = new int[size];
	for (int j = 0; j < strings.size(); j++) {
	    int calced = strategy.calculate(strings.get(j));
	    toReturn[j] = calced;
	}

	return toReturn;
    }
    
}

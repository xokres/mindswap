package academy.mindswap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class WordHistogram implements Iterable<String> {

    private Map<String, Integer> histogramData;

    public void analyseString(String toAnalyse) {
        histogramData = new HashMap<>();
        for (String word : toAnalyse.toLowerCase().split("(\s|[.,!?:;\"-])+")) { // one or more occurrences of either a whitespace or punctuation
            histogramData.put(word, histogramData.containsKey(word) ? histogramData.get(word) + 1 : 1);
        }
    }

    public int get(String word) {
        return histogramData.get(word);
    }


    @Override
    public Iterator<String> iterator() {
        return histogramData.keySet().iterator();
    }

}

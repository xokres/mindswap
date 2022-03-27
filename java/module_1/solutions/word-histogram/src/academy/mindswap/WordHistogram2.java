package academy.mindswap;

import java.util.HashMap;
import java.util.Map;

public class WordHistogram2 {

    private Map<String, Integer> words;

    public WordHistogram2() {
        words = new HashMap<>();
    }

    public void analyseString(String strToAnalyse) {

        String[] splitWords = strToAnalyse.toLowerCase().split(" ");

        for (String word : splitWords) {
            if (!words.containsKey(word)) {
                words.put(word, 1);
                continue;
            }
           words.put(word, words.get(word) + 1);
        }

        /*int counter = 0;

        for (int i = 0; i < splitWords.length; i++) {
            for (int j = 0; j < splitWords.length; j++) {

                if (splitWords[i].equals(splitWords[j])){
                    counter++;
                }
            }
            words.put(splitWords[i], counter);
            counter = 0;
        }*/
    }

}

package velykyi.vladyslav;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

import static velykyi.vladyslav.Scrambler.scramble;

public class App {

    final static Logger LOGGER = LoggerFactory.getLogger(App.class);

    final static String sourceText = "MyNameIsWhat";

    final static List<String> listOfStrings =
        Arrays.asList("MyNameIsWhat", "MyNameIsWho", "MyNameIs", "MeShady", "Tango", "Alpha", "Yankee", "Oscar");

    public static void main(String[] args) {
        try {
            LOGGER.info("Generating anagrams");
            for (int i = 1; i <= 5; i++) {
                LOGGER.info("Anagrams by method #" + i + ": \n" + scramble(sourceText, null, i));
            }
            for (int i = 6; i <= 8; i++) {
                LOGGER.info("Anagrams by method #" + i + ": \n" + scramble(null, listOfStrings, i));
            }
            System.exit(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

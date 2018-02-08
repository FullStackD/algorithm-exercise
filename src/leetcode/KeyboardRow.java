package leetcode;

import java.util.stream.Stream;

public class KeyboardRow {

    public String[] findWords(String[] words) {
        //size -> new String[size]  equals String[]::new
        return Stream.of(words).filter(s -> s.toLowerCase().matches("[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*"))
                .toArray(size -> new String[size]);
    }

}


}import java.util.ArrayList;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        String[] words = {"abc", "bcd", "aaaa", "cbc"};
        char x = 'a';
        List<Integer> indices = findWordsContainingCharacter(words, x);
        System.out.println("Output: " + indices);
    }

    public static List<Integer> findWordsContainingCharacter(String[] words, char x) {
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) {
                indices.add(i);
            }
        }
        return indices;
    }
}

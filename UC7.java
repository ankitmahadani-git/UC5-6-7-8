import java.util.HashMap;
import java.util.Map;

public class UC7 {

    // Static inner class to store character and its pattern
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        Map<Character, CharacterPatternMap> map = new HashMap<>();

        map.put('O', new CharacterPatternMap('O', new String[]{
                "***",
                "* *",
                "* *",
                "* *",
                "***"
        }));

        map.put('P', new CharacterPatternMap('P', new String[]{
                "***",
                "* *",
                "***",
                "*  ",
                "*  "
        }));

        map.put('S', new CharacterPatternMap('S', new String[]{
                "***",
                "*  ",
                "***",
                "  *",
                "***"
        }));

        String text = "OOPS";

        for (int row = 0; row < 5; row++) {
            StringBuilder line = new StringBuilder();

            for (char c : text.toCharArray()) {
                CharacterPatternMap pattern = map.get(c);
                line.append(pattern.getPattern()[row]).append(" ");
            }

            System.out.println(line);
        }
    }
}

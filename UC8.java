import java.util.HashMap;
import java.util.Map;

public class UC8 {

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                "***",
                "* *",
                "* *",
                "* *",
                "***"
        });

        patternMap.put('P', new String[]{
                "***",
                "* *",
                "***",
                "*  ",
                "*  "
        });

        patternMap.put('S', new String[]{
                "***",
                "*  ",
                "***",
                "  *",
                "***"
        });

        renderBanner("OOPS", patternMap);
    }

    static void renderBanner(String text, Map<Character, String[]> patternMap) {

        int height = 5;

        for (int row = 0; row < height; row++) {

            StringBuilder line = new StringBuilder();

            for (char c : text.toCharArray()) {
                String[] pattern = patternMap.get(c);
                line.append(pattern[row]).append(" ");
            }

            System.out.println(line.toString());
        }
    }
}

public class UC6 {

    public static void main(String[] args) {

        String[] banner = {
                String.join("", repeat("*", 25)),
                String.join("", "*", " ", buildO(1), " ", buildO(1), " ", buildP(1), " ", buildS(1), " ", "*"),
                String.join("", "*", " ", buildO(2), " ", buildO(2), " ", buildP(2), " ", buildS(2), " ", "*"),
                String.join("", "*", " ", buildO(3), " ", buildO(3), " ", buildP(3), " ", buildS(3), " ", "*"),
                String.join("", "*", " ", buildO(4), " ", buildO(4), " ", buildP(4), " ", buildS(4), " ", "*"),
                String.join("", "*", " ", buildO(5), " ", buildO(5), " ", buildP(5), " ", buildS(5), " ", "*"),
                String.join("", repeat("*", 25))
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }

    static String buildO(int line) {
        switch (line) {
            case 1:
            case 5: return "***";
            case 2:
            case 3:
            case 4: return "* *";
        }
        return "";
    }

    static String buildP(int line) {
        switch (line) {
            case 1:
            case 2: return "** ";
            case 3: return "***";
            case 4:
            case 5: return "*  ";
        }
        return "";
    }

    static String buildS(int line) {
        switch (line) {
            case 1: return "***";
            case 2: return "*  ";
            case 3: return "***";
            case 4: return "  *";
            case 5: return "***";
        }
        return "";
    }

    static String repeat(String ch, int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += ch;
        }
        return result;
    }
}
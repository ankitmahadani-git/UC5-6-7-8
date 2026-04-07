public class UC5 {

    public static void main(String[] args) {

        String[] banner = {
            String.join("", "*","*","*","*","*","*","*","*","*","*"),
            String.join("", "*"," "," ","O","O","P","S"," "," ","*"),
            String.join("", "*"," "," ","B","A","N","N","E","R","*"),
            String.join("", "*"," "," ","A","P","P"," "," "," ","*"),
            String.join("", "*"," "," ","U","C","5"," "," "," ","*"),
            String.join("", "*"," "," ","D","E","M","O"," "," ","*"),
            String.join("", "*","*","*","*","*","*","*","*","*","*")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}
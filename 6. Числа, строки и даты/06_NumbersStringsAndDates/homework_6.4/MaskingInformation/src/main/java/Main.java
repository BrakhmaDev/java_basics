import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String placeholder = scanner.nextLine();
        System.out.println(searchAndReplaceDiamonds(text, placeholder));
    }

    public static String searchAndReplaceDiamonds(String text, String placeholder) {
        int flag = 1;
        if (text.contains("<") && text.contains(">")) {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == '<') {
                    builder.append(placeholder);
                    flag = 0;
                } else if (text.charAt(i) == '>') {
                    flag = 1;
                } else if (flag == 1) {
                    builder.append(text.charAt(i));
                }

            }
            return builder.toString();
        } else {
            return text;
        }
    }

}
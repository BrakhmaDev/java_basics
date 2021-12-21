import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String placeholder = scanner.nextLine();
        System.out.println(searchAndReplaceDiamonds(text, placeholder));
    }

    public static String searchAndReplaceDiamonds(String text, String placeholder) {
        int count = -1;
        int flag = 1;
        if (text.contains("<") && text.contains(">")) {
            String stringBuilder = "";
            for (int i = 0; i < text.length(); i++) {
                count++;
                if (text.charAt(i) == '<') {
                    stringBuilder += placeholder;
                    count = 0;
                    flag = 0;
                } else if (text.charAt(i) == '>') {
                    count = 0;
                    flag = 1;
                } else if (flag == 1) {
                    count = 0;
                    stringBuilder += String.valueOf(text.charAt(i));
                }

            }
            return stringBuilder;
        } else {
            return text;
        }
    }

}
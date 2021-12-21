public class Alphabet {
  public static void main(String[] args) {
    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    for (int i =0; i < alphabet.length(); i++) {
      char oneAlph = alphabet.charAt(i);
      int alphCode = (int) oneAlph;
      System.out.println(oneAlph + " - " + alphCode);
    }
  }
}

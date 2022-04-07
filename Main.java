import edu.barrons.bowling.alan.Sentence;
import java.util.*;

class Main {
  public static void main(String[] args) {
    System.out.println("Type a sentence.");
    Scanner scan = new Scanner(System.in);
    Sentence a = new Sentence(scan.nextLine());
    System.out.println(a.getBlankPositions());
    System.out.println(a.countWords());
    String[] words = a.getWords();
    for (int i = 0; i < words.length; i++) {
      System.out.println(words[i]);
    }
  }
}
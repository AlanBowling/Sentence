package edu.barrons.bowling.alan;

import java.util.*;
import edu.jenks.dist.barrons.AbstractSentence;

public class Sentence extends AbstractSentence {
  private String sentence;
  
  public Sentence() {
    sentence = null;
  }

  public Sentence(String snt) {
    sentence = snt;
  }

  public List<Integer> getBlankPositions() {
    List<Integer> spaces = new ArrayList<>();
    for (int i = 0; i < sentence.length(); i++) {
      if (sentence.substring(i, i + 1).equals(" ")) {
        spaces.add(i);
      }
    }
    return spaces;
  }

  public int countWords() {
    int wrdcnt = 0;
    for (int i = 0; i < sentence.length(); i++) {
      if (sentence.substring(i, i + 1).equals(" ")) {
        wrdcnt++;
      }
    }
    return wrdcnt + 1;
  }

  public String[] getWords() {
    String[] wrds = new String[countWords()];
    List<Integer> blanks = getBlankPositions();
    if (countWords() > 1) {
      int start = 0;
      int end = blanks.get(0);
      for (int i = 0; i < wrds.length; i++) {
        if (i < wrds.length - 1) {
          end = blanks.get(i);
        } else {
          end = sentence.length();
        }
        wrds[i] = sentence.substring(start, end);
        if (i < wrds.length - 1) {
          start = blanks.get(i) + 1;
        }
      }
      return wrds;
    }
    wrds[0] = sentence;
    return wrds;
  }

}
/**
 * File:fcState2.java Author:Wangjianxi41 Date :20211023
 */

// step1: create .java file
// step2: edit.java File,save File
// step3: under cmd, javac .java -> compile java file
// step4: java . java -> run java file

public class ifExample10 {
  public static void main(String[] args) {
    try {
      int result = 1;
      int i = 1;
      do {
        result *= i;
        i++;
      } while (i <= 10);
      System.out.println("10! =" + result);

    } catch (Exception e) {

    } finally {
    }
  }
}

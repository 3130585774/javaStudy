/**
 * File:fcState2.java Author:Wangjianxi41 Date :20211023
 */

// step1: create .java file
// step2: edit.java File,save File
// step3: under cmd, javac .java -> compile java file
// step4: java . java -> run java file

public class ifExample15 {
  public static void main(String[] args) {
    try {
      int i, j;
      itcast: for (i = 1; i <= 9; i++) {
        for (j = 1; j <= i; j++) {
          if (i > 4) {
            break itcast;
          }
          System.out.println(" * ");
        }
        System.out.println("\n");

      }

    } catch (Exception e) {
    } finally {
    }
  }
}

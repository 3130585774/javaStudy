/**
 * File:fcState2.java Author:Wangjianxi41 Date :20211023
 */

// step1: create .java file
// step2: edit.java File,save File
// step3: under cmd, javac .java -> compile java file
// step4: java . java -> run java file

public class ifExample17 {
  public static void main(String[] args) {
    try {
      for (int i = 1; i <= 10; i++) {
        if (i % 3 == 0) {
          continue;
        }
        System.out.println(i);
      }

    } catch (Exception e) {

    } finally {

    }
  }
}

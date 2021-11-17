/**
 * File:fcState2.java Author:Wangjianxi41 Date :20211023
 */

// step1: create .java file
// step2: edit.java File,save File
// step3: under cmd, javac .java -> compile java file
// step4: java . java -> run java file

public class ifExample13 {
  public static void main(String[] args) {
    try {
      int sum = 0;
      int i = 1;
      for (; i <= 10;i++) {
        sum += i;
      }
      System.out.println("1+2+...+10=" + sum);
    } catch (Exception e) {
    } finally {

    }
  }
}

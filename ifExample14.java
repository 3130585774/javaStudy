/**
 * File:fcState2.java Author:Wangjianxi41 Date :20211023
 */

// step1: create .java file
// step2: edit.java File,save File
// step3: under cmd, javac .java -> compile java file
// step4: java . java -> run java file

public class ifExample14 {
     public static void main(String[] args) {
          try {
               int i = 1, n = 0;
               while (i <= 100) {
                    if (i % 3 == 0) {
                         System.out.println(i);
                         n++;
                    }
                    if (n == 5)
                         break;
                    i++;
               }
          } catch (Exception e) {

          } finally {

          }
     }
}

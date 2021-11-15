/**
 * File:fcState2.java Author:Wangjianxi41 Date :20211023
 */

// step1: create .java file
// step2: edit.java File,save File
// step3: under cmd, javac .java -> compile java file
// step4: java . java -> run java file

public class ifExample16 {
   public static void main(String[] args) {
      try {
         int sum = 0;
         for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
               continue;
            }
            sum += i;
         }
         System.out.println(" sum = " + sum);

      } catch (Exception e) {

      } finally {

      }
   }
}

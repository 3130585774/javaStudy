import java.util.Scanner;

/**
 * File:fcState2.java Author:Wangjianxi41 Date :20211023
 */

// step1: create .java file
// step2: edit.java File,save File
// step3: under cmd, javac .java -> compile java file
// step4: java . java -> run java file

public class ifExample11 {
   static Scanner sc = new Scanner(System.in);

   public static void main(String[] args) {
      try {
         int number = 17, guess;

         System.out.print(" 你猜测的数:");
         guess = sc.nextInt();
         while (guess != number) {
            if (guess > number)
               System.out.println(" 大了!");
            if (guess < number)
               System.out.println(" 小了!");
            System.out.print(" 你猜测的数:");
            guess = sc.nextInt();
         }

         System.out.println(" 恭喜你，猜对了! ");

      } catch (Exception e) {

      } finally {

      }
   }
}

/**
 * File:fcState2.java Author:Wangjianxi41 Date :20211023
 */

// step1: create .java file
// step2: edit.java File,save File
// step3: under cmd, javac .java -> compile java file
// step4: java . java -> run java file

public class ifExample12 {
  public static void main(String[] args) {
    try {
      int sum = 0; // 定义变量sum，用于记住累加的和
      for (int i = 1; i <= 4; i++) { // i 的值会在1~4之间变化
        sum += i; // 用于实现sum和i的累加
      }
      System.out.println(" sum = " + sum); // 打印累加的和

    } catch (Exception e) {

    } finally {

    }
  }
}

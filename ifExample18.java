/**
 * File:fcState2.java Author:Wangjianxi41 Date :20211023
 */

// step1: create .java file
// step2: edit.java File,save File
// step3: under cmd, javac .java -> compile java file
// step4: java . java -> run java file

public class ifExample18 {
  public static void main(String[] args) {
    try {
      double r1 = 8.0, r2 = 5.0;
      System.out.println(" 圆1的面积=" + area(r1));
      System.out.println(" 圆2的面积=" + area(r2));

    } catch (Exception e) {

    } finally {

    }
  }

  public static double area(double r) {
    return Math.PI * r * r;
  }
}

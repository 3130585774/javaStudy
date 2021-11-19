/**
  * File:fcState.java
  * Author:Wangjianxi41
  * Date :20211023
  */

// step1: create .java file
// step2: edit.java File,save File
// step3: under cmd, javac .java     -> compile java file
// step4: java .java                -> run java file

import java.util.Scanner; //header

public class fcState {
	/*
	 * java 学习
	 */
	private static final Scanner SCANNER = new Scanner(System.in);

	public static void main(String[] args) {
		try {
			// 20211023
			// System.out,println("This is my first output");
			boolean boolTemp = false;// true false
			// System.out.println("boolTem ="+boolTemp);
			System.out.println("boolTemp=" + boolTemp);
			// byte bTemp =(byte)boolTemp;
			int iX = 0;
			int iY = 1;
			System.out.println("iX =" + iX + "iY =" + iY);
			boolTemp = (iX++ >= iY);
			System.out.println("boolTemp = " + boolTemp);
			System.out.println("iX =" + iX + "iY=" + iY);
			if (++iX > iY) {
				System.out.println("iX =" + iX + "iY=" + iY);
				System.out.println("boolTemp =" + boolTemp);
				System.out.println("after if");
			}
			// System.out.println("This is finally");

			// 20211025
			int iTemp;
			iTemp = (int) (Math.random() * 100 + 1);// [1,100]
			System.out.println("iTemp =" + iTemp);
			if (iTemp++ >= 50) {
				System.out.println("iTemp = " + iTemp);
				System.out.println("running in if");
			} else {
				System.out.println("iTemp = " + iTemp);
				System.out.println("running in else");
			}
			System.out.println("running out of if");
			// 20211027
			// [0,10) [10,20) [20,30) [30,40) [40,50) [50,60) [60,70) [70,80) [80,90)
			// [90,100]
			iTemp = (int) (Math.random() * 100 + 1);// [1,100]
			if ((iTemp >= 0) && (iTemp < 10)) {
				System.out.println("iTemp = " + iTemp);
				System.out.println("in if [0,10) ");
			} else if ((iTemp >= 10) && (iTemp < 20)) {
				System.out.println("iTemp = " + iTemp);
				System.out.println("in if [10,20) ");
			} else if ((iTemp >= 20) && (iTemp < 30)) {
				System.out.println("iTemp = " + iTemp);
				System.out.println("in if [20,30) ");
			} else if ((iTemp >= 30) && (iTemp < 40)) {
				System.out.println("iTemp = " + iTemp);
				System.out.println("in if [30,40) ");
			} else if ((iTemp >= 40) && (iTemp < 50)) {
				System.out.println("iTemp = " + iTemp);
				System.out.println("in if [40,50) ");
			} else if ((iTemp >= 50) && (iTemp < 60)) {
				System.out.println("iTemp = " + iTemp);
				System.out.println("in if [50,60) ");
			} else if ((iTemp >= 60) && (iTemp < 70)) {
				System.out.println("iTemp = " + iTemp);
				System.out.println("in if [60,70) ");
			} else if ((iTemp >= 70) && (iTemp < 80)) {
				System.out.println("iTemp = " + iTemp);
				System.out.println("in if [70,80) ");
			} else if ((iTemp >= 80) && (iTemp < 90)) {
				System.out.println("iTemp = " + iTemp);
				System.out.println("in if [80,90) ");
			} else {
				System.out.println("iTemp = " + iTemp);
				System.out.println("in if [90,100] ");
			}

			// 20211101
			int iTempLoop = 0; // iTemp loop variant

			while (iTempLoop < 10) { // true in loop
				System.out.println("in while");
				iTempLoop++; // variant changes
			}
			// false out of loop
			System.out.println("after while");

			// 20211103
			// sum [1-100]The sum of the occasional
			iTempLoop = 2;
			int sum = 0;
			while (iTempLoop <= 100) {
				// sum = sum + iTempLoop;
				// iTempLoop = iTempLoop + 2;
				sum += iTempLoop;
				iTempLoop += 2;
			}
			System.out.println("sum = " + sum);

			// 20211108
			for (int i = 0; i <= 100; i++) {
				sum = sum + i;
			}
			System.out.println("sum = " + sum);

			sum = 0;
			for (int i = 100; i <= 200; i += 2) {
				sum = sum + i;
			}
			System.out.println("sum = " + sum);
			System.out.println("My school number is 41");

			sum = 0;
			for (int i = 1; i <= 100; i++) {
				if (i % 5 != 0) {
					sum += i;
				}
			}
			System.out.println(sum);

			// 20211110
			System.out.println("please imput Integer"); // accept keyboard input
			int sum2 = 0;
			//iTemp = SCANNER.nextInt();
			iTemp = 41;
			System.out.println("input INT = " + iTemp);
			sum2 = 0;
			for (int a = 1; a <= iTemp; a++) {
				sum2 += iTemp;
			}
			System.out.println("for ----" + sum2);
			int a = 1;
			sum2 = 0;
			while (a <= iTemp) {
				sum2 += iTemp;
				a++;
			}
			System.out.println("while ----" + sum2);

			// 202111151410
			iTemp = (int) (Math.random() * 20 + 1);
			int iN = iTemp;
			int i = 1;
			System.out.println(iN);
			while (i <= iN) {
				if(i%2==0){
					i++;
					System.out.println("");
					continue;
				}
				for (int j = 0; j < iN - i; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < 2 * i - 1; j++) {
					//System.out.print((char) (i + 64));
					System.out.print("*");
				}
				System.out.println("");
				i++;
			}
		} catch (Exception e) {
			System.out.println("Error!");

		} finally {
			System.out.println("This is finally");
		}
	}
}
//Test
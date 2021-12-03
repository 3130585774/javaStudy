public class OpArray {
	// main: ontrance of function
	static final int SZARRAY = 16;

	public static void main(String[] args) {

		try {
			// 20211122
			// byte short int long float double char boolean
			// array

			char cTemp = 'a';
			int iTemp = cTemp;
			System.out.println("iTemp = " + iTemp);

			// defintion of array

			// size of array 2 n
			// size is not real num
			
			char[] arrTemp = new char[SZARRAY];

			for (int i = 0; i < SZARRAY; i++) {
				arrTemp[i] = (char) (cTemp + i);
			}
			System.out.println("arrTemp = " + arrTemp);

			for (int i = 0; i < SZARRAY; i++) {
				System.out.print(arrTemp[i] + " ");
			}
			System.out.println("");

			// 20211129 1419
			int iarrsum = 0;
			int[] iarr = new int[SZARRAY];


			for (int i = 1; i < SZARRAY; i++) {
				iarr[i] = (int) (Math.random() * 100 + 1);
				iarrsum += iarr[i];
			}

			int iFound = (int) (Math.random() * 100 + 1);

			iarr[0] = iFound;

			for (int i = 0; i < SZARRAY; i++)
			{
				System.out.println(iarr[i]);
			}
			System.out.println("");
			
			boolean bF = false;
			int con = 0;
			int bigthan = 0;
			for (int i = 1; i < SZARRAY; i++) {
				if (iarr[0] == iarr[i]) {
					System.out.println(iFound + " is found");
					bF = true;
					con += 1;
				}
				if(iarr[0] < iarr[i]){
					bigthan += 1;
				}
			}
			if (bF == false){
			System.out.println(iFound + " not found");
			}
			float adv = (float)iarrsum / SZARRAY;
			System.out.println("iFound appear "+con);
			System.out.println("bigger than iFound have "+bigthan);
			System.out.println("advtage = "+adv);

		} catch (Exception e) {

		}
	}

}

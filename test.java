public class test {
    public static void main(String[] args) {
        int iTemp;
        iTemp = (int) (Math.random() * 20 + 1);
        int iN = iTemp;
        int i = 1;
        System.out.println(iN);
        while (i <= iN) {
            for (int j = 0; j < iN - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print((char) (i + 64));
            }
            System.out.println("");
            i++;
        }
    }
}

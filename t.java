public class t {
    static final int SZARRAY = 16;
    public static void main(String[] args) {
        char cTemp = 'a';
        char[] arrTemp = new char[SZARRAY];
        arrTemp[0] = 'a';
        arrTemp[1] = 's';
        arrTemp[15] = 'b';
        System.out.println(arrTemp[1]);
        System.out.println(arrTemp[0]);



        for (int i = 0; i < SZARRAY; i++)
         {
            arrTemp[i] = (char) (cTemp + i);
        }
    }
    
}

public class Xin {
    public static void main(String argv[]) {
        for (float y = (float) 1.5; y > -1.5; y -= 0.1) {
            for (float x = (float) -1.5; x < 1.5; x += 0.038) {
                float a = x * x + y * y - 1;
                if ((a * a * a - x * x * y * y * y) <= 0.0) {

                    System.out.print("*");

                } else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
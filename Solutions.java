public class Solutions {
    
    public static int max3(int x, int y, int z) {
        if (x >= y && x >= z) {
            return x;
        }
        if (x >= y && x < z) {
            return z;
        }
        if (x < y && x < z) {
            return z;
        }
        return y;
    }

    public static double max3(double x, double y, double z) {
        if (x >= y && x >= z) {
            return x;
        }
        if (x >= y && x < z) {
            return z;
        }
        if (x < y && x < z) {
            return z;
        }
        return y;
    }
    
    public static void main(String[] args) {
        System.out.println("The greatest of the three integers is " + max3(1, 2, 0.0000001));
    }
}
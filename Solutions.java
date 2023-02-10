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

    public static boolean odd(boolean x, boolean y, boolean z) {
        if (x == true && y == true && z == true){
            return true; }
        if (x == true && y == false && z == false) {
            return true; }
            if (x == false && y == true && z == false) {
                return true; }
                if (x == false && y == false && z == true) {
                    return true; }
        return false;
        }

    public static boolean majority(boolean x, boolean y, boolean z) {
        if (x == true && y == true || x == true && z == true || y == true && z == true) {
            return true;
        }
        return false;
    }

    public static double trigIdentity(double x) {
        double result = Math.pow(Math.sin(x), 2) + Math.pow(Math.cos(x), 2);
        return result;
    }
    
    
    public static void main(String[] args) {
        System.out.println("The greatest of the three integers is " + max3(1, 2, 0.0000001));
        System.out.println("The amount of true arguments has determined the argument to be " + odd(false, true, false));
        System.out.println("The majority of the arguments are " + majority(true, true, false));
        System.out.println("trigidentity answer is " + trigIdentity(5));
    }
}
// good!
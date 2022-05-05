package day25_CustomMethodOverloading;

public class MaximumNumberArray_OverLoading {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5};
        double[] doubleArray = {1.1,2.1,3.1,4.1,5.1};
        long[] longArray = {1,2,3,4,5};
        short[] shortArray = {1,2,3,4,5};
        float[] floatArray = {1,2,3,4,5};
        byte[] byteArray = {1,2,3,4,5};

        int intgr = max(intArray);
        double db = max(doubleArray);
        long lng = max(longArray);
        short srt = max(shortArray);
        float fl = max(floatArray);
        byte byt = max(byteArray);

        System.out.println(intgr);
        System.out.println(db);
        System.out.println(lng);
        System.out.println(srt);
        System.out.println(fl);
        System.out.println(byt);
    }

    public static int max(int[] input){
        int max = input[0];
        for (int i : input) {

            if (max < i){
                max = i;
            }
        }
        return max;
    }
    public static double max(double[] input){
        double max = input[0];
        for (double i : input) {

            if (max < i){
                max = i;
            }
        }
        return max;
    }
    public static long max(long[] input){
        long max = input[0];
        for (long i : input) {

            if (max < i){
                max = i;
            }
        }
        return max;
    }
    public static short max(short[] input){
        short max = input[0];
        for (short i : input) {

            if (max < i){
                max = i;
            }
        }
        return max;
    }
    public static float max(float[] input){
        float max = input[0];
        for (float i : input) {

            if (max < i){
                max = i;
            }
        }
        return max;
    }
    public static byte max(byte[] input){
        byte max = input[0];
        for (byte i : input) {

            if (max < i){
                max = i;
            }
        }
        return max;
    }

}

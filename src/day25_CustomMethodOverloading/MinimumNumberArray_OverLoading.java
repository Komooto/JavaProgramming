package day25_CustomMethodOverloading;

public class MinimumNumberArray_OverLoading {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5};
        double[] doubleArray = {1.1,2.1,3.1,4.1,5.1};
        long[] longArray = {1,2,3,4,5};
        short[] shortArray = {1,2,3,4,5};
        float[] floatArray = {1,2,3,4,5};
        byte[] byteArray = {1,2,3,4,5};

        int intgr = min(intArray);
        double db = min(doubleArray);
        long lng = min(longArray);
        short srt = min(shortArray);
        float fl = min(floatArray);
        byte byt = min(byteArray);

        System.out.println(intgr);
        System.out.println(db);
        System.out.println(lng);
        System.out.println(srt);
        System.out.println(fl);
        System.out.println(byt);

    }

    public static int min(int[] input){
        int min = input[0];
        for (int i : input) {

            if (min > i){
                min = i;
            }
        }
        return min;
    }
    public static double min(double[] input){
        double min = input[0];
        for (double i : input) {

            if (min > i){
                min = i;
            }
        }
        return min;
    }
    public static long min(long[] input){
        long min = input[0];
        for (long i : input) {

            if (min > i){
                min = i;
            }
        }
        return min;
    }
    public static short min(short[] input){
        short min = input[0];
        for (short i : input) {

            if (min > i){
                min = i;
            }
        }
        return min;
    }
    public static float min(float[] input){
        float min = input[0];
        for (float i : input) {

            if (min > i){
                min = i;
            }
        }
        return min;
    }
    public static byte min(byte[] input){
        byte min = input[0];
        for (byte i : input) {

            if (min > i){
                min = i;
            }
        }
        return min;
    }

}

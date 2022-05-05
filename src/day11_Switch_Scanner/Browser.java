package day11_Switch_Scanner;

import java.util.Scanner;

public class Browser {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //String browserName;
        //String browserName = "chrome";
        String browserName = scan.next();
        String result;
        //String browserName = "chrome";
        //boolean validBrowser = browserName == "chrome" || browserName == "firefox" || browserName == "opera" || browserName == "safari" || browserName == "edge";

        if (browserName .equals("chrome") || browserName .equals("firefox") || browserName .equals("opera") || browserName .equals("safari") || browserName .equals("edge") ) {
            if (browserName .equals("chrome")) {
                result = "Chrome Browser is Selected";
            } else if (browserName .equals("firefox")) {
                result = "Firefox Browser is Selected";
            } else if (browserName .equals("opera")) {
                result = "Opera Browser is Selected";
            } else if (browserName .equals("safari")) {
                result = "Safari Browser is Selected";
            } else {
                result = "Edge Browser is Selected";
            }

            } else {
                result = "Invalid";
            }

        System.out.println(result);


        }
    }


package com.grinfelds;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    public static void main(String[] args) {
        System.out.println(getDurationString(-1,5));
        System.out.println(getDurationString(-6));
        System.out.println(getDurationString(-7));
    }

    public static String  getDurationString(int minutes, int seconds) {
        if (minutes >= 0 && seconds >= 0 && seconds <= 59) {
            int hours = minutes / 60;
            int remMinutes = minutes % 60;

            String hoursString= hours + "h";
            if (hours < 10) {
                hoursString = "0" + hoursString;
            }

            String minutesString= remMinutes + "m";
            if (remMinutes < 10) {
                minutesString = "0" + minutesString;
            }

            String secondsString= seconds + "s";
            if (seconds < 10) {
                secondsString = "0" + secondsString;
            }

            String result = hoursString + " " + minutesString + " " + secondsString;

                    return result;
        }
        return INVALID_VALUE_MESSAGE;
    }
    public static String  getDurationString(int seconds) {
        if (seconds >= 0) {
            int minutes = seconds/60;
            int remSeconds = seconds%60;

            return getDurationString(minutes, remSeconds);
        }
        return INVALID_VALUE_MESSAGE;
    }
}

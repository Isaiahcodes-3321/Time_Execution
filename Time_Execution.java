package sideproject.Syda;

import java.util.Scanner;

public class Time_Execution {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

//        calculating the start time of the program
        long startTime = System.currentTimeMillis();

        System.out.println(" The program its calculating the time period you spent on this code \n time execution \n");

        String input = scanner.next();

        //        calculating the start time of the program
        long endTime = System.currentTimeMillis();
        long showendtime = endTime - startTime;

        //        calculating in secound
        double secondsTime = showendtime / 1000.0;

//        calculating in miniute
        long totalTimeInMinutes = showendtime / (1000 * 60);

//        calculating in hours
        double hours = (double) showendtime / (1000 * 60 * 60);


        if (showendtime < 60000) {
            System.out.println(" \n" + " Execution time :  " + secondsTime + " Seconds ");
        } else if (showendtime < 3600000) {
            System.out.println(" \n" + " Execution time :  " + totalTimeInMinutes + " Minutes " + secondsTime + " Seconds");
        } else {
            System.out.println(" \n" + " Execution time :  " + hours + " Hours " + totalTimeInMinutes + " Minutes " + secondsTime + " Seconds");

        }

    }

}

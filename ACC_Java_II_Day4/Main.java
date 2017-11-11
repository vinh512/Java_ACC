package edu.acc.java2.taxes;

/*
    Use the enormous tax data set from 2014 linked below to deploy an executable 
    jar named taxes.jar whose main program displays the total number of income tax 
    returns filed in the data set, the total amount of taxed income reported, and 
    the total amount of tax collected.
*/

public class Main {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java -jar edu.acc.java2.taxes.jar [file csv]");
            return;
        }
        
        final String pattern = "([\\w]+\\.\\d+)(?:[^,]*,){119}([\\w]+\\.\\d+),([\\w]+\\.\\d+)";
               
       
    }
    
}

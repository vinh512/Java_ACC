package edu.acc.java2.taxes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
    Use the enormous tax data set from 2014 linked below to deploy an executable 
    jar named taxes.jar whose main program displays the total number of income tax 
    returns filed in the data set, the total amount of taxed income reported, and 
    the total amount of tax collected.
*/

public class Main {

    public static void main(String[] args) {
        System.out.println("program started");
        if (args.length != 1) {
            System.out.println("Usage: java -jar edu.acc.java2.taxes.jar [file csv]");
            return;
        }
        
        final String pattern = "([\\w]+\\.\\d+)(?:[^,]*,){119}([\\w]+\\.\\d+),([\\w]+\\.\\d+)";
        final Pattern patt = Pattern.compile(pattern);
        String strN1, strN11901, strA11901;
        double total = 0.0;
        
        try (BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
            String line;
            System.out.println("entered try block");
            while ((line = br.readLine()) != null) {
                Matcher m = patt.matcher(line);
                if (m.find()) {
                    strN1 = m.group(1);
                    strN11901 = m.group(2);
                    strA11901 = m.group(3);
                    System.out.println("N1: " + strN1);
                    
                    total += update(strN1, strN11901, strA11901);   
                }
            }
            System.out.printf("The total of N1 is: %.4f\n", total);
        } catch (FileNotFoundException fnfe){
            System.out.println("File not found");
            
        } catch (IOException ioe) {
            System.out.println("Error");
        }
    }
    
    private static double update(String strN1, String strN11901, String strA11901) {
        double total = 0.0;
        double numN1     = Double.parseDouble(strN1); 
        double numN11901 = Double.parseDouble(strN11901);
        double numA11901 = Double.parseDouble(strA11901);        
        
        return numN1;
        
    }
    
}

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
        if (args.length != 1) {
            System.out.println("Usage: java -jar edu.acc.java2.taxes.jar [file csv]");
            return;
        }
        
        final String pattern = "([\\w]+\\.\\d+)(?:[^,]*,){119}([\\w]+\\.\\d+),([\\w]+\\.\\d+)";
        final Pattern patt = Pattern.compile(pattern);
        String N1, N11901, A11901;
        
        try (BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
            String line;
            while ((line = br.readLine()) != null) {
                Matcher m = patt.matcher(line);
                if (m.find()) {
                    N1 = m.group(1);
                    N11901 = m.group(2);
                    A11901 = m.group(3);
                }
            }
        } catch (FileNotFoundException fnfe){
            System.out.println("File not found");
        } catch (IOException ioe) {
            System.out.println("Error");
        }
    }
    
}

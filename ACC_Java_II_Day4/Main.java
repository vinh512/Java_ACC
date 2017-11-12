package edu.acc.java2.taxes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
    Use the enormous tax data set from 2014 to deploy an executable jar named
    taxes.jar whose main program displays the total number of income tax returns
    filed in the data set, the total amount of taxed income reported and the 
    total amount of tax collected.
    N1     - Number of returns
    N11901 - Number of returns with tax due at time of filing
    A11901 - Tax due at time of filing
*/

public class Main {

    public static void main(String[] args) {
        // ensures user provides a file argument when executing
        if (args.length != 1) {
            System.out.println("Usage: java -jar edu.acc.java2.taxes.jar "
                    + "[file csv]");
            return;
        }
        
        // the regex matches the first group(N1), then skips the next 119 items
        // and then matches the next couple groupings (N11901, A11901)
        final String PATTERN = "([\\w]+\\.\\d+)(?:[^,]*,){119}([\\w]+\\.\\d+),"
                               + "([\\w]+\\.\\d+)";
        final Pattern PATT = Pattern.compile(PATTERN);
        String N1, N11901, A11901;
        
        // initialize hashmap with keys and zero initial value
        Map<String, Double> data = new HashMap<>();        
        data.put("N1", 0.0);
        data.put("N11901", 0.0);
        data.put("A11901", 0.0);
        
        try (BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
            String line;
            System.out.println("Calculating totals...");
            while ((line = br.readLine()) != null) {
                Matcher m = PATT.matcher(line);       
                
                if (m.find()) {
                    N1     = m.group(1);
                    N11901 = m.group(2);
                    A11901 = m.group(3);
                    
                    calcTotal(data, N1, N11901, A11901);   
                }
            }            
            displayTotals(data);
            
        } catch (FileNotFoundException fnfe){
            System.out.println("File not found");
        } catch (IOException ioe) {
            System.out.println("Error");
        }
    }
    
    // updates hashmap with the accumulated totals
    private static void calcTotal(Map<String, Double> data, String N1,
                               String N11901, String A11901) {          
        data.put("N1", data.get("N1") + Double.parseDouble(N1));
        data.put("N11901", data.get("N11901") + Double.parseDouble(N11901));
        data.put("A11901", data.get("A11901") + Double.parseDouble(A11901));
    }
    
    private static void displayTotals(Map<String, Double> data) {
        // formats the totals like a currency with commas
        DecimalFormat df = new DecimalFormat("###,###,###,###,###.00");

        String total_N1     = df.format(data.get("N1"));
        String total_N11901 = df.format(data.get("N11901"));
        String total_A11901 = df.format(data.get("A11901"));

        System.out.printf("The total of N1 is: $%s\n", total_N1);
        System.out.printf("The total of N11901 is: $%s\n", total_N11901);
        System.out.printf("The total of A11901 is: $%s\n", total_A11901);
    }   
}

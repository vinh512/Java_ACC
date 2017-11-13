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
        // ensures user provides a file argument and State/Zip when executing
        if (args.length != 2) {
            System.out.println("Usage: java -jar edu.acc.java2.taxes.jar "
                    + "[file csv] [State abbreviation or Zip Code]");
            return;
        }
        
        // the regex matches the first group(state abbrev), then the second
        // group(zipcode), then the third group is N1, skips the next 119 items
        // and then matches the next couple groupings (N11901, A11901)    
        final String PATTERN = "([A-Z]+),([\\d]+),[\\d]+,"
                               + "([\\w]+\\.\\d+)(?:[^,]*,){119}"
                               + "([\\w]+\\.\\d+),([\\w]+\\.\\d+)";
        
        final Pattern PATT = Pattern.compile(PATTERN);
        String state, zipCode, N1, N11901, A11901;       
        
        // initialize hashmap for user argument (state/zip)
        Map<String, Double> data = new HashMap<>();        
        data.put("N1", 0.0);
        data.put("N11901", 0.0);
        data.put("A11901", 0.0);
        
        // intialize hashmap for grand total of entire file
        Map<String, Double> grandTotal = new HashMap<>();        
        grandTotal.put("N1", 0.0);
        grandTotal.put("N11901", 0.0);
        grandTotal.put("A11901", 0.0);
        
        try (BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
            System.out.println("Calculating totals...\n");
            String line;
            
            while ((line = br.readLine()) != null) {
                Matcher m = PATT.matcher(line);       
                
                if (m.find()) {
                    state   = m.group(1);
                    zipCode = m.group(2);
                    N1      = m.group(3);
                    N11901  = m.group(4);
                    A11901  = m.group(5);

                    // gets total for the state or zip
                    if (state.equals(args[1]) || zipCode.equals(args[1])) {
                        calcTotal(data, N1, N11901, A11901);
                    }     
                    // gets the grand total for the file
                    calcTotal(grandTotal, N1, N11901, A11901);
                }
            }            
            
            // end program if no records were found
            if (data.get("N1") == 0.0) {
                System.out.println("Nothing found for " + args[1] + "!");
                return;
            }
            
            displayTotals(data, args[1]); // shows state/zip total
            System.out.println("----");
            displayTotals(grandTotal, "gTotal"); // shows grand total
            
        } catch (FileNotFoundException fnfe){
            System.out.println("File not found");
        } catch (IOException ioe) {
            System.out.println("Error");
        }
    }
    
    // updates hashmap with the accumulated totals
    private static void calcTotal(Map<String, Double> mapData, String N1,
                               String N11901, String A11901) {                
        
        mapData.put("N1", mapData.get("N1") + Double.parseDouble(N1));
        mapData.put("N11901", mapData.get("N11901") + Double.parseDouble(N11901));
        mapData.put("A11901", mapData.get("A11901") + Double.parseDouble(A11901));
    }
    
    // displays the total based on the hashmap passed in
    private static void displayTotals(Map<String, Double> mapData, String args) {
        // formats currency with commas
        DecimalFormat currency = new DecimalFormat("$###,###,###,###,###.00");
        // formats number quantity with commas
        DecimalFormat quantity = new DecimalFormat("###,###,###,###");

        String total_N1     = quantity.format(mapData.get("N1"));
        String total_N11901 = quantity.format(mapData.get("N11901"));
        String total_A11901 = currency.format(mapData.get("A11901"));

        if (args.equals("gTotal")) {
            System.out.println("The grand totals for the 2014 tax year: ");
        } else {
            System.out.printf("For %s, the totals are: \n", args);
        }
        System.out.printf("N1    : %s\n", total_N1);
        System.out.printf("N11901: %s\n", total_N11901);
        System.out.printf("A11901: %s\n", total_A11901);
    }   
}
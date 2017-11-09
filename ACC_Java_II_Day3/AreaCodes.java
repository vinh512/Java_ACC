package edu.acc.java2.areacodes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AreaCodes {

    public static void main(String[] args) {
        // ensures 2 arguments
        if (args.length != 2) {
            System.out.println("Usage: java -jar Area Codes.jar [csv file] "
                    + "[state or area code]");
            return;
        }
        
        try (BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
            String line, state, ac;
            
            // the hash map are key-value pairs so our keys will be the states
            // and the value will be arraylists of area codes
            Map<String, List<String>> data = new HashMap<>();
            
            // read lines until end-of-file
            while ((line = br.readLine()) != null) {
                
                // We want to extract the values so we...
                //  - split the line into an array 
                //  - assign the state value in array[1] to the state variable
                //  - assign the area code value in array[0] to the ac variable
                String[] parts = line.split(",");                
                state = parts[1];
                ac = parts[0];
                
                // note that we pass the empty hashmap 'data' as well as the 
                // the values (state, ac) to the update function
                update(data, state, ac);
            }
            
            
            if (Character.isDigit(args[1].charAt(0))) {
                data.keySet()
                        .stream()
                        .filter((key) -> (data.get(key).contains(args[1])))
                        .forEach((key) -> {
                            System.out.printf("%s is in %s\n", args[1], key);
                        });
            } else {
                System.out.println(data.get(args[1]));
            }

        } catch (FileNotFoundException fnfe) {
            System.out.println("No such file " + args[0]);
        } catch (IOException ioe) {
            System.out.println("Something went wrong: " + ioe.getMessage());
        }
    }

    private static void update(Map<String, List<String>> data, String state, String ac) {
        // data is the hashmap, we use map's "get" method using 'state' as the key
        // which returns the value...HOWEVER, the data hasmap does not yet have any 
        // keys or values so when we run 'data.get(state)', it yields a null since we
        // have neither a key or a value for the key
        List<String> areaCodes = data.get(state);
        
        if (areaCodes == null) {
            // creates ArrayList to store the area code(s)
            // it is an List datatype because some states(keys) have mutliple area codes(values)
            areaCodes = new ArrayList<>();
            
            // now we populate the hashmap
            data.put(state, areaCodes);
        }
        
        // By now, the ArrayList exists so we add the area codes
        areaCodes.add(ac);
    }

}

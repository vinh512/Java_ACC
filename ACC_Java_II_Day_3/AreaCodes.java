package edu.acc.java2.areacodes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AreaCode {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java -jar Area Codes.jar [csv file] "
                    + "[state or area code]");
            return;
        }
        try (BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
            String line, state, ac;
            Map<String, List<String>> data = new HashMap<>();
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                state = parts[1];
                ac = parts[0];
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
        List<String> areaCodes = data.get(state);
        if (areaCodes == null) {
            areaCodes = new ArrayList<>();
            data.put(state, areaCodes);
        }
        areaCodes.add(ac);
    }

}

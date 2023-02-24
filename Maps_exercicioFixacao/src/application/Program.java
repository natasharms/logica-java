package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<String, Integer> votes = new LinkedHashMap<>();

        System.out.print("Enter file path: ");
        String path = sc.nextLine();

        System.out.println("RESULTS");

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();

            while(line != null){

                String[] column = line.split(",");
                String name = column[0];
                int count = Integer.parseInt(column[1]);

                if (votes.containsKey(name)){
                    int votesCount = votes.get(name);
                    votes.put(name, count + votesCount);
                }
                else{
                    votes.put(name, count);
                }
                line = br.readLine();
            }

            for (String key : votes.keySet()){
                System.out.println(key + ": " + votes.get(key));
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}

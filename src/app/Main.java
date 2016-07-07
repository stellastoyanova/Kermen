package app;

import app.homes.Home;
import app.homes.HomeFactory;
import app.items.Toy;
import app.people.Child;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        City kermen = new City();
        HomeFactory factory = new HomeFactory();
        String line = reader.readLine();
        Pattern pattern = Pattern.compile("[\\d.]+");
        Matcher matcher;
        int lineCounter = 0;
        while (!line.equals("Democracy")) {

            lineCounter++;
            if (line.trim().equals("EVN")) {

                System.out.println("Total consumption: " + kermen.getConsumption());
                if (lineCounter % 3 == 0) {
                    kermen.receiveSalaries();
                }
                line = reader.readLine();
                continue;
            } else if (line.trim().equals("EVN bill")) {
                if (lineCounter % 3 == 0) {
                    kermen.receiveSalaries();
                }
                kermen.payBills();
                line = reader.readLine();
                continue;
            }
            String homeType = line.substring(0, line.indexOf("("));
            String homeArgsLine = "";
            if (line.indexOf(" Child") == -1) {
                homeArgsLine = line;
            } else {

                homeArgsLine = line.substring(0, line.indexOf(" Child"));
            }


            matcher = pattern.matcher(homeArgsLine);
            List<String> homeArguments = new ArrayList<>();
            while (matcher.find()) {

                homeArguments.add(matcher.group());
            }

            List<Child> currentChildrenList = new ArrayList<>();
            if (line.contains("Child")) {

                String childArgsLine = line.substring(line.indexOf(" Child"), line.length());
                String[] childrenInfo = childArgsLine.split(" Child");
                for (int i = 0; i < childrenInfo.length; i++) {

                    List<Double> childArgs = new ArrayList<>();
                    if (childrenInfo[i].length() > 0) {

                        matcher = pattern.matcher(childrenInfo[i]);
                        while (matcher.find()) {

                            childArgs.add(Double.parseDouble(matcher.group()));
                        }
                        Child child = new Child(childArgs.get(0));
                        for (int j = 1; j < childArgs.size(); j++) {

                            Toy toy = new Toy(childArgs.get(j));
                            child.addToy(toy);
                        }
                        currentChildrenList.add(child);
                    }


                }


            }

            Home home = factory.createHome(homeType, homeArguments, currentChildrenList);

            home.calculateSalaries();
            home.calculateBills();
            kermen.addHome(home);
            if (lineCounter % 3 == 0) {

                kermen.receiveSalaries();
            }
            line = reader.readLine();

        }
        System.out.println("Total population: " + kermen.getPopulation());
    }
}

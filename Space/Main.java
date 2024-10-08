package Space;


import university.entity.Student;
import university.entity.University;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {

    private static String menu = "1.Show Galaxies \n2.Add New Planet\n3.Change Number of Moon\n4.Display Planet Info\n5.Save info and Exit";

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("به سیستم مدیریت کهکشانی خوش آمدید:");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(menu);
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    readGalaxyDataFromFile();
                    break;
                case "2":
                    addNewPlanet();
                    break;
                case "3":
                    break;
                case "4":
                    DisplayPlanetInfo();
                    break;
                case "5":
                    System.out.println("خداحافظ. اطلاعات با موفقیت ذخیره شد!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }


    }

    private static void readGalaxyDataFromFile() throws FileNotFoundException {
        File SpaceFile = new File("D:\\java\\SpaceInfo.txt");
        try {
            try (Scanner scanner = new Scanner(SpaceFile)) {
                while (scanner.hasNextLine()) {
                    String galaxyString = scanner.nextLine();
                    String planetName = galaxyString.split("#")[0];
                    String planetType = galaxyString.split("#")[1];
                    String numberOfMoon = galaxyString.split("#")[2];
                    String distanceFromeSun = galaxyString.split("#")[3];
                    Galaxy galaxy = new Galaxy(planetName, planetType, numberOfMoon, distanceFromeSun);
                    galaxy.getGalaxyName();
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void addNewPlanet() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\java\\SpaceInfo.txt"))) {
            String exportData = "";
            for (Planet planet : Planet.getPlanetName()) {
                String PlanetString = Planet.toString() + "\n";
                exportData += PlanetString;
            }
            exportData = exportData.substring(0, exportData.length() - 1);
            writer.write(exportData);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void DisplayPlanetInfo(Scanner scanner, Planet planet) throws Exception {
        System.out.println("Enter Planet Name:");
        String planetName = scanner.nextLine();

        boolean hasFound = false;

        for (Planet planet1 : Planet.getPlanetName()) {
            if (Planet.getPlanetName().equals(planetName)) {
                hasFound = true;
               planet1.getPlanetName().toString();
                break;
            }
        }
    }
}

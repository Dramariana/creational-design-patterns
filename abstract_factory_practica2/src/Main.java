import app.Application;
import factories.ArtDecoFurnitureFactory;
import factories.FurnitureFactory;
import factories.MordernFurnitureFactory;
import factories.VictorianFurnitureFactory;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static Application configureApplication(int option) {
        Application app;
        FurnitureFactory furnitureFactory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (option == 1) {
            furnitureFactory= new ArtDecoFurnitureFactory();
        } else if (option == 2) {
           furnitureFactory= new MordernFurnitureFactory();
        } else  {
            furnitureFactory=new VictorianFurnitureFactory();
        }
        app = new Application(furnitureFactory);
        return app;
    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int answer;

        System.out.println("What do you Furniture Style preffer?" +
                "\n1.Art Deco" +
                "\n2.Mordern" +
                "\n3.Victorian");
        System.out.print("Answer:");
        answer = scanner.nextInt();

        Application app = configureApplication(answer);

        app.build();
    }
}
import app.Application;
import factories.BiciFactory;
import factories.CarFactory;
import factories.Factory;
import factories.MotoFactory;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    private static Application configureApplication(int optionA, int optionB) {


        Application app;
        Factory factory;
        if (optionB == 1) {
            factory = new CarFactory();
        } else if (optionB == 2) {
            factory = new MotoFactory();
        } else  {
            factory = new BiciFactory();
        }

        app = new Application(factory, optionA);
        return app;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int answerA, answerB;

        System.out.println("What do you need today?" +
                "\n1.Delivery" +
                "\n2.Trasportation" +
                "\n3.Favor");
        System.out.print("Answer:");
        answerA = scanner.nextInt();

        System.out.println("What do you need today?" +
                "\n1.Car" +
                "\n2.Moto" +
                "\n3.Bici");
        System.out.print("Answer:");
        answerB = scanner.nextInt();

        Application app = configureApplication(answerA,answerB);
        app.paint();


            app.firstStep();
            app.secondStep();
            app.thirdStep();

    }
}
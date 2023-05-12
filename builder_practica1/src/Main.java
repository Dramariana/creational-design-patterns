import builders.HouseBuilder;
import builders.HousePlanBuilder;
import director.Director;
import houses.House;
import houses.Plan;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Director director = new Director();


       HouseBuilder builder = new HouseBuilder();
        director.constructCastle(builder);


       House house = builder.getResult();
        System.out.println("House built:\n" + house.getType());


        HousePlanBuilder planBuilder = new HousePlanBuilder();


        director.constructCastle(planBuilder);
        Plan housePlan = planBuilder.getResult();
        System.out.println("\nHouse Plan built:\n" + housePlan.print());
    }
}
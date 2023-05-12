import builders.CarBuilder;
import builders.CarManualBuilder;
import cars.Car;
import cars.Manual;
import director.Director;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        // Director obtiene el objeto constructor concreto del cliente
        // (código de la aplicación). Esto es porque la aplicación sabe mejor que
        // constructor utilizar para obtener un producto específico.
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        // El producto final suele recuperarse de un objeto constructor, ya que
        // Director no es consciente y no depende de constructores y
        // productos concretos.
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        // El Director puede conocer varias formulas de construcción.
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
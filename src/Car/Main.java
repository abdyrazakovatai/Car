package Car;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[]{
                new Car(1L, "Mercedes-Benz", "CLS 63", "black", BigDecimal.valueOf(35000), LocalDate.of(2020, 9, 14), 3.2),
                new Car(2L, "BMW", "39", "black", BigDecimal.valueOf(25000), LocalDate.of(1990, 6, 14), 2.2),
        };
        AutoSalon autoSalon = new AutoSalon(1L,"Atai",cars);
        autoSalon.allCars();
        System.out.println();
        autoSalon.addCar(new Car(3L,"KIA","Sonata","White",BigDecimal.valueOf(13500),LocalDate.of(2015,5,2),2.2));
        autoSalon.allCars();
        System.out.println();
        System.out.println("delete");
        autoSalon.deleteCarId(1L);
        autoSalon.allCars();
        System.out.println("update");
        autoSalon.updateCarId(1L,new Car(1L, "Mercedes-Benz", "CLS 63", "black", BigDecimal.valueOf(35000), LocalDate.of(2020, 9, 14), 3.2));
        autoSalon.allCars();
        Car car = new Car();
        autoSalon.updateCarModelId(2L,"34");
        autoSalon.allCars();
    }
}

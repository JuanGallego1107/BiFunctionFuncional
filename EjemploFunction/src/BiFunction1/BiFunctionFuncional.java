package BiFunction1;

import java.util.function.BiFunction;

public class BiFunctionFuncional {
    public static void main(String[] args) {
        BiFunction<String,String,String> newCar = (brand,type)-> "El vehiculo es marca: "+brand+" y es de tipo: "+type;

        System.out.println(newCar.apply("Chevrolet","Camioneta"));
    }
}

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Concesionaria concesionaria = new Concesionaria();

        //Creo una lista desde el Array, tamaño fijo.
        List<Vehiculo> listaVehiculos = Arrays.asList(
                new Auto( "Peugeot", "206", BigDecimal.valueOf(200000), 4),
                new Moto( "Honda", "Titan", BigDecimal.valueOf(60000), 125),
                new Auto( "Peugeot", "208", BigDecimal.valueOf(250000), 5),
                new Moto( "Yamaha", "YBR", BigDecimal.valueOf(80500.50), 160));

        String espacio = "================================";

        concesionaria.agregarVehiculos(listaVehiculos);

        concesionaria.mostrarVehiculos();
        System.out.println(espacio);
        concesionaria.vehiculoMasCaro();
        concesionaria.vehiculoMasBarato();
        concesionaria.letraY();
        System.out.println(espacio);
        concesionaria.vehiculosOrdenados();


    }
}

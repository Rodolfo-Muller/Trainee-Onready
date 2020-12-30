import java.text.DecimalFormat;
import java.util.*;

public class Concesionaria {

    private List<Vehiculo> vehiculos;

    //  Constructor
    public Concesionaria(){
        this.vehiculos=new ArrayList<>();
    }
    public void mostrarVehiculos(){
        this.vehiculos.forEach(System.out::println);
    }
    public void agregarVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
    //Hago una validación, comparo los valores y asigno el mayor valor.
    public void vehiculoMasCaro(){
        Vehiculo vehiculoMasCaro = this.vehiculos.get(0);
        for (Vehiculo vehiculoMasCaro2 : this.vehiculos){
            if (vehiculoMasCaro.compareTo(vehiculoMasCaro2) == 1){
                vehiculoMasCaro = vehiculoMasCaro2;
            }
        }
        System.out.println("Vehículo más caro: " + vehiculoMasCaro.getMarca() + " " + vehiculoMasCaro.getModelo());
    }
    //Hago una validación, comparo los valores y asigno el menor valor.
    public void vehiculoMasBarato(){
        Vehiculo vehiculoMasBarato = this.vehiculos.get(0);
        for (Vehiculo vehiculoMasBarato2 : this.vehiculos){
            if (vehiculoMasBarato.compareTo(vehiculoMasBarato2) == -1){
                vehiculoMasBarato = vehiculoMasBarato2;
            }
        }
        System.out.println("Vehículo más barato: " + vehiculoMasBarato.getMarca()+" "+vehiculoMasBarato.getModelo());
    }

    public void letraY() {
        DecimalFormat formato = new DecimalFormat("$#,###.00");

        for (Vehiculo vehiculo : vehiculos) {
            char[] caracter = vehiculo.getMarca().toCharArray();
            for (char letra : caracter) {
                if (letra == 'Y' || letra == 'y') {
                    System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: " + vehiculo.getMarca()
                            + " " + vehiculo.getModelo() + " " + formato.format(vehiculo.getPrecio()));
                }
            }
        }
    }

    public void vehiculosOrdenados(){
        Collections.sort(vehiculos);
        System.out.println("Vehículos ordenados por precios Mayor a Menor: ");

        for (int i = 0; i < vehiculos.size();i++){
            System.out.println(vehiculos.get(i).getMarca()+" "+vehiculos.get(i).getModelo());

        }
    }

}

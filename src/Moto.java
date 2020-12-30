import java.math.BigDecimal;

public class Moto extends Vehiculo{
    private int cilindradas;

    public Moto(String marca, String modelo, BigDecimal precio, int cilindradas) {
        super(marca, modelo, precio);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return this.cilindradas;
    }

    public String toString(){
        return "Marca: " + this.getMarca() + " // Modelo: " + this.getModelo() + " // Cilindradas: "
                + this.getCilindradas() + "cc // Precio: $" + String.format("%1$,.2f", this.getPrecio().doubleValue());
    }
}

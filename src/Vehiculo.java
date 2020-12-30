import java.math.BigDecimal;

abstract class Vehiculo implements Comparable<Vehiculo>{
    private String marca;
    private String modelo;
    private BigDecimal precio;



    public Vehiculo(String marca, String modelo, BigDecimal precio) {
        this.marca = marca;
        this.modelo=modelo;
        this.precio=precio;
    }

    public String getMarca(){return this.marca;}

    public String getModelo(){return this.modelo;}

    public BigDecimal getPrecio(){return this.precio;}

    public int compareTo(Vehiculo MayoraMenor){return  MayoraMenor.getPrecio().compareTo(getPrecio());}


}

// Cuadrado.java
public class Cuadrado implements PoligonoRegular {

    private double longitud;

    public Cuadrado(double longitud) {
        this.longitud = longitud;
    }

    @Override
    public int getNumeroLados() {
        return 4;
    }

    @Override
    public double getLongitudLado() {
        return longitud;
    }
}

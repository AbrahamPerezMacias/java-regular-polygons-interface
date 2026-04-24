// TrianguloEquilatero.java
public class TrianguloEquilatero implements PoligonoRegular {

    private double longitud;

    public TrianguloEquilatero(double longitud) {
        this.longitud = longitud;
    }

    @Override
    public int getNumeroLados() {
        return 3;
    }

    @Override
    public double getLongitudLado() {
        return longitud;
    }
}

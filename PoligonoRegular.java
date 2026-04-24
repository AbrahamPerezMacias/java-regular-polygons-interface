// PoligonoRegular.java
public interface PoligonoRegular {

    int getNumeroLados();

    double getLongitudLado();

    // Método default: perímetro
    default double getPerimetro() {
        return getNumeroLados() * getLongitudLado();
    }

    // Método default: ángulo interior en radianes
    default double getAnguloInterior() {
        int n = getNumeroLados();
        return ((n - 2) * Math.PI) / n;
    }
}

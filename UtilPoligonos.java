// UtilPoligonos.java
public class UtilPoligonos {

    public static int totalDeLados(PoligonoRegular[] arreglo) {
        int suma = 0;

        for (PoligonoRegular p : arreglo) {
            suma += p.getNumeroLados();
        }

        return suma;
    }
}

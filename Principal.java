// Principal.java
public class Principal {

    public static void main(String[] args) {

        PoligonoRegular[] figuras = new PoligonoRegular[2];

        figuras[0] = new TrianguloEquilatero(5);
        figuras[1] = new Cuadrado(8);

        for (PoligonoRegular figura : figuras) {

            System.out.println("Figura con " + figura.getNumeroLados() + " lados");
            System.out.println("Longitud lado: " + figura.getLongitudLado());
            System.out.println("Perímetro: " + figura.getPerimetro());
            System.out.println("Ángulo interior (radianes): " + figura.getAnguloInterior());
            System.out.println("---------------------------");
        }

        System.out.println("Total de lados: " +
                UtilPoligonos.totalDeLados(figuras));
    }
}

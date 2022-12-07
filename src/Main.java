public class Main {
    public static void main(String[] args) {
        int resultadosuma = suma(10,20,30);
        System.out.println(resultadosuma);
        Coche miCoche = new Coche();
        miCoche.anadirPuerta();
        System.out.println("Mi coche tiene " + miCoche.nPuertas + " puertas.");

    }
    public static int suma(int a, int b, int c) {
        return a + b + c;
    }

}

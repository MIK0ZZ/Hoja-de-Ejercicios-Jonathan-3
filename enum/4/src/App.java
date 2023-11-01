public class App {

    enum ColorArcoiris {ROJO,NARANJA,AMARILLO,VERDE,AZUL,VIOLETA}
    public static void main(String[] args) throws Exception {

        //Código "inspirado" en una página de internet xddd
        for (ColorArcoiris color : ColorArcoiris.values()) {
            System.out.println(color);
        }
    }
}

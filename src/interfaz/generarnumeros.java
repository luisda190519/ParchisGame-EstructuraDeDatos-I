package interfaz;

import java.util.Random;

public class generarnumeros {

    public int valor;

    public int calcularnumero() {

        Random numeroRandom = new Random();

        valor = numeroRandom.nextInt(6) + 1;

        return valor;
    }

}

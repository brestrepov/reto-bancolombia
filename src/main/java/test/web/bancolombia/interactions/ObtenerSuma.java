package test.web.bancolombia.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static test.web.bancolombia.utils.Constantes.COORDENADA_X;
import static test.web.bancolombia.utils.Constantes.COORDENADA_Y;
import static test.web.bancolombia.utils.Constantes.MATRIZ;
import static test.web.bancolombia.utils.Constantes.SUMA_TOTAL;

public class ObtenerSuma implements Interaction {

    private int sumaTotal=0;

    @Override
    public <T extends Actor> void performAs(T actor) {
        String[][] matriz = actor.recall(MATRIZ);
        int posicionX = actor.recall(COORDENADA_X);
        int posiciony = actor.recall(COORDENADA_Y);

        int filas = matriz.length;
        int columnas = matriz[0].length;

        int[][] matrizProximos = new int[3][3];

        int filaInicial = posiciony - 1;
        int columnaInicial = posicionX - 1;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (filaInicial + i >= 0 && filaInicial + i < filas && columnaInicial + j >= 0 && columnaInicial + j < columnas) {
                    matrizProximos[i][j] = Integer.parseInt(matriz[filaInicial + i][columnaInicial + j]);
                } else {
                    matrizProximos[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < matrizProximos.length; i++) {
            for (int j = 0; j < matrizProximos[0].length; j++) {
                sumaTotal += matrizProximos[i][j];
            }
        }
        actor.remember(SUMA_TOTAL,sumaTotal);

    }

    public static ObtenerSuma deValoresProximos() {
        return instrumented(ObtenerSuma.class);
    }
}

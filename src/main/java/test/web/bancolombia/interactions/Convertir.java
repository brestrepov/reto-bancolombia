package test.web.bancolombia.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static test.web.bancolombia.userinterfaces.MatrizPage.BTN_BOTONES_MATRIZ;
import static test.web.bancolombia.utils.Constantes.COORDENADA_X;
import static test.web.bancolombia.utils.Constantes.COORDENADA_Y;
import static test.web.bancolombia.utils.Constantes.MATRIZ;

public class Convertir implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        var matrizNumeros = BTN_BOTONES_MATRIZ.resolveAllFor(actor);

        String[][] matriz = new String[12][12];
        int indice = 0;

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                matriz[i][j] = matrizNumeros.get(indice).getText();
                indice++;
            }
        }

        /*for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }*/

        actor.remember(MATRIZ,matriz);

        /*System.out.println("-----");

        System.out.println(actor.recall(COORDENADA_X).toString());
        System.out.println( actor.recall(COORDENADA_Y).toString());*/

    }

    public static Performable matriz() {
        return instrumented(Convertir.class);
    }
}

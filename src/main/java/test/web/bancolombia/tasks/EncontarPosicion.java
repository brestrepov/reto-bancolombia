package test.web.bancolombia.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import test.web.bancolombia.interactions.ObtenerSuma;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static test.web.bancolombia.userinterfaces.HomePage.BTN_ENVIAR;
import static test.web.bancolombia.userinterfaces.MatrizPage.BTN_DADO_POR_COORDENADAS;
import static test.web.bancolombia.userinterfaces.MatrizPage.TXT_SUMA_VALORES;
import static test.web.bancolombia.utils.Constantes.COORDENADA_X;
import static test.web.bancolombia.utils.Constantes.COORDENADA_Y;
import static test.web.bancolombia.utils.Constantes.MATRIZ;
import static test.web.bancolombia.utils.Constantes.SUMA_TOTAL;

public class EncontarPosicion implements Task {


    @Override
    @Step("{0} da click en el boton busquedo e ingresa la suma de los valores proximos")
    public <T extends Actor> void performAs(T actor) {
        String[][] matriz = actor.recall(MATRIZ);
        int posicionX = actor.recall(COORDENADA_X);
        int posiciony = actor.recall(COORDENADA_Y);

        actor.attemptsTo(ObtenerSuma.deValoresProximos());

        int sumaTotal = actor.recall(SUMA_TOTAL);
        actor.attemptsTo(
                Click.on(BTN_DADO_POR_COORDENADAS.of(matriz[posiciony][posicionX])),
                Enter.theValue(Integer.toString(sumaTotal)).into(TXT_SUMA_VALORES),
                Click.on(BTN_ENVIAR)
        );
    }

    public static EncontarPosicion segunCoordenadas() {
        return instrumented(EncontarPosicion.class);
    }
}

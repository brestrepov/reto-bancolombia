package test.web.bancolombia.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import test.web.bancolombia.interactions.Convertir;
import test.web.bancolombia.interactions.EncontrarCoordenada;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static test.web.bancolombia.userinterfaces.MatrizPage.LBL_COORDENADAS;
import static test.web.bancolombia.userinterfaces.MatrizPage.LBL_NUMERO_CICLOS;

public class EncontrarHash implements Task {


    @Override
    @Step("{0} inicia validacion para encontrar el hash")
    public <T extends Actor> void performAs(T actor) {
        int ciclos = Integer.parseInt(LBL_NUMERO_CICLOS.resolveFor(actor).getText().substring(LBL_NUMERO_CICLOS.resolveFor(actor).getText().length()-2));

        for(int i=0;i<ciclos;i++){
            actor.attemptsTo(
                    WaitUntil.the(LBL_COORDENADAS, isVisible()).forNoMoreThan(10).seconds(),
                    EncontrarCoordenada.paraBoton(),
                    Convertir.matriz(),
                    EncontarPosicion.segunCoordenadas());
        }
    }

    public static Performable deLaPrueba() {
        return instrumented(EncontrarHash.class);
    }
}

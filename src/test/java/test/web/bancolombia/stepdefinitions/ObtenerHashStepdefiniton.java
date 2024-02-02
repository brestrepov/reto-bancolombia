package test.web.bancolombia.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import test.web.bancolombia.interactions.Abrir;
import test.web.bancolombia.questions.ElHashGenerado;
import test.web.bancolombia.tasks.Autenticarse;
import test.web.bancolombia.tasks.EncontrarHash;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static test.web.bancolombia.utils.Constantes.URL_EVALART_TEST;

public class ObtenerHashStepdefiniton {

    @Dado("que el {word} se encuentra en la pagina de prueba de evalart")
    public void queElUsuarioSeEncuentraEnLaPaginaDePruebaDeEvalart(String actor) {
        theActorCalled(actor).attemptsTo(
                Abrir.laPagina(URL_EVALART_TEST),
                Autenticarse.enElPortal()
        );
    }
    @Cuando("realice los procesos sobre la matriz")
    public void realiceLosProcesosSobreLaMatriz() {
        theActorInTheSpotlight().attemptsTo(
                EncontrarHash.deLaPrueba()
        );
    }
    @Entonces("debera ver el hash generado")
    public void deberaVerElHashGenerado() {
        theActorInTheSpotlight().should(
                seeThat(ElHashGenerado.conExito())
        );
    }

}

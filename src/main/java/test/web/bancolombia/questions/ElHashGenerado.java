package test.web.bancolombia.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Step;

import static java.lang.Boolean.TRUE;
import static test.web.bancolombia.userinterfaces.MatrizPage.LBL_HASH_GENERADO;


public class ElHashGenerado implements Question<Boolean> {

    @Override
    @Step("{0} valida que se muestre el hash generado")
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                Ensure.that(LBL_HASH_GENERADO).isDisplayed()
        );
        return TRUE;
    }

    public static Question<Boolean> conExito() {
        return new ElHashGenerado();
    }
}

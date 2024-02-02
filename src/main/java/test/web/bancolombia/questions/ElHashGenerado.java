package test.web.bancolombia.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;

import static java.lang.Boolean.TRUE;
import static test.web.bancolombia.userinterfaces.MatrizPage.LBL_HASH_GENERADO;


public class ElHashGenerado implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String hash = LBL_HASH_GENERADO.resolveFor(actor).getText();
        System.out.println("--------");
        System.out.println(hash);
        System.out.println("--------");
        actor.attemptsTo(
                Ensure.that(LBL_HASH_GENERADO).isDisplayed()
        );
        return TRUE;
    }

    public static Question<Boolean> conExito() {
        return new ElHashGenerado();
    }
}

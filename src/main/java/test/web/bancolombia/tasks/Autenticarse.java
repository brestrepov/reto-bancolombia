package test.web.bancolombia.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static test.web.bancolombia.userinterfaces.HomePage.BTN_ENVIAR;
import static test.web.bancolombia.userinterfaces.HomePage.TXT_CLAVE;
import static test.web.bancolombia.userinterfaces.HomePage.TXT_USAUARIO;

public class Autenticarse implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_USAUARIO, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue("779804").into(TXT_USAUARIO),
                Enter.theValue("10df2f32286b7120My0zLTQwODk3Nw==30e0c83e6c29f1c3").into(TXT_CLAVE),
                Click.on(BTN_ENVIAR)
        );
    }

    public static Autenticarse enElPortal() {
        return instrumented(Autenticarse.class);
    }
}

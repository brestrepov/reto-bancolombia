package test.web.bancolombia.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import test.web.bancolombia.data.UsuarioData;
import test.web.bancolombia.models.UsuarioModel;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static test.web.bancolombia.userinterfaces.HomePage.BTN_ENVIAR;
import static test.web.bancolombia.userinterfaces.HomePage.TXT_CLAVE;
import static test.web.bancolombia.userinterfaces.HomePage.TXT_USAUARIO;

public class Autenticarse implements Task {

    private final UsuarioModel usuario;

    public Autenticarse(UsuarioModel usuario) {
        this.usuario = usuario;
    }


    @Override
    @Step("{0} se autentica en la pagina de prueba")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_USAUARIO, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(usuario.getUsuario()).into(TXT_USAUARIO),
                Enter.theValue(usuario.getClave()).into(TXT_CLAVE),
                Click.on(BTN_ENVIAR)
        );
    }

    public static Autenticarse enElPortal() {
        return instrumented(Autenticarse.class, UsuarioData.usuarioValido());
    }
}

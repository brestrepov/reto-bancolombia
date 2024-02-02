package test.web.bancolombia.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Abrir implements Interaction {

    private final String pagina;

    public Abrir(String pagina) {
        this.pagina = pagina;
    }

    @Override
    @Step("{0} abre navegador web en pagina #pagina")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(pagina));
    }

    public static Abrir laPagina(String url) {
        return instrumented(Abrir.class, url);
    }
}

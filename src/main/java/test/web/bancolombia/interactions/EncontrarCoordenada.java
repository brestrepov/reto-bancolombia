package test.web.bancolombia.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static test.web.bancolombia.userinterfaces.MatrizPage.LBL_COORDENADAS;
import static test.web.bancolombia.utils.Constantes.COORDENADA_X;
import static test.web.bancolombia.utils.Constantes.COORDENADA_Y;

public class EncontrarCoordenada implements Interaction {



    @Override
    @Step("{0} obtiene coordenadas del boton")
    public <T extends Actor> void performAs(T actor) {
        int corrdenadaX = 0;
        int corrdenadaY = 0;
        String coordenadas = LBL_COORDENADAS.resolveFor(actor).getText().replaceAll("[()]", "");
        String[] valoresCoordenadas= coordenadas.split("[;,\\.]");
        for (int i =0; i<valoresCoordenadas.length;i=i+2){
            corrdenadaX = corrdenadaX + Integer.parseInt(valoresCoordenadas[i]);
            corrdenadaY = corrdenadaY + Integer.parseInt(valoresCoordenadas[i+1]);
        }
        actor.remember(COORDENADA_X,corrdenadaX);
        actor.remember(COORDENADA_Y,corrdenadaY);
    }

    public static EncontrarCoordenada paraBoton() {
        return instrumented(EncontrarCoordenada.class);
    }
}

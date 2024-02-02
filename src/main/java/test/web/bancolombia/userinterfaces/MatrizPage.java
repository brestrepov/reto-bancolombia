package test.web.bancolombia.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MatrizPage {

    public static final Target LBL_COORDENADAS = Target.the("Coordenadas boton").located(By.xpath("//p[@class='text-center text-xl font-bold']"));


    private MatrizPage() {
    }
}

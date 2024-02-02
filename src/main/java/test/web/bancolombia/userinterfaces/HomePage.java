package test.web.bancolombia.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    public static final Target TXT_USAUARIO= Target.the("Campo para ingresar usuario").located(By.name("username"));
    public static final Target TXT_CLAVE= Target.the("Campo para ingresar contraseña").located(By.name("password"));
    public static final Target BTN_ENVIAR = Target.the("Boton Enviar para ingresar").located(By.xpath("//button[contains(.,'Enviar')]"));


    private HomePage() {
    }
}

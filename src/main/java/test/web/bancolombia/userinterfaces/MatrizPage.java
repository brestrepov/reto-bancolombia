package test.web.bancolombia.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MatrizPage {

    public static final Target LBL_NUMERO_CICLOS = Target.the("Numero de ciclos").located(By.xpath("//p[contains(.,'Ciclos')]//following-sibling::p"));
    public static final Target LBL_COORDENADAS = Target.the("Coordenadas boton").located(By.xpath("//p[@class='text-center text-xl font-bold']"));
    public static final Target BTN_BOTONES_MATRIZ = Target.the("Coordenadas de todos los botones").located(By.xpath("//div[@class='w-3/2 grid gap-4 grid-cols-12']/button"));
    public static final Target BTN_DADO_POR_COORDENADAS= Target.the("Coordenadas de boton dado segun las coordenadas").locatedBy("//button[@value='{0}']");
    public static final Target TXT_SUMA_VALORES = Target.the("Boton para enviar la suma de todos los valores").located(By.name("modal_answer"));
    public static final Target LBL_HASH_GENERADO = Target.the("Has generado al finalizar al prueba").located(By.xpath("//h1[contains(.,'Felicidades')]//following::p"));


    private MatrizPage() {
    }
}

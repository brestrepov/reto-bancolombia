package test.web.bancolombia.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class Hooks {
    @Managed(driver = "chrome")
    WebDriver navegador;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(OnlineCast.whereEveryoneCan(BrowseTheWeb.with(navegador)));
    }

    @After
    public void close() {
        navegador.close();
        navegador.quit();
        OnStage.setTheStage(new OnlineCast());
    }
}

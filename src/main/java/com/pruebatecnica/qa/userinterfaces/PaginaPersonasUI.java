package com.pruebatecnica.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaPersonasUI {
    public static final Target MENU_PRODUCTOS_Y_SERVICIOS = Target.the("dar clic en menu productos y servicios")
            .locatedBy("//*[@id='navbar-collapse-grid']/ul/li[3]/a");

    public static final Target TEXT_LINK_PRESTAMOS = Target.the("se da clic en prestamos")
            .locatedBy("//*[@id='navbar-collapse-grid']/ul/li[3]/ul/li/div[1]/div[1]/ul/li[4]/a");

    public static final Target CARD_PRESTAMO_DE_AUTO = Target.the("se da clic en la card de prestamos de auto")
            .locatedBy("//*[@id='none']/div/div/div[2]/div[3]/div/div[2]/h2/a");

    public static final Target MENU_TASAS_Y_TARIFAS = Target.the("Se da clic en el menu tasa y tarifas")
            .locatedBy("//a[contains(text(),'Tasas y tarifas')]");

    public static final Target ICONO_PDF_PROHIBICIONES = Target.the("se da clic en pdf prohibiciones")
            .locatedBy("//*[@id='tab4']/table/tbody/tr[2]/td[2]/span/a/img");

}

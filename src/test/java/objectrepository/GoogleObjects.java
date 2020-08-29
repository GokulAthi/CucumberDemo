package objectrepository;

import org.openqa.selenium.By;

public class GoogleObjects {
    public By searchTextBox = By.name("q");
    public By resultStats = By.id("result-stats");
    public By googleSpeedTestLink = By.xpath("//h3[contains(text(),'Speedtest - Google')]");
}

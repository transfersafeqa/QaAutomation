package pageObjects;
import org.openqa.selenium.WebDriver;
/**
 * Created by rsangroula on 6/18/2015.
 */
public class PageObjectBase {
    protected WebDriver driver;

    public PageObjectBase(WebDriver driver)

    {
        this.driver = driver;
    }


}

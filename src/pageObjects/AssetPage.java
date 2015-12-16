package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by rsangroula on 6/18/2015.
 */
public class AssetPage extends PageObjectBase {
    public AssetPage(WebDriver driver){
        super(driver);
    }
    public AssetPage assetInfo() {

        return new AssetPage(driver);
    }

}

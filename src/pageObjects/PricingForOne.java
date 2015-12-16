package pageObjects;

import org.openqa.selenium.WebDriver;

/**
 * Created by rsangroula on 6/23/2015.
 */
public class PricingForOne extends PageObjectBase {
    public PricingForOne(WebDriver driver){
        super(driver);
    }

    public PricingForOne thirtyYearsFixed(){


      return new PricingForOne(driver);
    }
}

package WebTest;

import org.openqa.selenium.By;

public class CompareTwoProducts extends Utils
{   // locators for required elements
    private By _category = By.linkText( "Books" );
    private By _fahrenheit451 = By.xpath( "//input[@onclick='return AjaxCart.addproducttocomparelist(\"/compareproducts/add/37\"),!1']" );
    private By _firstprizepies = By.xpath( "//input[@onclick='return AjaxCart.addproducttocomparelist(\"/compareproducts/add/38\"),!1']" );
    private By _compare = By.xpath( "/html/body/div[5]/div/p/a");   //linkText( "product comparison" );

    public void selectProductsToCompare() {

        sleep( 5 );

        //click on Book category
        clickOnElement(_category);
        sleep( 5 );

        // Click on Add to Compare for product Fahrenheit 451 by Ray Bradbury
        clickOnElement(_fahrenheit451);
        //waitForClickable(_fahrenheit451,10);
        sleep( 5 );

        //click on Book category
        //clickOnElement(_category);

        //Click on Add to Compare for product First Prize Pies
        clickOnElement(_firstprizepies);
        //waitForClickable(_firstprizepies,10);
        sleep( 5 );

        waitForVisibility(_compare,1);

        // Click on Product comparision on Popup Bar
        clickOnElement(_compare);
    }
}

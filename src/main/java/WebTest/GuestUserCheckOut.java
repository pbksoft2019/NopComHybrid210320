package WebTest;

import org.openqa.selenium.By;

public class GuestUserCheckOut extends Utils
{
    //private By _AddToCart = By.xpath( "/html/body/div[6]/div[3]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div[2]/div[3]/div[2]/input[1]" );
    private By _AddToCart =By.id( "add-to-cart-button-37" );
    // locator for shopping cart button
    private By _ShoppingCart = By.className( "cart-label" );
    // locator for terms and condition tick box
    private By _CheckBox = By.id( "termsofservice" );
    // locator for check out button
    private By _CheckOut = By.xpath( "//button[@type='submit']" );
    // locator for check out as a guest button
    private By _CheckOutGuest =  By.xpath( "//input[@class='button-1 checkout-as-guest-button']" );
    // locator for first name field
    private By _FirstNme = By.id("BillingNewAddress_FirstName");
    // locator for last name field
    private By _LastName =By.id("BillingNewAddress_LastName");
    // locator for email address field
    private By _EmailAddress = By.id("BillingNewAddress_Email");
    // expected result message
    String expected ="Your order has been successfully processed!";
    // locator to get actual message result
    private By _actual = By.xpath( "/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[1]" );

    // method to click on add to cart button
    public void addToCart()

    {
        sleep( 3);
        clickOnElement( _AddToCart );
        sleep( 5 );
    }
    // method to check out as a guest
    public void guestCheckOut()
    {   clickOnElement( _ShoppingCart );
        sleep( 2 );
        clickOnElement( _CheckBox );
        sleep( 2 );
        clickOnElement( _CheckOut );
        sleep( 2 );
        clickOnElement( _CheckOutGuest );
        sleep( 2 );
        enterText(_FirstNme,"pk");
        sleep( 2 );
        enterText( _LastName,"pk" );
        enterText( _EmailAddress, "pbk"+timeStamp()+"@gmail.com");
        dropDownValue( By.id( "BillingNewAddress_CountryId" ),"1" );
        dropDownValue( By.id( "BillingNewAddress_StateProvinceId" ),"53" );
        enterText( By.id( "BillingNewAddress_City" ), "london");
        enterText( By.id( "BillingNewAddress_Address1" ), "10 downing Street" );
        enterText(By.id( "BillingNewAddress_ZipPostalCode" ), "123456");
        enterText( By.id( "BillingNewAddress_PhoneNumber" ),"01234567890" );
        clickOnElement(By.xpath( "/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[1]/div[2]/div/input" ));
        clickOnElement( By.xpath( "/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[3]/div[2]/form/div[2]/input" ) );
        clickOnElement( By.id( "paymentmethod_1" ) );
        clickOnElement( By.xpath( "//*[@id=\"payment-method-buttons-container\"]/input" ) );
    }
    // method to compare expected and actual
    public void guestCheckOutSuccessVerify()
    {
        String actual = getTextFromElement(_actual);
        //assertTextMessage( "", expected, actual );
    }
}

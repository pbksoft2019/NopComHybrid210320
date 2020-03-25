package WebTest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDefs
{
    Homepage homepage = new Homepage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    CompareTwoProducts compareTwoProducts = new CompareTwoProducts();
    ReferFriendRegisterUser referFriendRegisterUser = new ReferFriendRegisterUser();
    ReferFriendNonRegisterUser referFriendNonRegisterUser = new ReferFriendNonRegisterUser();
    LogIn logIn = new LogIn();
    SortPriceHighToLow sortPriceHighToLow = new SortPriceHighToLow();
    GuestUserCheckOut guestUserCheckOut = new GuestUserCheckOut();
    PaymentPage paymentPage = new PaymentPage();
    GuestUserComments guestUserComments = new GuestUserComments();
    ChangeCurrency changeCurrency = new ChangeCurrency();
    AddToCartButtonPresent addToCartButtonPresent = new AddToCartButtonPresent();


    @Given("user is on homepage")
    public void user_is_on_homepage()
    { }

    @And("click on register Button")
    public void click_on_register_Button()
    {
        homepage.clickOnRegisterButton();
    }

    @And("user enters registration details and click on submit")
    public void user_enters_registration_details_and_click_on_submit()
    {
       registrationPage.userEnterRegistrationDetails();
    }

    @Then("user should be able to register successfully")
    public void user_should_be_able_to_register_successfully()
    { }

    @And("welcome message should display")
    public void welcome_message_should_display()
    {
        registrationResultPage.verifyUserSeeRegistrationSuccessMessage();
    }

    @When("user clicks on book category")
    public void userClicksOnBookCategory()
    {
        homepage.clickOnBookCategory();
    }

    @And("user click on add to compare on two different products")
    public void userClickOnAddToCompareOnTwoDifferentProducts()
    {
        compareTwoProducts.selectProductsToCompare();
    }
    @Then("user should be able to see comparision of two different product")
    public void userShouldBeAbleToSeeComparisionOfTwoDifferentProduct() {
    }
    @And("user login first")
    public void userLoginFirst()
    {
        logIn.clickOnLogIn();
        logIn.enterLoginDetails();
    }

    @And("click on book Fahrenheit {int} by Ray Bradbury")
    public void clickOnBookFahrenheitByRayBradbury()
    {
        referFriendRegisterUser.clickOnBook();
    }

    @When("User click on email a friend Button")
    public void userClickOnEmailAFriendButton()
    {
    }

    @And("fill out details and click on submit button")
    public void fillOutDetailsAndClickOnSubmitButton()
    {
        referFriendRegisterUser.emailAFriendDetails();
    }

    @Then("user should see success message")
    public void userShouldSeeSuccessMessage()
    {referFriendRegisterUser.verifyUserSeeSuccessMessageOfEmailAFriend();
    }


    @Then("user should see error message")
    public void userShouldSeeErrorMessage()
    {
        referFriendNonRegisterUser.emailAFriendNonRegUserDetails();
        referFriendNonRegisterUser.verifyUserSeeErrorMessage();
    }

    @And("I select on high to low")
    public void iSelectOnHighToLow()
    {
     sortPriceHighToLow.userSelectFRomPositionPriceHighToLow();
    }

    @Then("I should see price organised high to low")
    public void iShouldSeePriceOrganisedHighToLow()
    {
        sortPriceHighToLow.verifyUserShouldBeAbleToSeePriceHighToLow();
    }

    @And("user can click on add to cart and go to shopping cart")
    public void userCanClickOnAddToCartAndGoToShoppingCart()
    {
        referFriendRegisterUser.clickOnBook();
        guestUserCheckOut.addToCart();
    }

    @And("user can tick on terms box and click on checkout")
    public void userCanTickOnTermsBoxAndClickOnCheckout() {
        guestUserCheckOut.guestCheckOut();
    }

    @And("user can click on checkout as guest")
    public void userCanClickOnCheckoutAsGuest() {     }

    @And("user can enter all compulsory field and make payment")
    public void userCanEnterAllCompulsoryFieldAndMakePayment()
    {
        paymentPage.paymentInstruction();
    }

    @And("user can click on conform button")
    public void userCanClickOnConformButton(){    }

    @Then("user can buy product successfully and see message")
    public void userCanBuyProductSuccessfullyAndSeeMessage()
    {
     guestUserCheckOut.guestCheckOutSuccessVerify();
    }

    @When("user navigate to new comments")
    public void userNavigateToNewComments()
    {
        guestUserComments.clickOnNews();
    }

    @And("user fills comment fields")
    public void userFillsCommentFields()
    {
        guestUserComments.enterTitle();
        guestUserComments.enterComment();
    }

    @And("user click on new comment button")
    public void userClickOnNewCommentButton()
    {
        guestUserComments.clickOnNewComment();
    }

    @Then("comment should be added and message display <News comment is successfully added.>")
    public void commentShouldBeAddedAndMessageDisplayNewsCommentIsSuccessfullyAdded()
    {guestUserComments.verifyUsersCommentIsAdded();
    }

    @When("user change currency to USD to Euro or")
    public void userChangeCurrencyToUSDToEuroOr()
    {
        changeCurrency.selectCurrencyFromDropDown();
    }

    @Then("user can see all the prices have change USD to Euro")
    public void userCanSeeAllThePricesHaveChangeUSDToEuro() {
        changeCurrency.verifyingCurrencySymbolPresent();
    }

    @When("user see all products")
    public void userSeeAllProducts() throws InterruptedException {
        addToCartButtonPresent.verifyAddToCartButtonPresentInEachItem();
    }

    @Then("user should be see add to cart button")
    public void userShouldBeSeeAddToCartButton() {
        addToCartButtonPresent.verifyAddToCartButtonPresent();
    }
}

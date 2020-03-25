package WebTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class GuestUserComments extends Utils
{
    LoadProp loadProp = new LoadProp();
    private By _ClickOnNews = By.xpath("/html/body/div[6]/div[4]/div[1]/div[2]/ul/li[2]/a" );
    private By _ClickDetails = By.xpath( "//a[contains(@href,'about')and(@class='read-more')]" );
    private By _EnterTitle = By.id( "AddNewComment_CommentTitle" );
    private By _EnterComment =By.id( "AddNewComment_CommentText" );
    private By _ClickOnNewComment =By.name( "add-comment" );
    private By _CommetnSuccessMessageField = By.xpath("//div[@class=\"result\"]");
    String commentTitle = "Test123"+timeStamp();
    private By _GetMesssage =By.id( "result" );
    private String EnterTitle = "Very Good website";
    private String EnterComment = "thanks for providing practice website";
    private String expected = "News comment is successfully added.";
    String commentSuccessMessage = loadProp.getProperty("commentSuccessMessage");


    public void clickOnNews()
    {
        clickOnElement( _ClickOnNews );
        sleep( 2 );
        clickOnElement( _ClickDetails );
    }
    public  void enterTitle()
    {
        sleep( 3 );
        enterText( _EnterTitle, EnterTitle );
    }
    public void enterComment()
    {
        enterText( _EnterComment, EnterComment );
    }
    public void clickOnNewComment()
    {
        clickOnElement( _ClickOnNewComment );
    }
    public void verifyUsersCommentIsAdded()
    {
        Assert.assertEquals(getTextFromElement(_CommetnSuccessMessageField),commentSuccessMessage,"New comment not added......");

        List<WebElement> listOfCommentsElements= driver.findElements(By.cssSelector("div.comment.news-comment"));

        //finding number of comments
        int numberOfComments =listOfCommentsElements.size();

        //finding last comments text
        String actualComment = listOfCommentsElements.get(numberOfComments-1).getText();

        Assert.assertTrue(actualComment.contains(commentTitle),"Comment is not added at bottom of the page");

    }
    public  void userShouldSeeCommentAddedMessage()
    {
        getTextFromElement( _GetMesssage );
        assertTextMessage( "cc","News comment is successfully added.", _GetMesssage );
    }
}

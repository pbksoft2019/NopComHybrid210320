package WebTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AddToCartButtonPresent extends Utils
{
    // locator for category list field
    private By _CategoryListField = By.xpath("//div[@class=\"block block-category-navigation\"]/div[2]/ul[1]/li/a[1]");
    // locator for item box field
    private By _ItemBoxesField = By.className("product-item");
    // locator for add to cart button
    private By _AddCartButtonField = By.cssSelector("[type='button'][value='Add to cart']");
    // locator for product name field
    private By _ProductNameField = By.cssSelector("h2.product-title > a");

    public void verifyAddToCartButtonPresentInEachItem() throws InterruptedException {
        clickOnElement( By.xpath("//li/a[@href=\"/computers\"]"));
        sleep( 3 );

        List<WebElement> mainCategoryList = driver.findElements(_CategoryListField);

        int categoryList = mainCategoryList.size();
        System.out.println("Main Category: "+categoryList);

        for (int i = 1; i <=categoryList ; i++)
        {
            System.out.println(driver.findElement(By.xpath("//div[@class=\"block block-category-navigation\"]/div[2]/ul[1]/li["+i+"]/a")).getText());
            driver.findElement(By.xpath("//div[@class=\"block block-category-navigation\"]/div[2]/ul[1]/li["+i+"]/a")).click();
            sleep( 5 );

            List<WebElement> subCategoryList = driver.findElements(By.xpath("//div[@class=\"block block-category-navigation\"]/div[2]/ul[1]/li["+i+"]/ul[1]/li/a[1]"));
            int subCategories = subCategoryList.size();
            if (subCategories>0)
            {
                System.out.println("....................SubCategory: "+subCategories);

                for (int j = 1; j <=subCategories ; j++)
                {
                    System.out.println("                    "+driver.findElement(By.xpath("//div[@class=\"block block-category-navigation\"]/div[2]/ul[1]/li["+i+"]/ul[1]/li["+j+"]/a[1]")).getText());
                    driver.findElement(By.xpath("//div[@class=\"block block-category-navigation\"]/div[2]/ul[1]/li["+i+"]/ul[1]/li["+j+"]/a[1]")).click();
                    Thread.sleep(4000);
                    verifyAddToCartButtonPresent();
                }
            }else{
                verifyAddToCartButtonPresent();
            }
        }
    }

    public void verifyAddToCartButtonPresent() {

        List<WebElement> webElementList=driver.findElements(_ItemBoxesField);
        int count=0;
        for (WebElement element : webElementList)
        {
            //finding add tocart element present in each product box
            if (element.findElements(_AddCartButtonField).size() == 1)
            {
                //adding add to cart button for counting
                count++;
            }
            else
            {
                //if add to cart element not present, then printing product title/name from that product box
                System.out.println("                                   "+"NO ADD TO CART BUTTON >>>>>>> "+ element.findElement(_ProductNameField).getText()+"\n" );
            }
        }
    }
}

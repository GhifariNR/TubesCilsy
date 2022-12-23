package pages;

import base.testBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class BoardPages extends testBase {
    public BoardPages(){
        PageFactory.initElements(driver, "https://staging.cicle.app/companies/61eba2c85080f47b25ddc8f8");
    }
    By BoardMenu = By.xpath("//*[contains(text(),'Board')]");
    By AddListBtn = By.xpath("//*[contains(text(),'Add List')]");
    By InputBoardName = By.xpath("//div[@class='ListContainer_ListContainer__outerList__1PG0-']/div/div/div/form/div[1]/input");
    By CreateBoardListBtn = By.xpath("//div[@class='ListContainer_createListSection__2AIXs']/div/div/form/div[2]/div/button");
    By VerifyBoardListCantEmpty = By.id("notistack-snackbar");
    By VerifySuccessAddList = By.id("notistack-snackbar");
    By AddCardBtn = By.xpath("//div[@data-rbd-droppable-id='all-lists']/div[1]/div/div/div[4]/a['Add Card']");
    By CreateCardBtn = By.xpath("//div[@class='CreateCardForm_container__2ljHB']/div[3]/button/div");
    By FieldCardBtn = By.xpath("//div[@class='ListContainer_ListContainer__outerList__1PG0-']/div/div/div/div[4]/div/form/input");
    By VerifyCardListCantEmpty = By.xpath("//div[@class='SnackbarContainer-bottom SnackbarContainer-left SnackbarContainer-root css-uwcd5u']/div/div/div/div/div");
    By VerifyCardSuccessAdded = By.xpath("//div[@class='SnackbarContainer-bottom SnackbarContainer-left SnackbarContainer-root css-uwcd5u']/div/div/div/div/div");
    By DotThreeCardName = By.xpath("//div[@class='ListContainer_ListContainer__outerList__1PG0-']/div/div/div/div[1]/div[2]");
    By SetCompleteList = By.xpath("//div[@class='BoxPopOver_BoxPopOver__1vCj0 BoxPopOver_BoxPopOver__left__9KRmE']/div/div/div/div[3]");
    By VerifySetCompletSuccess = By.xpath("//div[@class='SnackbarContainer-bottom SnackbarContainer-left SnackbarContainer-root css-uwcd5u']/div/div/div/div/div");

    public void clickBoardMenu(){
        driver.findElement(BoardMenu).click();
    }
    public void clickAddListButton(){
        driver.findElement(AddListBtn).click();
    }
    public void ClickBoardListButton(){
        driver.findElement(CreateBoardListBtn).click();
    }
    public void FieldBoardList(){
        driver.findElement(InputBoardName).sendKeys("list 1");
    }
    public void VerifyListCannotEmpty(){
        boolean verifyEmptyList = driver.findElement(VerifyBoardListCantEmpty).isDisplayed();
    }
    public void VerifySuccessAddList(){
        boolean verifysuccessAddList = driver.findElement(VerifySuccessAddList).isDisplayed();
    }
    public void AddCard(){
        driver.findElement(AddCardBtn).click();
    }
    public void CreateNewCardButton(){
        driver.findElement(CreateCardBtn).click();
    }
    public void VerifyCardNameCantEmpty(){
        boolean verifyemptycard = driver.findElement(VerifyCardListCantEmpty).isDisplayed();
    }
    public void InputCardButton(){
        driver.findElement(FieldCardBtn).sendKeys("Card 1");
    }
    public void VerifySuccessAddCard(){
        boolean VerifySuccessAddCard = driver.findElement(VerifyCardSuccessAdded).isDisplayed();
    }
    public void ClickDotThreeCardName(){
        driver.findElement(DotThreeCardName).click();
    }
    public void SetCompleteList(){
        driver.findElement(SetCompleteList).click();
    }
    public void VerifyCompleteList(){
        boolean verifyCompleteList = driver.findElement(VerifySetCompletSuccess).isDisplayed();
    }
}

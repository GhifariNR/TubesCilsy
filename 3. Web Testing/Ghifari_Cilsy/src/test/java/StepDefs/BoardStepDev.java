package StepDefs;

import base.testBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BoardPages;

public class BoardStepDev extends testBase {
    BoardPages boardPages;
    //@Positive-Open-Menu-Board
    @Given("User Navigate to Cicle")
    public void userNavigateToCicle() throws Exception{
        initialization();
        boardPages = new BoardPages();
    }
    @When("User Click Board Menu")
    public void userClickBoardMenu() throws Exception{
        boardPages.clickBoardMenu();
        Thread.sleep(3000);
    }

    @Then("Close Web")
    public void closeWeb() {
        driver.quit();
    }
    //@Negative-Add-Empty-Card-List
    @And("User Click Add List Button")
    public void userClickAddListButton() throws Exception{
        boardPages.clickAddListButton();
        Thread.sleep(3000);
    }

    @And("User Click Board List Button")
    public void userClickBoardListButton() throws Exception{
        boardPages.ClickBoardListButton();
        Thread.sleep(3000);
    }

    @Then("Verify List Cant Empty")
    public void verifyListCantEmpty() throws Exception{
        boardPages.ClickBoardListButton();
        Thread.sleep(3000);
        driver.quit();
    }
    //@Positive-Add-List
    @And("User Input Board List")
    public void userInputBoardList() throws Exception{
        boardPages.FieldBoardList();
        Thread.sleep(3000);
    }

    @Then("Verify Success Add List")
    public void verifySuccessAddList() throws Exception{
        boardPages.VerifySuccessAddList();
        Thread.sleep(3000);
        driver.quit();
    }
    //@Positive-Set-Complete-List-Card
    @And("User Click Dot Three Card Name")
    public void userClickDotThreeCardName() throws Exception{
        boardPages.ClickDotThreeCardName();
        Thread.sleep(3000);
    }

    @And("User Click Set Complete List Card")
    public void userClickSetCompleteListCard() throws Exception{
        boardPages.SetCompleteList();
        Thread.sleep(3000);
    }

    @Then("Verify Complete Card is Success")
    public void verifyCompleteCardIsSuccess() throws Exception{
        boardPages.VerifyCompleteList();
        Thread.sleep(3000);
        driver.quit();
    }
    //@Negative-Add-Empty-Card
    @And("User Click Add Card Button")
    public void userClickAddCardButton() throws Exception{
        boardPages.AddCard();
        Thread.sleep(3000);
    }

    @And("User Click New Card Button")
    public void userClickNewCardButton() throws Exception{
        boardPages.CreateNewCardButton();
        Thread.sleep(3000);
    }

    @Then("Verify Card Name Cant Empty")
    public void verifyCardNameCantEmpty() throws Exception{
        boardPages.VerifyCardNameCantEmpty();
        Thread.sleep(3000);
        driver.quit();
    }
    //@Positive-Add-Card
    @And("User Input Card")
    public void userInputCard() throws Exception{
        boardPages.InputCardButton();
        Thread.sleep(3000);
    }

    @Then("Verify Success Add Card")
    public void verifySuccessAddCard() throws Exception{
        boardPages.VerifySuccessAddCard();
        Thread.sleep(3000);
        driver.quit();
    }



}

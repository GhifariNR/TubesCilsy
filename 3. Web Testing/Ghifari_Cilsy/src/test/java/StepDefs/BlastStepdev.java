package StepDefs;

import base.testBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BlastPages;

public class BlastStepdev extends testBase {
    BlastPages blastPages;

    @Given("User Navigate to Cicle Teams")
    public void userNavigateToCicleTeams() throws Exception{
    initialization();
    blastPages = new BlastPages();
    }

    @When("User Click Blast Menu")
    public void userClickBlastMenu() {
        blastPages.clickBlastdMenu();
    }

    @Then("User successfully on blast menu")
    public void userSuccessfullyOnBlastMenu() {
        blastPages.VerifyOnBlastMenu();
        driver.quit();
    }

    @Then("User Click Create Button")
    public void userClickCreateButton() throws Exception {
        blastPages.ClistCreateButton();
        Thread.sleep(3000);
    }

    @And("User Click Publish Button")
    public void userClickPublishButton() throws Exception {
        blastPages.ClickPublishButton();
        Thread.sleep(3000);
    }

    @Then("Notify to verify Parameter Cant Empty is Pop up")
    public void notifyToVerifyParameterCantEmptyIsPopUp() throws Exception {
        blastPages.VerifyParameterCantEmpty();
        Thread.sleep(3000);
        driver.quit();
    }

    @Then("User Click Blast Post")
    public void userClickBlastPost() throws Exception {
        blastPages.ClickBlastPost();
        Thread.sleep(3000);
    }

    @And("User Click Dot Three")
    public void userClickDotThree() throws Exception{
        blastPages.ClickDotThreeArchive();
        Thread.sleep(3000);
    }

    @And("User Choose Archive Blast")
    public void userChooseArchiveBlast() throws Exception{
        blastPages.ClickArchiveButton();
        Thread.sleep(3000);
    }

    @And("User Click Yes for Archive")
    public void userClickYesForArchive() throws Exception {
        blastPages.YesForArchive();
        Thread.sleep(3000);
    }

    @Then("Web Close")
    public void webClose() {
        driver.quit();
    }

    @And("User Input Description")
    public void userInputDescription() throws Exception {
        blastPages.InputDescriptionWithoutTitle();
        Thread.sleep(3000);
    }

    @And("User Input Title")
    public void userInputTitle() {
        blastPages.InputTitleBlast();
    }

    @Then("Notify Successfully Add Blast")
    public void notifySuccessfullyAddBlast() throws Exception {
        blastPages.VerifyParameterCantEmpty();
        Thread.sleep(3000);
        driver.quit();
    }
}

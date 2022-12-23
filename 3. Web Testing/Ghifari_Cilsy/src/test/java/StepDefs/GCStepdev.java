package StepDefs;

import base.testBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GroupChat;


public class GCStepdev extends testBase {
    GroupChat groupChatPages;
    @Given("User Navigate to Cicle Staging")
    public void userNavigateToCicleStaging() throws Exception{
        initialization();
        groupChatPages = new GroupChat();
    }

    @When("User Click GroupChat Menu")
    public void userClickGroupChatMenu() throws Exception{
        groupChatPages.ClickMenuGroupChat();
        Thread.sleep(3000);
    }

    @Then("Close Webs")
    public void closeWebs() {
        driver.quit();
    }
    //@Negative-Send-Empty-Message
    @And("User Click Submit Button")
    public void userClickSubmitButton() throws Exception{
        groupChatPages.ClickSubmitButton();
        Thread.sleep(3000);
    }
    //@Positive-Send-Message
    @And("User Input Message")
    public void userInputMessage() throws Exception{
        groupChatPages.InputMessage();
        Thread.sleep(3000);
    }

    @And("User Input @ Message")
    public void userInputAtMessage() throws Exception{
        groupChatPages.SendAtMessage();
        Thread.sleep(3000);
    }

    @And("User Click People in shown")
    public void userClickPeopleInShown() throws Exception{
        groupChatPages.MentionPeople();
        Thread.sleep(3000);
    }

    @And("User Click Attachment Icon")
    public void userClickAttachmentIcon() throws Exception{
        groupChatPages.ClickUploadFile();
        Thread.sleep(3000);
    }

    @And("User Upload Attachment")
    public void userUploadAttachment() throws Exception{
        groupChatPages.UploadAttachmentFile1();
        Thread.sleep(3000);
    }
}

package pages;

import base.testBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class BlastPages extends testBase {

    public BlastPages(){
        PageFactory.initElements(driver, "https://staging.cicle.app/companies/61eba2c85080f47b25ddc8f8");
    }
    By BlastMenu = By.xpath("//*[contains(text(),'Blast')]");
    By CreateBlastBtn = By.xpath("//*[contains(@class, 'GlobalActionButton_text__31ND7')]");
    By PublishBtn = By.xpath("//*[contains(@class, 'Main_iconText__f-xVC Main_iconDefault__3fDo9 Main_iconPositionStart__IWQqT')]");
    By AssertParameterNotComplete = By.id("notistack-snackbar");
    By FieldTitle = By.xpath("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 Main_container__211E3 css-aoeo82']/div/div/div/textarea");
    By FieldDescription = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[2]/div/div/div[3]/div/p");
    By ArchiveBtn = By.xpath("//div[@class='Basic_container__UtC8A']/div[2]/div[1]");
    By ClickBlastPosted = By.xpath("//div[@class='Main_container__39jS7']/div[2]/div/div/div/div/div/div[1]/a/div");
    By ClickDotThree = By.xpath("//div[@class='PostBlastPage_menuSection__2mg_7']/div");
    By ClickYesChoiceArchive = By.xpath("//div[@class='MuiDialogActions-root MuiDialogActions-spacing css-14b29qc']/div[2]/button");
    By VerifyOnBlastMenu = By.className("Main_container__39jS7");
    public void VerifyOnBlastMenu (){
        driver.findElement(VerifyOnBlastMenu).isEnabled();
    }
    public void clickBlastdMenu(){
        driver.findElement(BlastMenu).click();
    }
    public void ClistCreateButton(){
        driver.findElement(CreateBlastBtn).click();
    }
    public void ClickPublishButton(){
        driver.findElement(PublishBtn).click();
    }
    public void VerifyParameterCantEmpty(){
        driver.findElement(AssertParameterNotComplete).click();
    }
    public void InputTitleBlast(){
        driver.findElement(FieldTitle).sendKeys("This is title");
    }
    public void InputTitleWithoutDescription(){
        driver.findElement(FieldTitle).sendKeys("This is Title Without Description");
    }
    public void InputDescriptionWithoutTitle(){
        driver.findElement(FieldDescription).sendKeys("This is Description without title");
    }
    public void InputDescriptionBlast(){
        driver.findElement(FieldDescription).sendKeys("This is Description");
    }
    public void ClickArchiveButton(){
        driver.findElement(ArchiveBtn).click();
    }
    public void ClickBlastPost(){
        driver.findElement(ClickBlastPosted).click();
    }
    public void ClickDotThreeArchive(){
        driver.findElement(ClickDotThree).click();
    }
    public void YesForArchive(){
        driver.findElement(ClickYesChoiceArchive).click();
    }


}

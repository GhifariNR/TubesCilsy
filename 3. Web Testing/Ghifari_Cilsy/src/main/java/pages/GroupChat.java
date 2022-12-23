package pages;

import base.testBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import java.io.File;

public class GroupChat extends testBase {

    public GroupChat(){
        PageFactory.initElements(driver, "https://staging.cicle.app/companies/61eba2c85080f47b25ddc8f8");
    }

    By GroupChatMenu = By.xpath("//*[contains(text(),'Group Chat')]");
    By SubmitBtn = By.xpath("//div[@class='MainGroupChatSection_create__2hsB_']/div/div[3]/div/div");
    By SendMessageBar = By.xpath("//div[@class='CreateMessage_container__3JaSW']/div[2]/div/div/div/p");
    By MentionPeople = By.xpath("//div[@class='tribute-container']/ul/li");
    By DownArrowMessageBtn = By.xpath("//div[@class='infinite-scroll-component ']/div[1]/div/div/div[2]");
    By ChooseDeleteBtn = By.xpath("//*[@id=\"list-groupChat-messages-section\"]/div/div/div[1]/div/div/div[1]/div[1]/svg");
    By ClickMessage = By.className("Message_balloonMessage__3dmkS");
    By ChooseDeleteMessage = By.className("MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv");

    //Attachment file photo
    By attachmentfile = By.xpath("//*[contains(@type,'file')]");
    By Uploadfile = By.className("CreateMessage_attachment__2Z8Rx");

    //Photo
    String filename1 = "D:\\GIT FOLDER\\Ghifari_Cilsy\\src\\main\\FileTest\\HAHAHA.jpeg";
    File file1 = new File(filename1);
    String path1 = file1.getAbsolutePath();
    public void UploadAttachmentFile1(){
        System.out.println("Upload file " + path1);
        driver.findElement(attachmentfile).sendKeys(path1);
    }

    public void ClickMenuGroupChat(){
        driver.findElement(GroupChatMenu).click();
    }
    public void ClickSubmitButton(){
        driver.findElement(SubmitBtn).click();
    }
    public void InputMessage(){
        driver.findElement(SendMessageBar).sendKeys("Halo");
    }
    public void SendAtMessage(){
        driver.findElement(SendMessageBar).sendKeys(" @");
    }
    public void MentionPeople(){
        driver.findElement(MentionPeople).click();
    }
    public void ClickMessage(){
        driver.findElement(ClickMessage).click();
    }
    public void DownArrowMessage(){
        driver.findElement(DownArrowMessageBtn).click();
    }
    public void ChooseDeleteMessage(){
        driver.findElement(ChooseDeleteBtn).click();
    }
    public void ChooseDeleteforDeleteMessage(){
        driver.findElement(ChooseDeleteMessage).click();
    }
    public void ClickUploadFile(){
        driver.findElement(Uploadfile).click();
    }
}





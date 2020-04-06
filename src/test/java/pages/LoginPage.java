package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {
    String url ="https://moodpanda.com/login/";

     public LoginPage openPage(){
         open(url);
         $("[alt='MoodPanda Android App on Google Play']").waitUntil(Condition.visible,3000);
         return this;
     }
     public LoginPage login(String user, String password){
         $(By.id("ContentPlaceHolderContent_TextBoxEmail")).sendKeys(user);
         $(By.id("ContentPlaceHolderContent_TextBoxPassword")).sendKeys(password);
         $(By.id("ContentPlaceHolderContent_ButtonLogin")).click();
         return this;
     }

}

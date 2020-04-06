package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class FeedPage {
    By UPDATE_MOOD_ID=By.id("LinkUpdate");
    public FeedPage isPageOpened(){
        $(UPDATE_MOOD_ID).waitUntil(Condition.visible,3000);
        return this;
    }
    public MoodModal clickUpdate(){
        $(UPDATE_MOOD_ID).click();

        return  new MoodModal();
    }
}

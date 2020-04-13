package pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;

public class MoodModal {
    String UPDATE_BUTTON_CSS=".ButtonUpdate";
    String MY_DIARY_BUTTON_CSS= ".ButtonMyDiary";
    public MoodModal isPageOpened(){
        $(UPDATE_BUTTON_CSS).should(Condition.appear);
        return this;
    }

    @Step("Mood Change")
    public MoodModal updateDetails(int moodRating,String description, String date){
        $("#TextBoxUpdateMoodTag").sendKeys(description);
        if(moodRating>5){
            for (int i=0; i<moodRating-5; i++) {
                $(".ui-slider-handle ").click();
                $(".ui-slider-handle ").sendKeys(Keys.ARROW_RIGHT);
            }
        }else{
            for (int i=0; i<5-moodRating; i++){
                $(".ui-slider-handle ").click();
                $(".ui-slider-handle ").sendKeys(Keys.ARROW_LEFT);}
        }
        return this;
    }
    public MoodModal clickUpdateMood(){
        $(UPDATE_BUTTON_CSS).click();
        return this;
    }
    public void toDiary(){
        $(MY_DIARY_BUTTON_CSS).click();
    }
}

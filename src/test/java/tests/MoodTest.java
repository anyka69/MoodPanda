package tests;

import org.testng.annotations.Test;

public class MoodTest extends BaseTest{
    @Test
    public void updateMood10Test(){
        steps
                .login("piter1@mailinator.com","qwerty123")
                .updateMood(1,"","");
    }
}

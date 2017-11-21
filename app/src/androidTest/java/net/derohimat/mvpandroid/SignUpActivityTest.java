package net.derohimat.mvpandroid;

import android.support.test.espresso.intent.rule.IntentsTestRule;
import android.support.test.runner.AndroidJUnit4;

import net.derohimat.mvpandroid.ui.main.MainActivity;
import net.derohimat.mvpandroid.ui.signup.SignUpActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.intent.Intents.intended;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class SignUpActivityTest {

    String email = "abc1712@gmail.com";
    String pass = "fdgte%$";

    @Rule
    public IntentsTestRule<SignUpActivity> testRule = new IntentsTestRule<>(SignUpActivity.class);

    @Test
    public void SignUpTest() {

        onView(withId(R.id.email)).perform(typeText(email));
        onView(withId(R.id.password)).perform(typeText(pass), closeSoftKeyboard());
        onView(withId(R.id.signup)).perform(click());
        intended(hasComponent(MainActivity.class.getName()));
    }

}
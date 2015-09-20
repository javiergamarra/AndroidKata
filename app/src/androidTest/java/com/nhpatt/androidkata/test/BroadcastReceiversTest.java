package com.nhpatt.androidkata.test;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;

import com.nhpatt.androidkata.activity.Main;
import com.nhpatt.androidkata.activity.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

//Expresso library route changed on newer version.


@SmallTest
public class BroadcastReceiversTest extends ActivityInstrumentationTestCase2<Main> {

    public BroadcastReceiversTest() {
        super(Main.class);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        getActivity();
    }

    public void testInnerBroadcast() {
        onView(withId(R.id.buttonSameActivity)).perform(click());
        onView(withId(R.id.buttonSameActivity)).check(matches(withText("Broadcast clicked!")));
    }

    public void testOtherActivityBroadcast() {
        onView(withId(R.id.buttonOtherActivity)).perform(click());
        onView(withId(R.id.titleSecondActivity)).check(matches(isDisplayed()));
    }

//    public void testGeneralBroadcast() {
//        getActivity().sendBroadcast(new Intent("android.intent.action.AIRPLANE_MODE"));
//        onView(withId(R.id.titleAirplaneMode)).check(matches(isDisplayed()));
//    }

}

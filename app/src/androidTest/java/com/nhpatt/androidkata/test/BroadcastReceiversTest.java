package com.nhpatt.androidkata.test;

import android.content.Intent;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;

import com.nhpatt.androidkata.activity.Main;
import com.nhpatt.androidkata.activity.R;

import static com.google.android.apps.common.testing.ui.espresso.Espresso.onView;
import static com.google.android.apps.common.testing.ui.espresso.action.ViewActions.click;
import static com.google.android.apps.common.testing.ui.espresso.assertion.ViewAssertions.matches;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.isDisplayed;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.withId;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.withText;

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

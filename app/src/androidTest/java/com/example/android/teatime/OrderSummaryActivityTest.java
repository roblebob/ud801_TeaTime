/*
* Copyright (C) 2017 The Android Open Source Project
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*  	http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package com.example.android.teatime;

import org.junit.Rule;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;



import static android.app.Instrumentation.ActivityResult;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.intent.Intents.intended;
import static androidx.test.espresso.intent.Intents.intending;
import static androidx.test.espresso.intent.matcher.ComponentNameMatchers.hasShortClassName;
import static androidx.test.espresso.intent.matcher.IntentMatchers.hasAction;
import static androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static androidx.test.espresso.intent.matcher.IntentMatchers.hasData;
import static androidx.test.espresso.intent.matcher.IntentMatchers.isInternal;
import static androidx.test.espresso.intent.matcher.IntentMatchers.toPackage;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static androidx.test.ext.truth.content.IntentSubject.assertThat;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.core.AllOf.allOf;
import static org.robolectric.annotation.TextLayoutMode.Mode.REALISTIC;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;


import androidx.test.core.app.ActivityScenario;
import androidx.test.espresso.intent.Intents;
import androidx.test.espresso.intent.rule.IntentsTestRule;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.rule.GrantPermissionRule;

//import com.google.common.collect.Iterables;
import androidx.test.espresso.core.internal.deps.guava.collect.Iterables;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.annotation.TextLayoutMode;














// TODO✓(1) Add annotation to specify AndroidJUnitRunner class as the default test runner
@RunWith(JUnit4.class)
public class OrderSummaryActivityTest {

    // TODO (2) Add the rule that indicates we want to use Espresso-Intents APIs in functional UI tests
    @Rule public IntentsTestRule< OrderSummaryActivity>  mActivityTestRule = new IntentsTestRule<>( OrderSummaryActivity.class);

    // TODO (3) Finish this method which runs before each test and will stub all external intents so all external intents will be blocked
    public void stubAllExternalIntents() {

    }


    // TODO (4) Finish this method which verifies that the intent sent by clicking the send email button matches the intent sent by the application
    public void clickSendEmailButton_SendsEmail() {

    }
}
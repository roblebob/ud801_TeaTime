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

import android.app.Activity;

import androidx.test.espresso.intent.rule.IntentsTestRule;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


import static android.app.Instrumentation.ActivityResult;
import static androidx.test.espresso.intent.Intents.intending;
import static androidx.test.espresso.intent.matcher.IntentMatchers.isInternal;
import static org.hamcrest.Matchers.not;


// TODO✓(1) Add annotation to specify AndroidJUnitRunner class as the default test runner
@RunWith(JUnit4.class)
public class OrderSummaryActivityTest {

    // TODO✓(2) Add the rule that indicates we want to use Espresso-Intents APIs in functional UI tests
    @Rule public IntentsTestRule< OrderSummaryActivity> mActivityTestRule = new IntentsTestRule<>( OrderSummaryActivity.class);

    // TODO✓(3) Finish this method which runs before each test and will stub all external intents so all external intents will be blocked
    @Before
    public void stubAllExternalIntents() {
        intending( not( isInternal()))   .respondWith(  new ActivityResult( Activity.RESULT_OK, null));
    }

    // TODO (4) Finish this method which verifies that the intent sent by clicking the send email button matches the intent sent by the application
    @Test
    public void clickSendEmailButton_SendsEmail() {

    }
}
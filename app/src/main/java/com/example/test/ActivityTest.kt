package com.example.test

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test

class ActivityTest {

    @Rule
    @JvmField
    var rule: ActivityScenarioRule<*> = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun simpleDivide() {
        Espresso.onView(withId(R.id.firstEd)).perform(ViewActions.typeText("4"))
        Espresso.onView(withId(R.id.firstEd)).perform(ViewActions.closeSoftKeyboard())
        Espresso.onView(withId(R.id.secondEd)).perform(ViewActions.typeText("0"))
        Espresso.onView(withId(R.id.secondEd)).perform(ViewActions.closeSoftKeyboard())
        Espresso.onView(withId(R.id.plusBtn)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.devideBtn))
            .check(ViewAssertions.matches(ViewMatchers.withText("на ноль делить нельзя")))
    }
}
package com.submission1.home

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.submission1.R
import com.submission1.utils.DataDummy
import org.junit.Rule
import org.junit.Test

class HomeActivityTest {

    private val listMovie = DataDummy.generateDummyMovies()
    private val listTvShow = DataDummy.generateDummyTv()

    @get:Rule
    var activityRule = ActivityScenarioRule(HomeActivity::class.java)

    @Test
    fun loadMovie() {
        Espresso.onView(withId(R.id.rvMovie))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
            .perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(listMovie.size))
    }

    @Test
    fun openDetailMovie() {
        val selectedMovie = listMovie.first()
        Espresso.onView(withId(R.id.rvMovie)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0,
            ViewActions.click()
        ))
        Espresso.onView(withId(R.id.textViewTitle)).check(ViewAssertions.matches(ViewMatchers.isDisplayed())).check(
            ViewAssertions.matches(withText(selectedMovie.title))
        )
        Espresso.onView(withId(R.id.textViewReleaseDate)).check(ViewAssertions.matches(ViewMatchers.isDisplayed())).check(
            ViewAssertions.matches(withText(selectedMovie.releaseDate))
        )
        Espresso.onView(withId(R.id.textViewOverview)).check(ViewAssertions.matches(ViewMatchers.isDisplayed())).check(
            ViewAssertions.matches(withText(selectedMovie.overview))
        )
        Espresso.onView(withId(R.id.textViewRating)).check(ViewAssertions.matches(ViewMatchers.isDisplayed())).check(
            ViewAssertions.matches(withText(selectedMovie.voteAverage.toString()))
        )
    }

    @Test
    fun loadTvShow() {
        Espresso.onView(ViewMatchers.withText("Tv")).perform(ViewActions.click())
        Espresso.onView(withId(R.id.rvTvShow))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
            .perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(listTvShow.size))
    }

    @Test
    fun openDetailTvShow() {
        val selectedTvShow = listTvShow.first()
        Espresso.onView(ViewMatchers.withText("Tv")).perform(ViewActions.click())
        Espresso.onView(withId(R.id.rvTvShow)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0,
            ViewActions.click()
        ))
        Espresso.onView(withId(R.id.textViewTitle)).check(ViewAssertions.matches(ViewMatchers.isDisplayed())).check(
            ViewAssertions.matches(withText(selectedTvShow.title))
        )
        Espresso.onView(withId(R.id.textViewReleaseDate)).check(ViewAssertions.matches(ViewMatchers.isDisplayed())).check(
            ViewAssertions.matches(withText(selectedTvShow.firstAirDate))
        )
        Espresso.onView(withId(R.id.textViewOverview)).check(ViewAssertions.matches(ViewMatchers.isDisplayed())).check(
            ViewAssertions.matches(withText(selectedTvShow.overview))
        )
        Espresso.onView(withId(R.id.textViewRating)).check(ViewAssertions.matches(ViewMatchers.isDisplayed())).check(
            ViewAssertions.matches(withText(selectedTvShow.voteAverage.toString()))
        )
    }
}
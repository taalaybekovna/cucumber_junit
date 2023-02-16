package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.security.Key;
import java.util.List;

public class Google_search {
    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @When("User searches for {string} capital")
    public void user_searches_for_capital(String countryName) {
        googleSearchPage.searchBox.sendKeys("what is capital of "+countryName + Keys.ENTER);
    }

    @Then("User should see {string} in the result")
    public void user_should_see_in_the_result(String capitalCity) {

        Assert.assertEquals(capitalCity,googleSearchPage.capitalText.getText());

    }




    @Given("User is on Google search page")
    public void user_is_on_google_search_page() {
        Driver.getDriver().get("https://www.google.com/");

    }
    @When("User types apple in the google search box and clicks enter")
    public void user_types_apple_in_the_google_search_box_and_clicks_enter() {
        googleSearchPage.searchBox.sendKeys("apple" + Keys.ENTER);

    }
    @Then("User sees apple - Google Search is in the google title")
    public void user_sees_apple_google_search_is_in_the_google_title() {

        Assert.assertEquals("Verification is failed", "apple - Google Search", Driver.getDriver().getTitle());
    }

    @When("User types {string} in the google search box and clicks enter")
    public void userTypesInTheGoogleSearchBoxAndClicksEnter(String searchKeyWord) {
        googleSearchPage.searchBox.sendKeys(searchKeyWord + Keys.ENTER);
    }

    @Then("User sees {string} is in the google title")
    public void userSeesIsInTheGoogleTitle(String expectedTitle) {
        Assert.assertEquals("Verification is failed", expectedTitle, Driver.getDriver().getTitle());
    }

    @Then("User should be able to search for following:")
    public void userShouldBeAbleToSearchForFollowing(List<String> searchKeywords) {
        System.out.println("searchKeywords: " + searchKeywords);

        for (String each : searchKeywords) {
            googleSearchPage.searchBox.clear();
            googleSearchPage.searchBox.sendKeys(each+Keys.ENTER);
            Assert.assertEquals(each+" - Google Search",Driver.getDriver().getTitle());
        }

    }

    @Then("User sees apple – Google Search is in the google title")
    public void userSeesAppleGoogleSearchIsInTheGoogleTitle() {

    }
}

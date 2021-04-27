package steps_definitions;
import common.BaseAPI;
import io.cucumber.java.en.*;
import static ebay_testbase.Hooks.dealsPage;
public class Deals_definitions extends BaseAPI {
    @Given("user is in ebay home page")
    public void user_is_in_ebay_home_page() { }
    @When("user clicks on search button")
    public void user_clicks_on_search_button() {
        dealsPage.setDeals(); }
    @When("user inputs {string} in the search box")
    public void user_inputs_in_the_search_box(String items) {
        dealsPage.setSearch_for_anything(items); }}

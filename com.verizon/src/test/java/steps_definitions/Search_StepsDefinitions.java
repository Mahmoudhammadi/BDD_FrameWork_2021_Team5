package steps_definitions;
import common.BaseAPI;
import io.cucumber.java.en.*;
import static verizon_Testbase.Hooks.verizonHomePage;
public class Search_StepsDefinitions extends BaseAPI {
    @Given("user is in verizon home page")
    public void user_is_in_verizon_home_page() { }
    @When("user clicks on search button")
    public void user_clicks_on_search_button() {
        verizonHomePage.clicksearchButton(); }
    @When("user inputs {string} in the search box")
    public void user_inputs_in_the_search_box(String items) throws InterruptedException {
        verizonHomePage.dosearchbox(items);
        Thread.sleep(3000); }
    @Then("i click on shop button")
    public void i_click_on_shop_button() throws InterruptedException {
        verizonHomePage.setShop_Button(); }
    @Then("i click on why verizon button")
    public void i_click_on_why_verizon_button() {
      verizonHomePage.setWhyVerison_Button(); }
    @Then("i click on support button")
    public void i_click_on_support_button() {
       verizonHomePage.setSupport_Button(); }
    @Then("i click on shop all button")
    public void i_click_on_shop_all_button() {
    verizonHomePage.setShopall(); }
    @Then("iclic on add filter")
    public void iclic_on_add_filter() {
     verizonHomePage.setAdd_fliter(); }
    @Then("i click on brand")
    public void i_click_on_brand() {
    verizonHomePage.setBrand(); }
    @Then("i check apple box")
    public void i_check_apple_box() {
    verizonHomePage.setCheck_apple(); }
}

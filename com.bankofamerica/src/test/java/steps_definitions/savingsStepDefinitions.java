package steps_definitions;


import Savings.SavingsHomePage;
import io.cucumber.java.en.*;
import org.junit.Assert;

import java.util.Iterator;
import java.util.List;

import static bankofamerica_Testbase.Hooks.init;
import static bankofamerica_Testbase.Hooks.savingsHomePage;

public class savingsStepDefinitions extends SavingsHomePage {

    @Given("user on bank of america home page")
    public void user_on_bank_of_america_home_page() {

    }




    @When("user click on savings")
    public void user_click_on_savings() {
        savingsHomePage.clickSavings();
    }
    @When("user click on advantage savings link")
    public void user_click_on_advantage_savings_link() {
        savingsHomePage.clickAdvantageSavings();
    }
    @Then("user verify advantage savings is showing up")
    public void user_verify_advantage_savings_is_showing_up() {
       String expected="Start saving today";
       String actual=savingsHomePage.verifyAdvantageSavings();
        Assert.assertEquals(expected,actual);
    }
// child saving methods
@When("user click on child saving")
public void user_click_on_child_saving() {
    savingsHomePage.clickChildSaving();
}
    @When("user enter {string}")
    public void user_enter(String zipCode) {
        savingsHomePage.zipCode(zipCode);
    }

    @Then("user verify child saving")
    public void user_verify_child_saving() {
        String expected="Child Savings Accounts";
        String actual=savingsHomePage.verifyChildSaving();
        Assert.assertEquals(expected,actual);
    }
    @And("user click search button")
    public void user_click_search_button(){
        savingsHomePage.ClickZipCode();
    }

    @When("i send myUserName and password")
    public void i_send_my_user_name_and_password(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

        List<String> list = dataTable.asList();
        Iterator<String> it = list.iterator();

        enterUserName(it.next());
        enterPassword(it.next());
    }


}

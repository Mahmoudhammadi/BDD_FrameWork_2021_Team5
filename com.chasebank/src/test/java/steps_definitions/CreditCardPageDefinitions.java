package steps_definitions;
import homePage.ChaseCreditCards;
import io.cucumber.java.en.*;
import static verizon_Testbase.Hooks.chaseCreditCards;
public class CreditCardPageDefinitions extends ChaseCreditCards {
    @Given("i am at chase home page")
    public void i_am_at_chase_home_page() { }
    @Then("i click on credit cards button")
    public void i_click_on_credit_cards_button() {
        chaseCreditCards.setCreditCard();}
    @Then("i click on all cards button")
    public void i_click_on_all_cards_button() {
        chaseCreditCards.setAllCard(); }
    @When("i clic on view all rewards cards")
    public void i_clic_on_view_all_rewards_cards() {
    chaseCreditCards.setViewAllCard(); }
    @Then("i click on learn more")
    public void i_click_on_learn_more() {
     chaseCreditCards.setLearnMore(); }
    @Then("i click apply as guest")
    public void i_click_apply_as_guest() {
        chaseCreditCards.setAplyAsGuest(); }


}

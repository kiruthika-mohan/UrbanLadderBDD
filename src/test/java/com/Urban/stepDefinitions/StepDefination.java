package com.Urban.stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Urban.ReusableComponent.Reusablecomponent;
import com.Urban.Utilities.PropertyFileReader;
import com.Urban.pageObject.Cards;
import com.Urban.pageObject.Colours;
import com.Urban.pageObject.Decor;
import com.Urban.pageObject.Living;
import com.Urban.pageObject.Mattresses;
import com.Urban.pageObject.Searching;
import com.Urban.pageObject.Size;
import com.Urban.pageObject.Storage;
import com.Urban.pageObject.Study;
import com.Urban.pageObject.Urban;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

public class StepDefination {

	public static WebDriver driver;
	public static Logger log=LogManager.getLogger(Reusablecomponent.class.getName());
	@Given("^Initialize the Browser and Load url$")
	public void initialize_the_Browser_and_Load_url() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver =Reusablecomponent.initializer();
		driver.get(PropertyFileReader.loadfile().getProperty("url"));
		driver.manage().window().maximize();
		Urban u=new Urban();
		u.Close(driver);
	}

	@When("^Click login tab and enter invalid (.+) and (.+)$")
    public void click_login_tab_and_enter_invalid_and(String username, String password) throws Throwable {
		Urban u=new Urban();
		try
    	{
			u.login(driver);
			u.Email(driver, username);
			u.password(driver, password);
			u.signUp(driver);
			Reusablecomponent.getScreenshot("picture");
    	}
    	catch(Exception e)
    	{
    		System.out.println("Screenshot not taken");
    	}
    }

	@Then("^login Testcase verified$")
	public void login_Testcase_verified() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		log.info("The email or password you entered is incorrect. Please try again.");
	}

	@When("^Click storage tab and Dressers tab$")
	public void click_storage_tab_and_Dressers_tab() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Storage s=new Storage();
		s.storageTab(driver);
	}

	@Then("^Verify title and NoOf links and products$")
	public void verify_title_and_NoOf_links_and_products() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		log.info("StorageTab testcase passed Successfully");
	}

	@When("^Click mattresse tab and Mettresses$")
	public void click_mattresse_tab_and_Mettresses() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Mattresses m=new Mattresses();
		m.matTab(driver);
	}

	@Then("^Verify title and get types of mattresses$")
	public void verify_title_and_get_types_of_mattresses() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		log.info("MattressesTab testcase passed Successfully");
	}

	@When("^Click Living and wooden sofa sets tabs$")
	public void click_Living_and_wooden_sofa_sets_tabs() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Living l=new Living();
		l.livingTab(driver);
	}

	@Then("^Add the products in add to carts and verify$")
	public void add_the_products_in_add_to_carts_and_verify() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		log.info("LivingTab testcase passed Successfully");
	}

	@When("^Search table mat (.+) and chage price range$")
    public void search_table_mat_and_chage_price_range(String var) throws Throwable {
		Searching s=new Searching();
		s.searchTab(driver,var);
    }

	@Then("^Verify the changes$")
	public void verify_the_changes() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		log.info("SearchingTab testcase passed Successfully");
	}

	@When("^Click study and study chairs tabs change High to low recommends$")
	public void click_study_and_study_chairs_tabs_change_High_to_low_recommends() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Study s=new Study();
		s.studyTab(driver);
	}

	@Then("^print the high product price$")
	public void print_the_high_product_price() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		log.info("StudyTab testcase passed Successfully");
	}

	@When("^Click footstools in decor tab and print offers value and new arrivals$")
	public void click_footstools_in_decor_tab_and_print_offers_value_and_new_arrivals() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Decor d=new Decor();
		d.decorTab(driver);
	}

	@Then("^Offers and new Arrivals printed$")
	public void offers_and_new_Arrivals_printed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		log.info("DecorTab testcase passed Successfully");
	}

	@When("^Living tab product colours change$")
	public void living_tab_product_colours_change() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Colours c=new Colours();
		c.choose(driver);
	}

	@Then("^print the changed colours$")
	public void print_the_changed_colours() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		log.info("Product colours change testcase passed Successfully");
	}

	@When("^changes the size and price$")
	public void changes_the_size_and_price() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Size s=new Size();
		s.TvUnitsTab(driver);
	}

	@Then("^Print the product details$")
	public void print_the_product_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		log.info("TvUnitsTab testcase passed Successfully");
	}

	@When("^Enters giftcards tab verify the title$")
	public void enters_giftcards_tab_verify_the_title() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Cards c=new Cards();
		c.cardstab(driver);
	}

	@Then("^Print the Greetings$")
	public void print_the_Greetings() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		log.info("GiftCardsTab testcase passed Successfully");
	}

}

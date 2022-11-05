package ec.edu.espol.workshops;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;
import io.cucumber.java.en.And;

public class StepsDefs {
	int actualAnswer;
	
	@Given("customer is over 85")
	public void customer_is_over_85() {
		CarInsurance.age = 90;}
	
	@And("customer is over {age}")
	@Given("customer is over {age}")
	public void customer_is_over(int age) {
		CarInsurance.age = age;}
	
	@When("I calculate the premium")
	public void i_calculate_the_premium() {
		CarInsurance.main(null);
		actualAnswer = CarInsurance.basePremium;}
	
	@Then("I should be shown {answer}")
	public void i_should_be_told(int expectedAnswer) {
		assertEquals(expectedAnswer, actualAnswer);} }

	@Given("customer is female")
	public void customer_is_female() {
		CarInsurance.sex = "F";}
	
	@Given("customer is {gender}")
	public void customer_is_gender(String gender) {
		CarInsurance.sex = gender;}
	
	@And("customer is married")
	public void customer_is_married() {
		CarInsurance.married = "Y";}
	
	@And("customer is {maritalStatus}")
	public void customer_is_maritalStatus(String maritalStatus) {
		CarInsurance.married = maritalStatus;}
	
	@And("customer is 50 years old")
	public void customer_is_50_years_old() {
		CarInsurance.age = 50;}
	
	@Given("customer is male")
	public void customer_is_male() {
		CarInsurance.sex = "M";}
	
	@And("customer is not married")
	public void customer_is_not_married() {
		CarInsurance.married = "N";}
	
	@And("customer is 20 years old")
	public void customer_is_20_years_old() {
		CarInsurance.age = 20;}
}
	

	
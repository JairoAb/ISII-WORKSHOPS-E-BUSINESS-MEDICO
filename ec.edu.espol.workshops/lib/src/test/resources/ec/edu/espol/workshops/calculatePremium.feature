Feature: Calculate the insurance prime for a customer

	Scenario: Customer is over 80 years old
		Given customer is 85 years old
		When i calculate the premium
		Then show -1
		
	Scenario Outline: 
		Given customer is over <age>
		When I calculate the premium 
		Then I should be shown <answer>
	
	Examples: 
		|  age   | answer |
		|   70   |    0   |
		|   81   |   -1   |
      
Feature: Calculate the insurance prime for a customer
      
	Scenario: The customer is female, married and between 45 and 65 years old including them
		Given customer is female
		And customer is married
		And customer is 50 years old
		When we calculate the premium
		Then show 200

	Scenario Outline: 
		Given customer is <gender>
		And customer is <maritalStatus>
		And customer is over <age>
		And customer is younger than <age>
		When I calculate the premium 
		Then I should be shown <answer>

	Examples: 
		|  age  |  gender  | maritalStatus | answer |  
		|   45  |  female  |   married     |  200   |
		|   50  |  female  |   married     |  200   |
		|   65  |  female  |   married     |  200   |
			
Feature: Calculate the insurance prime for a customer

	Scenario: Customer is male, not married, and younger than 25 years
		Given customer is male
		And customer is not married
		And customer is 20 years old
		When calculate the premium
		Then show 2000
		
	Scenario Outline: 
		Given customer is <gender>
		And customer is <maritalStatus>
		And customer is younger than <age>
		When I calculate the premium 
		Then I should be shown <answer>

	Examples: 
		|  age  |  gender | maritalStatus | answer |  
		|   20  |  male   |  not married  |  2000  |
		|   24  |  male   |  not married  |  2000  |
		|   18  |  male   |  not married  |  2000  |

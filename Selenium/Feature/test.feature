#Author: your.email@your.domain.com
#Keywords Summary :

Feature: Addition

@tagone1
Scenario: Positive if addition
Given user add two numbers "4" and "3"
Then Addition should be "7"

@tagone2
Scenario: Positive if addition
Given user add two numbers "5" and "3"
Then Addition should not be "7"	

@tagone
Scenario Outline: Title of your outline
Given user wants to do  addition of  two numbers <a> and <b>
Then Addition should be <c>

Examples:
	|a|b|c|
	|3|4|7|
	|5|6|4|
	|4|2|6|
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
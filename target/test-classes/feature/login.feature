# Auteur:elyes
Feature: mytek login page

Scenario: login whith valid credential
Given admin is in login page
When admin enter correct user name and correct password
Then admin is directed to the home page

Feature: Urban website BDD

Scenario Outline: Testing urbanladder with invalid login testcase

Given Initialize the Browser and Load url
When Click login tab and enter invalid <username> and <password>
Then login Testcase verified

Examples:
|username            | password  |
|kiruthika@gmail.com | 12345     |

Scenario: Testing urbanladder with storage tab

Given Initialize the Browser and Load url
When Click storage tab and Dressers tab
Then Verify title and NoOf links and products

Scenario: Testing urbanladder with mattresses tab

Given Initialize the Browser and Load url
When Click mattresse tab and Mettresses
Then Verify title and get types of mattresses

Scenario: Testing urbanladder with Living tab

Given Initialize the Browser and Load url
When Click Living and wooden sofa sets tabs 
Then Add the products in add to carts and verify

Scenario Outline: Testing urbanladder with Search tab

Given Initialize the Browser and Load url
When Search table mat <var> and chage price range
Then Verify the changes

Examples:
|var    |
|mat    |

Scenario: Testing urbanladder with study tab

Given Initialize the Browser and Load url
When Click study and study chairs tabs change High to low recommends
Then print the high product price 

Scenario: Testing urbanladder with Decor tab

Given Initialize the Browser and Load url
When Click footstools in decor tab and print offers value and new arrivals
Then Offers and new Arrivals printed

Scenario: Testing urbanladder with Cha

Given Initialize the Browser and Load url
When Living tab product colours change
Then print the changed colours 

Scenario: Testing urbanladder with TvUnits

Given Initialize the Browser and Load url
When changes the size and price 
Then Print the product details

Scenario: Testing urbanladder with GiftCards

Given Initialize the Browser and Load url
When Enters giftcards tab verify the title
Then Print the Greetings
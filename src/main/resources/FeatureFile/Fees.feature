Feature: Fees Functionality

Background:
Given User is on login page
When User enter admin credentials
Then User should login successfully


  Scenario Outline: Add Fees
  And User create Fee "<name>" and "<code>" and "<intCode>" and "<priority>"
  Then Success message should be displayed

    Examples:
      | name    | code | intCode  | priority |
      | Micheal | 274  | Visa     | 5397     |
      | Matt    | 436  | Discover | 5198     |
      | Sandro  | 912  | Venmo    | 3272     |

  Scenario Outline: Edit Fees
    And User edit Fee "<existingFeeName>" and change it to "<newFeeName>"
    Then Success message should be displayed

    Examples:
      | existingFeeName | newFeeName |
      | Micheal         | Patty      |
      | Matt            | Frankie    |
      | Sandro          | Shannon    |


  Scenario Outline: Delete Fees
    And User delete Fee "<FeeName>"
    Then Success message should be displayed

    Examples:
      | FeeName |
      | Patty   |
      | Frankie |
      | Shannon |
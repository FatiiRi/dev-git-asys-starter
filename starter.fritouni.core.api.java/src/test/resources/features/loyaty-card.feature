Feature: Super Smoothie Loyaty Card Program
  The more smothies you buy, the more points you earn.

  Background: 
    Given the fallowing drink categories
      | Drink  | Category | Points |
      | Banana | Regular  |     15 |
      | Triple | Fancy    |     20 |

  Scenario Outline: Earning points when purchasing smoothing
    Given Micheal is a morning Freshness Member
    When Michael purchases <Quantity> <Drink> drinks
    Then he should earn <Points> points

    Examples: 
      | Drink  | Quantity | Points |
      | Banana |        2 |     30 |
      | Triple |        1 |     20 |

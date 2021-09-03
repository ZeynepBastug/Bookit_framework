Feature:
  Verify different GET operations using REST-Assured

  Scenario Outline: Verify one of the campuses name
    Given I perform GET operation for "<getRequestToCampuses>"
    And I perform GET for the "<location>"
    Then i should see the campus id as "<id>"

  Examples:
    | getRequestToCampuses            | location   | id |
    | /api/campuses/{campus_location} | VA         | 1  |
    | /api/campuses/{campus_location  | IL         | 2  |

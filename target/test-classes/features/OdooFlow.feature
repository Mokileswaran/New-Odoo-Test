Feature: Odoo Sales, Invoices and API Logs verification

  Scenario: Verify Odoo menus and logs
    Given I open the Odoo login page
    When I login with valid credentials
    Then I navigate to Sales and view Quotations list
    And I navigate to Accounting and view Invoices list
    And I navigate to Settings and view API logs

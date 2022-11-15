@smoke
Feature: F07_followUs | users could open followUs links
  Scenario:  user opens facebook link
    When User click on facebook Link
    Then  Page shall be opened in new tab "https://www.facebook.com/nopCommerce"

    Scenario: User open Twitter
      When User click on Twitter link
      Then Page shall be opened in new tab "https://twitter.com/nopCommerce"

      Scenario: User open rss
        When User click on rss
        Then Page shall be opened in new tab "https://demo.nopcommerce.com/news/rss/1"

        Scenario: User open yourtube
          When User click on youtube
          Then Page shall be opened in new tab "https://www.youtube.com/user/nopCommerce"

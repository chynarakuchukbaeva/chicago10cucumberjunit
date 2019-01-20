$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/amazon.feature");
formatter.feature({
  "name": "Amazon search",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@amazon"
    }
  ]
});
formatter.background({
  "name": "User is on the amazon homepage",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user in amazon homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "Amazon_steps.user_in_amazon_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Amazon search test",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@amazon"
    }
  ]
});
formatter.step({
  "name": "user enters headphone keyword",
  "keyword": "When "
});
formatter.match({
  "location": "Amazon_steps.user_enters_headphone_keyword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks to search button",
  "keyword": "And "
});
formatter.match({
  "location": "Amazon_steps.user_clicks_to_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see headphones in results",
  "keyword": "Then "
});
formatter.match({
  "location": "Amazon_steps.user_should_see_headphones_in_results()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
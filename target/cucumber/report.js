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
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//a[@id\u003d\u0027bcKwText\u0027]/span\"}\n  (Session info: chrome\u003d71.0.3578.98)\n  (Driver info: chromedriver\u003d72.0.3626.7 (efcef9a3ecda02b2132af215116a03852d08b9cb),platform\u003dMac OS X 10.13.6 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027Iskanders-MacBook-Pro.local\u0027, ip: \u00272603:300a:16aa:1000:0:0:0:6352\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.13.6\u0027, java.version: \u00271.8.0_151\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 72.0.3626.7 (efcef9a3ecda02..., userDataDir: /var/folders/mv/pwlc475s4j3...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:64091}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 71.0.3578.98, webStorageEnabled: true}\nSession ID: 658e8c43d0d63ee14a5fd2fdbc5cbf72\n*** Element info: {Using\u003dxpath, value\u003d//a[@id\u003d\u0027bcKwText\u0027]/span}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:424)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy16.getText(Unknown Source)\n\tat steps.Amazon_steps.user_should_see_headphones_in_results(Amazon_steps.java:35)\n\tat ✽.user should see headphones in results(src/test/resources/features/amazon.feature:9)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});
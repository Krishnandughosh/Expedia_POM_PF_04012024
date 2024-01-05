package carsguide;

import carsguide.base.PageBase;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {

  @BeforeTest
  @Step("Running the Page Base configuration to initilize the drivers")
  public void setUp() {

    PageBase.initConfiguration();
  }

  @AfterTest
  @Step("Closing the driver")
  public void tearDown() {
    if (PageBase.driver != null) {
      PageBase.quitBrowser();
    }
  }

  @Step("{0}")
  void step(String description, Runnable code) {
    Allure.step(description);
    try {
      code.run();
    } catch (Exception e) {
      Allure.step("Step failed: " + e.getMessage());
      throw e;
    }
  }

}



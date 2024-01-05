package carsguide;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import io.qameta.allure.testng.Tag;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
@Feature("Demo run")
@Story("Demo_Test")
@Owner("Krishnandu")
@Tag("Only Demo")
public class Demo_Test {
  @Test
  public static void demo_test() {
    System.out.println("Testing");
    log.debug("This is a debug message");
    log.info("This is an info message");
    log.error("This is an error message");
  }
}

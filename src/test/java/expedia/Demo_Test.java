package expedia;

import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;
@Slf4j
public class Demo_Test {
  @Test
  public static void demo_test(){
    System.out.println("Testing");
    log.debug("This is a debug message");
    log.info("This is an info message");
    log.error("This is an error message");
  }
}

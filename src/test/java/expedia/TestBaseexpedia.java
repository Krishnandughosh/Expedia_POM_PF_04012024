package expedia;

import expedia.base.PageBase;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase{

  @BeforeTest
  public void setUp(){
    PageBase.initConfiguration();
  }
  @AfterTest
  public void tearDown(){
/*    if(PageBase.driver!=null){
      PageBase.quitBrowser();
    }*/
  }

}

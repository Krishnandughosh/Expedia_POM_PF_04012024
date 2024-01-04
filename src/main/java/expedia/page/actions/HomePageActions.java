package expedia.page.actions;

import expedia.base.PageBase;
import expedia.page.locators.HomePageLocators;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import static expedia.base.GlobalConfig.factoryWaitTimeOut;
import static java.lang.Thread.sleep;

public class HomePageActions extends PageBase {

  public HomePageLocators home;
  public HomePageActions(){
    this.home=new HomePageLocators();
    AjaxElementLocatorFactory factory=new AjaxElementLocatorFactory(driver,factoryWaitTimeOut);
    PageFactory.initElements(factory,this.home);
  }

  public HomePageActions goToStaysTab(){
    click(home.staysTab);
    return this;
  }
  public HomePageActions goToFlightsTab(){
    click(home.flightsTab);
    return this;
  }
  public void searchStays(String goingTo) throws InterruptedException {
    click(home.detinationFeild);
    sleep(2000);
    type(home.goingToFeild,goingTo);
    sleep(2000);
    click(home.goingToFeildSelect);
    click(home.searchButton);
  }
  public void searchFlights(String leavingFrom,String goingTo){
    goToOneWay();
    type(home.leavingFromFeild,leavingFrom);
    type(home.goingToFeild,goingTo);
    click(home.searchButton);
  }
  public HomePageActions goToOneWay(){
    click(home.oneWayFeild);
    return this;
  }
}

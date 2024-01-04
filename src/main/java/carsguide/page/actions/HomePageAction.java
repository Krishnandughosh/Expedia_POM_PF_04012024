package carsguide.page.actions;

import carsguide.base.PageBase;
import carsguide.page.locators.HomePageLocator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import static carsguide.base.GlobalConfig.factoryWaitTimeOut;

public class HomePageAction extends PageBase {
  public HomePageLocator homePageLocator;
  public HomePageAction(){
    this.homePageLocator =new HomePageLocator();
    AjaxElementLocatorFactory factory= new AjaxElementLocatorFactory(driver,factoryWaitTimeOut);
    PageFactory.initElements(factory,this.homePageLocator);
  }

  public HomePageAction buySellTabOpen(){
    mouseOver(homePageLocator.buySellTab);
    return this;
  }
  public HomePageAction usedCarLinkClick(){
    click(homePageLocator.usedLink);
    return this;
  }
  public HomePageAction newCarLinkClick(){
    click(homePageLocator.newLink);
    return this;
  }

}

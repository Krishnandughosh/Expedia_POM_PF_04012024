package carsguide.page.actions;

import carsguide.base.PageBase;
import carsguide.page.locators.SearchPageLocator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import static carsguide.base.GlobalConfig.factoryWaitTimeOut;

public class SearchPageAction extends PageBase {
  public SearchPageLocator searchPageLocator;
  public SearchPageAction(){
    this.searchPageLocator =new SearchPageLocator();
    AjaxElementLocatorFactory factory= new AjaxElementLocatorFactory(driver,factoryWaitTimeOut);
    PageFactory.initElements(factory,this.searchPageLocator);
  }

  public SearchPageAction selectMake(String makes){
    selectDropDown(searchPageLocator.makes,makes);
    return this;
  }
  public SearchPageAction selectmodel(String model){
    selectDropDown(searchPageLocator.models,model);
    return this;
  }
  public SearchPageAction selectLocation(String location){
    selectDropDown(searchPageLocator.location,location);
    return this;
  }
  public SearchPageAction selectPrice(String price){
    selectDropDown(searchPageLocator.makes,price);
    return this;
  }
  public SearchPageAction clickSearchButton(){
    click(searchPageLocator.searchButton);
    return this;
  }
  public String getHeader(){
    String header=value(searchPageLocator.searchPageHeader);
    return header;
  }

}

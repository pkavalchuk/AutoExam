package project.by.stormnet.functional.entities.pages;

import org.openqa.selenium.WebElement;

public class SearchPage extends AbstractPage {
    private static String resultsCounter = "//span[@class = 'products-catalog__head-counter']";
    private static String results = "//div[@class = 'products-list-item dyother dyMonitor']";

    public static SearchPage getSearchPage(){
        SearchPage searchPage = new SearchPage();
        waitForElementVisible(getElementBy(results));
        System.out.println("Search page is opened");
        return searchPage;
    }

    public int getResultsSizePerPage(){
        return getElements(results).size();
    }

    public String getResultsCount(){
        return getElement(resultsCounter).getText();
    }

    public boolean getElementInLamoda(){
        return  getElement("//div[@class = 'projhjhducts-list-item dyother dyMonitor']").isDisplayed();
    }
}

package project.by.stormnet.functional.entities.helpers;

import org.openqa.selenium.WebElement;
import project.by.stormnet.functional.entities.pages.SearchPage;

public class SearchHelper extends AbstractHelper{
    private SearchPage searchPage = new SearchPage();

    public int getSearchResultsCountPerPage(){
        return searchPage.getResultsSizePerPage();
    }

    public int getAllResultsCount(){
        return Integer.parseInt(searchPage.getResultsCount().split(" ")[0]);
    }


}

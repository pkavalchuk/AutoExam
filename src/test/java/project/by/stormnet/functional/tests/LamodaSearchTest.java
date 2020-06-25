package project.by.stormnet.functional.tests;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import project.by.stormnet.functional.entities.helpers.HomeHelper;
import project.by.stormnet.functional.entities.helpers.SearchHelper;
import project.by.stormnet.functional.entities.pages.SearchPage;

public class LamodaSearchTest {
    private HomeHelper homeHelper = new HomeHelper();
    private SearchPage searchPage = new SearchPage();
    private String searchKey = "jeans";
    private String searchKey2 = "!@$%^";

    @Test
    public void performSearch(){
        int countPerPage = homeHelper.search(searchKey).getSearchResultsCountPerPage();
        Assert.assertTrue(countPerPage > 0, "No results were found!");
    }

    @Test
    public void failedSearch(){
        boolean countPerPage = searchPage.getElementInLamoda();
        Assert.assertFalse(true, "No results were found!");
    }

    @Test(enabled = false)
    public void skippedSearch(){
        int countPerPage = homeHelper.search(searchKey).getSearchResultsCountPerPage();
        Assert.assertTrue(countPerPage > 0, "Test was skipped!");
    }

    @AfterClass
    public void tearDown(){
        homeHelper.quit();
    }

}

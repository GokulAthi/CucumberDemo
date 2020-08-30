package businessfunctions;

import objectrepository.GoogleObjects;
import utils.SeleniumWrapperMethods;

public class GoogleFunctions extends GoogleObjects {
    SeleniumWrapperMethods seleniumWrapperMethods = new SeleniumWrapperMethods();

    public void openGoogleSite(){
        seleniumWrapperMethods.openURL("https://www.google.com/");
    }

    public void searchGoogleWithKeyword(String keyword){
        seleniumWrapperMethods.waitForDisplayOfElement(searchTextBox);
        seleniumWrapperMethods.enterDataIntoTextBox(searchTextBox, keyword);
        seleniumWrapperMethods.simulateKeyBoardEnter(searchTextBox);
    }

    public void verifySearchResults(String keyword){
        seleniumWrapperMethods.waitForDisplayOfElement(resultStats);
        seleniumWrapperMethods.waitForDisplayOfElement(googleSpeedTestLink);
    }
}

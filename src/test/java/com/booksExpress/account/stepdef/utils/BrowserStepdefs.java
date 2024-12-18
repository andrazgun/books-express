package com.booksExpress.account.stepdef.utils;

import com.booksExpress.framework.BrowserOrchestrator;
import io.cucumber.java.en.When;

public class BrowserStepdefs {
//    @Autowired
    private BrowserOrchestrator browserOrchestrator;

    @When("^Customer refreshes page$")
    public void customerRefreshesPage() {
        browserOrchestrator.refreshPage();
    }

    @When("^Customer navigates to the Back page$")
    public void customerNavigatesToTheBackPage() {
        browserOrchestrator.goBack();
    }

}

package steps;


import pages.*;

public class PageInitializers {
    // this is were we create objects of all pages and we initialize them
    // this page is in inheritance with common method --- common method extends PageInitializers

    public static LoginPage login;
    public static EmployeeSearchPage employeeSearchPage;
    public static AddEmployeePage addEmployeePage;
    public static AddMembershipPage addmembershipPage;


    public static DashboardPage dash;


    public static void intializePageObjects() {
        login = new LoginPage();
        employeeSearchPage = new EmployeeSearchPage();
        addEmployeePage = new AddEmployeePage();
        addmembershipPage = new AddMembershipPage();
        dash = new DashboardPage();

    }
}
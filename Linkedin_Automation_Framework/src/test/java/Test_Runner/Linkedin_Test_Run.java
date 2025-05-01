package Test_Runner;

import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Base.Base_Class;
import Pages.a_Login_Page;
import Pages.b_Search_Job;
import Pages.c_Save_Job;
import Pages.d_Search_User;
import Pages.e_Send_Connection_Request_and_Like_a_post;
import Pages.f_Logout;
import Utils.Logs;
import Utils.Screen_Shots;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic("Linkedin Automation(Appium)")
@Feature("Social Media Module")
public class Linkedin_Test_Run extends Base_Class{

	private static final Logger log = Logs.getLogger(Linkedin_Test_Run.class);


	@Test(priority=1)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Login Functionality")
	@Story("Login")
	public void LoginPage() throws InterruptedException {
		a_Login_Page loginpage=new a_Login_Page(driver);
		test = extent.createTest("LoginPage Test", "Test to validate login functionality");
		test.log(Status.INFO, "Login Page Initialized");
		log.info("Login Page Initialized");
		loginpage.ContinueWithGoogle();
		Screen_Shots.captureScreenshotForAllure(driver, "Clicked Continue With Google");
		test.log(Status.INFO, "Continue With Google");
		log.info("Clicked On Continue With Google");
		loginpage.ContinueAsLytics();
		Screen_Shots.captureScreenshotForAllure(driver, "Clicked On Continus as Lytics");
		test.log(Status.INFO, "Select The Google Account");
		log.info("Clicked On Continue As Lytics");
		loginpage.manualPause();
		test.log(Status.INFO, "Pressed Enter to Continue");
		log.info("Manual Pause Initialized--> Press Enter To Continue");
		loginpage.AfterCancel();
		Screen_Shots.captureScreenshotForAllure(driver, "Clicked on Cancel Button");
		log.info("Login Page Passed");
		test.log(Status.INFO, "Login Page Passed");
	}

	@Test(priority=2,dependsOnMethods = "LoginPage")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Search Job Functionality")
	@Story("Search Job")
	public void SearchJob() throws InterruptedException {
		b_Search_Job searchjob=new b_Search_Job(driver);
		test = extent.createTest("Searchjob Test", "Test to validate Searchjob functionality");
		test.log(Status.INFO, "Search Job Page Initialized");
		log.info("Search Job Page Initialized");
		searchjob.ClickOnJobs();
		Screen_Shots.captureScreenshotForAllure(driver,"Clicked On Jobs");
		test.log(Status.INFO, "Clicked On Jobs Icon");
		log.info("Clicked On Jobs Icon");
		searchjob.ClickOnSearchIcon();
		Screen_Shots.captureScreenshotForAllure(driver, "Clicked On Search Icon");
		test.log(Status.INFO, "Searched Job");
		log.info("Clicked on Search Icon");
		Thread.sleep(3000);
		searchjob.SearchJob("Automation Tester");
		Screen_Shots.captureScreenshotForAllure(driver, "Job Searched");
		log.info("Job Searched");
		searchjob.ClickOnSeeAllResults();
		Screen_Shots.captureScreenshotForAllure(driver, "Clicked on see all Results");
		log.info("Search Job Page Passed");
		test.log(Status.INFO, "Search Job Passed");
	}

	@Test(priority=3,dependsOnMethods = "SearchJob")
	@Severity(SeverityLevel.NORMAL)
	@Description("Save Job Functionality")
	@Story("Save Job")
	public void SaveJob() {
		c_Save_Job savejob=new c_Save_Job(driver);
		test = extent.createTest("SaveJob Test", "Test to validate SaveJob functionality");
		test.log(Status.INFO, "Save Job Page Initialized");
		log.info("Save Job Page Initilized");
		savejob.SelectJob();
		Screen_Shots.captureScreenshotForAllure(driver, "Clicked On Selected Job");
		test.log(Status.INFO, "Job Selected");
		log.info("Job is Selected");
		savejob.SaveJob();
		Screen_Shots.captureScreenshotForAllure(driver, "Clicked On Save Job");
		test.log(Status.INFO, "Job Saved");
		log.info("Job is Saved");
		savejob.ScrollDown();
		Screen_Shots.captureScreenshotForAllure(driver, "Scrolled Down");
		log.info("Scroll Down To end the current job page");
		log.info("Save Job Page Passed");
		test.log(Status.INFO, "Save Job Passed");
	}

	@Test(priority=4,dependsOnMethods="SaveJob")
	@Severity(SeverityLevel.NORMAL)
	@Description("Search User Functionality")
	@Story("Search User")
	public void SearchUser() {
		d_Search_User searchuser=new d_Search_User(driver);
		test = extent.createTest("Search User Page Test", "Test to validate Search User functionality");
		test.log(Status.INFO, "Save Job Page Initialized");
		log.info("Search User Page Initialized");
		searchuser.RevertBackToJobPage();
		Screen_Shots.captureScreenshotForAllure(driver, "Clicked On Revert Back");
		test.log(Status.INFO, "Reavert Back To Home Page");
		log.info("Revert Back To Home Page");
		searchuser.ClickOnHomeButton();
		Screen_Shots.captureScreenshotForAllure(driver, "Clicked On Home Button");
		test.log(Status.INFO, "Clicked On Home Button");
		log.info("Clicked On Home Button");
		searchuser.SearchUser("Maadhav Hira");
		Screen_Shots.captureScreenshotForAllure(driver, "User Searched");
		test.log(Status.INFO, "User Searched");
		log.info("User is Searched");
		searchuser.ClickOnSeeAllResults();
		Screen_Shots.captureScreenshotForAllure(driver, "Clicked on See All Results");
		log.info("Search User Page Passed");
		test.log(Status.INFO, "Search User Passed");
	}

	@Test(priority=5,dependsOnMethods="SearchUser")
	@Severity(SeverityLevel.MINOR)
	@Description("Send Connection Request And Like Post Functionality")
	@Story("Send Connection Request And Like Post")
	public void SendConnectionRequestAndLikePost() {
		e_Send_Connection_Request_and_Like_a_post sendconnectionrequestandlikepost=new e_Send_Connection_Request_and_Like_a_post(driver);
		test = extent.createTest("Send Connection Request And Like Post Page Test", "Test to validate Connection Request and Like Post functionality");
		test.log(Status.INFO, "Send Connection Request And Like Post Page Initialized");
		log.info("Send Connection Request And Like A Post page is Initialized");
		sendconnectionrequestandlikepost.SendConnectionRequest();
		Screen_Shots.captureScreenshotForAllure(driver, "Connection Request Sended");
		test.log(Status.INFO, "Send The Connection Request");
		log.info("Connection Request Sended");
		sendconnectionrequestandlikepost.ClickOnViewProfile();
		Screen_Shots.captureScreenshotForAllure(driver, "Clicked on View Profile");
		test.log(Status.INFO, "Clicked On View Profile");
		log.info("Clicked On View Profile");
		sendconnectionrequestandlikepost.ScrollUp();
		Screen_Shots.captureScreenshotForAllure(driver, "Scrolled Up");
		test.log(Status.INFO, "Scrolled until Like Button is Visible");
		log.info("Scrolled till the like button is visible");
		sendconnectionrequestandlikepost.LikeThePost();
		Screen_Shots.captureScreenshotForAllure(driver, "Liked The Post");
		test.log(Status.INFO, "Liked the Post");
		log.info("Liked The Post");
		log.info("Send Connection Request And Like A Post page Passed");
		test.log(Status.INFO, "Send Connection Request And Like Post Passed");
	}

	@Test(priority=6,dependsOnMethods="SendConnectionRequestAndLikePost")
	@Severity(SeverityLevel.TRIVIAL)
	@Description("LogOut Functionality")
	@Story("Logout")
	public void LogOut() {
		f_Logout logout=new f_Logout(driver);
		test = extent.createTest("LogOut Page Test", "Test to validate LogOut functionality");
		test.log(Status.INFO, "Logout Page Initialized");
		log.info("Logout Page is Initialized");
		logout.ClickOnProfile();
		Screen_Shots.captureScreenshotForAllure(driver, "Clicked On Profile Button");
		test.log(Status.INFO, "Clicked On Profile");
		log.info("Clicked On Profile");
		logout.ClickOnSettings();
		Screen_Shots.captureScreenshotForAllure(driver, "Clicked On Settings");
		test.log(Status.INFO, "Clicked On Settings");
		log.info("Clicked On Settings");
		logout.SignOut();
		Screen_Shots.captureScreenshotForAllure(driver, "Clicked On Sign Out");
		test.log(Status.INFO, "Clicked On SignOut");
		log.info("Clicked On SignOut");
		log.info("Allure Reports Generated");
		test.log(Status.INFO, "LogOut Passed");
	}
}

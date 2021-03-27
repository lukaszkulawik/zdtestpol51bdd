package zdtestpol51bdd.devto.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    WebDriver driver;
    String url = "https://dev.to/";

    @FindBy(css = "h2.crayons-story__title > a")
    public WebElement firstBlog;

    @FindBy(linkText = "Podcasts")
    public WebElement podcastsBtn;

    public MainPage(WebDriver driver){
        this.driver = driver;
        this.driver.get(url);
        PageFactory.initElements(this.driver, this);
    }

    public void selectFirstBlog(){
        firstBlog.click();
    }
    public void goToPodcastSection(){
        podcastsBtn.click();
    }
}

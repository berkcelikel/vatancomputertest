package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class BodyContent extends Parent{

    public BodyContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(id = "navbar-search-input")
    private WebElement search;

    @FindBy(xpath = "//span[@class='icon-search']")
    private WebElement searchclick;

    @FindBy(xpath = "(//a[@class='product-list__image-safe-link sld'])[3]")
    private WebElement iphone;

    @FindBy(xpath = "//button[@id='add-to-cart-button']")
    private WebElement addtocard;

    @FindBy(xpath = "//a[@class='go-back goback-close']")
    private WebElement close;

    @FindBy(xpath = "(//img[@id='search-product-image'])[2]")
    private WebElement motherboard;

    @FindBy(xpath = "(//button[@data-value='Sepete Ekle'])[1]")
    private WebElement motherboardcard;

    @FindBy(xpath = "//input[@class='btn btn-dark-blue goToBasket']")
    private WebElement gotocard;

    @FindBy(xpath = "(//input[@class='apple-switch basket-cart__product-switch warranty-toggler '])[1]")
    private WebElement extension;

    @FindBy(xpath = "//button[@class='btn btn-block btn-success input-lg basket-ordersummary__button continuebutton btn-arrow']")
    private WebElement confirm;

    @FindBy(xpath = "//i[@class='icon-arrow-right']")
    private WebElement withoutmembership;

    @FindBy(xpath = "//input[@id='DeliveryNameSurname']")
    private WebElement name;

    @FindBy(xpath = "//input[@id='newValueConfirmed']")
    private WebElement mail;

    @FindBy(xpath = "//textarea[@id='DeliveryAddress']")
    private WebElement adress;

    @FindBy(xpath = "//input[@id='DeliveryPhoneNumber']")
    private WebElement mobile;

    @FindBy(xpath = "(//label[@class='wrapper-checkbox'])[1]")
    private WebElement tc;

    @FindBy(xpath = "//select[@name='DeliveryCity']")
    private WebElement city;

    @FindBy(xpath = "//select[@name='DeliveryRegion']")
    private WebElement region;

    @FindBy(xpath = "(//div[@class='selectize-control form-control zipcode single'])[1]/div")
    private WebElement postcode;

    @FindBy(xpath = "(//div[@class='selectize-control form-control zipcode single'])[1]//div[@class='option'][4]")
    private WebElement postcodeclick;



    @FindBy(xpath = "(//span[@class='basket-process__icon'])[1]")
    private WebElement beforecard;

    @FindBy(xpath = "(//i[@class='icon-times-circle'])[1]")
    private WebElement removeproduct;

    @FindBy(css = "div[class=empty-basket]>h3")
    private  WebElement check;

    @FindBy(xpath = "//i[@class='icon-trash-alt']")
    private WebElement removecard;

    WebElement myElement22;

    public void findAndSend(String strElement, String value) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement) {

            case "search": myElement22 = search; break;
            case "name": myElement22 = name; break;
            case "mail": myElement22 = mail; break;
            case "adress": myElement22 = adress; break;
            case "mobile": myElement22 = mobile; break;
        }

        sendKeysFunction(myElement22, value);
    }

    public void findAndClick(String strElement22) {

        switch (strElement22) {

            case "searchclick": myElement22= searchclick; break;
            case "iphone": myElement22= iphone; break;
            case "addtocard": myElement22= addtocard; break;
            case "close": myElement22= close; break;
            case "motherboard": myElement22= motherboard; break;
            case "motherboardcard": myElement22= motherboardcard; break;
            case "gotocard": myElement22= gotocard; break;
            case "extension": myElement22= extension; break;
            case "confirm": myElement22= confirm; break;
            case "withoutmembership": myElement22= withoutmembership; break;
            case "postcode": myElement22= postcode; break;
            case "postcodeclick": myElement22= postcodeclick; break;




            case "beforecard": myElement22= beforecard; break;
            case "removeproduct": myElement22= removeproduct; break;

            case "removecard": myElement22= removecard; break;

            case "city": myElement22= city; break;
            case "region": myElement22= region; break;

            case "tc": myElement22= tc; break;
        }
        clickFunction(myElement22);
    }

    public void  findandselectvalue(String strElement, String text) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement) {

            case "city": myElement22= city; break;
            case "region": myElement22= region; break;
            case "postcode": myElement22= postcode; break;

        }

        select(myElement22, text);
    }

    public void findAndContainsText(String strElement, String text) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement) {

            case "city": myElement22= city; break;
            case "region": myElement22= region; break;
            case "postcode": myElement22= postcode; break;
            case "tc": myElement22= tc; break;
            case "check": myElement22= check; break;

        }

        verifyContainsText(myElement22, text);
    }
}

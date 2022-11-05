package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.HepsiBurada.HomePage;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;


public class AddingProductToCartWithOUTUserLoginTest extends BaseTest{

    @Test
    public void step()  {
        // get product name .... test
        HomePage homePage = new HomePage(driver);
        String url="https://www.hepsiburada.com/vestel-43ua9600-43-108-ekran-uydu-alicili-4k-ultra-hd-android-smart-led-tv-p-HBV00000Y2TGX?magaza=Hepsiburada";
        driver.get(url);
        homePage.acceptCookies();
        

        System.out.println( "-getTitle "+driver.getTitle());


    }
   // @Test(priority = 1,description = "Kullanıcı Hepsiburada.com sitesini ziyaret eder.")
    public void step1()  {

    }



   // @Test(priority = 4,description = "Kullanıcı, burada satın almak istediği ürün için arama yapacaktır.")
    public void step4(){

    }

    //@Test(priority = 5,description = "Kullanıcı, Arama sonucunda ekrana gelen ürün listesinden (veya tek bir sonuç da dönmüş olabilir) ürün seçer.")
    public void step5() {

    }

    //@Test(priority = 6,description = "Seçilen ürün için 2 tane farklı satıcıdan ürün seçilip sepete eklenir.")
    private void step6() throws InterruptedException {

    }

    //@Test(priority = 7,description = "Seçilen ürünün doğru olarak eklendiği ‘Sepetim’ sayfasında doğrulanmalıdır.")
    private void step7() {

    }
}
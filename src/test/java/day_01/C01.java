package day_01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();

        driver.manage().window().maximize();
        Thread.sleep(3000);

        // "https://www.amazon.com/" adresine gidiniz.
        driver.get("https://www.amazon.com/");
        Thread.sleep(3000);

        // "https://www.n11.com/" adresine gidiniz.
        driver.get("https://www.n11.com/");
        Thread.sleep(3000);

        // amazon adresine geri donunuz
        driver.navigate().back();
        Thread.sleep(3000);

        // n11 adresine ilerleyiniz
        driver.navigate().forward();
        Thread.sleep(3000);

        // sayfayi yenileyiniz
        driver.navigate().refresh();
        Thread.sleep(3000);

        // pencereyi kapat
        driver.close();

        // Konsola "HER ŞEY YOLUNDA" yazdir
        System.out.println("HER ŞEY YOLUNDA");

    }

}

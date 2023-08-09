package day_01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        Thread.sleep(1000);
        // "https://teknosa.com/" adresine gidiniz
        driver.get("https://teknosa.com");
        Thread.sleep(1000);
        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
        //System.out.println("Teknosa başlığı : "+driver.getTitle());
        //System.out.println("Teknosa URL : "+driver.getCurrentUrl());

        String teknosaTitle = driver.getTitle();
        System.out.println("Teknosa başlığı : "+teknosaTitle);
        Thread.sleep(1000);

        String teknosaURL = driver.getCurrentUrl();
        System.out.println("Teknosa URL : "+teknosaURL);
        Thread.sleep(1000);


        // Title'in "Teknoloji" kelimesini icerip icermedigini kontrol ediniz
        if (teknosaTitle.contains("Teknoloji")) {
            System.out.println("Title -Teknoloji- içeriyor");
        }else {
            System.out.println("Title -Teknoloji- içermiyor");
        }
        Thread.sleep(1000);

        // URL'in "teknosa" kelimesini icerip icermedigini kontrol ediniz
        if (teknosaURL.contains("teknosa")) {
            System.out.println("URL -teknosa- içeriyor");
        }else {
            System.out.println("URL -teknosa- içermiyor");
        }
        Thread.sleep(1000);

        // "https://medunna.com/" adresine gidiniz
        driver.get("https://medunna.com");
        Thread.sleep(1000);

        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
        //System.out.println("MEDUNNA başlığı : "+driver.getTitle());
        //System.out.println("MEDUNNA URL : "+driver.getCurrentUrl());

        String medunnaTitle = driver.getTitle();
        System.out.println("MEDUNNA başlığı : "+medunnaTitle);

        String medunnaURL = driver.getCurrentUrl();
        System.out.println("MEDUNNA URL : "+medunnaURL);

        Thread.sleep(1000);

        // Title'in "MEDUNNA" kelimesini icerip icermedigini kontrol ediniz
        if (medunnaTitle.contains("MEDUNNA")) {
            System.out.println("Title -MEDUNNA- içeriyor");
        }else {
            System.out.println("Title -MEDUNNA- içermiyor");
        }
        Thread.sleep(1000);

        // URL'in "medunna" kelimesini icerip icermedigini kontrol ediniz
        if (medunnaURL.contains("medunna")) {
            System.out.println("URL -medunna- içeriyor");
        }else {
            System.out.println("URL -medunna- içermiyor");
        }
        Thread.sleep(1000);

        // teknosa adresine geri donunuz
        driver.navigate().back();
        Thread.sleep(1000);
        // Sayfayı yenileyiniz
        driver.navigate().refresh();

        // medunna adresine ilerleyiniz
        driver.navigate().forward();
        Thread.sleep(1000);
        // Sayfayı yenileyiniz
        driver.navigate().refresh();
        Thread.sleep(1000);
        // pencereyi kapat
        driver.close();

    }
}

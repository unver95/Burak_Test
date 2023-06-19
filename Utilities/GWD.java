package Burak_Test.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.logging.Level;
import java.util.logging.Logger;


public class GWD {

    private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>(); // webDriver 1, webDriver 2
    private static ThreadLocal<String> threadBrowserName = new ThreadLocal<>(); // Chrome, firefox ...

    public static void setThreadBrowserName(String browserName) {
        GWD.threadBrowserName.set(browserName);
    }

    public static String getThreadBrowserName() {
        return GWD.threadBrowserName.get();
    }

    public static WebDriver getDriver() {

        Logger.getLogger("").setLevel(Level.SEVERE);

        if (threadBrowserName.get() == null)
            threadBrowserName.set("firefox");


        if (threadDriver.get() == null)
        {
            switch (threadBrowserName.get()) {
                case "firefox": {
                    System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");

                    threadDriver.set(new FirefoxDriver());
                }
                break;
                case "safari": {

                    threadDriver.set(new SafariDriver());
                }
                break;
                case "edge": {
                    System.setProperty(EdgeDriverService.EDGE_DRIVER_SILENT_OUTPUT_PROPERTY,"true");

                    threadDriver.set(new EdgeDriver());
                }
                break;
                default: { /*Chrome*/
                    System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
                    ChromeOptions opt = new ChromeOptions();
                    opt.setBinary("C:/Program Files/BraveSoftware/Brave-Browser/Application/brave.exe");
                    threadDriver.set(new ChromeDriver(opt));
                }
                break;
            }
        }
        threadDriver.get().manage().window().maximize();
        return threadDriver.get();
    }


/*    public static void quitDriver() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (threadDriver.get() != null) {
            threadDriver.get().quit();
            WebDriver driver = threadDriver.get();
            driver = null;
            threadDriver.set(driver);
        }
    }*/

}

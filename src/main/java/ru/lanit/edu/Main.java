package ru.lanit.edu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://ya.ru");
        WebElement input = driver.findElement(By.id("text"));
        input.sendKeys("Hello");
        WebElement button = driver.findElement(By.xpath("//button[@role='button']"));
        button.click();
    }
}

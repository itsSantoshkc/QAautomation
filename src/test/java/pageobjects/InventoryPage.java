package pageobjects;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class InventoryPage {

    public SelenideElement sortButton() {
        return $x("//select[@class='product_sort_container']");
    }

    public SelenideElement sortByNameDescendingButton() {
        return $x("//option[@value='za']");
    }

    public SelenideElement cartButton() {
        return $x("//a[@class='shopping_cart_link fa-layers fa-fw']");
    }

    public SelenideElement addAllToCart() {
        return $x("//div[@class='inventory_item']//button[text()='ADD TO CART']");
    }

    public SelenideElement openMenu() {
        return $x("//div[@class='bm-burger-button']");
    }

    public SelenideElement logOutButton(){
        return $x("//a[text()='Logout']");
    }

}
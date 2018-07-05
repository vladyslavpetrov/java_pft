package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactsData;

import java.util.NoSuchElementException;

public class ContactsHelper extends HelperBase{
    public ContactsHelper(WebDriver wd){
        super(wd);
    }

    public void fillContactsForm(ContactsData contactsData, boolean isCreating) {
        clearAndFill(By.name("firstname"), contactsData.getFirstname());
        clearAndFill(By.name("middlename"), contactsData.getMiddlename());
        clearAndFill(By.name("lastname"), contactsData.getLastname());
        clearAndFill(By.name("nickname"), contactsData.getNickname());
        clearAndFill(By.name("mobile"), contactsData.getMobile());
        clearAndFill(By.name("email"), contactsData.getEmail());

        if (isCreating){
            new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactsData.getGroup());
        } else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }
    }

    public void submitContactsForm(){
        click(By.name("submit"));
    }

    public void editContact() {
        click(By.cssSelector("img[title='Edit']"));
    }

    public void updateForm() {
        click(By.name("update"));
    }

    public void deleteContact() {
        click(By.cssSelector("input[value='Delete']"));
    }
}

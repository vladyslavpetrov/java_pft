package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.ContactsData;

public class ContactsHelper extends HelperBase{
    public ContactsHelper(FirefoxDriver wd){
        super(wd);
    }

    public void fillContactsForm(ContactsData contactsData) {
        clearAndFill(By.name("firstname"), contactsData.getFirstname());
        clearAndFill(By.name("middlename"), contactsData.getMiddlename());
        clearAndFill(By.name("lastname"), contactsData.getLastname());
        clearAndFill(By.name("nickname"), contactsData.getNickname());
        clearAndFill(By.name("mobile"), contactsData.getMobile());
        clearAndFill(By.name("email"), contactsData.getEmail());
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
}

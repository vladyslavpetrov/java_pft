package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactsData;

public class ContactAddTests extends TestBase{

    @Test
    public void testAddNewContact() throws InterruptedException {
        app.getNavigationHelper().goToAddContactPage();
        app.getContactsHelper().fillContactsForm(new ContactsData("Vlad", "Sergeevich",
                "Petrov", "vladp", "380936835804", "retqqqq@gmail.com"));
        app.getContactsHelper().submitContactsForm();
    }
}

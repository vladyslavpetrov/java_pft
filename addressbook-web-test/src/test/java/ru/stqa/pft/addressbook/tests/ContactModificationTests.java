package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactsData;

public class ContactModificationTests extends TestBase{
    @Test
    public void testContactModification() throws InterruptedException {
        if (!app.getContactsHelper().isThereAContact()){
            app.getNavigationHelper().goToAddContactPage();
            app.getContactsHelper().createContact(new ContactsData("Vlad", "Sergeevich",
                    "Petrov", "vladp", "380936835804", "retqqqq@gmail.com", "test1"), true);
        }
        app.getContactsHelper().editContact();
        app.getContactsHelper().fillContactsForm(new ContactsData("Vlad.ed", "Sergeevich.ed",
                "Petrov.ed", "vladp.ed", "380936835804.ed", "retqqqq@gmail.com.ed", null), false);
        app.getContactsHelper().updateForm();
    }
}

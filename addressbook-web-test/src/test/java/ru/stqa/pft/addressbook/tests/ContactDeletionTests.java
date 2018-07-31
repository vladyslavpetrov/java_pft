package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactsData;

public class ContactDeletionTests extends TestBase{
    @Test
    public void testContactDeletion(){
        if (!app.getContactsHelper().isThereAContact()){
            app.getNavigationHelper().goToAddContactPage();
            app.getContactsHelper().createContact(new ContactsData("Vlad", "Sergeevich",
                    "Petrov", "vladp", "380936835804", "retqqqq@gmail.com", "test1"), true);
        }
        app.getContactsHelper().editContact();
        app.getContactsHelper().deleteContact();
    }
}

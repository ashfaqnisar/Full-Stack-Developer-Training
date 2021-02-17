package Hands_On.Collections_Framework.Collection_Generics_StreamAPI.PhoneBook_Manipulation;
/*Remove the package import from the code in genc learn*/

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<Contact> phoneBook = new ArrayList<Contact>();

    public void addContact(Contact contact) {
        phoneBook.add(contact);
    }

    public List<Contact> viewAllContacts() {
        return phoneBook;
    }

    public Contact viewContactGivenPhone(long phoneNumber) {
        for (Contact contact : phoneBook) {
            if (contact.getPhoneNumber() == phoneNumber) {
                return contact;
            }
        }
        return null;
    }

    public boolean removeContact(long phoneNumber) {
        Contact contact = viewContactGivenPhone(phoneNumber);
        if (contact != null) {
            phoneBook.remove(contact);
            return true;
        }
        return false;
    }

    public List<Contact> getPhoneBook() {
        return phoneBook;
    }

    public void setPhoneBook(List<Contact> phoneBook) {
        this.phoneBook = phoneBook;
    }
}

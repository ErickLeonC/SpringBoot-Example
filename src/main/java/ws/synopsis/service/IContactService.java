package ws.synopsis.service;

import java.util.List;

import ws.synopsis.entity.Contact;
import ws.synopsis.model.ContactModel;

public interface IContactService {

	public ContactModel addContact(ContactModel contactModel);

	public List<ContactModel> listAllContacts();

	public Contact findContactById(int id);

	public void removeContact(int id);

	public ContactModel findContactByIdModel(int id);

}

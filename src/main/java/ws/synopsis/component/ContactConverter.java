package ws.synopsis.component;

import org.springframework.stereotype.Component;

import ws.synopsis.entity.Contact;
import ws.synopsis.model.ContactModel;

@Component("contactConverter")
public class ContactConverter {

	public Contact convertContactModel2Contact(ContactModel contactModel) {
		Contact contact = new Contact();
		contact.setCity(contactModel.getCity());
		contact.setFirstname(contactModel.getFirstname());
		contact.setLastname(contactModel.getLastname());
		contact.setTelephone(contactModel.getTelephone());
		contact.setId(contactModel.getId());
		
		return contact;
	}
	
	public ContactModel convertContact2ContactModel(Contact contact) {
		ContactModel contactModel = new ContactModel();
		contactModel.setCity(contact.getCity());
		contactModel.setFirstname(contact.getFirstname());
		contactModel.setLastname(contact.getLastname());
		contactModel.setTelephone(contact.getTelephone());
		contactModel.setId(contact.getId());
		
		return contactModel;
	}
}

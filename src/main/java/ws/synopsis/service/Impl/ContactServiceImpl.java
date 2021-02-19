package ws.synopsis.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ws.synopsis.component.ContactConverter;
import ws.synopsis.entity.Contact;
import ws.synopsis.model.ContactModel;
import ws.synopsis.repository.IContactRepository;
import ws.synopsis.service.IContactService;

@Service("contactServiceImpl")
public class ContactServiceImpl implements IContactService {

	@Autowired
	@Qualifier("contactRepository")
	private IContactRepository iContactRepository;

	@Autowired
	@Qualifier("contactConverter")
	private ContactConverter contactConverter;

	@Override
	public ContactModel addContact(ContactModel contactModel) {
		Contact contact = iContactRepository.save(contactConverter.convertContactModel2Contact(contactModel));
		return contactConverter.convertContact2ContactModel(contact);
	}

	@Override
	public List<ContactModel> listAllContacts() {
		List<Contact> contacts = iContactRepository.findAll();
		List<ContactModel> contactsModel = new ArrayList<ContactModel>();
		for (Contact contact : contacts) {
			contactsModel.add(contactConverter.convertContact2ContactModel(contact));
		}

		return contactsModel;
	}

	@Override
	public Contact findContactById(int id) {
		return iContactRepository.findById(id);

	}

	public ContactModel findContactByIdModel(int id) {
		return contactConverter.convertContact2ContactModel(findContactById(id));
	}

	@Override
	public void removeContact(int id) {
		Contact contact = findContactById(id);
		if (null != contact) {
			iContactRepository.delete(contact);
		}

	}

}

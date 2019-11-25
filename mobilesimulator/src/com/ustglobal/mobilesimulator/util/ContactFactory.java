package com.ustglobal.mobilesimulator.util;

import com.ustglobal.mobilesimulator.dao.ContactDao;
import com.ustglobal.mobilesimulator.dao.ContactDaoImpl;

public class ContactFactory {
private ContactFactory() {
	
}
public static ContactDao getContactDao() {
	return new ContactDaoImpl();
}
}

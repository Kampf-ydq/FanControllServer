package com.moon.service;

import com.moon.common.pojo.MoonResult;
import com.moon.pojo.TbContact;

public interface ContactService {

	MoonResult getAllContact();
	MoonResult createContact(TbContact contact);
}

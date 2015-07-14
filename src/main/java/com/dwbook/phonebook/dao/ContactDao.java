package com.dwbook.phonebook.dao;

import com.dwbook.phonebook.dao.mappers.ContactMapper;
import com.dwbook.phonebook.representation.Contact;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;

public interface ContactDao {
    @Mapper(ContactMapper.class)
    @SqlQuery("select * from contacts where id = :id")
    Contact getContactById(@Bind("id") int id);
}
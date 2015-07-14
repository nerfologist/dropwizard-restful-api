package com.dwbook.phonebook.dao.mappers;

import com.dwbook.phonebook.representation.Contact;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ContactMapper implements ResultSetMapper<Contact> {

    public Contact map(int i, ResultSet r, StatementContext statementContext) throws SQLException {
        return new Contact(r.getInt("id"), r.getString("firstName"),
                r.getString("lastName"), r.getString("phone"));
    }
}

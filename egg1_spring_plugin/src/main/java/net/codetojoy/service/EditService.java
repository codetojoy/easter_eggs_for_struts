package net.codetojoy.service;

import net.codetojoy.model.Person;

public interface EditService {
    Person getPerson();
    void savePerson(Person personBean);
}

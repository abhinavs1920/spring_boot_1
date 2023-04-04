package com.example.demo.dao;

import com.example.demo.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("fakeDao")
public class FakePersonDataAccessService implements PersonDao{
    private static List<Person> DB= new ArrayList<>();
    @Override
    public int insertPerson(UUID id, String name) {
        DB.add(new Person(id, name));
        return 0;
    }

    @Override
    public List<Person> selectAllPeople() {
        return DB;
    }
}

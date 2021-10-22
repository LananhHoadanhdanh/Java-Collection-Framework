package person_manager_full.service.impl;

import person_manager_full.model.Person;
import person_manager_full.service.GeneralService;

import java.util.ArrayList;

public class PersonServiceImpl implements GeneralService<Person> {
    private ArrayList<Person> personList;

    public PersonServiceImpl() {
        personList = new ArrayList<>();
    }

    @Override
    public void print() {
        for (int i = 0; i < personList.size(); i++) {
            System.out.println(personList.get(i));
        }
        System.out.println("___________________________");
    }

    @Override
    public void add(Person person) {
        personList.add(person);
    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getPersonalId() == id) {
                return i;
            }
        }
        return -1;
    }


    @Override
    public void deleteById(int id) {
        if (findIndexById(id) != -1) {
            personList.remove(findIndexById(id));
        } else {
            System.out.println("Không có học sinh này.");
        }
    }

    @Override
    public void editById(int id, Person person) {
        if (findIndexById(id) != -1) {
            personList.set(findIndexById(id), person);
        } else {
            System.out.println("Không có học sinh này.");
        }
    }

    @Override
    public void findByName(String name) {
        boolean check = false;
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getName().equals(name)) {
                System.out.println(personList.get(i));
                check = true;
            }
        }
        if (!check) {
            System.out.println("Không có tên này!");
        }
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    @Override
    public Person getElement(int index) {
        return personList.get(index);
    }

    @Override
    public int size() {
        return personList.size();
    }


}

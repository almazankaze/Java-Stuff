package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class SC_HashTable {

    private static final int TABLE_SIZE = 10;
    private static final int PRIME = 31;
    private int records;
    private List<ArrayList<User>> table;

    SC_HashTable() {

        table = new ArrayList<>();
        records = 0;

        for(int i = 0; i < TABLE_SIZE; i++) {
            table.add(new ArrayList<>());
        }
    }

    private int myHash(String key) {

        char[] characters = key.toCharArray();
        int index = 0;

        for(char c: characters) {
            index = (PRIME * index + c) % TABLE_SIZE;
        }

        return index;
    }

    public void printTable() {

        for(int i = 0; i < TABLE_SIZE; i++) {

            System.out.print(i);

            for (User user: table.get(i)) {

                System.out.print(" --> " + user.getUserName());
            }

            System.out.println("");
        }
    }

    public void insertUser(User user) {

        int index = myHash(user.getPassword());
        table.get(index).add(user);
        records++;
    }

    public void deleteUser(User user) {

        int index = myHash(user.getPassword());

        ListIterator<User> iterator = table.get(index).listIterator();

        while(iterator.hasNext()) {

            if(iterator.next().getUserName().equals(user.getUserName())) {
                iterator.remove();
                break;
            }
        }
    }

    public boolean findUser(User user) {
        int index = myHash(user.getPassword());

        for(User u: table.get(index)) {

            if(u.getUserName().equals(user.getUserName()))
                return true;
        }

        return false;
    }

    public int getNumUsers() {
        return records;
    }
}

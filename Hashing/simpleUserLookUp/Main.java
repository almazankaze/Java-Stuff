package com.company;

public class Main {

    public static void main(String[] args) {

        User u1 = new User("jakePaul", "rejm5@KM");
        User u2 = new User("maryAntoine", "mm34KMP=");
        User u3 = new User("eleanYay", "myPassword");
        User u4 = new User("helloWorld", "12345678");

        SC_HashTable myTable = new SC_HashTable();

        myTable.insertUser(u1);
        myTable.insertUser(u2);
        myTable.insertUser(u3);
        myTable.insertUser(u4);

        myTable.printTable();

        if(myTable.findUser(u1)) {
            System.out.println("record found");
        }

        myTable.deleteUser(u3);

        myTable.printTable();
    }
}

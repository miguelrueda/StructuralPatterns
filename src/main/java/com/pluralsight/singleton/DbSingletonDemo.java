package com.pluralsight.singleton;

public class DbSingletonDemo {

    public static void main(String[] args) {
        DbSingleton dbSingleton = DbSingleton.getInstance();

        System.out.println(dbSingleton);

        DbSingleton dbSingleton2 = DbSingleton.getInstance();

        System.out.println(dbSingleton2);
    }
}

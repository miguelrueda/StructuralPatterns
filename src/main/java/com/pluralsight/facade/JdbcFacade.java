package com.pluralsight.facade;

import com.pluralsight.singleton.DbSingleton;

import java.util.ArrayList;
import java.util.List;

public class JdbcFacade {

    DbSingleton instance = null;

    public JdbcFacade() {
        instance = DbSingleton.getInstance();
    }

    public int createTable() {
        return 0;
    }

    public int insertIntoTable() {
        return 0;
    }

    public List<Address> getAddresses() {
        return new ArrayList<>();
    }

}

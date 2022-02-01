package com.pluralsight.facade;

import java.util.List;

public class FacadeDemo {

    public static void main(String[] args) {
        JdbcFacade jdbcFacade = new JdbcFacade();

        jdbcFacade.createTable();

        jdbcFacade.insertIntoTable();

        List<Address> addresses = jdbcFacade.getAddresses();

        for (Address address: addresses) {
            System.out.println(address);
        }
    }
}

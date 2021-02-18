package com.cts.bank.test;

import com.cts.bank.dao.AccountDAO;
import com.cts.bank.exception.AccountTransactionException;
import org.junit.After;
import org.junit.Before;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@RunWith(MockitoJUnitRunner.class)
public class AccountDAOTest {

    @Mock
    private DataSource ds;
    @Mock
    private Connection con;
    @Mock
    private PreparedStatement ps;

    private AccountDAO dao;
    public ExpectedException exceptionRule = ExpectedException.none();

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }


    public void testInvalidAccount() throws AccountTransactionException {
        dao.deposit(null, 100.0);
    }

    public void testNullAccount() throws AccountTransactionException {
        //fill code

    }

    public void testInvalidAmount() throws AccountTransactionException {
        //fill code

    }


    public void testMethodCall() throws SQLException {
        //fill code

    }
}

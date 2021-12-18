/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittestingexmapledemo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Michael
 */
public class BankTest {
    
    
    
    public BankTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addAccount method, of class Bank.
     */
    @Test
    public void testAddAccount() {
        BankAccount account = new BankAccount(1234, "ABC", 1000, "chk");     
        Bank anz = new Bank();
        anz.addAccount(account);
        BankAccount search = anz.searchAccount(1234);
        assertEquals("Added Successfully",search, account);
    }
    
     @Test
    public void testValidSearchAccount() {
        BankAccount account = new BankAccount(1234, "ABC", 1000, "chk");     
        Bank anz = new Bank();
        anz.addAccount(account);
        BankAccount search = anz.searchAccount(1234);
        assertEquals("Added Successfully",search, account);
    }
    
     @Test
    public void testInValidAddAccount() {
        BankAccount account = new BankAccount(1234, "ABC", 1000, "chk");     
        Bank anz = new Bank();
        anz.addAccount(account);
        BankAccount search = anz.searchAccount(1236);
        assertEquals(null, search);
    }
    
      @Test
    public void testValidChangeAccountType() {
        BankAccount account = new BankAccount(1234, "ABC", 1000, "chk");     
        Bank anz = new Bank();
        anz.addAccount(account);
        try{
        String output= anz.changeBankAccountType(1234, "Saving");
        fail("Wrong type provided");
        assertEquals("Successfully changed type", output);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    /**
     * Test of searchAccount method, of class Bank.
     */
//    @Test
//    public void testSearchAccount() {
//        System.out.println("searchAccount");
//        int number = 0;
//        Bank instance = new Bank();
//        BankAccount expResult = null;
//        BankAccount result = instance.searchAccount(number);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}

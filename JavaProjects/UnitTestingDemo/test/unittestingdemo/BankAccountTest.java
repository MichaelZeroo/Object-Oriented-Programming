/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittestingdemo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 *
 * @author st14158
 */
public class BankAccountTest {
    BankAccount account;
    public BankAccountTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        try{
        account = new BankAccount("Raj", 1000, "chk");
        }catch(Exception ex){}
    }
    
    @After
    public void tearDown() {
        account=null;
    }

    /**
     * Test of getAccountHolderName method, of class BankAccount.
     */
//    @Test
//    public void testGetAccountHolderName() {
//        System.out.println("getAccountHolderName");
//        BankAccount instance = null;
//        String expResult = "";
//        String result = instance.getAccountHolderName();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of setAccountHolderName method, of class BankAccount.
     */
   @Test
    public void testSetAccountHolderName() {
       
       account.setAccountHolderName("abc");
        assertEquals("abc", account.getAccountHolderName());
        
    }

    /**
     * Test of getBalance method, of class BankAccount.
     */
    @Test
    public void testGetBalance() {
        assertEquals(1000, account.getBalance(),0.0);
    }

    @Test
    public void testValidDeposit() {
       //Balance before deposit     
        double currentBalance = account.getBalance();
        //Money t deposit
        double money = 100;
        //deposit money
        account.deposit(money);
        //test the balance after depositing money
        assertEquals(currentBalance+money, account.getBalance(),0.0);      
       
    }
    
    @Test
    public void testInValidDeposit() {
       //Balance before deposit     
        double currentBalance = account.getBalance();
        //Money t deposit
        double money = -100;
        //deposit money
        account.deposit(money);
        //test the balance after depositing money
        assertEquals(currentBalance, account.getBalance(),0.0);      
       
    }
    
     @Test
    public void testInValidWithdraw() {
       //Balance before deposit     
        double currentBalance = account.getBalance();
        //Money t deposit
        double money = -100;
        //deposit money
        account.withdraw(money);
        //test the balance after depositing money
        assertEquals(currentBalance, account.getBalance(),0.0);      
       
    }
    
    @Test
    public void testValidWithdraw() {
       //Balance before deposit     
        double currentBalance = account.getBalance();
        //Money t deposit
        double money = 100;
        //deposit money
        account.withdraw(money);
        //test the balance after depositing money
        assertEquals(currentBalance-money, account.getBalance(),0.0);      
      }
    /**
     * Test of withdraw method, of class BankAccount.
     */

    @Test
    public void testGetType() {
        assertEquals("chk", account.getType());
    }

//    @Test
//    public void testSetType() {
//        account.setType("saving");
//        assertEquals("saving", account.getType());
//    }
}

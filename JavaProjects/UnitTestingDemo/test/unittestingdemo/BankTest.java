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


/**
 *
 * @author st14158
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
//    @Test
//    public void testAddAccount() {
//        BankAccount account = new BankAccount(1234, "ABC",1000, "chk");
//        Bank anz = new Bank();
//        anz.addAccount(account);
//        BankAccount search = anz.searchAccount(1234);
//        assertEquals("Added Sucessfully",search, account);
//       }
// @Test
//    public void testValidSearchAccount() {
//        BankAccount account = new BankAccount(1234, "ABC",1000, "chk");
//        Bank anz = new Bank();
//        anz.addAccount(account);
//        BankAccount search = anz.searchAccount(1234);
//        assertEquals("Added Sucessfully",search, account);
//       }
    
//     @Test
//    public void testInValidSearchAccount() {
//        BankAccount account = new BankAccount(1234, "ABC",1000, "chk");
//        Bank anz = new Bank();
//        anz.addAccount(account);
//        BankAccount search = anz.searchAccount(1235);
//       // assertEquals(null, search);
//         assertNotEquals(search, account);
//       }
    
    @Test
    public void testValidChangeAccountType() {
       try{
   BankAccount account = new BankAccount(1234, "ABC",1000, "chk");
   Bank anz = new Bank();
   anz.addAccount(account);
   String output= anz.changeBankAccountType(1234, "saving"); 
   assertEquals("Successfully changed type", output);
        }
        catch(Exception ex)
        {
        
        fail("Type not changed successfully");
        }
      }
    
    @Test
     public void testInValidChangeAccountType() {
       try{
   BankAccount account = new BankAccount(1234, "ABC",1000, "chk");
   Bank anz = new Bank();
   anz.addAccount(account);
   String output= anz.changeBankAccountType(1234, "saving1"); 
   assertEquals("Successfully changed type", output);
        }
        catch(Exception ex)
        {
        
        assertEquals("Wrong type provided", ex.getMessage());
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

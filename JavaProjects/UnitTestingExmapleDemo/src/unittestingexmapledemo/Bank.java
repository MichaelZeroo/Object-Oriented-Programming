/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittestingexmapledemo;

import java.util.ArrayList;

/**
 *
 * @author Michael
 */
public class Bank {
    private ArrayList<BankAccount> accounts;

    public Bank() {
        accounts = new ArrayList<BankAccount>();
    }

    public void addAccount(BankAccount account){
        this.addAccount(account);
    }
    
    public BankAccount searchAccount(int number){
        BankAccount found = null;
        for(BankAccount ba: accounts){
            if(ba.getNumber()==number){
                found = ba;
                break;
            }          
        }
        return found;    
    }
    
    public String changeBankAccountType(int number,String newType)throws Exception{
        BankAccount account = searchAccount(number);
        if(account==null){
            return "Wrong account number";
        }else{
          account.setType(newType);  
          return "Successfully chnaged type";
        }
        
    }
    
    
}

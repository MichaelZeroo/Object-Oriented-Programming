/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittestingdemo;

/**
 *
 * @author st14158
 */
public class BankAccount {
    private int number;
    private String accountHolderName;
    private double balance;
    private String type;

    public int getNumber() {
        return number;
    }

    
    public BankAccount(int number, String accountHolderName, double balance, String type) 
    throws Exception
    {
        this.number = number;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        setType(type);
    }

    
    
    public BankAccount(String accountHolderName, double balance, String type) 
    
    {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.type= type;
    }

    public String getAccountHolderName() {
        return accountHolderName;
        
    }

    public void setAccountHolderName(String accountHolderName) 
    {
        this.accountHolderName = accountHolderName;
       
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double money)
    {
        if(money>0)
        {
        balance= balance+ money;
        }
    }

    public void withdraw(double money)
    {
        if(money>0)
        {
        balance = balance-money;
        }
    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) throws Exception
    {
        if(type.equals("chk") || type.equals("saving"))
        {
        this.type = type;
        }
        else
        {
           throw new Exception ("Wrong type provided");
        }
    }
    
}

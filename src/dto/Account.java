package dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ACC")
public class Account {
    @Id
    int account_no;
    String bankname;
    float balance;
    
    public Account() {}

    public Account(int account_no, String bankname, float balance) {
        this.account_no = account_no;
        this.bankname = bankname;
        this.balance = balance;
    }

    public int getAccount_no() {
        return account_no;
    }

    public void setAccount_no(int account_no) {
        this.account_no = account_no;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}

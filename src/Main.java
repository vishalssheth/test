//import java.awt.*;
//import java.lang.Math;
//import java.util.Random;

public class Main {
    public static void main(String[] args) {
    	System.out.println("Hello.....!");
    	for(int n=0;n<=10;n++) {
    	int i = 1110702;
    	BankAccount banked = new BankAccount(i++, 10000);
    	banked.deposit(banked.setAccount_balance(n*100));
    	System.out.println(n);
    	}
    }
}


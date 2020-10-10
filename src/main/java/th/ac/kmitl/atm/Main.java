package th.ac.kmitl.atm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    private static ATM atm;

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("Customer.txt");

        DataSourceFile dataSourceFile = context.getBean(DataSourceFile.class);

        String name = atm.validateCustomer(2, 2345);
        System.out.println(name + " has " + atm.getBalance());
        atm.withdraw(200);
        System.out.println(name + " has " + atm.getBalance());




    }
}

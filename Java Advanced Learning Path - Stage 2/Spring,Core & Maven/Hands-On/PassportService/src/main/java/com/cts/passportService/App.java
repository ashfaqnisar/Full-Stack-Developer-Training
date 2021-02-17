package com.cts.passportService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        new SkeletonValidator();

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        HeadPassportOffice passport;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select location:\n1.Chennai\n2.Bangalore");
        int choice = scanner.nextInt();

        if (choice == 1) {
            passport = context.getBean("chennai", ChennaiPassportOffice.class);
        } else if (choice == 2) {
            passport = context.getBean("bangalore", BangalorePassportOffice.class);
        } else {
            System.out.println("Wrong Choice");
            return;
        }
        passport.doPhotoVerification();
        passport.issuePassport();
    }
}

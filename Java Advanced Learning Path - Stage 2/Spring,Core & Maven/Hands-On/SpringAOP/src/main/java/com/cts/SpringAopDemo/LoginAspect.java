package com.cts.SpringAopDemo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoginAspect {

    @Autowired
    private EasyBank easyBank;

    @Around(value = "execution(* com.cts.SpringAopDemo.EasyBank.doWithdraw(..))")
    public void validateWithdraw(ProceedingJoinPoint joinPoint) throws Throwable {
        if (easyBank.getTempPin() != easyBank.getPinCode()) {
            throw new Exception();
        } else {
            joinPoint.proceed();
            System.out.println("Your remaining balance is " + (easyBank.getBalance()));

        }
    }

    @Before("execution(* com.cts.SpringAopDemo.EasyBank.showBalance(..)) || execution(* com.cts.SpringAopDemo.EasyBank.doWithdraw(..))")
    public void validateBalance() {
        if (easyBank.getTempPin() != easyBank.getPinCode()) {
            throw new RuntimeException();
        }
    }

    @AfterReturning("execution(* com.cts.SpringAopDemo.EasyBank.doChangePin(..))")
    public void afterPinChange() {
        System.out.println("You have successfully changed your pin");
    }

    @AfterThrowing("execution(* com.cts.SpringAopDemo.EasyBank.*(..))")
    public void afterWrongPin() {
        System.out.println("Invalid Pin");
    }

}

package com.cts.passportService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("bangalore")
public class BangalorePassportOffice implements HeadPassportOffice {

    private Document bangaloreDocument;

    @Autowired
    public BangalorePassportOffice(Document bangaloreDocument) {
        this.bangaloreDocument = bangaloreDocument;
    }

    @Override
    public void doPhotoVerification() {
        System.out.println("Photo verification done using "+ bangaloreDocument.getIdProof());
    }

    @Override
    public void issuePassport() {
        System.out.println("Passport issue is in progress for "+bangaloreDocument.getName() + " from " + bangaloreDocument.getCity() + " office");
    }

    @Override
    public String toString() {
        return "BangalorePassportOffice{" +
                "bangaloreDocument=" + bangaloreDocument.toString() +
                '}';
    }
}

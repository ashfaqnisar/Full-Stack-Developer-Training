package com.cts.passportService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("chennai")
public class ChennaiPassportOffice implements HeadPassportOffice {

    private Document chennaiDocument;

    @Autowired
    public ChennaiPassportOffice(Document chennaiDocument) {
        this.chennaiDocument = chennaiDocument;
    }

    @Override
    public void doPhotoVerification() {
        System.out.println("Photo verification done using " + chennaiDocument.getIdProof());
    }

    @Override
    public void issuePassport() {
        System.out.println("Passport issue is in progress for " + chennaiDocument.getName() + " from " + chennaiDocument.getCity() + " office");
    }

    @Override
    public String toString() {
        return "ChennaiPassportOffice{" +
                "chennaiDocument=" + chennaiDocument.toString() +
                '}';
    }
}

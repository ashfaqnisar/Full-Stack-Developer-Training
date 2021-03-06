package com.spring.app;

public class MemberShip {
    private int membershipId, visitsPerYear;
    private String membershipType;
    private Customer customer;

    public MemberShip(Customer customer) {
        this.customer = customer;
    }

    public int getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(int membershipId) {
        this.membershipId = membershipId;
    }

    public int getVisitsPerYear() {
        return visitsPerYear;
    }

    public void setVisitsPerYear(int visitsPerYear) {
        this.visitsPerYear = visitsPerYear;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "MemberShip{" +
                "membershipId=" + membershipId +
                ", visitsPerYear=" + visitsPerYear +
                ", membershipType='" + membershipType + '\'' +
                ", customer=" + customer.toString() +
                '}';
    }
}

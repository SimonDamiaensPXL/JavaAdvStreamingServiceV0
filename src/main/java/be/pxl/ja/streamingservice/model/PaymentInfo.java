package be.pxl.ja.streamingservice.model;

import java.time.LocalDate;

public class PaymentInfo {
    private String cardNumer;
    private CreditCardType type;
    private String firstname;
    private String lastname;
    private LocalDate expirationDate;
    private int securityCode;


    public String getCardNumber() {
        return cardNumer;
    }

    public void setCardNumer(String cardNumber) {
        this.cardNumer = cardNumber;
    }

    public CreditCardType getType() {
        return type;
    }

    public void setType(CreditCardType type) {
        this.type = type;
    }

    public String getFirstName() {
        return firstname;
    }

    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public void setLastName(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(int securityCode) {
        this.securityCode = securityCode;
    }
}

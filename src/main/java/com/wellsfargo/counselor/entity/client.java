// package com.wellsfargo.counselor.entity;

// import java.util.Date;

// import ch.aonyx.broker.ib.api.fa.FinancialAdvisorConfigurationEventLoggingListener;
// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.JoinColumn;
// import jakarta.persistence.ManyToOne;

// public class client {
//     @Entity
// public class Client {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private int clientId;

//     @ManyToOne
//     @JoinColumn(name = "advisorId")
//     private FinancialAdvisorConfigurationEventLoggingListener advisor;

//     private String name;
//     private String contactInfo;
//     private String address;
//     private String accountStatus;
//     private Date createdAt;

//     public Client() {}

//     public Client(FinancialAdvisor advisor, String name, String contactInfo, 
//                   String address, String accountStatus, Date createdAt) {
//         this.advisor = advisor;
//         this.name = name;
//         this.contactInfo = contactInfo;
//         this.address = address;
//         this.accountStatus = accountStatus;
//         this.createdAt = createdAt;
//     }

//     // Getters and setters
// }

// }

package com.wellsfargo.counselor.entity;


import jakarta.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue()
    private long clientId;

    @Column(nullable = false)
    private String userName;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String email;

    protected Client() {

    }

    public Client(String userName, String firstName, String lastName, String address, String phone, String email) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "client")
    private Portfolio portfolio;

    public Long getClientId() {
        return clientId;
    }

    public String getUserName() {
        return userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Portfolio getPortfolio() {
        return this.portfolio;
    }

    public void setPortfolio() {
        this.portfolio = new Portfolio();
    }
}
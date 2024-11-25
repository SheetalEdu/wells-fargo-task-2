package com.wellsfargo.counselor.entity;

    
    // Default constructor
        public FinancialAdvisor() 
    
        // Parameterized constructor
        public FinancialAdvisor(String name, String email, String phone, String address, 
                                String position, String department, boolean availability) {
            this.name = name;
            this.email = email;
            this.phone = phone;
            this.address = address;
            this.position = position;
            this.department = department;
            this.availability = availability;
        }
    
        // Getters and Setters
        public int getAdvisorId() { return advisorId; }
        
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
    
        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }
    
        public String getPhone() { return phone; }
        public void setPhone(String phone) { this.phone = phone; }
    
        public String getAddress() { return address; }
        public void setAddress(String address) { this.address = address; }
    
        public String getPosition() { return position; }
        public void setPosition(String position) { this.position = position; }
    
        public String getDepartment() { return department; }
        public void setDepartment(String department) { this.department = department; }
    
        public boolean isAvailability() { return availability; }
        public void setAvailability(boolean availability) { this.availability = availability; }
}
    


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
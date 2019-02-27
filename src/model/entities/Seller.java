package model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Seller implements Serializable{
    
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name, email;
    private Date bithDate;
    private Double baseSallary;
    private Department department;

    public Seller() {
    }

    public Seller(Integer id, String name, String email, Date bithDate, Double baseSallary, Department department) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.bithDate = bithDate;
        this.baseSallary = baseSallary;
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBithDate() {
        return bithDate;
    }

    public void setBithDate(Date bithDate) {
        this.bithDate = bithDate;
    }

    public Double getBaseSallary() {
        return baseSallary;
    }

    public void setBaseSallary(Double baseSallary) {
        this.baseSallary = baseSallary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Seller other = (Seller) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Seller{" + "id=" + id + ", name=" + name + ", email=" + email + ", bithDate=" + bithDate + ", baseSallary=" + baseSallary + ", department=" + department + '}';
    }
    
    
}

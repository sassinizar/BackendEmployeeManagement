package tech.getarrays.employeemanager.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Employee implements Serializable{
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String UrlImage;
    private String jobTitle;
    @Column(nullable = false, updatable = false)
    private String employeeCode;

    public Employee(){

    }

    public Employee(String name, String email, String phone, String urlImage, String jobTitle, String employeeCode) {
        this.name = name;
        this.email = email;
        this.phone = phone;
       this.UrlImage = urlImage;
        this.jobTitle = jobTitle;
        this.employeeCode = employeeCode;
    }

    public Long getId() {
        return id;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUrlImage() {
        return UrlImage;
    }

    public void setUrlImage(String urlImage) {
        UrlImage = urlImage;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", UrlImage='" + UrlImage + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", employeeCode='" + employeeCode + '\'' +
                '}';
    }
}

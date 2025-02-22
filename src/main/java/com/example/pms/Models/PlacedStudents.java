package com.example.pms.Models;

import javafx.beans.property.*;

import java.time.LocalDate;

public class PlacedStudents {

    private final StringProperty placedStudentName;
    private final StringProperty placedStudentDept;
    private final StringProperty placedStudentPhone;
    private final StringProperty placedStudentRole;
    private final StringProperty placedStudentPackage;
    private final StringProperty placedStudentCompany;
    private final StringProperty placedStudentEmail;
    private final ObjectProperty<LocalDate> placedStudentDate;
    private final StringProperty placedStudentAddress;
    private final StringProperty placedStudentId;

    // Constructor
    public PlacedStudents(String placedStudentName, String placedStudentDept, String placedStudentPhone,
                          String placedStudentRoll, String placedStudentPackage, String placedStudentCompany,
                          String placedStudentEmail, LocalDate placedStudentDate, String placedStudentAddress,String placedStudentId) {
        this.placedStudentName = new SimpleStringProperty(this, "placedStudentName", placedStudentName);
        this.placedStudentDept = new SimpleStringProperty(this, "placedStudentDept", placedStudentDept);
        this.placedStudentPhone = new SimpleStringProperty(this, "placedStudentPhone", placedStudentPhone);
        this.placedStudentRole = new SimpleStringProperty(this, "placedStudentRoll", placedStudentRoll);
        this.placedStudentPackage = new SimpleStringProperty(this, "placedStudentPackage", placedStudentPackage);
        this.placedStudentCompany = new SimpleStringProperty(this, "placedStudentCompany", placedStudentCompany);
        this.placedStudentEmail = new SimpleStringProperty(this, "placedStudentEmail", placedStudentEmail);
        this.placedStudentDate = new SimpleObjectProperty<>(this, "placedStudentDate", placedStudentDate);
        this.placedStudentAddress = new SimpleStringProperty(this, "placedStudentAddress", placedStudentAddress);
        this.placedStudentId = new SimpleStringProperty(this, "placedStudentId", placedStudentId);
    }

    // Getters for property binding
    @SuppressWarnings("exports")
    public StringProperty placedStudentNameProperty() {
        return placedStudentName;
    }

    @SuppressWarnings("exports")
    public StringProperty placedStudentDeptProperty() {
        return placedStudentDept;
    }

    @SuppressWarnings("exports")
    public StringProperty placedStudentPhoneProperty() {
        return placedStudentPhone;
    }

    @SuppressWarnings("exports")
    public StringProperty placedStudentRollProperty() {
        return placedStudentRole;
    }

    @SuppressWarnings("exports")
    public StringProperty placedStudentPackageProperty() {
        return placedStudentPackage;
    }

    @SuppressWarnings("exports")
    public StringProperty placedStudentCompanyProperty() {
        return placedStudentCompany;
    }

    @SuppressWarnings("exports")
    public StringProperty placedStudentEmailProperty() {
        return placedStudentEmail;
    }

    public ObjectProperty<LocalDate> placedStudentDateProperty() {
        return placedStudentDate;
    }

    @SuppressWarnings("exports")
    public StringProperty placedStudentAddressProperty() {
        return placedStudentAddress;
    }

    @SuppressWarnings("exports")
    public StringProperty placedStudentIdProperty() {
        return placedStudentId;
    }
}

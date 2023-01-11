package edu.javacourse.studentorder.domain;

import edu.javacourse.studentorder.domain.Adult;
import edu.javacourse.studentorder.domain.Child;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentOrder {

   private long studentOrderId;
   private Adult husband;
   private Adult wife;
   private List<Child> children;
   private String MarriageCertificatedId;
   private String MarriageOffice;
   private LocalDate MarriageDate;

    public long getStudentOrderId() {
        return studentOrderId;
    }

    public void setStudentOrderId(long studentOrderId) {
        this.studentOrderId = studentOrderId;
    }

    public Adult getHusband() {
        return husband;
    }

    public void setHusband(Adult husband) {
        this.husband = husband;
    }

    public Adult getWife() {
        return wife;
    }

    public void setWife(Adult wife) {
        this.wife = wife;
    }




    public LocalDate getMarriageDate() {
        return MarriageDate;
    }

    public void setMarriageDate(LocalDate marriageDate) {
        MarriageDate = marriageDate;
    }

    public String getMarriageOffice() {
        return MarriageOffice;
    }

    public void setMarriageOffice(String marriageOffice) {
        MarriageOffice = marriageOffice;
    }

    public String getMarriageCertificatedId() {
        return MarriageCertificatedId;
    }

    public void setMarriageCertificatedId(String marriageCertificatedId) {
        MarriageCertificatedId = marriageCertificatedId;
    }

    public void addChild(Child child) {
        if (children == null) {
            children = new ArrayList<>(5);
        }
        children.add(child);
    }

    public List<Child> getChildren() {
        return children;
    }
}

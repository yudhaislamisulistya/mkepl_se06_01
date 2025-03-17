package models;

import java.util.Date;

import models.*;

public class Employee {

    private PersonalInfo personalInfo;
    private EmergencyContact emergencyContact;
    private JobInfo jobInfo;

    public Employee(PersonalInfo personalInfo, EmergencyContact emergencyContact, JobInfo jobInfo) {
        this.personalInfo = personalInfo;
        this.emergencyContact = emergencyContact;
        this.jobInfo = jobInfo;
    }

    public PersonalInfo getPersonalInfo() {
        return personalInfo;
    }

    public void setPersonalInfo(PersonalInfo personalInfo) {
        this.personalInfo = personalInfo;
    }

    public EmergencyContact getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(EmergencyContact emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public JobInfo getJobInfo() {
        return jobInfo;
    }

    public void setJobInfo(JobInfo jobInfo) {
        this.jobInfo = jobInfo;
    }

}

enum Department {
    HR, IT, FINANCE
}

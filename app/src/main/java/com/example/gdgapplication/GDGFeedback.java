package com.example.gdgapplication;

public class GDGFeedback {
    String name;
    String occupation;
    int rating;
    String qualification;
    int age;
    String suggestion;
    Boolean isAgree;

    public String getName() {
        return name;
    }

    public GDGFeedback(String name, String occupation, int rating, String qualification, int age, String suggestion, Boolean isAgree) {
        this.name = name;
        this.occupation = occupation;
        this.rating = rating;
        this.qualification = qualification;
        this.age = age;
        this.suggestion = suggestion;
        this.isAgree = isAgree;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    public Boolean getAgree() {
        return isAgree;
    }

    public void setAgree(Boolean agree) {
        isAgree = agree;
    }
}

package com.saifkhan.fingerresponsetimerrecord;

import java.util.List;

public class RespondData {
    private String age;
    private String gender;
   private List timearray;

    public RespondData()
    {

    }
    public RespondData(String age, String gender, List timearray)//, List timearray
    {
        this.age = age;
        this.gender=gender;
        this.timearray = timearray;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List gettimeArray() {
        return timearray;
    }

    public void settimeArray(List timearray) {
        this.timearray = timearray;
    }
}

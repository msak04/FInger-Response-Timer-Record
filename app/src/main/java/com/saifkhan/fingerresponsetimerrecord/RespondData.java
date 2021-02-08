package com.saifkhan.fingerresponsetimerrecord;

public class RespondData {
    String age,gender;
    Double timearray[];

    public RespondData()
    {

    }
    public RespondData(String age, String gender, Double timearray[])
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

    public Double[] gettimeArray() {
        return timearray;
    }

    public void settimeArray(Double[] array) {
        this.timearray = array;
    }
}

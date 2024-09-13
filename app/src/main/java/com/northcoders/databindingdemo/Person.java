package com.northcoders.databindingdemo;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class Person extends BaseObservable {

    private String name;
    private String age;
    private String emailAddress;

    public Person(String name, String age, String emailAddress) {
        this.name = name;
        this.age = age;
        this.emailAddress = emailAddress;
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
        notifyPropertyChanged(BR.age);
    }

    @Bindable
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        notifyPropertyChanged(BR.emailAddress);
    }

}

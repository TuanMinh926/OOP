#include<iostream>
#pragma once

using namespace std;

class Person {
private:
    string name;
    string address;
public:
    Person(string name, string address){
        this->name = name;
        this->address = address;
    }
    
    virtual void display() = 0;
    
    void setName(string name){
        this->name = name;
    }
    string getName(){
        return name;
    }
    void setAddress(string address){
        this->address = address;
    }
    string getAddress(){
        return address;
    }
};
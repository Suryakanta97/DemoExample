package com.surya.metaprogramming.extension

import com.surya.metaprogramming.Employee

class StaticEmployeeExtension {
    
    static Employee getDefaultObj(Employee self) {
        return new Employee(firstName: "firstName", lastName: "lastName", age: 20)
    }
}
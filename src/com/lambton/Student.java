

package com.lambton;

public class Student
{
    int studentID;
    String studentName;

    void setValues()
    {
        studentID = 1;
        studentName = "Charan";
    }

    void display()
    {
        System.out.println("Student ID   : " + studentID);
        System.out.println("Student Name : " + studentName);
    }
}

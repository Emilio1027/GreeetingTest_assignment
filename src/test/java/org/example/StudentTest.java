package org.example;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest  {
    Student student;

    @BeforeEach
    void setUp()  {
    student= new Student("Adam",40,"ATL");

    }

    @Test
     void getName() {
        assertEquals("Adam",student.getName());
    }
    @Test
     void setName() {
        student.setName("Adam");
        assertEquals("Adam","Adam","Set Name Failed...");
    }
    @Test
     void getAge() {
        assertEquals(40,student.getAge());
    }
    @Test
     void setAge() {
        student.setAge(40);
        assertEquals(40,student.getAge());
    }
    @Test
    public void testSetAddress() {
    }

    @Test
    void groupedAssertions(){
        student.setName("Adam");
        student.setAge(40);

        assertAll("Test Props",
        ()-> assertEquals("Adam",student.getName(),"First Name Failed"),
                   ()-> assertEquals(40,student.getAge(),"Wrong Age"),
                   ()-> assertEquals("ATL",student.getAddress(),"Wrong Address"));
    }

}
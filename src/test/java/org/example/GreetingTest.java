package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;


public class GreetingTest {


    Greeting greeting;


    //This is only called once before anything else
    @BeforeAll
    public static void beforeClass() {
        System.out.println("Before all - I am only called once");
    }


    //This will run before each test method
    @BeforeEach
    void setUp() {
        System.out.println("In before each..");
        greeting = new Greeting();
    }

    @DisplayName("Test Hello World")
    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
        assertEquals("Hello World", greeting.helloWorld(),"Test #1 Failed");
    }


    @DisplayName("Test Overload Hello Everett")
    @Test
    void testhelloWorld() {
        System.out.println(greeting.helloWorld("Everett"));
        assertEquals("Hello Everett", greeting.helloWorld("Everett "),"Test #2 Failed");
    }


    @DisplayName("Test Overload Hello Adam")
    @Test
    void testHelloWorld2()     {
         System.out.println(greeting.helloWorld());
          assertEquals("Hello Adam", greeting.helloWorld("Adam"),"Test #3 Failed");
        }

    //This will run after each test method
    @AfterEach
    void tearDown(){
        System.out.println("In after each...");
    }
    //This is only called after everything else
    @AfterAll
    public static  void afterClass() {
        System.out.println("After!! I am only called once!!");

    }

    }

















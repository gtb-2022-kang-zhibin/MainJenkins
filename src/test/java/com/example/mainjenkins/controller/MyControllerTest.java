package com.example.mainjenkins.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyControllerTest {
    MyController stub = new MyController();

    @Test
    void myController() {
        assertThrows(Exception.class, stub::myController);
    }
}
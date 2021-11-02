/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Rafael Alvarez-Romero
 */

module ucf.assignments {
    requires javafx.controls;
    requires javafx.fxml;


    opens ucf.assignments to javafx.fxml;
    exports ucf.assignments;
}
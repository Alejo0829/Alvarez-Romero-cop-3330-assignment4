/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Rafael Alvarez-Romero
 */

package ucf.assignments;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {

    @FXML

    //creating-a-to-do-list
    public Button SubmitToDoListNameButton;
    public TextField CreateToDoList;

    //editing-an-item
    public TextField EnterToDoName;
    public TextField Description;
    public DatePicker DueDate;
    public ChoiceBox StatusDropDown;

    //editing-todolist
    public TextField EditToDoName;
    public Button SubmitNewName;

    //hello-view
    public TextField CreateToDoListName;
    public TextField AddDescription;
    public DatePicker DueDatePicker;
    public ChoiceBox StatusDropDownPicker;
    public Button SubmitNewToDoListButton;

    //item-view
    public Button EditToDoButton;
    public Button DeleteToDoButton;
    public Button AddToDoButton;
    public Button EditToDoList;
    public Button MarkAsCompleteButton;
    public ChoiceBox Filter;
    public ListView ViewToDoList;

    //main-todolist-view
    public ListView DisplayToDoList;
    public Button ViewItemsButton;
    public Button DeleteListButton;
    public Button AddNewToDoButton;
    public Button SaveAllListsButton;
    public Button SaveCurrentListButton;
    public Button ImportListButton;
    public TextField LocationImportExport;



}
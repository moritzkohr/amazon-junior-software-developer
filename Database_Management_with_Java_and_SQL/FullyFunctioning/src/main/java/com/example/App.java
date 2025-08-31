package com.example;

import org.mariadb.jdbc.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class PrimaryController {

    @FXML
    private TextField searchField;

    @FXML
    private TextField fNameField;

    @FXML
    private TextField lNameField;

    @FXML
    private TextField pointsField;

    @FXML
    private Button btnAdd;

    @FXML
    private Button btnRead;

    @FXML
    private Button btnUpdate;

    @FXML
    private TableColumn<User, String> fnameColumn;

    @FXML
    private TableColumn<User, String> lnameColumn;

    @FXML
    private TableColumn<User, Integer> pointsColumn;

    @FXML
    private TableView<User> tableView;

    @FXML
    public void initialize() {

         /*TODO 9: Assign the CellValueProperty of each TableColumn in the TableView with PropertyValueProperty of corresponding field.
         Copy the statements below in the initialize() method*/
        fnameColumn.setCellValueFactory(new PropertyValueFactory<>("fName"));
        lnameColumn.setCellValueFactory(new PropertyValueFactory<>("lName"));
        pointsColumn.setCellValueFactory(new PropertyValueFactory<>("points"));

        //right alignment
        pointsColumn.setCellFactory(column -> new TableCell<User, Integer>() {
            @Override
            protected void updateItem(Integer item, boolean empty) {
                super.updateItem(item, empty);
                if (empty || item == null) {
                    setText(null);
                } else {
                    setText(item.toString());
                    setAlignment(Pos.CENTER_RIGHT); // Align text to the right
                }
            }
        });

        refreshTable();
        //getAllUsers();
    }

    /*     private static Connection connect() throws SQLException {

            String url = "jdbc:mysql://localhost:3306/clicknbuy";
            String user = "root";
            String password = "Lmv@15561";
            return DriverManager.getConnection(url, user, password);
        } */
    /* TODO 4: Open PrimaryController.java code. Define getAllUsers() method that returns ObservableList */
    private ObservableList<User> getAllUsers() {

        ObservableList<User> userList = FXCollections.observableArrayList();
        /*TODO 5 String query =  // SQL Query to select all fields from user table;*/


        try (Connection conn = Database.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
/*TODO 6:  Read all records in a while loop.
Fetch the field values in the variables userId, fName, lName and points.
Print the variables with System.out.println() */

                /*TODO 7: Create a new User object with these values and add in userList ObservableList.*/
                userList.add(new User(userId, fName, lName, points));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userList;

    }

    /*TODO 10: Define refreshTable() method.
    It will be called after any CRUD operation.
    The ObservableList retuned by getAllUsers() is used to populate the TableView*/
    private void refreshTable() {
        tableView.setItems(getAllUsers());
    }

    @FXML
    void readUser(ActionEvent event) {
/*TODO 16: call the getSelectedItem() method,
obtain the User object corresponding to the row clicked on.*/
        User selectedUser = tableView.getSelectionModel().getSelectedItem();
/*TODO 17: once the User object is obtained, set the fNameField with
the fName attribute of the User object. Use the setText() method of TextField class */
        fNameField.setText(selectedUser.getfName());
/*TODO 18:  similarly, set the text fields - lNameField, and pointsField -
with the corresponding attributes of the User object.*/
    }


    @FXML
    void insertUser(ActionEvent event) {
        /*TODO 11: Declare newFName, newLName variables of int type and newpoints variable of int type.*/

  /*TODO 12:    Populate these variables with the data entered by the user in the text fields.
  Use getText() method of TextField class*/

        /*TODO 13: Construct a parameterized query string for INSERT operation, and create a PreparedStatement using it.*/



        try (Connection conn = Database.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
/*TODO 14: Substitute user entered data with setString() and setInt() methods
of PreparedStatement class and execute the query.*/
            pstmt.setString(1, newFName);
            pstmt.setString(2, newLName);
            pstmt.setInt(3, newPoints);

            pstmt.executeUpdate();

            /*TODO 15:     call refreshTable() method.*/
        } catch (SQLException e) {
            System.out.println("error:"+e.getMessage());

        }

    }

    @FXML
    void updateUser(ActionEvent event) {
/*TODO 19: Declare newFName, newLName variables of int type
and newpoints variable of int type.*/

/*TODO 19: Call the getSelectedItem() method,
obtain the User object corresponding to the row clicked on.*/

/*TODO 21: Assign the values of the text fields - fNameField, lNameField and pointField
to newFName, newLName and newpoints variables.*/

        /*TODO 22: Construct a parameterized query string for UPDATE operation. */

        String query = "UPDATE user SET first_name = ?, last_name = ?, reward_points = ? WHERE user_id = ?";

        try (Connection conn = Database.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
/*TODO 23:: Perform parameter substitution and execute the query to update the
selected row in the TableView as done in TODO 19*/


            refreshTable();
        } catch (SQLException e) {
            System.out.println("error:"+e.getMessage());
        }
    }
    @FXML
    void deleteUser(ActionEvent event) {
/*TODO 24: Call the getSelectedItem() method,
obtain the User object corresponding to the row clicked on.*/

        User selectedUser = tableView.getSelectionModel().getSelectedItem();

        /*TODO 25: Construct a parameterized query string for DELETE operation.*/

        try (Connection conn = Database.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
/*TODO 26: Perform parameter substitution and execute the
query to delete the selected row in the TableView as in TODO 19*/

            pstmt.executeUpdate();
            refreshTable();
        } catch (SQLException e) {
            System.out.println("error:"+e.getMessage());

        }
    }

}

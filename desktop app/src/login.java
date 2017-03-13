/**
 * Created by ETCH on 3/5/2017.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import javax.swing.*;
import java.sql.ResultSet;


public class login extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    database obj = new database();
    home obj_home=new home();
    String user = "", pass = "", passdb = "";
    TextField inp_username;
    PasswordField inp_password;
    @Override
    public void start(final Stage primaryStage) {
        primaryStage.setTitle("Login");


        Label label_username = new Label();
        label_username.setText("ID");
        label_username.setPrefWidth(200);
        label_username.setAlignment(Pos.CENTER);
        label_username.setStyle("-fx-font-family:'Segoe Print';-fx-font-size:18;-fx-font-weight:bolder;");


        Label label_password = new Label();
        label_password.setText("password");
        label_password.setPrefWidth(200);
        label_password.setAlignment(Pos.CENTER);
        label_password.setStyle("-fx-font-family:'Segoe Print';-fx-font-size:18;-fx-font-weight:bolder;");

        inp_username = new TextField();
        inp_username.setStyle("-fx-border-radius:10px;-fx-background-color:white;");
        inp_username.setPromptText("Enter your ID");


        inp_password = new PasswordField();
        inp_password.setStyle("-fx-border-radius:10px;-fx-background-color:white;");
        inp_password.setPromptText("Enter your Password");



        Button btn_login = new Button();
        btn_login.setText("Login");
        btn_login.setPrefWidth(100);
        btn_login.setStyle("-fx-border-radius: 10px;-fx-background-color:rgb(223, 255, 196);-fx-font-family:'Segoe Print';-fx-font-size:18;-fx-font-weight:bolder;");



        btn_login.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                /*user = inp_username.getText();
                pass = inp_password.getText();
                ResultSet rs = obj.connectToDatabase("select password from users where id ="+user);
                try {
                    while (rs.next()) {
                        // System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
                        passdb = rs.getString("password");
                    }
                    obj.con.close();
                } catch (Exception e) {
                    System.out.println(e);
                }
                if (pass.equals(passdb)) {
                    obj_home.home(primaryStage);
                } else {
                    JOptionPane.showMessageDialog(null, "Id or password is wrong try again please");
                }*/
                room obj_emergency = new room();
                obj_emergency.room(primaryStage);
            }
        });


        Button btn_cancel = new Button();
        btn_cancel.setText("cancel");
        btn_cancel.setPrefWidth(100);
        btn_cancel.setStyle("-fx-border-radius: 10px;-fx-background-color:rgb(223, 255, 196);-fx-font-family:'Segoe Print';-fx-font-size:18;-fx-font-weight:bolder;");
        btn_cancel.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.exit(1);
            }
        });


        ///////////////////////// Layouts ///////////////////////////////
        GridPane root = new GridPane();
        root.setPadding(new Insets(20, 20, 20, 20));
        root.setStyle("-fx-background-color:rgb(85, 170, 255);");
        root.setAlignment(Pos.CENTER);
        root.setVgap(30);

        root.add(label_username, 2, 1);
        root.add(inp_username, 2, 2);
        root.add(label_password, 2, 3);
        root.add(inp_password, 2, 4);
        root.add(btn_login, 1, 5);
        root.add(btn_cancel, 3, 5);


        primaryStage.setScene(new Scene(root, 500, 350));
        primaryStage.show();
    }

}

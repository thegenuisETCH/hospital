import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Created by ETCH on 3/10/2017.
 */
public class emergency {

    public void emergency(final Stage emergencyStage) {

        emergencyStage.setTitle("Emergency");
        TextField inp_username,price;
        TextArea list;




        Label label_username = new Label();
        label_username.setText("ID");
        label_username.setPrefWidth(300);
        label_username.setAlignment(Pos.CENTER);
        label_username.setStyle("-fx-font-family:'Segoe Print';-fx-font-size:18;-fx-font-weight:bolder;");

        inp_username = new TextField();
        inp_username.setStyle("-fx-border-radius:10px;-fx-background-color:white;");
        inp_username.setPromptText("Enter Patient ID");

        Label label_1 = new Label();
        label_1.setText("Items");
        label_1.setPrefWidth(300);
        label_1.setAlignment(Pos.CENTER);
        label_1.setStyle("-fx-font-family:'Segoe Print';-fx-font-size:18;-fx-font-weight:bolder;");

        list= new TextArea();
        list.setStyle("-fx-border-radius:10px;-fx-background-color:white;");
        list.setPromptText("Enter the list of items");

        Label label_price = new Label();
        label_price.setText("Items");
        label_price.setPrefWidth(300);
        label_price.setAlignment(Pos.CENTER);
        label_price.setStyle("-fx-font-family:'Segoe Print';-fx-font-size:18;-fx-font-weight:bolder;");


        price = new TextField();
        price.setStyle("-fx-border-radius:10px;-fx-background-color:white;");
        price.setPromptText("Enter total price of items");

        Button btn_submit = new Button();
        btn_submit.setPrefWidth(150);
        btn_submit.setPrefHeight(80);
        btn_submit.setText("Submit");
        btn_submit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

            }
        });



        Button btn_1 = new Button("Patient");
        btn_1.setPrefSize(130,70);
        btn_1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                patient obj_patient = new patient();
                obj_patient.patient(emergencyStage);
            }
        });

        Button btn_2 = new Button("Clinic");
        btn_2.setPrefSize(130,70);
        btn_2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                clinic obj_clinic = new clinic();
                obj_clinic.clinic(emergencyStage);
            }
        });

        Button btn_3 = new Button("emergency");
        btn_3.setPrefSize(130,70);
        btn_3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                emergency obj_emergency = new emergency();
                obj_emergency.emergency(emergencyStage);
            }
        });

        Button btn_4 = new Button("Rooms");
        btn_4.setPrefSize(130,70);
        btn_4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                room obj_room = new room();
                obj_room.room(emergencyStage);
            }
        });

        Button btn_5 = new Button("Money System");
        btn_5.setPrefSize(130,70);
        btn_5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                money obj_money = new money();
                obj_money.money(emergencyStage);
            }
        });

        Button btn_6 = new Button("Lap");
        btn_6.setPrefSize(130,70);
        btn_6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                lap obj_lap = new lap();
                obj_lap.lap(emergencyStage);
            }
        });


        Button btn_7 = new Button("Registration");
        btn_7.setPrefSize(130,70);
        btn_7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                registration obj_registration = new registration();
                obj_registration.registration(emergencyStage);
            }
        });

        Button btn_8 = new Button("Exit");
        btn_8.setPrefSize(130,70);
        btn_8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.exit(1);
            }
        });

        BorderPane root = new BorderPane();
        FlowPane bar = new FlowPane();
        GridPane content = new GridPane();


        bar.setPrefSize(130,70);
        bar.getChildren().addAll(btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8);
        bar.setAlignment(Pos.TOP_CENTER);
        root.setTop(bar);



        root.setStyle("-fx-background-color:rgb(85, 170, 255);");
        //root.setAlignment(Pos.CENTER);
        //root.setVgap(30);
        content.setAlignment(Pos.CENTER);

        content.add(label_username, 1, 1);
        content.add(inp_username, 2, 1);
        content.add(label_1, 1, 2);
        content.add(list,2,2);
        content.add(label_price,1,3);
        content.add(price, 2, 3);
        content.add(btn_submit,2,4,2,1);
        root.setTop(bar);
        root.setCenter(content);



        emergencyStage.setScene(new Scene(root, 500, 350));
        emergencyStage.setFullScreen(true);
        emergencyStage.show();


    }

}

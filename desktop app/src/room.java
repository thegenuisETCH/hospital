import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


/**
 * Created by ETCH on 3/10/2017.
 */
public class room {

    BorderPane root;
    GridPane content;

    public void room (final Stage roomStage){

        roomStage.setTitle("Rooms");


        Button btn_1 = new Button("Patient");
        btn_1.setPrefSize(130,70);
        btn_1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                patient obj_patient = new patient();
                obj_patient.patient(roomStage);
            }
        });
        Button btn_2 = new Button("Clinic");
        btn_2.setPrefSize(130,70);
        btn_2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                clinic obj_clinic = new clinic();
                obj_clinic.clinic(roomStage);
            }
        });
        Button btn_3 = new Button("emergency");
        btn_3.setPrefSize(130,70);
        btn_3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                emergency obj_emergency = new emergency();
                obj_emergency.emergency(roomStage);
            }
        });
        Button btn_4 = new Button("Rooms");
        btn_4.setPrefSize(130,70);
        btn_4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                room(roomStage);
            }
        });
        Button btn_5 = new Button("Money System");
        btn_5.setPrefSize(130,70);
        btn_5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                money obj_money = new money();
                obj_money.money(roomStage);
            }
        });
        Button btn_6 = new Button("Lap");
        btn_6.setPrefSize(130,70);
        btn_6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                lap obj_lap = new lap();
                obj_lap.lap(roomStage);
            }
        });
        Button btn_7 = new Button("Registration");
        btn_7.setPrefSize(130,70);
        btn_7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                registration obj_registration = new registration();
                obj_registration.registration(roomStage);
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
        /////////////////////////////////////////////////////////////////////

        ///////////////////////////// Left buttons ////////////////////////////////////
        Button btn_ic = new Button("IC");
        btn_ic.setPrefSize(200,70);
        btn_ic.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ic(content);
            }
        });

        Button btn_surgery = new Button("Surgery");
        btn_surgery.setPrefSize(200,70);
        btn_surgery.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                surgery(content);
            }
        });

        Button btn_room = new Button("Rooms");
        btn_room.setPrefSize(200,70);
        btn_surgery.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                rooms(content);
            }
        });

        Label description = new Label("Select your type of Rooms \nform the left buttons please");
        description.setTextAlignment(TextAlignment.CENTER);
        description.setStyle("-fx-font-family:'Segoe Print';-fx-font-size:38;-fx-font-weight:bolder;");
        ////////////////////////////////////////////////////////////////////////////////


        ///////////////////////// Layouts ///////////////////////////////
        root = new BorderPane();
        FlowPane bar = new FlowPane();
        VBox vbar = new VBox();
        content = new GridPane();


        vbar.getChildren().addAll(btn_ic,btn_surgery,btn_room);
        vbar.setAlignment(Pos.CENTER);

        bar.setPrefSize(150,50);
        bar.getChildren().addAll(btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8);
        bar.setAlignment(Pos.TOP_CENTER);

        content.add(description,2,2);
        content.setAlignment(Pos.CENTER);

        root.setStyle("-fx-background-color:rgb(85, 170, 255);");
        root.setTop(bar);
        root.setLeft(vbar);
        root.setCenter(content);

        roomStage.setScene(new Scene(root, 500, 350));
        roomStage.setFullScreen(true);
        roomStage.show();

    }

    public void ic(GridPane content) {

        content.getChildren().clear();


        content.setAlignment(Pos.CENTER);
        root.setCenter(content);

    }

    public void surgery(GridPane content) {


        content.getChildren().clear();


        content.setAlignment(Pos.CENTER);
        root.setCenter(content);

    }
    public void rooms(GridPane content) {


        content.getChildren().clear();


        content.setAlignment(Pos.CENTER);
        root.setCenter(content);

    }


}

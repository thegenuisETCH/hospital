import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

/**
 * Created by ETCH on 3/10/2017.
 */
public class money {

    BorderPane root;
    GridPane content;

    public void money(final Stage moneyStage) {

        moneyStage.setTitle("Money");



        ////////////////////// Bar buttons ///////////////////////
        Button btn_1 = new Button("Patient");
        btn_1.setPrefSize(130, 70);
        btn_1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                patient obj_patient = new patient();
                obj_patient.patient(moneyStage);
            }
        });
        Button btn_2 = new Button("Clinic");
        btn_2.setPrefSize(130, 70);
        btn_2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                clinic obj_clinic = new clinic();
                obj_clinic.clinic(moneyStage);
            }
        });
        Button btn_3 = new Button("emergency");
        btn_3.setPrefSize(130, 70);
        btn_3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                emergency obj_emergency = new emergency();
                obj_emergency.emergency(moneyStage);
            }
        });
        Button btn_4 = new Button("Rooms");
        btn_4.setPrefSize(130, 70);
        btn_4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                room obj_room = new room();
                obj_room.room(moneyStage);
            }
        });
        Button btn_5 = new Button("Money System");
        btn_5.setPrefSize(130, 70);
        btn_5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                money(moneyStage);
            }
        });
        Button btn_6 = new Button("Lap");
        btn_6.setPrefSize(130, 70);
        btn_6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                lap obj_lap = new lap();
                obj_lap.lap(moneyStage);
            }
        });
        Button btn_7 = new Button("Registration");
        btn_7.setPrefSize(130, 70);
        btn_7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                registration obj_registration = new registration();
                obj_registration.registration(moneyStage);
            }
        });
        Button btn_8 = new Button("Exit");
        btn_8.setPrefSize(130, 70);
        btn_8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.exit(1);
            }
        });
        /////////////////////////////////////////////////////////////////////


        ///////////////////////////// Left buttons ////////////////////////////////////
        Button btn_in = new Button("New Bill");
        btn_in.setPrefSize(200,70);
        btn_in.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                newBill(content);
            }
        });
        Button btn_update = new Button("Update Bill");
        btn_update.setPrefSize(200,70);
        btn_update.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                updateBill(content);
            }
        });
        Button btn_out = new Button("Check Out");
        btn_out.setPrefSize(200,70);
        btn_out.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                checkOut(content);
            }
        });
        Label description = new Label("Select one Operation \nform the left buttons please");
        description.setTextAlignment(TextAlignment.CENTER);
        description.setStyle("-fx-font-family:'Segoe Print';-fx-font-size:38;-fx-font-weight:bolder;");
        ///////////////////////////////////////////////////////////////////////////////////


        ///////////////////////// Layouts ///////////////////////////////
        root = new BorderPane();
        FlowPane bar = new FlowPane();
        VBox vbar = new VBox();
        content = new GridPane();


        vbar.getChildren().addAll(btn_in,btn_update,btn_out);
        vbar.setAlignment(Pos.CENTER);

        bar.setPrefSize(150,50);
        bar.getChildren().addAll(btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8);
        bar.setAlignment(Pos.TOP_CENTER);

        content.add(description,2,2);
        content.setAlignment(Pos.CENTER);


        root.setTop(bar);
        root.setLeft(vbar);
        root.setCenter(content);

        moneyStage.setScene(new Scene(root, 500, 350));
        moneyStage.setFullScreen(true);
        moneyStage.show();


    }

    public void newBill(GridPane content) {


        content.getChildren().clear();


        content.setAlignment(Pos.CENTER);
        root.setCenter(content);

    }
    public void updateBill(GridPane content) {


        content.getChildren().clear();


        content.setAlignment(Pos.CENTER);
        root.setCenter(content);

    }
    public void checkOut(GridPane content) {


        content.getChildren().clear();


        content.setAlignment(Pos.CENTER);
        root.setCenter(content);

    }

}

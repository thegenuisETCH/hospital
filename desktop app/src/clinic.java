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
public class clinic {

    public void clinic(final Stage clinicStage) {

        clinicStage.setTitle("Clinic");

        Button btn_1 = new Button("Patient");
        btn_1.setPrefSize(130,70);
        btn_1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                patient obj_patient = new patient();
                obj_patient.patient(clinicStage);
            }
        });

        Button btn_2 = new Button("Clinic");
        btn_2.setPrefSize(130,70);
        btn_2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                clinic obj_clinic = new clinic();
                obj_clinic.clinic(clinicStage);
            }
        });

        Button btn_3 = new Button("emergency");
        btn_3.setPrefSize(130,70);
        btn_3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                emergency obj_emergency = new emergency();
                obj_emergency.emergency(clinicStage);
            }
        });

        Button btn_4 = new Button("Rooms");
        btn_4.setPrefSize(130,70);
        btn_4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                room obj_room = new room();
                obj_room.room(clinicStage);
            }
        });

        Button btn_5 = new Button("Money System");
        btn_5.setPrefSize(130,70);
        btn_5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                money obj_money = new money();
                obj_money.money(clinicStage);
            }
        });

        Button btn_6 = new Button("Lap");
        btn_6.setPrefSize(130,70);
        btn_6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                lap obj_lap = new lap();
                obj_lap.lap(clinicStage);
            }
        });



        Button btn_7 = new Button("Registration");
        btn_7.setPrefSize(130,70);
        btn_7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                registration obj_registration = new registration();
                obj_registration.registration(clinicStage);
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


        bar.setPrefSize(150,50);
        bar.getChildren().addAll(btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8);
        bar.setAlignment(Pos.TOP_CENTER);
        root.setTop(bar);



        clinicStage.setScene(new Scene(root, 500, 350));
        clinicStage.setFullScreen(true);
        clinicStage.show();


    }


}

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;


/**
 * Created by ETCH on 3/10/2017.
 */
public class registration {

    BorderPane root;
    GridPane content;

    public void registration(final Stage registrationStage) {

        registrationStage.setTitle("Registration");

        ////////////////////// Bar buttons ///////////////////////
        Button btn_1 = new Button("Patient");
        btn_1.setPrefSize(130, 70);
        btn_1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                patient obj_patient = new patient();
                obj_patient.patient(registrationStage);
            }
        });
        Button btn_2 = new Button("Clinic");
        btn_2.setPrefSize(130, 70);
        btn_2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                clinic obj_clinic = new clinic();
                obj_clinic.clinic(registrationStage);
            }
        });
        Button btn_3 = new Button("emergency");
        btn_3.setPrefSize(130, 70);
        btn_3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                emergency obj_emergency = new emergency();
                obj_emergency.emergency(registrationStage);
            }
        });
        Button btn_4 = new Button("Rooms");
        btn_4.setPrefSize(130, 70);
        btn_4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                room obj_room = new room();
                obj_room.room(registrationStage);
            }
        });
        Button btn_5 = new Button("Money System");
        btn_5.setPrefSize(130, 70);
        btn_5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                money obj_money = new money();
                obj_money.money(registrationStage);
            }
        });
        Button btn_6 = new Button("Lap");
        btn_6.setPrefSize(130, 70);
        btn_6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                lap obj_lap = new lap();
                obj_lap.lap(registrationStage);
            }
        });
        Button btn_7 = new Button("Registration");
        btn_7.setPrefSize(130, 70);
        btn_7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                registration(registrationStage);
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


        ////////////////////////// Tree view //////////////////////////////////
        TreeItem<String> registration_type = new TreeItem<String>("Registration types");

        TreeItem<String> stuff = new TreeItem<String>("Stuff");
        TreeItem<String> stuff_in = new TreeItem<String>("Insert new employee");
        TreeItem<String> stuff_update = new TreeItem<String>("Update existing employee");
        TreeItem<String> stuff_delete = new TreeItem<String>("Delete employee");
        stuff.getChildren().addAll(stuff_in, stuff_update, stuff_delete);

        TreeItem<String> patient = new TreeItem<String>("Patient");
        TreeItem<String> patient_in = new TreeItem<String>("Insert new patient");
        TreeItem<String> patient_update = new TreeItem<String>("Update existing patient");
        TreeItem<String> patient_delete = new TreeItem<String>("Delete patient");
        patient.getChildren().addAll(patient_in, patient_update,patient_delete);

        registration_type.getChildren().addAll(stuff,patient);
        registration_type.setExpanded(true);

        TreeView<String> vbar = new TreeView<String>(registration_type);

        Label description = new Label("Select One Registration operation\nform the left buttons please");
        description.setTextAlignment(TextAlignment.CENTER);
        description.setStyle("-fx-font-family:'Segoe Print';-fx-font-size:38;-fx-font-weight:bolder;");

        /////////////////////////////////////////////////////////////////////


        ///////////////////////// Layouts ///////////////////////////////
        root = new BorderPane();
        content = new GridPane();
        FlowPane bar = new FlowPane();

        FlowPane vbar_pane = new FlowPane();

        vbar_pane.getChildren().add(vbar);
        vbar_pane.setPadding(new Insets(30, 10, 0, 0));

        bar.setPrefSize(150, 50);
        bar.getChildren().addAll(btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8);
        bar.setAlignment(Pos.TOP_CENTER);

        content.add(description,2,2);
        content.setAlignment(Pos.CENTER);

        root.setTop(bar);
        root.setLeft(vbar_pane);
        root.setCenter(content);

        registrationStage.setScene(new Scene(root, 500, 350));
        registrationStage.setFullScreen(true);
        registrationStage.show();


    }
    public void insertStuff(GridPane content) {


        content.getChildren().clear();


        content.setAlignment(Pos.CENTER);
        root.setCenter(content);

    }
    public void updateStaff(GridPane content) {


        content.getChildren().clear();


        content.setAlignment(Pos.CENTER);
        root.setCenter(content);

    }
    public void deleteStuff(GridPane content) {


        content.getChildren().clear();


        content.setAlignment(Pos.CENTER);
        root.setCenter(content);

    }
    public void insertPatient(GridPane content) {


        content.getChildren().clear();


        content.setAlignment(Pos.CENTER);
        root.setCenter(content);

    }
    public void updatePatient(GridPane content) {


        content.getChildren().clear();


        content.setAlignment(Pos.CENTER);
        root.setCenter(content);

    }
    public void deletePatient(GridPane content) {


        content.getChildren().clear();


        content.setAlignment(Pos.CENTER);
        root.setCenter(content);

    }


}

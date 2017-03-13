import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

/**
 * Created by ETCH on 3/10/2017.
 */
public class clinic {

    BorderPane root;
    GridPane content;

    public void clinic(final Stage clinicStage) {

        clinicStage.setTitle("Clinic");

        ////////////////////// Bar buttons ///////////////////////
        Button btn_1 = new Button("Patient");
        btn_1.setPrefSize(130, 70);
        btn_1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                patient obj_patient = new patient();
                obj_patient.patient(clinicStage);
            }
        });
        Button btn_2 = new Button("Clinic");
        btn_2.setPrefSize(130, 70);
        btn_2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                clinic obj_clinic = new clinic();
                obj_clinic.clinic(clinicStage);
            }
        });
        Button btn_3 = new Button("emergency");
        btn_3.setPrefSize(130, 70);
        btn_3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                emergency obj_emergency = new emergency();
                obj_emergency.emergency(clinicStage);
            }
        });
        Button btn_4 = new Button("Rooms");
        btn_4.setPrefSize(130, 70);
        btn_4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                room obj_room = new room();
                obj_room.room(clinicStage);
            }
        });
        Button btn_5 = new Button("Money System");
        btn_5.setPrefSize(130, 70);
        btn_5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                money obj_money = new money();
                obj_money.money(clinicStage);
            }
        });
        Button btn_6 = new Button("Lap");
        btn_6.setPrefSize(130, 70);
        btn_6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                lap obj_lap = new lap();
                obj_lap.lap(clinicStage);
            }
        });
        Button btn_7 = new Button("Registration");
        btn_7.setPrefSize(130, 70);
        btn_7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                registration obj_registration = new registration();
                obj_registration.registration(clinicStage);
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

        TreeItem<String> departments = new TreeItem<String>("Root Node");

        TreeItem<String> dep1 = new TreeItem<String>("Departmet 1");
        TreeItem<String> dep2 = new TreeItem<String>("Departmet 2");
        TreeItem<String> dep3 = new TreeItem<String>("Departmet 3");
        departments.getChildren().addAll(dep1, dep2, dep3);

        TreeItem<String> dr1 = new TreeItem<String>("DR 1");
        TreeItem<String> dr2 = new TreeItem<String>("DR 2");
        TreeItem<String> dr3 = new TreeItem<String>("DR 3");
        dep1.getChildren().addAll(dr1,dr2,dr3);

        TreeView<String> vbar = new TreeView<String>(departments);

        Label description = new Label("Select your doctor clinic \nform the left buttons please");
        description.setTextAlignment(TextAlignment.CENTER);
        description.setStyle("-fx-font-family:'Segoe Print';-fx-font-size:38;-fx-font-weight:bolder;");

        /////////////////////////////////////////////////////////////////////


        ///////////////////////// Layouts ///////////////////////////////
        root = new BorderPane();
        FlowPane bar = new FlowPane();
        content = new GridPane();
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


        clinicStage.setScene(new Scene(root, 500, 350));
        clinicStage.setFullScreen(true);
        clinicStage.show();


    }
    public void list(GridPane content) {


        content.getChildren().clear();


        content.setAlignment(Pos.CENTER);
        root.setCenter(content);

    }
    public void booking(GridPane content) {


        content.getChildren().clear();


        content.setAlignment(Pos.CENTER);
        root.setCenter(content);

    }

}

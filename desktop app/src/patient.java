import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * Created by ETCH on 3/8/2017.
 */
public class patient {

    boolean down_flag;
    GridPane down;


    public void patient (final Stage patientStage){

        patientStage.setTitle("Patient");

        ////////////////////// Bar buttons ///////////////////////
        Button btn_1 = new Button("Patient");
        btn_1.setPrefSize(130,70);
        btn_1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                patient(patientStage);
            }
        });
        Button btn_2 = new Button("Clinic");
        btn_2.setPrefSize(130,70);
        btn_2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                clinic obj_clinic = new clinic();
                obj_clinic.clinic(patientStage);
            }
        });
        Button btn_3 = new Button("emergency");
        btn_3.setPrefSize(130,70);
        btn_3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                emergency obj_emergency = new emergency();
                obj_emergency.emergency(patientStage);
            }
        });
        Button btn_4 = new Button("Rooms");
        btn_4.setPrefSize(130,70);
        btn_4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                room obj_room = new room();
                obj_room.room(patientStage);
            }
        });
        Button btn_5 = new Button("Money System");
        btn_5.setPrefSize(130,70);
        btn_5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                money obj_money = new money();
                obj_money.money(patientStage);
            }
        });
        Button btn_6 = new Button("Lap");
        btn_6.setPrefSize(130,70);
        btn_6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                lap obj_lap = new lap();
                obj_lap.lap(patientStage);
            }
        });
        Button btn_7 = new Button("Registration");
        btn_7.setPrefSize(130,70);
        btn_7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                registration obj_registration = new registration();
                obj_registration.registration(patientStage);
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


        TextField input_search;
        TextField id_search;
        down_flag = false;
        Button check = new Button();
        check.setAlignment(Pos.CENTER);
        check.setText("check availbelty");
        check.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                //System.exit(1);
               /* namesearch=input_search.getText();
                idsearch=id_search.getText();
                if(namesearch.equals(databas)|| idsearch.equals(database))
                {
                }*/
               down_flag=true;
               down.setVisible(down_flag);

            }
        });
        Label or = new Label("or");

        Label statment = new Label();
        statment.setText("Search by Patient name Or by Patient number ");
        statment.setPrefWidth(400);
        statment.setStyle(";-fx-font-size:15");
        statment.setAlignment(Pos.CENTER);

        Label Patient_name = new Label();
        Patient_name.setText("Patient Name:");
        Patient_name.setPrefWidth(100);
        Patient_name.setStyle("-fx-font-size:15");

        Label id = new Label();
        id.setText("Patient Number:");
        id.setPrefWidth(120);
        id.setStyle("-fx-font-size:15");


        input_search = new TextField();
        input_search.setPrefSize(150, 20);
        input_search.setPromptText(" Search By name here");
        input_search.setStyle("-fx-border-radius:15px;-fx-background-color:white");

        id_search = new TextField();
        id_search.setPrefSize(150, 20);
        id_search.setPromptText("serach by ID here");
        id_search.setStyle("-fx-border-radius:15px;-fx-background-color:white");


        // Patient_name.setAlignment(Pos.BOTTOM_LEFT);
        // id.setAlignment(Pos.BOTTOM_LEFT);

        //*lama ados 3ala el zorar informat1ion 7atzhar ta7t*/

        /////////////////////////////////////////////////////

        Label f_name = new Label();
        f_name.setText("Full Name:");
        //f_name.setPrefWidth(100);
        f_name.setStyle("-fx-font-size:15");


        Label p_number = new Label();
        p_number.setText("ID Number:");
        p_number.setStyle("-fx-font-size:15");

        Label bod = new Label();
        bod.setText("Age:");
        bod.setStyle("-fx-font-size:15");

        Label gender = new Label();
        gender.setText("Gender:");
        gender.setStyle("-fx-font-size:15");


        Label files = new Label();
        files.setText("Choose file:");

        TextField name= new TextField();
        name.setEditable(false);

        TextField age= new TextField();
        age.setEditable(false);

        TextField id_in= new TextField();
        id_in.setEditable(false);

        TextField gender_in= new TextField();
        gender_in.setEditable(false);


        ///////////////////////// Layouts ///////////////////////////////
        BorderPane root = new BorderPane();
        FlowPane bar = new FlowPane();
        GridPane content = new GridPane();

        HBox slider = new HBox();

        ScrollPane scroll_files = new ScrollPane();
        scroll_files.setHbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        scroll_files.setContent(slider);
        scroll_files.setPrefSize(270,100);

        GridPane up = new GridPane();
        up.setAlignment(Pos.TOP_CENTER);
        up.setVgap(15);
        up.setHgap(15);
        up.add(statment, 3, 1, 7, 1);
        up.add(Patient_name, 2, 2);
        up.add(input_search, 3, 2);
        up.add(or, 4, 2);
        up.add(id, 5, 2);
        up.add(id_search, 6, 2);
        up.add(check, 7, 2);

        down = new GridPane();
        down.add(f_name, 3, 1);
        down.add(name,4,1);
        down.add(p_number, 5, 1);
        down.add(id_in, 6, 1);
        down.add(bod, 3, 2);
        down.add(age, 4, 2);
        down.add(gender, 5, 2);
        down.add(gender_in, 6, 2);
        down.add(files, 3, 3);
        down.add(scroll_files,1,4,6,3);
        down.setAlignment(Pos.CENTER);
        down.setHgap(15);
        down.setVgap(30);
        down.setPadding(new Insets(80, 30, 30, 30));
        down.setVisible(down_flag);

        bar.setPrefSize(150,50);
        bar.getChildren().addAll(btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8);
        bar.setAlignment(Pos.TOP_CENTER);

        content.add(up, 1, 1);
        content.add(down, 1, 2);
        content.setAlignment(Pos.TOP_CENTER);

        root.setTop(bar);
        root.setCenter(content);

        patientStage.setScene(new Scene(root, 500, 350));
        patientStage.setFullScreen(true);
        patientStage.show();

    }

}

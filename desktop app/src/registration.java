import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
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
        Button insert_stuff_btn =new Button("Insert new employee");
        insert_stuff_btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                insertStuff(content);
            }
        });
        Button update_stuff_btn =new Button("Update existing employee");
        update_stuff_btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                updateStuff(content);
            }
        });
        Button delete_stuff_btn =new Button("Delete employee");
        delete_stuff_btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                deleteStuff(content);
            }
        });
        TreeItem stuff_insert_item = new TreeItem(insert_stuff_btn);
        TreeItem stuff_update_item = new TreeItem(update_stuff_btn);
        TreeItem stuff_delete_item = new TreeItem(delete_stuff_btn);
        stuff.getChildren().addAll(stuff_insert_item, stuff_update_item, stuff_delete_item);

        TreeItem<String> patient = new TreeItem<String>("Patient");
        Button insert_patient_btn =new Button("Insert new patient");
        insert_patient_btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                insertPatient(content);
            }
        });
        Button update_patient_btn =new Button("Update existing patient");
        update_patient_btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                updatePatient(content);
            }
        });
        Button delete_patient_btn =new Button("Delete patient");
        delete_patient_btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                deletePatient(content);
            }
        });
        TreeItem patient_insert_item = new TreeItem(insert_patient_btn);
        TreeItem patient_update_item = new TreeItem(update_patient_btn);
        TreeItem patient_delete_item = new TreeItem(delete_patient_btn);
        patient.getChildren().addAll(patient_insert_item, patient_update_item,patient_delete_item);

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
        vbar_pane.setPadding(new Insets(30, 0, 0, 0));

        bar.setPrefSize(150, 50);
        bar.getChildren().addAll(btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8);
        bar.setAlignment(Pos.TOP_CENTER);

        content.add(description,2,2);
        content.setPadding(new Insets(300,0,0,0));



        root.setTop(bar);
        root.setLeft(vbar_pane);
        root.setCenter(content);

        registrationStage.setScene(new Scene(root, 500, 350));
        registrationStage.setFullScreen(true);
        registrationStage.show();


    }
    public void insertStuff(GridPane content) {

        Label id,fname,lname,type,city,address,gender,birthDate,phone,email,password;
        TextField id_in,fname_in,lname_in,city_in,address_in,birthDate_in,phone_in,email_in;
        PasswordField password_in;
        ChoiceBox gender_in,type_in;

        id = new Label("ID");
        id_in=new TextField("Enter ID");
        fname=new Label("First Name");
        fname_in=new TextField("Enter First Name");
        lname = new Label("Last Name");
        lname_in=new TextField("Enter last Name");
        type= new Label("Job Name");
        type_in=new ChoiceBox(FXCollections.observableArrayList("Doctor","Employee"));
        city= new Label("City");
        city_in=new TextField("Enter City");
        address= new Label("Address");
        address_in=new TextField("Enter Address");
        gender= new Label("Gender");
        gender_in=new ChoiceBox(FXCollections.observableArrayList("Male","Female"));
        birthDate = new Label("Birth Date");
        birthDate_in=new TextField("Enter Date of Birth");
        phone= new Label("Phone Number");
        phone_in=new TextField("Enter Phone Number");
        email = new Label("Email");
        email_in=new TextField("Enter email address");
        password= new Label("Password");
        password_in=new PasswordField();

        Button submit=new Button("Submit");
        submit.setPrefSize(300,50);
        submit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {


            }
        });


        content.getChildren().clear();

        content.add(id,0,1);
        content.add(id_in,1,1,3,1);
        content.add(fname,0,2);
        content.add(fname_in,1,2);
        content.add(lname,2,2);
        content.add(lname_in,3,2);
        content.add(type,0,3);
        content.add(type_in,1,3);
        content.add(gender,2,3);
        content.add(gender_in,3,3);
        content.add(city,0,4);
        content.add(city_in,1,4);
        content.add(address,2,4);
        content.add(address_in,3,4);
        content.add(birthDate,0,5);
        content.add(birthDate_in,1,5);
        content.add(phone,2,5);
        content.add(phone_in,3,5);
        content.add(email,0,6);
        content.add(email_in,1,6);
        content.add(password,2,6);
        content.add(password_in,3,6);
        content.add(submit,1,7,2,1);




        content.setVgap(50);
        content.setHgap(50);
        content.setPadding(new Insets(40,0,0,0));

        root.setCenter(content);

    }
    public void updateStuff(GridPane content) {


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

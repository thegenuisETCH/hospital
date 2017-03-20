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
    boolean down_flag,edit_flag;
    GridPane down;
    TextField id_in,fname_in, lname_in, city_in, address_in, birthDate_in, phone_in, email_in;
    PasswordField password_in;
    ComboBox gender_in, type_in;

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
        Button insert_stuff_btn = new Button("Insert new employee");
        insert_stuff_btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                insertStuff(content);
            }
        });
        Button update_stuff_btn = new Button("Update existing employee");
        update_stuff_btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                updateStuff(content);
            }
        });
        Button delete_stuff_btn = new Button("Delete employee");
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
        Button insert_patient_btn = new Button("Insert new patient");
        insert_patient_btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                insertPatient(content);
            }
        });
        Button update_patient_btn = new Button("Update existing patient");
        update_patient_btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                updatePatient(content);
            }
        });
        Button delete_patient_btn = new Button("Delete patient");
        delete_patient_btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                deletePatient(content);
            }
        });
        TreeItem patient_insert_item = new TreeItem(insert_patient_btn);
        TreeItem patient_update_item = new TreeItem(update_patient_btn);
        TreeItem patient_delete_item = new TreeItem(delete_patient_btn);
        patient.getChildren().addAll(patient_insert_item, patient_update_item, patient_delete_item);

        registration_type.getChildren().addAll(stuff, patient);
        registration_type.setExpanded(true);

        TreeView<String> vbar = new TreeView<String>(registration_type);
        vbar.setPrefWidth(300);

        Label description = new Label("Select One Registration operation\nform the left buttons please");
        description.setTextAlignment(TextAlignment.CENTER);
        description.setStyle("-fx-font-family:'Segoe Print';-fx-font-size:38;-fx-font-weight:bolder;");
        description.setPadding(new Insets(300, 0, 0, 0));

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
        bar.setPadding(new Insets(0,0,30,0));

        content.add(description, 2, 2);


        root.setTop(bar);
        root.setLeft(vbar_pane);
        root.setCenter(content);

        registrationStage.setScene(new Scene(root, 500, 350));
        registrationStage.setFullScreen(true);
        registrationStage.show();


    }

    public void insertStuff(GridPane content) {

        Label id, fname, lname, type, city, address, gender, birthDate, phone, email, password;

        id = new Label("ID");
        id_in = new TextField();
        id_in.setPromptText("Enter ID");

        fname = new Label("First Name");
        fname_in = new TextField();
        fname_in.setPromptText("Enter First Name");

        lname = new Label("Last Name");
        lname_in = new TextField();
        lname_in.setPromptText("Enter last Name");

        type = new Label("Job Name");
        type_in = new ComboBox(FXCollections.observableArrayList("Doctor", "Employee"));

        address = new Label("Address");
        address_in = new TextField();
        address_in.setPromptText("Enter Address");

        gender = new Label("Gender");
        gender_in = new ComboBox(FXCollections.observableArrayList("Male", "Female"));

        birthDate = new Label("Birth Date");
        birthDate_in = new TextField();
        birthDate_in.setPromptText("Enter Date of Birth");

        phone = new Label("Phone Number");
        phone_in = new TextField();
        phone_in.setPromptText("Enter Phone Number");

        email = new Label("Email");
        email_in = new TextField();
        email_in.setPromptText("Enter email address");

        password = new Label("Password");
        password_in = new PasswordField();
        password_in.setPromptText("Enter you Password");

        Button submit = new Button("Submit");
        submit.setPrefSize(300, 50);
        submit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {


            }
        });

        Label description = new Label("Insert New stuff");
        description.setStyle("-fx-font-family:'Segoe Print';-fx-font-size:28;-fx-font-weight:bolder;");
        description.setTextAlignment(TextAlignment.CENTER);


        content.getChildren().clear();

        content.add(description, 2, 0,3,1);
        content.add(id, 1, 1);
        content.add(id_in, 2, 1, 3, 1);
        content.add(fname, 1, 2);
        content.add(fname_in, 2, 2);
        content.add(lname, 3, 2);
        content.add(lname_in, 4, 2);
        content.add(type, 1, 3);
        content.add(type_in, 2, 3);
        content.add(gender, 3, 3);
        content.add(gender_in, 4, 3);
        content.add(address, 1, 4);
        content.add(address_in, 2, 4, 3, 1);
        content.add(birthDate, 1, 5);
        content.add(birthDate_in, 2, 5);
        content.add(phone, 3, 5);
        content.add(phone_in, 4, 5);
        content.add(email, 1, 6);
        content.add(email_in, 2, 6);
        content.add(password, 3, 6);
        content.add(password_in, 4, 6);
        content.add(submit, 2, 7, 2, 1);


        content.setVgap(30);
        content.setHgap(30);
        content.setAlignment(Pos.TOP_LEFT);

        root.setCenter(content);

    }

    public void updateStuff(GridPane content) {

        Label fname, lname, type, city, address, gender, birthDate, phone, email, password;
        edit_flag=false;

        fname = new Label("First Name");
        fname_in = new TextField();
        fname_in.setPromptText("Enter First Name");
        fname_in.setEditable(edit_flag);

        lname = new Label("Last Name");
        lname_in = new TextField();
        lname_in.setPromptText("Enter last Name");
        lname_in.setEditable(edit_flag);

        type = new Label("Job Name");
        type_in = new ComboBox(FXCollections.observableArrayList("Doctor", "Employee"));
        type_in.setDisable(!edit_flag);

        address = new Label("Address");
        address_in = new TextField();
        address_in.setPromptText("Enter Address");
        address_in.setEditable(edit_flag);

        gender = new Label("Gender");
        gender_in = new ComboBox(FXCollections.observableArrayList("Male", "Female"));
        gender_in.setDisable(!edit_flag);

        birthDate = new Label("Birth Date");
        birthDate_in = new TextField();
        birthDate_in.setPromptText("Enter Date of Birth");
        birthDate_in.setEditable(edit_flag);

        phone = new Label("Phone Number");
        phone_in = new TextField();
        phone_in.setPromptText("Enter Phone Number");
        phone_in.setEditable(edit_flag);

        email = new Label("Email");
        email_in = new TextField();
        email_in.setPromptText("Enter email address");
        email_in.setEditable(edit_flag);

        password = new Label("Password");
        password_in = new PasswordField();
        password_in.setPromptText("Enter you Password");
        password_in.setEditable(edit_flag);

        Button update = new Button("Update");
        update.setPrefSize(300, 50);
        update.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {


            }
        });
        Button edit = new Button("Edit");
        edit.setPrefSize(300, 50);
        edit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                edit_flag=true;
                fname_in.setEditable(edit_flag);
                lname_in.setEditable(edit_flag);
                type_in.setDisable(!edit_flag);
                address_in.setEditable(edit_flag);
                gender_in.setDisable(!edit_flag);
                birthDate_in.setEditable(edit_flag);
                phone_in.setEditable(edit_flag);
                email_in.setEditable(edit_flag);
                password_in.setEditable(edit_flag);
            }
        });
    ////////////////////////////////////////////////////////////////////////

        down_flag = false;

        Button check = new Button("check availbelty");
        check.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                down_flag = true;
                down.setVisible(down_flag);
            }
        });

        Label or = new Label("or");
        Label statment = new Label("Search by employee name Or by employee ID ");
        statment.setStyle("-fx-font-family:'Segoe Print';-fx-font-size:28;-fx-font-weight:bolder;");



        Label Patient_name = new Label("employee Name:");
        Patient_name.setStyle("-fx-font-size:15");

        Label id = new Label("employee ID:");
        id.setStyle("-fx-font-size:15");

        TextField input_search = new TextField();
        input_search.setPromptText(" Search By name here");
        input_search.setStyle("-fx-border-radius:15px;-fx-background-color:white");

        TextField id_search = new TextField();
        id_search.setPromptText("serach by ID here");
        id_search.setStyle("-fx-border-radius:15px;-fx-background-color:white");
        ///////////////////////////////////////////////////////////////

        content.getChildren().clear();


        GridPane up = new GridPane();
        up.setVgap(30);
        up.setHgap(30);
        up.add(statment, 1, 1, 6, 1);
        up.add(Patient_name, 1, 2);
        up.add(input_search, 2, 2);
        up.add(or, 3, 2);
        up.add(id, 4, 2);
        up.add(id_search, 5, 2);
        up.add(check, 6, 2);
        up.setAlignment(Pos.TOP_CENTER);


        down = new GridPane();
        down.add(fname, 1, 1);
        down.add(fname_in, 2, 1);
        down.add(lname, 3, 1);
        down.add(lname_in, 4, 1);
        down.add(type, 1, 2);
        down.add(type_in, 2, 2);
        down.add(gender, 3, 2);
        down.add(gender_in, 4, 2);
        down.add(address, 1, 3);
        down.add(address_in, 2, 3, 3, 1);
        down.add(birthDate, 1, 4);
        down.add(birthDate_in, 2, 4);
        down.add(phone, 3, 4);
        down.add(phone_in, 4, 4);
        down.add(email, 1, 5);
        down.add(email_in, 2, 5);
        down.add(password, 3, 5);
        down.add(password_in, 4, 5);
        down.add(update, 1, 6, 2, 1);
        down.add(edit, 3, 6, 2, 1);
        down.setVgap(30);
        down.setHgap(30);
        down.setAlignment(Pos.TOP_LEFT);
        down.setVisible(down_flag);

        content.add(up, 1, 1);
        content.add(down, 1, 2);

        root.setCenter(content);

    }

    public void deleteStuff(GridPane content) {


        Button check = new Button("Check Availbelty");
        check.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                down_flag = true;
                down.setVisible(down_flag);
            }
        });

        Label or = new Label("or");
        Label statment = new Label("Search by Employee name Or by Employee ID ");
        statment.setStyle("-fx-font-family:'Segoe Print';-fx-font-size:28;-fx-font-weight:bolder;");



        Label Patient_name = new Label("Employee Name:");
        Patient_name.setStyle("-fx-font-size:15");

        Label id = new Label("Employee ID:");
        id.setStyle("-fx-font-size:15");

        TextField input_search = new TextField();
        input_search.setPromptText(" Search By name here");
        input_search.setStyle("-fx-border-radius:15px;-fx-background-color:white");

        TextField id_search = new TextField();
        id_search.setPromptText("serach by ID here");
        id_search.setStyle("-fx-border-radius:15px;-fx-background-color:white");

        Label response_db = new Label();
        response_db.setStyle("-fx-font-family:'Segoe Print';-fx-font-size:28;-fx-font-weight:bolder;");
        response_db.setPadding(new Insets(100,0,0,0));
        ///////////////////////////////////////////////////////////////

        content.getChildren().clear();


        GridPane up = new GridPane();
        up.setVgap(30);
        up.setHgap(30);
        up.add(statment, 1, 1, 6, 1);
        up.add(Patient_name, 1, 2);
        up.add(input_search, 2, 2);
        up.add(or, 3, 2);
        up.add(id, 4, 2);
        up.add(id_search, 5, 2);
        up.add(check, 6, 2);
        up.setAlignment(Pos.TOP_CENTER);

        down = new GridPane();
        down.add(response_db,2,2);
        down.setVisible(down_flag);
        down.setAlignment(Pos.CENTER);

        content.add(up, 1, 1);
        content.add(down, 1, 2);

        root.setCenter(content);

    }

    public void insertPatient(GridPane content) {


        Label id, fname, lname, type, city, address, gender, birthDate, phone, email, password;


        id = new Label("ID");
        id_in = new TextField();
        id_in.setPromptText("Enter ID");

        fname = new Label("First Name");
        fname_in = new TextField();
        fname_in.setPromptText("Enter First Name");

        lname = new Label("Last Name");
        lname_in = new TextField();
        lname_in.setPromptText("Enter last Name");

        address = new Label("Address");
        address_in = new TextField();
        address_in.setPromptText("Enter Address");

        gender = new Label("Gender");
        gender_in = new ComboBox(FXCollections.observableArrayList("Male", "Female"));

        birthDate = new Label("Birth Date");
        birthDate_in = new TextField();
        birthDate_in.setPromptText("Enter Date of Birth");

        phone = new Label("Phone Number");
        phone_in = new TextField();
        phone_in.setPromptText("Enter Phone Number");

        email = new Label("Email");
        email_in = new TextField();
        email_in.setPromptText("Enter email address");

        password = new Label("Password");
        password_in = new PasswordField();
        password_in.setPromptText("Enter you Password");


        Button submit = new Button("Submit");
        submit.setPrefSize(300, 50);
        submit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {


            }
        });

        Label description = new Label("Insert New stuff");
        description.setStyle("-fx-font-family:'Segoe Print';-fx-font-size:28;-fx-font-weight:bolder;");
        description.setTextAlignment(TextAlignment.CENTER);


        content.getChildren().clear();

        content.add(description, 2, 0,3,1);
        content.add(id, 0, 1);
        content.add(id_in, 1, 1, 3, 1);
        content.add(fname, 0, 2);
        content.add(fname_in, 1, 2);
        content.add(lname, 2, 2);
        content.add(lname_in, 3, 2);
        content.add(gender, 2, 3);
        content.add(gender_in, 3, 3);
        content.add(address, 0, 3);
        content.add(address_in, 1, 3);
        content.add(birthDate, 0, 4);
        content.add(birthDate_in, 1, 4);
        content.add(phone, 2, 4);
        content.add(phone_in, 3, 4);
        content.add(email, 0, 5);
        content.add(email_in, 1, 5);
        content.add(password, 2, 5);
        content.add(password_in, 3, 5);
        content.add(submit, 1, 6, 2, 1);


        content.setVgap(30);
        content.setHgap(30);
        content.setPadding(new Insets(40, 0, 0, 0));

        root.setCenter(content);

    }

    public void updatePatient(GridPane content) {

        Label fname, lname, city, address, gender, birthDate, phone, email, password;
        edit_flag=false;

        fname = new Label("First Name");
        fname_in = new TextField();
        fname_in.setPromptText("Enter First Name");
        fname_in.setEditable(edit_flag);

        lname = new Label("Last Name");
        lname_in = new TextField();
        lname_in.setPromptText("Enter last Name");
        lname_in.setEditable(edit_flag);

        address = new Label("Address");
        address_in = new TextField();
        address_in.setPromptText("Enter Address");
        address_in.setEditable(edit_flag);

        gender = new Label("Gender");
        gender_in = new ComboBox(FXCollections.observableArrayList("Male", "Female"));
        gender_in.setDisable(!edit_flag);

        birthDate = new Label("Birth Date");
        birthDate_in = new TextField();
        birthDate_in.setPromptText("Enter Date of Birth");
        birthDate_in.setEditable(edit_flag);

        phone = new Label("Phone Number");
        phone_in = new TextField();
        phone_in.setPromptText("Enter Phone Number");
        phone_in.setEditable(edit_flag);

        email = new Label("Email");
        email_in = new TextField();
        email_in.setPromptText("Enter email address");
        email_in.setEditable(edit_flag);

        password = new Label("Password");
        password_in = new PasswordField();
        password_in.setPromptText("Enter you Password");
        password_in.setEditable(edit_flag);

        Button update = new Button("Update");
        update.setPrefSize(300, 50);
        update.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {


            }
        });
        Button edit = new Button("Edit");
        edit.setPrefSize(300, 50);
        edit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                edit_flag=true;
                fname_in.setEditable(edit_flag);
                lname_in.setEditable(edit_flag);
                address_in.setEditable(edit_flag);
                gender_in.setDisable(!edit_flag);
                birthDate_in.setEditable(edit_flag);
                phone_in.setEditable(edit_flag);
                email_in.setEditable(edit_flag);
                password_in.setEditable(edit_flag);
            }
        });
        ////////////////////////////////////////////////////////////////////////

        down_flag = false;

        Button check = new Button("check availbelty");
        check.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                down_flag = true;
                down.setVisible(down_flag);
            }
        });

        Label or = new Label("or");
        Label statment = new Label("Search by Patient name Or by Patient ID ");
        statment.setStyle("-fx-font-family:'Segoe Print';-fx-font-size:28;-fx-font-weight:bolder;");



        Label Patient_name = new Label("Patient Name:");
        Patient_name.setStyle("-fx-font-size:15");

        Label id = new Label("Patient ID:");
        id.setStyle("-fx-font-size:15");

        TextField input_search = new TextField();
        input_search.setPromptText(" Search By name here");
        input_search.setStyle("-fx-border-radius:15px;-fx-background-color:white");

        TextField id_search = new TextField();
        id_search.setPromptText("serach by ID here");
        id_search.setStyle("-fx-border-radius:15px;-fx-background-color:white");
        ///////////////////////////////////////////////////////////////

        content.getChildren().clear();


        GridPane up = new GridPane();
        up.setVgap(30);
        up.setHgap(30);
        up.add(statment, 1, 1, 6, 1);
        up.add(Patient_name, 1, 2);
        up.add(input_search, 2, 2);
        up.add(or, 3, 2);
        up.add(id, 4, 2);
        up.add(id_search, 5, 2);
        up.add(check, 6, 2);
        up.setAlignment(Pos.TOP_CENTER);


        down = new GridPane();
        down.add(fname, 1, 1);
        down.add(fname_in, 2, 1);
        down.add(lname, 3, 1);
        down.add(lname_in, 4, 1);
        down.add(address, 1, 2);
        down.add(address_in, 2, 2);
        down.add(gender, 3, 2);
        down.add(gender_in, 4, 2);
        down.add(birthDate, 1, 4);
        down.add(birthDate_in, 2, 4);
        down.add(phone, 3, 4);
        down.add(phone_in, 4, 4);
        down.add(email, 1, 5);
        down.add(email_in, 2, 5);
        down.add(password, 3, 5);
        down.add(password_in, 4, 5);
        down.add(update, 1, 6, 2, 1);
        down.add(edit, 3, 6, 2, 1);
        down.setVgap(30);
        down.setHgap(30);
        down.setAlignment(Pos.TOP_LEFT);
        down.setVisible(down_flag);

        content.add(up, 1, 1);
        content.add(down, 1, 2);

        root.setCenter(content);

    }

    public void deletePatient(GridPane content) {


        Button check = new Button("Check Availbelty");
        check.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                down_flag = true;
                down.setVisible(down_flag);
            }
        });

        Label or = new Label("or");
        Label statment = new Label("Search by Patient name Or by Patient ID ");
        statment.setStyle("-fx-font-family:'Segoe Print';-fx-font-size:28;-fx-font-weight:bolder;");



        Label Patient_name = new Label("Patient Name:");
        Patient_name.setStyle("-fx-font-size:15");

        Label id = new Label("Patient ID:");
        id.setStyle("-fx-font-size:15");

        TextField input_search = new TextField();
        input_search.setPromptText(" Search By name here");
        input_search.setStyle("-fx-border-radius:15px;-fx-background-color:white");

        TextField id_search = new TextField();
        id_search.setPromptText("serach by ID here");
        id_search.setStyle("-fx-border-radius:15px;-fx-background-color:white");

        Label response_db = new Label();
        response_db.setStyle("-fx-font-family:'Segoe Print';-fx-font-size:28;-fx-font-weight:bolder;");
        response_db.setPadding(new Insets(100,0,0,0));
        ///////////////////////////////////////////////////////////////

        content.getChildren().clear();


        GridPane up = new GridPane();
        up.setVgap(30);
        up.setHgap(30);
        up.add(statment, 1, 1, 6, 1);
        up.add(Patient_name, 1, 2);
        up.add(input_search, 2, 2);
        up.add(or, 3, 2);
        up.add(id, 4, 2);
        up.add(id_search, 5, 2);
        up.add(check, 6, 2);
        up.setAlignment(Pos.TOP_CENTER);

        down = new GridPane();
        down.add(response_db,2,2);
        down.setVisible(down_flag);
        down.setAlignment(Pos.CENTER);

        content.add(up, 1, 1);
        content.add(down, 1, 2);

        root.setCenter(content);

    }


}

/**
 * Created by ETCH on 3/5/2017.
 */
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class home{

    static void home (Stage homeStage){

        homeStage.setTitle("Home");


        Button btn_1 = new Button();
        btn_1.setPrefWidth(650);
        btn_1.setPrefHeight(175);
        btn_1.setStyle("-fx-background-image:url('pic/1.jpg');");

        Button btn_2 = new Button();
        btn_2.setPrefWidth(650);
        btn_2.setPrefHeight(175);
        btn_2.setStyle("-fx-background-image:url('pic/2.jpg');");

        Button btn_3 = new Button();
        btn_3.setPrefWidth(650);
        btn_3.setPrefHeight(174);
        btn_3.setStyle("-fx-background-image:url('pic/3.jpg');");

        Button btn_4 = new Button();
        btn_4.setPrefWidth(650);
        btn_4.setPrefHeight(174);
        btn_4.setStyle("-fx-background-image:url('pic/4.jpg');");

        Button btn_5 = new Button();
        btn_5.setPrefWidth(650);
        btn_5.setPrefHeight(182);
        btn_5.setStyle("-fx-background-image:url('pic/5.jpg');");

        Button btn_6 = new Button();
        btn_6.setPrefWidth(650);
        btn_6.setPrefHeight(182);
        btn_6.setStyle("-fx-background-image:url('pic/6.jpg');");

        Button btn_7 = new Button();
        btn_7.setPrefWidth(1300);
        btn_7.setPrefHeight(119);
        btn_7.setStyle("-fx-background-image:url('pic/7.jpg');");
        btn_7.setDisable(true);


        GridPane root= new GridPane();
        root.setStyle("-fx-background-color:rgb(85, 170, 255);");
        root.setPadding(new Insets(30, 30, 5, 30));
        root.setVgap(4);
        root.setHgap(4);

        root.add(btn_1,1,1);
        root.add(btn_2,2,1);
        root.add(btn_3,1,2);
        root.add(btn_4,2,2);
        root.add(btn_5,1,3);
        root.add(btn_6,2,3);
        root.add(btn_7,1,4,2,1);

        homeStage.setScene(new Scene(root ,800,800));
        homeStage.setFullScreen(true);
        homeStage.setMinWidth(1280);
        homeStage.setMinHeight(768);
        homeStage.show();

    }

}

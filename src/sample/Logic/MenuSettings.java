package sample.Logic;

import javafx.embed.swing.SwingFXUtils;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by jam on 9/1/16.
 */
public class MenuSettings {

    public boolean clicked = false;



    public  void display() throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/sample/FXML_S/settings.fxml"));

        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Settings");
        window.setMinWidth(600);
        window.setMinHeight(450);
        Button toClose = new Button("Close");
        toClose.setOnAction(e -> window.close());


        BorderPane layout = new BorderPane();
        Scene scene = new Scene(root);
        window.setScene(scene);
        window.setResizable(false);
        window.show();
        // layout.setCenter(addGrid());

    }
}


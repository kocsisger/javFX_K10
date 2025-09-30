package org.example;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.example.model.Model;
import org.example.model.Submodel;

public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        var loader = new FXMLLoader(getClass().getResource("main.fxml"));
        var scene = new Scene(loader.load());
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

        Model model = new Model();
        MainController controller = ((MainController)loader.getController());
        controller.setModel(model);

        stage.setScene(scene);
        stage.setTitle("New title added");
        //Super commentsgsdhsdghsdsfhd
        stage.show();
    }

}

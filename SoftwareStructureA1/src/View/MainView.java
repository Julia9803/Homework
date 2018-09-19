package View;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class MainView extends Stage {
    @FXML VBox root;

    public MainView() throws IOException {
        root = FXMLLoader.load(getClass().getResource("../resources/fxml/MainView.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("../resources/css/MainView.css").toExternalForm());
        scene.setFill(Color.TRANSPARENT);
        this.setScene(scene);
        this.initStyle(StageStyle.DECORATED);
        this.show();
    }
}
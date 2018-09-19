import View.MainView;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {

        Platform.runLater(() -> {
            try {
                new MainView();

            } catch (Exception e) {
                e.printStackTrace();
            }
        });

    }

}

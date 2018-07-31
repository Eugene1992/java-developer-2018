import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        /*primaryStage.setTitle("App v1.0");

        Button btn = new Button();
        Text textField = new Text();
        btn.setText("Touch me");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textField.setText("You touch me tralala!");
            }
        });

        BorderPane root = new BorderPane();
        root.setTop(textField);
        root.setCenter(btn);

        primaryStage.setScene(new Scene(root, 300, 250));

        primaryStage.show();*/

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}

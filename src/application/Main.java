package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import view.CalculatorGUI;
import controler.CalculatorControler;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            // 1. Create the view (loads FXML)
            CalculatorGUI view = new CalculatorGUI();

            // 2. Create the controller and wire events
            CalculatorControler controller = new CalculatorControler(view);

            // 3. Set the scene using the view as root
            Scene scene = new Scene(view, 268, 422);

            // 4. Optional: add stylesheet
            System.out.println("CSS path: " + getClass().getResource("application.css"));
            //scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

            // 5. Show the stage
            primaryStage.setScene(scene);
            primaryStage.setTitle("Calculator");
            primaryStage.show();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}

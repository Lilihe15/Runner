
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;




public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("Runner Project");
        Group root = new Group();
        Pane pane = new Pane(root);
        //Scene theScene = new Scene(pane, 1600, 600,true);
        GameScene theScene = new GameScene(pane, 1600, 600,true);
        primaryStage.setScene(theScene);
        primaryStage.show();


    }

    public static void main(String[] args) {
        launch(args);
    }
}

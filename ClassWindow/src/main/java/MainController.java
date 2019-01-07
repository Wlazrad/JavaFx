import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {


    public void onAction1(ActionEvent actionEvent) throws IOException {
        Stage stage1 = new Stage();
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("Dialogs1.fxml"));
        Pane pane = loader.load();
        Scene scene = new Scene(pane);
        stage1.setScene(scene);

        stage1.setTitle("ClassWindow");
        stage1.show();

    }

    public void onAction2(ActionEvent actionEvent) {


    }

    public void onAction3(ActionEvent actionEvent) {


    }
}

package aplicacion;
import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.fxml.*;

public class Main extends Application {

	private AnchorPane miPanel;

	@Override
	public void start(Stage primaryStage) throws Exception {
	
		FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginJFoenix.fxml"));	
		miPanel = (AnchorPane) loader.load();
		primaryStage.setTitle("Login");
		primaryStage.setScene(new Scene(miPanel));
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}

}


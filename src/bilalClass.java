

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class bilalClass extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		Button btn=new Button("Hello");
		Scene scene = new Scene(btn);
		stage.setScene(scene);
		stage.show();
		
	
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}

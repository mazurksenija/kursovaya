package ClientWork;

import connect.Connect;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

//client


public class Client extends Application {
public static Network network;

    public Client(){ network = new Network(new Connect("127.0.0.1", 1025));}

    @Override
    public void start(Stage stage) throws IOException {

      //  Parent root = FXMLLoader.load(Client.getClass().getResource("LogIn.fxml"));
        FXMLLoader fxmlLoader = new FXMLLoader(Client.class.getResource("/LogIn.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);


     //   Scene scene = new Scene(root,800,600);
        stage.setScene(scene);
        stage.show();
    }



    public static void main(String[] args) {
        Application.launch(args);
    }


}

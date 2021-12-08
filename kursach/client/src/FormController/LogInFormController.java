package FormController;


import java.io.IOException;

import java.util.Objects;


import ClientWork.Client;
import ClientWork.Network;
import connect.Connect;
import entities.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.control.Button;

import javafx.scene.control.TextField;

import javafx.scene.layout.AnchorPane;


import javax.swing.JOptionPane;


public class LogInFormController  {

    @FXML
    private AnchorPane rootPane;


    @FXML
    private TextField txt_login;

    @FXML
    private TextField txt_password;

    @FXML
  private Button btnSignIn;

//private final Network network;





    public LogInFormController() {
    //  this.network = new Network(new Connect("127.0.0.1", 1025));
    }



    public void Login(ActionEvent event) throws IOException {



      User user= Client.network.searchLogin("login", txt_login.getText().trim(), txt_password.getText().trim());

        if (!user.equals(new User(0, "", "",""))) {

       if(Objects.equals(user.getStatus(), "admin"))
       {    JOptionPane.showMessageDialog(null, "Вы успешно зашли как Админ!");
           AnchorPane pane=  FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/Kursach.fxml")));

           rootPane.getChildren().setAll(pane);}

       else {
           JOptionPane.showMessageDialog(null, "Вы успешно зашли как Пользователь!");
           AnchorPane pane=  FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/User.fxml")));

           rootPane.getChildren().setAll(pane);

       }


        } else {
            JOptionPane.showMessageDialog(null, "Такой пользователь не найден! Повторите ввод!");

        }



    }

    public void registration(ActionEvent event) throws IOException {

        Client.network.sendUser("add_user","0", txt_login.getText().trim(), txt_password.getText().trim(), "user");
        txt_login.setText("");
        txt_password.setText("");



    }


}
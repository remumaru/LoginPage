package sample;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class Controller {

    @FXML
    private Text error_Msg;

    @FXML
    private Label label;

    @FXML
    private AnchorPane background;

    @FXML
    public TextField username_field;

    @FXML
    public PasswordField password_field;

    @FXML
    private Button login_button;

    @FXML
    private Button register_button;

    @FXML
    private ToggleButton theme_toggle;

    @FXML
    void initialize() {
        theme_toggle.setOnAction(event -> {
            if (theme_toggle.isSelected()) {
                background.setStyle("-fx-background-color: #3a4147");
                label.setStyle("-fx-text-fill: #dedfe0");
                username_field.setStyle("-fx-background-color: #232e3c; -fx-alignment: center; -fx-text-fill: #f1f2f3");
                login_button.setStyle("-fx-background-color: #232e3c; -fx-text-fill: #dedfe0");
                register_button.setStyle("-fx-background-color: #232e3c; -fx-text-fill: #dedfe0");
                theme_toggle.setStyle("-fx-background-color: #232e3c; -fx-text-fill: #dedfe0");
                password_field.setStyle("-fx-background-color: #232e3c; -fx-alignment: center; -fx-text-fill: #f1f2f3");
            }
            else {
                background.setStyle("-fx-background-color: #ffffff");
                label.setStyle("");
                username_field.setStyle("-fx-alignment: center; -fx-background-color: #e3e3e3");
                login_button.setStyle("-fx-background-color: #e3e3e3");
                register_button.setStyle("-fx-background-color: #e3e3e3");
                theme_toggle.setStyle("-fx-background-color: #e3e3e3");
                password_field.setStyle("-fx-alignment: center; -fx-background-color: #e3e3e3");
            }
        });
        register_button.setOnAction(event -> {
            if (!(password_field.getText().equals("") || username_field.getText().equals(""))) {
                error_Msg.setText("Successfully Registered");
            }
            else {
                error_Msg.setText("Username or Password field is empty");
            }
        });
    }
}

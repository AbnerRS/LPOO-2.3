package javafx;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class SegundaTela extends Application {

    public static Stage stage;
    public static String link;

    public SegundaTela(String valor) {
        this.link = valor;
    }

    public static void main(String[] args) {
        Application.launch(MainView.class);
    }



    @Override
    public void start(Stage primaryStage) throws Exception {
        // TODO Auto-generated method stub

        Parent root = FXMLLoader.load(getClass().getResource(link));

        Scene scene = new Scene(root);

        SegundaTela.stage = primaryStage;
        stage.setScene(scene);
        stage.setTitle("Login");
        stage.show();
    }

//    /
//     * @return the link
//     */
    public String getLink() {
        return link;
    }

//    /
//     * @param link
//     *            the link to set
//     */
    public void setLink(String link) {
        this.link = link;
    }

}

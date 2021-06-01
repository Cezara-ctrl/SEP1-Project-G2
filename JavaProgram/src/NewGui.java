import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.stage.Window;

public class NewGui extends Application
{
  private Scene scene;

  public void start(Stage stage) throws Exception
  {
    try
    {

      stage.setTitle("ViaClub");
      BorderPane pane = new BorderPane();
      final Menu file = new Menu("File");
      final Menu about = new Menu("About");
      final Menu exit = new Menu("Exit");
      BorderPane tabLayout = new BorderPane();
      // tabs
      TabPane tabPane = new TabPane();
      tabPane.setTabClosingPolicy(TabPane.TabClosingPolicy.UNAVAILABLE);

      Tab tab1 = new Tab("Players", new Label("Player class"));
      Tab tab2 = new Tab("Matches"  , new Label("Matches class"));
        Tab tab3 = new Tab("Info" , new Label("About Via club"));

      tabPane.getTabs().add(tab1);
      tabPane.getTabs().add(tab2);
      tabPane.getTabs().add(tab3);


      MenuBar menu = new MenuBar();
      menu.getMenus().addAll(file, about, exit);
      pane.setTop(menu);
      pane.setLeft(tabPane);
      scene = new Scene(pane,500,500);












      stage.setScene(scene);
      stage.show();
    }
    catch (Exception e){
      e.printStackTrace();
    }
  }


}
 class Test2{
  public static void main(String[] args)
  {
    Application.launch(NewGui.class);
  }
}

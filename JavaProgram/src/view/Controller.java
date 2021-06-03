package view;

import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import model.Player;
import model.VIAClubModelManager;

import java.util.ArrayList;

public class Controller
{
  private Button savePlayerButton;
  private Button removePlayerButton;
  private Button saveChangesButton;

  private TextField nameField;
  private TextField numberField;
  private TextField suspensionField;
  private TextArea allPlayersArea;

  private ComboBox<String> positionBox;
  private ComboBox<String> removePlayerBox;

  private Pane playersPane;
  private Pane matchesPane;

  private Button playersTab;
  private Button matchesTab;

  private VIAClubModelManager manager;

  public void initialize()
  {
    manager = new VIAClubModelManager("players.bin", "matches.bin");
    loadPlayersPane();
    loadMatchesPane();
  }

  public void loadPlayersPane()
  {
    playersPane.setVisible(true);
    matchesPane.setVisible(false);
    playersTab.setStyle("-fx-background-color: #000037;-fx-font-size: 24px;fx-font-weight: bold;");
    matchesTab.setStyle("-fx-background-color: #12123A;-fx-font-size: 24px;fx-font-weight: bold;");
  }

  public void loadMatchesPane()
  {
    playersPane.setVisible(false);
    matchesPane.setVisible(true);
    playersTab.setStyle("-fx-background-color: #12123A;-fx-font-size: 24px;fx-font-weight: bold;");
    matchesTab.setStyle("-fx-background-color: #000037;-fx-font-size: 24px;fx-font-weight: bold;");
  }

  public void addPlayer()
  {
    if(manager.getPlayer(numberField.getText()) == null)
    {
      Player newPlayer = new Player(nameField.getText(),numberField.getText(),positionBox.getSelectionModel().getSelectedItem(),suspensionField.getText());
      nameField.clear();
      numberField.clear();
      suspensionField.clear();

      manager.savePlayers("players.bin", newPlayer);
      messageInformation("Member Added");
    }
    else
    {
      messageWarning("A players with this number already exists");
    }
  }












}

package view;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.media.MediaException;
import model.Date;
import model.Match;
import model.Player;
import model.VIAClubModelManager;

import java.util.ArrayList;

public class Controller
{
  /**
   * controls for players tab
   */
  private Button savePlayerButton;
  private Button removePlayerButton;
  private Button saveChangesForPlayersButton;

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

  /**
   * controls for matches tab
   */
  public Button removeMatchButton;
  public Button saveMatchesButton;
  public Button saveAllChangesForMatchesButton;
  public Button updateMatches;

  public TextField typeField;
  public TextField placeField;
  public DatePicker dateField;
  public TextField timeField;
  public ListView listViewForPlayers;

  public TextArea allMatchesTextArea;
  private TextArea upcomingMatchesArea;
  private VIAClubModelManager manager;

  public void initialize()
  {
    manager = new VIAClubModelManager("players.bin", "matches.bin");
  }

  public void savePlayerInformation(ActionEvent e)
  {
    if (e.getSource() == savePlayerButton)
    {
      String name = nameField.getText();
      String number = numberField.getText();
      String position = positionBox.getSelectionModel().getSelectedItem();
      String suspention = suspensionField.getText();

      manager.savePlayers("players.bin", playersPane);
    }
  }

  public void removePlayerInformation(ActionEvent e)
  {
    if (e.getSource() == removePlayerButton)
    {
      nameField.clear();
      numberField.clear();
      positionBox.getItems().clear();
      suspensionField.clear();
    }
  }
  public void setAllMatchesTextArea(){
    ArrayList<Match> matches=manager.getAllMatches();
    allMatchesTextArea.setText(matches.toString());
    }

  private void updateMatchesTab()
  {
    if (manager != null)
    { }
    ArrayList<Match> matches = manager.getAllMatches();
    allMatchesTextArea.setText(matches.toString());

  }

  public void setActions(ActionEvent e)
  {
    if (e.getSource() == updateMatches)
    {
      updateMatchesTab();
    }
    else if (e.getSource() == saveAllChangesForMatchesButton)
    {
      ArrayList<Match> matches = manager.getAllMatches();
      //
    }
  }
}

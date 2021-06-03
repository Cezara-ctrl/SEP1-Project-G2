package view;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import model.Player;
import model.VIAClubModelManager;

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

  public void setNameField(ActionEvent e)
  {
    TextInputDialog nameField = new TextInputDialog();

    nameField.getDialogPane().setContentText("Name");
  }



}

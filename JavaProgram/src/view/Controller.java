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

  public void handleActions(ActionEvent e)
  {
    if (e.getSource() == savePlayerButton)
    {
      String name = nameField.getText();
      String number = numberField.getText();
      String suspention = suspensionField.getText();
      String position = positionBox.getSelectionModel().getSelectedItem();

      manager.savePlayers("players.bin", allPlayersArea);
    }
    else if (e.getSource() == positionBox)
    {
      String temp = positionBox.getSelectionModel().getSelectedItem();

      if (temp != null)
      {
        positionBox.setAccessibleText("GK");
        positionBox.setAccessibleText("Midfielder");
        positionBox.setAccessibleText("Forward");
        positionBox.setAccessibleText("Striker");
      }
    }
  }













}

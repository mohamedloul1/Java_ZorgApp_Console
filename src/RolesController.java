import javax.management.relation.RoleList;
import java.sql.*;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;


public class RolesController {
    private Connection connection;
    public RolesController() {
        try {
            // Initialisatie van de databaseverbinding in de constructor
            connection = DatabaseConnector.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    List<Roles> rolesList = new ArrayList<>();

    public void retrieveRoles() {
        try (Statement statement = connection.createStatement()) {
            String sqlQuery = "SELECT * FROM Roles";
            ResultSet resultSet = statement.executeQuery(sqlQuery);

            while (resultSet.next()) {
                Roles role = new Roles(resultSet.getInt("role_id"),
                        resultSet.getString("role_name"));
                rolesList.add(role);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Fout bij het ophalen van de rollen uit de database", e);
        }
    }

    public void displayRolesList(){
        retrieveRoles();
        System.out.println("Roles List");
        for (Roles role : rolesList){
            System.out.format("%d %s %n",
                    role.getRoleId(),
                    role.getRoleName());
        }
    }

    public void insertRole() {
        try {
            Scanner userInput = new Scanner(System.in);
            // Vraag de gebruiker om de gegevens voor de nieuwe rol in te voeren
            System.out.print("Voer de naam van de nieuwe rol in: ");
            String roleName = userInput.nextLine();
            // Voorbereid SQL-invoegingsopdracht
            String sqlInsert = "INSERT INTO Roles (role_name) VALUES (?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sqlInsert)) {
                preparedStatement.setString(1, roleName);

                // Voer de invoegingsopdracht uit
                int affectedRows = preparedStatement.executeUpdate();

                if (affectedRows > 0) {
                    System.out.println("Nieuwe rol succesvol toegevoegd \u001B[32m" + roleName + " \u001B[0m");
                } else {
                    System.out.println("Er is iets fout gegaan bij het toevoegen van de rol.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Voeg hier andere functies toe voor databasebewerkingen
}

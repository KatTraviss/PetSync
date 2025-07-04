package doa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

import model.User;

public class ApplicationDAO {

    public Map<UUID, User> readUsers() {
        User user = null;
        Map<UUID, User> users = new LinkedHashMap<UUID, User>();

        try {
            // connect 
            Connection connection = DBConnection.getConnectionToDatabase();

            // query
            String sql = "select * from users;";
            PreparedStatement statement = connection.prepareStatement(sql);

            ResultSet set = statement.executeQuery();
            while (set.next()) {
                user = new User();
                user.setUserID(UUID.fromString(set.getString("uuid")));
                user.setFullName(set.getString("fullname"));
                user.setEmail(set.getString("email"));
                user.setPassword(set.getString("password"));
                user.setRoleName(set.getString("role"));
              
                users.put(user.getUserID(), user);
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        return users;
    }

    public User readUser(String userID) {
        User user = null;
        try {
            // connection 
            Connection connection = DBConnection.getConnectionToDatabase();
            // query 
            String sql = "select * from users where uuid=?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, userID);

            // execute query, get resultset and return user info
            ResultSet set = statement.executeQuery();
            while (set.next()) {
                user = new User();
                user.setUserID(UUID.fromString(set.getString("uuid")));
                user.setFullName(set.getString("fullname"));
                user.setEmail(set.getString("email"));
                user.setPassword(set.getString("password"));
                user.setRoleName(set.getString("role"));
            }

        } catch (SQLException exception) {
            exception.printStackTrace();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return user;
    }

    public void createUser(User user) {
        try {
            // connect
            Connection connection = DBConnection.getConnectionToDatabase();

            // query
            String sql = "insert into users (uuid, fullname, email, password, role) values (?, ?, ?, ?, ?);";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, user.getUserID().toString());
            statement.setString(2, user.getFullName());
            statement.setString(3, user.getEmail());
            statement.setString(4, user.getPassword());
            statement.setString(5, user.getRoleName());
            statement.execute();

        } catch (SQLException exception) {
            exception.printStackTrace();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void updateUser(User user) {
        try {
            // connect
            Connection connection = DBConnection.getConnectionToDatabase();

            // query
            String sql = "update logs set fullName=?, email=?, password=?, role=?  where uuid=?;";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, user.getFullName());
            statement.setString(2, user.getEmail());
            statement.setString(3, user.getPassword());
            statement.setString(4, user.getRoleName());
            statement.setString(5, user.getUserID().toString());
            statement.execute();

        } catch (SQLException exception) {
            exception.printStackTrace();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void deleteUser(String userID) {
        try {
            // connect
            Connection connection = DBConnection.getConnectionToDatabase();

            // query
            String sql = "delete from users where uuid=?;";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, UUID.fromString(userID).toString());
            statement.execute();

        } catch (SQLException exception) {
            exception.printStackTrace();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

   
    public void createOrUpdateUser(User user) {
        User localUser = readUser(user.getUserID().toString());
        if (localUser == null) {
            createUser(user);
        } else {
            updateUser(user);
        }
    }

	
}
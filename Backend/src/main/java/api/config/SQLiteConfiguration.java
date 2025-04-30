package api.config;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Configuration
public class SQLiteConfiguration {

    @Autowired
    private DataSource dataSource;

    @PostConstruct
    public void enableForeignKeys() {
        try (Connection connection = dataSource.getConnection()) {
            connection.createStatement().execute("PRAGMA foreign_keys=ON");
        } catch (SQLException e) {
            throw new RuntimeException("Failed to enable foreign keys in SQLite", e);
        }
    }
}

module com.example.user2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires redis.clients.jedis;


    opens com.example.user2 to javafx.fxml;
    exports com.example.user2;
}
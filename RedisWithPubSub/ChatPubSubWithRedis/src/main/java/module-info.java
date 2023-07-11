module com.example.chatpubsubwithredis {
    requires javafx.controls;
    requires javafx.fxml;
    requires redis.clients.jedis;


    opens com.example.chatpubsubwithredis to javafx.fxml;
    exports com.example.chatpubsubwithredis;
}
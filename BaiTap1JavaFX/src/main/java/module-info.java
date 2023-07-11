module com.example.baitap1javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires redis.clients.jedis;
    requires com.google.gson;


    opens com.example.baitap1javafx to javafx.fxml;
    exports com.example.baitap1javafx;
}
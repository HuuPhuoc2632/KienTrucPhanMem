package com.example.baitap1javafx;



import com.example.baitap1javafx.Model.Patient;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

public class HelloController {

    @FXML
    private Button btnSend;

    @FXML
    private TextField txtCmnd;

    @FXML
    private TextField txtDiaChi;

    @FXML
    private TextField txtMaBN;

    @FXML
    private TextField txtName;

    @FXML
    private void sendPatient(ActionEvent actionEvent){
        Patient patient = new Patient(txtMaBN.getText(), txtCmnd.getText(), txtName.getText(), txtDiaChi.getText(), null);
        JedisPool pool = new JedisPool("localhost", 6379);
        try (Jedis jedis = pool.getResource()) {
            Map<String, String> hash = new HashMap<>();
            hash.put("msbn", patient.getMsbn());
            hash.put("cmnd", patient.getCmnd());
            hash.put("hoTen", patient.getHoTen());
            hash.put("diaChi", patient.getDiaChi());

            jedis.hmset(patient.getMsbn(), hash);
        }
        catch(Exception e) {

        }
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setHeaderText(null);
        // show the dialog
        a.setContentText("Đã gửi thông tin đến phòng khám");
        a.show();

    }


}
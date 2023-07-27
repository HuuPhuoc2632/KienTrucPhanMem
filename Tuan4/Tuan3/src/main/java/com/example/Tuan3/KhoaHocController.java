package com.example.Tuan3;

import com.example.Tuan3.Model.KhoaHoc;
import com.example.Tuan3.Model.KhoaHocRepository;
import com.example.Tuan3.service.KhoaHocService;
import com.example.Tuan3.service.ServiceImpl;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.web.bind.annotation.*;
import redis.clients.jedis.Jedis;

import java.util.*;

@RestController
@RequestMapping("/api/khoahoc")
public class KhoaHocController {

    private final KhoaHocService khoaHocService;
    private Jedis jedis = new Jedis("localhost", 6379);

    @Autowired
    public KhoaHocController(KhoaHocService khoaHocService) {
        this.khoaHocService = khoaHocService;
    }

    @GetMapping("/{id}")
    public KhoaHoc getKhoaHoc(@PathVariable Long id) {
        return khoaHocService.getKhoaHoc(id);
    }

    @PostMapping("/")
    public KhoaHoc createKhoaHoc(@RequestBody KhoaHoc khoaHoc) {
        String khoaHocJson = convertObjectToJson(khoaHoc);

        // Lưu đối tượng KhoaHoc vào Redis
        jedis.set(khoaHoc.getId().toString(), khoaHocJson);
        return khoaHocService.saveKhoaHoc(khoaHoc);
    }
//    @PutMapping("/{id}")
//    public KhoaHoc updateKhoaHoc(@PathVariable String id, @RequestBody KhoaHoc khoaHoc) {
//        KhoaHoc k = new KhoaHoc();
//        for ( KhoaHoc kh : khoaHocList
//        ) {
//            if(kh.getId().equalsIgnoreCase(id)){
//                k = kh;
//                Collections.replaceAll(khoaHocList, kh, k);
//                break;
//            }
//        }
//        if (k != null) {
//           k.setTitle(khoaHoc.getTitle());
//            k.setNativePrice(khoaHoc.getNativePrice());
//            k.setSalePrice(khoaHoc.getSalePrice());
//            k.setUserImage(khoaHoc.getUserImage());
//            k.setUserName(khoaHoc.getUserName());
//        }
//        return k;
//    }

    @DeleteMapping("/{id}")
    public void deleteKhoaHoc(@PathVariable Long id) {
        khoaHocService.deleteKhoaHoc(id);
    }

    @GetMapping("/")
    public List<KhoaHoc> getAllKhoaHoc() {
//        Set<String> khoaHocKeys = jedis.keys("*");
//        // Lấy danh sách các đối tượng KhoaHoc từ Redis
//        List<KhoaHoc> khoaHocList = new ArrayList<>();
//        for (String khoaHocKey : khoaHocKeys) {
//            String khoaHocJson = jedis.get(khoaHocKey);
//            KhoaHoc khoaHoc = convertJsonToObject(khoaHocJson, KhoaHoc.class);
//            khoaHocList.add(khoaHoc);
//        }
//        return khoaHocList;
        return khoaHocService.getAllKhoaHoc();
    }
    private static String convertObjectToJson(Object object) {
        Gson gson = new Gson();
        return gson.toJson(object);
    }

    private static <T> T convertJsonToObject(String json, Class<T> objectType) {
        Gson gson = new Gson();
        return gson.fromJson(json, objectType);
    }
}

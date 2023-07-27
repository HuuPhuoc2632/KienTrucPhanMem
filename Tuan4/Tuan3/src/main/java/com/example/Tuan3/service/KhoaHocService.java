package com.example.Tuan3.service;

import com.example.Tuan3.Model.KhoaHoc;
import com.example.Tuan3.Model.KhoaHocRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public interface KhoaHocService {


    KhoaHoc saveKhoaHoc(KhoaHoc khoaHoc);
    public void deleteKhoaHoc(Long id);
    public List<KhoaHoc> getAllKhoaHoc();
    public KhoaHoc getKhoaHoc(Long id);

    // Các phương thức xử lý và truy vấn khác
}

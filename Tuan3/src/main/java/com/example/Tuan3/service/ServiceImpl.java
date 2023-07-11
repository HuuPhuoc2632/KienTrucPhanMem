package com.example.Tuan3.service;

import com.example.Tuan3.Model.KhoaHoc;
import com.example.Tuan3.Model.KhoaHocRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class ServiceImpl implements KhoaHocService {
    @Autowired
    private KhoaHocRepository khr;

    @Override
    public KhoaHoc saveKhoaHoc(KhoaHoc khoaHoc) {
        return khr.save(khoaHoc);
    }

    @Override
    public void deleteKhoaHoc(Long id) {
        khr.deleteById(id);
    }

    @Override
    public List<KhoaHoc> getAllKhoaHoc() {
        return khr.findAll();
    }

    @Override
    public KhoaHoc getKhoaHoc(Long id) {
        return khr.getOne(id);
    }
}

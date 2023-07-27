package com.khoahoc.khoaHoc2.controller;


import java.util.List;

import com.khoahoc.khoaHoc2.modal.KhoaHoc;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/api")
public class KhoaHocController {
   @GetMapping("/call")
   public List<KhoaHoc> callAPI() {
		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl
		  = "http://localhost:8080/api/khoahoc/";
		ResponseEntity<List<KhoaHoc> > response
		  = restTemplate.exchange(fooResourceUrl , HttpMethod.GET, null,
			        new ParameterizedTypeReference<List<KhoaHoc>>() {});

		List<KhoaHoc> courseResponses = response.getBody();
		return courseResponses;

   }
}

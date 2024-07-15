package com.example.test_task_ofd.controllers;

import com.example.test_task_ofd.dto.UserDataDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@Slf4j
public class UserDataController {
    @PostMapping("/add_data")
    public ResponseEntity<?> postUserData(@RequestBody UserDataDTO userData) {
        log.info("user_id:{} user_data:{}", userData.userId(), userData.userData());
        Map<String, String> responseBody = new HashMap<>();
        responseBody.put("answer", "Processed Successfully");
        return ResponseEntity.ok(responseBody);
    }
}

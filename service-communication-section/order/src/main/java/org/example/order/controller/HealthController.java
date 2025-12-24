package org.example.order.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orders")
public class HealthController {
  
  @GetMapping("/monitor/health")
  public ResponseEntity<?> hello() {
    return ResponseEntity.ok("hello");
  }
  
}

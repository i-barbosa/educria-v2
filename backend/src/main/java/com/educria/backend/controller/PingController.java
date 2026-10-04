package com.educria.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.Map;

/**
 * Endpoint mínimo pra provar a comunicação front-back (etapa 2).
 * Vai sumir/virar health check real quando Actuator entrar.
 */
@RestController
public class PingController {

    @GetMapping("/api/ping")
    public Map<String, Object> ping() {
        return Map.of(
                "status", "ok",
                "service", "educria-backend",
                "timestamp", Instant.now().toString()
        );
    }
}

package ru.nikitos.kuberdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class KuberController {
    @GetMapping
    public Map<String, String> greeting() {
        return Map.of("info", "Greeting to application!");
    }
}

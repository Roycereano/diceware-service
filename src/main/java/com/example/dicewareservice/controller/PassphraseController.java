package com.example.dicewareservice.controller;

import com.example.dicewareservice.service.PassphraseGenerator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/passphrases")
public class PassphraseController {

  private final PassphraseGenerator generator;

  public PassphraseController(PassphraseGenerator generator) {
    this.generator = generator;
  }


  @GetMapping("/transient")
  public String[] generate(int length) {
    return generator.generate(length);

  }
}

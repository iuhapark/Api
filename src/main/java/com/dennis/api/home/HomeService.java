package com.dennis.api.home;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HomeService {

  private final HomeRepository repository;
  public String test(){
    return "";
  }

}

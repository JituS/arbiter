package com.etsy.arbiter;

import lombok.Data;

import java.util.Map;

@Data
public class Credential {
  private String name;
  private String type;
  private Map<String, String> properties;
}

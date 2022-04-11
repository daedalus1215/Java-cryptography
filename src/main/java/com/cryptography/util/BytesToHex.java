package com.cryptography.util;

import java.util.function.Function;

public class BytesToHex implements Function<byte[], String> {

  @Override
  public String apply(byte[] bytes) {
    StringBuilder sb = new StringBuilder();
    for (byte b : bytes) {
      sb.append(String.format("%02X ", b));
    }
    return sb.toString();
  }
}

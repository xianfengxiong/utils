package com.caigin.utils;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.math.BigDecimal;

/**
 * @author xxf
 * @since 2016-04-28
 */
public class BigDecimalTypeAdapter extends TypeAdapter<BigDecimal> {
  @Override
  public void write(JsonWriter out, BigDecimal value) throws IOException {
    if (value == null) {
      out.nullValue();
      return;
    }
    out.value(value.toPlainString());
  }

  @Override
  public BigDecimal read(JsonReader in) throws IOException {

    System.out.println("hello read");

    if (in.peek() == JsonToken.NULL){
      in.nextNull();
      return null;
    }
    String value = in.nextString();
    return new BigDecimal(value);
  }
}

package com.exercise.seo;

import java.util.Random;

public class SEOService {

  public static final String SHORT_URL = "http://short.com/";
  private static final Integer MAX_KEYWORD_LENGTH = 20;
  public static final int SEO_SHORT_STRING_LENGTH = 4;

  public String generateURL(String url, String keyword){
    if(keyword.length() > MAX_KEYWORD_LENGTH) {
      throw new IllegalArgumentException("Keyword exceeds max length");
    }

     return SHORT_URL + keyword;
  }

  public String generateShortURL(String url){
      return SHORT_URL + generateRandomString(SEO_SHORT_STRING_LENGTH);
  }

  private String generateRandomString(Integer length) {
    StringBuilder stringBuilder = new StringBuilder();
    for(int i=0; i<length; i++){
      stringBuilder.append(generateRandomChar());
    }
    return stringBuilder.toString();
  }

  private char generateRandomChar() {
    return  (char) new Random().nextInt('{');
  }
}

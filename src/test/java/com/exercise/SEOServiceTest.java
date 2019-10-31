package com.exercise;

import com.exercise.seo.SEOService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SEOServiceTest {

  @Test
  public void test(){
    Assertions.assertEquals("http://short.com/MY-NEW-WS",
        new SEOService().generateURL("http://looooong.com/somepath/newWebService", "MY-NEW-WS"));
  }
  @Test
  public void shouldLimitKeywordSizeCorrectly(){
    Assertions.assertThrows(
        IllegalArgumentException.class,
        () -> new SEOService()
            .generateURL("http://looooong.com/somepath/newWebService", "12345678901234567890123"));
  }

  @Test
  public void shouldGenerateShortUrl(){
    String actual = new SEOService().generateShortURL("http://looooong.com/somepath/newWebService");
    System.out.println("actual " + actual);
    Assertions.assertEquals("http://short.com/1234".length(),
        actual.length());
  }
}

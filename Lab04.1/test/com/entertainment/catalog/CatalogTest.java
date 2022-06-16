/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.entertainment.catalog;

import static org.junit.Assert.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import com.entertainment.Television;

public class CatalogTest {
  
  /**
   * Contract: a no-matches result should be an empty collection (not null).
   */
  @Test
  public void findByBrand_none() {
    Collection<Television> tvs = Catalog.findByBrand("\u0000NO-MATCHES");
    assertNotNull(tvs);
    assertTrue(tvs.isEmpty());
  }

  @Test
  public void findByBrand_present() {
    Collection<Television> tvs = Catalog.findByBrand("Sony");
    assertNotNull(tvs);
//    assertEquals(7, tvs.size());
    for(Television tv : tvs) {
      assertEquals("Sony", tv.getBrand());
    }
  }

  @Test
  public void findByBrands_none() {
    Map<String, Collection<Television>> tvs = Catalog.findByBrands();
    assertNotNull(tvs);
    assertTrue(tvs.isEmpty());
  }

  @Test
  public void findByBrands_present() {
    Map<String, Collection<Television>> tvs = Catalog.findByBrands("Sony", "RCA", "Zenith");
    assertNotNull(tvs);
    assertFalse(tvs.isEmpty());
    assertTrue(tvs.containsKey("Sony"));
    assertEquals(7, tvs.get("Sony").size());
    assertEquals(9, tvs.get("RCA").size());
    assertEquals(9, tvs.get("Zenith").size());
  }
}

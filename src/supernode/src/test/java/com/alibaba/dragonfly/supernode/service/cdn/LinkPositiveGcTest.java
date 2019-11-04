package com.alibaba.dragonfly.supernode.service.cdn;

import com.alibaba.dragonfly.supernode.service.cdn.LinkPositiveGc;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class LinkPositiveGcTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99937f051da6f23f74f() {

    // Act, creating object to test constructor
    final LinkPositiveGc actual = new LinkPositiveGc();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void gcInputNotNullOutputTrue999cceb3c850cfb9224() {

    // Arrange
    final LinkPositiveGc thisObj = new LinkPositiveGc();
    final String arg0 = "aaaaa";

    // Act
    final boolean actual = thisObj.gc(arg0);

    // Assert result
    Assert.assertTrue(actual);

  }
}

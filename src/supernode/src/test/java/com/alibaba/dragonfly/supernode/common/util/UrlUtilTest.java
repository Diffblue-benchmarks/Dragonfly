package com.alibaba.dragonfly.supernode.common.util;

import com.alibaba.dragonfly.supernode.common.util.UrlUtil;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class UrlUtilTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99913be790412d85bfa() {

    // Act, creating object to test constructor
    final UrlUtil actual = new UrlUtil();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isValidIpInputNotNullOutputFalse99919e149abefb55bcb() {

    // Arrange
    final String arg0 = "aaaaa";

    // Act
    final boolean actual = UrlUtil.isValidIp(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isValidUrlInputNotNullOutputFalse99972f549f1600eb69d() {

    // Arrange
    final String arg0 = "aaaaa";

    // Act
    final boolean actual = UrlUtil.isValidUrl(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }
}

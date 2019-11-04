package com.alibaba.dragonfly.supernode.common;

import com.alibaba.dragonfly.supernode.common.Constants;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ConstantsTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9997b3a1f35bd3142fa() {

    // Act, creating object to test constructor
    final Constants actual = new Constants();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void generateNodeCidOutputVoid9996a808b14b47be511() {

    // Act
    Constants.generateNodeCid();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getSuperCidInputNotNullOutputNotNull9998ee1d6b01bd5ab3b() {

    // Arrange
    final String arg0 = "aaaaa";

    // Act
    final String actual = Constants.getSuperCid(arg0);

    // Assert result
    Assert.assertEquals("nullaaaaa", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isDebugEnabledOutputFalse9990cf2cb1236f39b9c() {

    // Act
    final boolean actual = Constants.isDebugEnabled();

    // Assert result
    Assert.assertFalse(actual);

  }
}

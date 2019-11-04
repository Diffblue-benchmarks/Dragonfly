package com.alibaba.dragonfly.supernode.common.exception;

import com.alibaba.dragonfly.supernode.common.exception.AssertException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class AssertExceptionTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorInputPositiveNotNullOutputNotNull99924bd670f77c8354a() {

    // Arrange
    final int arg0 = 1;
    final String arg1 = "aaaaa";

    // Act, creating object to test constructor
    final AssertException actual = new AssertException(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.getCode());
    Assert.assertEquals("aaaaa", actual.getMessage());

  }

  // Test written by Diffblue Cover
  @Test
  public void getCodeOutputPositive999e10a73c4a45bae11() {

    // Arrange
    final AssertException thisObj = new AssertException(1, "aaaaa");

    // Act
    final int actual = thisObj.getCode();

    // Assert result
    Assert.assertEquals(1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void setCodeInputPositiveOutputVoid9995c1026ead3441146() {

    // Arrange
    final AssertException thisObj = new AssertException(1, "aaaaa");
    final int arg0 = 1;

    // Act
    thisObj.setCode(arg0);

    // The method returns void, testing that no exception is thrown

  }
}

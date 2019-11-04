package com.alibaba.dragonfly.supernode.common.exception;

import com.alibaba.dragonfly.supernode.common.exception.ValidateException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ValidateExceptionTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullOutputNotNull999ae61991f99fbcb6a() {

    // Arrange
    final Integer arg0 = new Integer(1);
    final String arg1 = "aaaaa";

    // Act, creating object to test constructor
    final ValidateException actual = new ValidateException(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getCode());
    Assert.assertEquals("aaaaa", actual.getMessage());

  }

  // Test written by Diffblue Cover
  @Test
  public void getCodeOutputNotNull999f0ca77682d19424e() {

    // Arrange
    final Integer integer = new Integer(1);
    final ValidateException thisObj = new ValidateException(integer, "aaaaa");

    // Act
    final Integer actual = thisObj.getCode();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void setCodeInputNotNullOutputVoid999ecf316f607ca5da8() {

    // Arrange
    final Integer integer = new Integer(1);
    final ValidateException thisObj = new ValidateException(integer, "aaaaa");
    final Integer arg0 = new Integer(1);

    // Act
    thisObj.setCode(arg0);

    // The method returns void, testing that no exception is thrown

  }
}

package com.alibaba.dragonfly.supernode.rest.exception;

import com.alibaba.dragonfly.supernode.common.view.ResultInfo;
import com.alibaba.dragonfly.supernode.rest.exception.GlobalExceptionHandler;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class GlobalExceptionHandlerTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final GlobalExceptionHandler actual = new GlobalExceptionHandler();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void handleHttpRequestMethodNotSupportedExceptionInputNullOutputNotNull() {

    // Arrange
    final GlobalExceptionHandler globalExceptionHandler = new GlobalExceptionHandler();

    // Act
    final ResultInfo actual =
        globalExceptionHandler.handleHttpRequestMethodNotSupportedException(null);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getData());
    Assert.assertNull(actual.getAddition());
    Assert.assertNull(actual.getMsg());
    Assert.assertEquals(404, actual.getCode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void handleMethodArgumentTypeMismatchExceptionInputNullOutputNotNull() {

    // Arrange
    final GlobalExceptionHandler globalExceptionHandler = new GlobalExceptionHandler();

    // Act
    final ResultInfo actual =
        globalExceptionHandler.handleMethodArgumentTypeMismatchException(null);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getData());
    Assert.assertNull(actual.getAddition());
    Assert.assertEquals("invalid param", actual.getMsg());
    Assert.assertEquals(501, actual.getCode());
  }

  // Test written by Diffblue Cover.

  @Test
  public void staticInitOutputVoid() throws InvocationTargetException {

    // Act, using constructor to test static initializer
    final Object constructed = Reflector.getInstance(
        "com.alibaba.dragonfly.supernode.rest.exception.GlobalExceptionHandler");

    // Assert side effects
    Assert.assertNotNull(Reflector.getInstanceField(GlobalExceptionHandler.class, null, "log"));
  }
}

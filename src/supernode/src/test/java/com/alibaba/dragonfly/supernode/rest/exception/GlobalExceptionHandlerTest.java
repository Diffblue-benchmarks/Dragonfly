package com.alibaba.dragonfly.supernode.rest.exception;

import com.alibaba.dragonfly.supernode.common.view.ResultInfo;
import com.alibaba.dragonfly.supernode.rest.exception.GlobalExceptionHandler;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import java.lang.reflect.Method;



public class GlobalExceptionHandlerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9996a07b58d577c77a9() {

    // Act, creating object to test constructor
    final GlobalExceptionHandler actual = new GlobalExceptionHandler();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void handleHttpRequestMethodNotSupportedExceptionInputNotNullOutputNotNull999432fb83504ff0f49() {

    // Arrange
    final GlobalExceptionHandler thisObj = new GlobalExceptionHandler();
    final HttpRequestMethodNotSupportedException arg0 = new HttpRequestMethodNotSupportedException("aaaaa");

    // Act
    final ResultInfo actual = thisObj.handleHttpRequestMethodNotSupportedException(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(404, actual.getCode());
    Assert.assertNull(actual.getAddition());
    Assert.assertNull(actual.getMsg());
    Assert.assertNull(actual.getData());

  }

  // Test written by Diffblue Cover
  @Test
  public void handleMethodArgumentTypeMismatchExceptionInputNotNullOutputNotNull9990e678824f99d6abf() {

    // Arrange
    final GlobalExceptionHandler thisObj = new GlobalExceptionHandler();
    final Throwable throwable = new Throwable();
    final MethodArgumentTypeMismatchException arg0 = new MethodArgumentTypeMismatchException("aaaaa", null, "aaaaa", null, throwable);

    // Act
    final ResultInfo actual = thisObj.handleMethodArgumentTypeMismatchException(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(501, actual.getCode());
    Assert.assertNull(actual.getAddition());
    Assert.assertEquals("invalid param", actual.getMsg());
    Assert.assertNull(actual.getData());

  }
}

package com.alibaba.dragonfly.supernode.common.util;

import com.alibaba.dragonfly.supernode.common.util.BeanPoolUtil;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebApplicationContext;



public class BeanPoolUtilTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99913ce14ebaa031f1d() {

    // Act, creating object to test constructor
    final BeanPoolUtil actual = new BeanPoolUtil();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getBeanInputNullOutputNullPointerException99978f67cd7c85b7eb1() {

    // Arrange
    final Class<Object> arg0 = null;

    // Act
    thrown.expect(NullPointerException.class);
    BeanPoolUtil.getBean(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getBeansInputNullOutputNullPointerException9995cf80b4db956c732() {

    // Arrange
    final Class<Object> arg0 = null;

    // Act
    thrown.expect(NullPointerException.class);
    BeanPoolUtil.getBeans(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getObjectInputNotNullOutputNullPointerException9990ae8de75b8b9cc77() {

    // Arrange
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    BeanPoolUtil.getObject(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setApplicationContextInputNotNullOutputVoid999f95f8457960419c3() {

    // Arrange
    final BeanPoolUtil thisObj = new BeanPoolUtil();
    final AnnotationConfigReactiveWebApplicationContext arg0 = new AnnotationConfigReactiveWebApplicationContext();

    // Act
    thisObj.setApplicationContext(arg0);

    // The method returns void, testing that no exception is thrown

  }
}

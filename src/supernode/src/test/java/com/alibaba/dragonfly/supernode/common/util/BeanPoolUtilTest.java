package com.alibaba.dragonfly.supernode.common.util;

import com.alibaba.dragonfly.supernode.common.util.BeanPoolUtil;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class BeanPoolUtilTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final BeanPoolUtil actual = new BeanPoolUtil();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getBeanInputNullOutputNullPointerException() {

    // Act
    thrown.expect(NullPointerException.class);
    BeanPoolUtil.getBean(null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getBeansInputNullOutputNullPointerException() {

    // Act
    thrown.expect(NullPointerException.class);
    BeanPoolUtil.getBeans(null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getObjectInputNotNullOutputNullPointerException() {

    // Act
    thrown.expect(NullPointerException.class);
    BeanPoolUtil.getObject("?");

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void setApplicationContextInputNullOutputVoid() {

    // Arrange
    final BeanPoolUtil beanPoolUtil = new BeanPoolUtil();

    // Act
    beanPoolUtil.setApplicationContext(null);

    // The method returns void, testing that no exception is thrown
  }
}

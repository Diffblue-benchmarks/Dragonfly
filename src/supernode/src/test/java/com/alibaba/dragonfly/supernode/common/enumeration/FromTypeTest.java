package com.alibaba.dragonfly.supernode.common.enumeration;

import com.alibaba.dragonfly.supernode.common.enumeration.FromType;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;

public class FromTypeTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.

  @Test
  public void staticInitOutputVoid() throws InvocationTargetException {

    // Act, using constructor to test static initializer
    final Object constructed =
        Reflector.getInstance("com.alibaba.dragonfly.supernode.common.enumeration.FromType");

    // Assert side effects
    Assert.assertArrayEquals(
        new Object[] {FromType.LOCAL, FromType.DOWNLOADER},
        ((Object[])Reflector.getInstanceField(FromType.class, null, "$VALUES")));
  }

  // Test written by Diffblue Cover.
  @Test
  public void typeOutputNotNull() {

    // Arrange
    final FromType fromType = FromType.LOCAL;

    // Act and Assert result
    Assert.assertEquals("local", fromType.type());
  }

  // Test written by Diffblue Cover.
  @Test
  public void valueOfInputNotNullOutputIllegalArgumentException() {

    // Act
    thrown.expect(IllegalArgumentException.class);
    FromType.valueOf("!!!!");

    // The method is not expected to return due to exception thrown
  }
}

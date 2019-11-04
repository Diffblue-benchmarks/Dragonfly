package com.alibaba.dragonfly.supernode.common.enumeration;

import com.alibaba.dragonfly.supernode.common.enumeration.FromType;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class FromTypeTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void typeOutputNotNull999e26c81403992c9df() {

    // Arrange
    final FromType thisObj = FromType.LOCAL;

    // Act
    final String actual = thisObj.type();

    // Assert result
    Assert.assertEquals("local", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void valueOfInputNotNullOutputIllegalArgumentException99912157ca74de21f37() {

    // Arrange
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(IllegalArgumentException.class);
    FromType.valueOf(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void valuesOutput2999c7a2ce11990734f1() {

    // Act
    final FromType[] actual = FromType.values();

    // Assert result
    Assert.assertArrayEquals(new FromType[]{ FromType.LOCAL, FromType.DOWNLOADER }, actual);

  }
}

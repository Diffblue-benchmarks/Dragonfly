package com.alibaba.dragonfly.supernode.common.util;

import com.alibaba.dragonfly.supernode.common.exception.AssertException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;



public class AssertTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void assertFalseInputTruePositiveNotNullOutputAssertException9998b94c63c3ac6e33b() throws AssertException {

    // Arrange
    final boolean arg0 = true;
    final int arg1 = 1;
    final String arg2 = "aaaaa";

    // Act
    thrown.expect(AssertException.class);
    com.alibaba.dragonfly.supernode.common.util.Assert.assertFalse(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void assertJsonArrayInputNotNullNullPositiveNotNullOutputAssertException999e61458b0a0c489bd() throws AssertException {

    // Arrange
    final String arg0 = "aaaaa";
    final Class<Object> arg1 = null;
    final int arg2 = 1;
    final String arg3 = "aaaaa";

    // Act
    thrown.expect(AssertException.class);
    com.alibaba.dragonfly.supernode.common.util.Assert.assertJsonArray(arg0, arg1, arg2, arg3);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void assertNotEmptyInputNotNullPositiveNotNullOutputVoid999d0a78d6aaed3edc1() throws AssertException {

    // Arrange
    final String arg0 = "aaaaa";
    final int arg1 = 1;
    final String arg2 = "aaaaa";

    // Act
    com.alibaba.dragonfly.supernode.common.util.Assert.assertNotEmpty(arg0, arg1, arg2);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void assertNotEmptyInputNotNullPositiveNotNullOutputVoid999d334742e0432b9c0() throws AssertException {

    // Arrange
    final ArrayList<Object> arg0 = new ArrayList<Object>();
    arg0.add("aaaaa");
    final int arg1 = 1;
    final String arg2 = "aaaaa";

    // Act
    com.alibaba.dragonfly.supernode.common.util.Assert.assertNotEmpty(arg0, arg1, arg2);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void assertNotNullInputNotNullPositiveNotNullOutputVoid999fd4f0a62d92ef517() throws AssertException {

    // Arrange
    final Object arg0 = "aaaaa";
    final int arg1 = 1;
    final String arg2 = "aaaaa";

    // Act
    com.alibaba.dragonfly.supernode.common.util.Assert.assertNotNull(arg0, arg1, arg2);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void assertNullInputNotNullPositiveNotNullOutputAssertException999fb2dcce6c6fda38d() throws AssertException {

    // Arrange
    final Object arg0 = "aaaaa";
    final int arg1 = 1;
    final String arg2 = "aaaaa";

    // Act
    thrown.expect(AssertException.class);
    com.alibaba.dragonfly.supernode.common.util.Assert.assertNull(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void assertNumericInputNotNullPositiveNotNullOutputAssertException9994d6c831bbfb2b595() {

    // Arrange
    final String arg0 = "aaaaa";
    final int arg1 = 1;
    final String arg2 = "aaaaa";

    // Act
    thrown.expect(AssertException.class);
    com.alibaba.dragonfly.supernode.common.util.Assert.assertNumeric(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void assertPositiveInputNotNullPositiveNotNullOutputVoid99964775cc46dc98539() throws AssertException {

    // Arrange
    final Long arg0 = new Long(1L);
    final int arg1 = 1;
    final String arg2 = "aaaaa";

    // Act
    com.alibaba.dragonfly.supernode.common.util.Assert.assertPositive(arg0, arg1, arg2);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void assertTrueInputTruePositiveNotNullOutputVoid99952480d437febb43d() throws AssertException {

    // Arrange
    final boolean arg0 = true;
    final int arg1 = 1;
    final String arg2 = "aaaaa";

    // Act
    com.alibaba.dragonfly.supernode.common.util.Assert.assertTrue(arg0, arg1, arg2);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99931615d126b935ef7() {

    // Act, creating object to test constructor
    final com.alibaba.dragonfly.supernode.common.util.Assert actual = new com.alibaba.dragonfly.supernode.common.util.Assert();

    // Assert result
    Assert.assertNotNull(actual);

  }
}

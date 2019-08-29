package com.alibaba.dragonfly.supernode.common.util;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.alibaba.dragonfly.supernode.common.exception.AssertException;
import com.alibaba.fastjson.JSON;
import com.diffblue.deeptestutils.mock.DTUMemberMatcher;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.util.CollectionUtils;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.List;

@RunWith(PowerMockRunner.class)
public class AssertTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void assertFalseInputFalseZeroNotNullOutputVoid() throws AssertException {

    // Act
    com.alibaba.dragonfly.supernode.common.util.Assert.assertFalse(false, 0, "");

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void assertFalseInputTrueZeroNotNullOutputAssertException() throws AssertException {

    // Act
    thrown.expect(AssertException.class);
    com.alibaba.dragonfly.supernode.common.util.Assert.assertFalse(true, 0, "");

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(JSON.class)
  @Test
  public void assertJsonArrayInputNotNullNullZeroNotNullOutputVoid() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(JSON.class);

    // Arrange
    final String val = "";
    final Class cls = null;
    final int errCode = 0;
    final String errorMessage = "";
    final Method parseArrayMethod =
        DTUMemberMatcher.method(JSON.class, "parseArray", String.class, Class.class);
    PowerMockito.doReturn(null)
        .when(JSON.class, parseArrayMethod)
        .withArguments(or(isA(String.class), isNull(String.class)),
                       or(isA(Class.class), isNull(Class.class)));

    // Act
    com.alibaba.dragonfly.supernode.common.util.Assert.assertJsonArray(val, cls, errCode,
                                                                       errorMessage);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(StringUtils.class)
  @Test
  public void assertNotEmptyInputNotNullZeroNotNullOutputAssertException() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final String str = "";
    final int errCode = 0;
    final String errorMessage = "";
    final Method isEmptyMethod =
        DTUMemberMatcher.method(StringUtils.class, "isEmpty", CharSequence.class);
    PowerMockito.doReturn(true)
        .when(StringUtils.class, isEmptyMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    thrown.expect(AssertException.class);
    com.alibaba.dragonfly.supernode.common.util.Assert.assertNotEmpty(str, errCode, errorMessage);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(StringUtils.class)
  @Test
  public void assertNotEmptyInputNotNullZeroNotNullOutputVoid() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final String str = "";
    final int errCode = 0;
    final String errorMessage = "";
    final Method isEmptyMethod =
        DTUMemberMatcher.method(StringUtils.class, "isEmpty", CharSequence.class);
    PowerMockito.doReturn(false)
        .when(StringUtils.class, isEmptyMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    com.alibaba.dragonfly.supernode.common.util.Assert.assertNotEmpty(str, errCode, errorMessage);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(CollectionUtils.class)
  @Test
  public void assertNotEmptyInputNullZeroNotNullOutputAssertException() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(CollectionUtils.class);

    // Arrange
    final List list = null;
    final int errCode = 0;
    final String errorMessage = "";
    final Method isEmptyMethod =
        DTUMemberMatcher.method(CollectionUtils.class, "isEmpty", Collection.class);
    PowerMockito.doReturn(true)
        .when(CollectionUtils.class, isEmptyMethod)
        .withArguments(or(isA(Collection.class), isNull(Collection.class)));

    // Act
    thrown.expect(AssertException.class);
    com.alibaba.dragonfly.supernode.common.util.Assert.assertNotEmpty(list, errCode, errorMessage);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(CollectionUtils.class)
  @Test
  public void assertNotEmptyInputNullZeroNotNullOutputVoid() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(CollectionUtils.class);

    // Arrange
    final List list = null;
    final int errCode = 0;
    final String errorMessage = "";
    final Method isEmptyMethod =
        DTUMemberMatcher.method(CollectionUtils.class, "isEmpty", Collection.class);
    PowerMockito.doReturn(false)
        .when(CollectionUtils.class, isEmptyMethod)
        .withArguments(or(isA(Collection.class), isNull(Collection.class)));

    // Act
    com.alibaba.dragonfly.supernode.common.util.Assert.assertNotEmpty(list, errCode, errorMessage);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void assertNotNullInputNullZeroNotNullOutputAssertException() throws AssertException {

    // Act
    thrown.expect(AssertException.class);
    com.alibaba.dragonfly.supernode.common.util.Assert.assertNotNull(null, 0, "");

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(com.alibaba.dragonfly.supernode.common.util.Assert.class)
  @Test
  public void assertNotNullInputNullZeroNotNullOutputVoid() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(com.alibaba.dragonfly.supernode.common.util.Assert.class);

    // Arrange
    final Object obj = null;
    final int errCode = 0;
    final String errorMessage = "?";

    // Act
    com.alibaba.dragonfly.supernode.common.util.Assert.assertNotNull(obj, errCode, errorMessage);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void assertNullInputNullZeroNotNullOutputVoid() throws AssertException {

    // Act
    com.alibaba.dragonfly.supernode.common.util.Assert.assertNull(null, 0, "");

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(StringUtils.class)
  @Test
  public void assertNumericInputNotNullZeroNotNullOutputAssertException() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final String val = "";
    final int errCode = 0;
    final String errorMessage = "";
    final Method isNumericMethod =
        DTUMemberMatcher.method(StringUtils.class, "isNumeric", CharSequence.class);
    PowerMockito.doReturn(false)
        .when(StringUtils.class, isNumericMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    thrown.expect(AssertException.class);
    com.alibaba.dragonfly.supernode.common.util.Assert.assertNumeric(val, errCode, errorMessage);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(StringUtils.class)
  @Test
  public void assertNumericInputNotNullZeroNotNullOutputVoid() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final String val = "";
    final int errCode = 0;
    final String errorMessage = "";
    final Method isNumericMethod =
        DTUMemberMatcher.method(StringUtils.class, "isNumeric", CharSequence.class);
    PowerMockito.doReturn(true)
        .when(StringUtils.class, isNumericMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    com.alibaba.dragonfly.supernode.common.util.Assert.assertNumeric(val, errCode, errorMessage);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void assertPositiveInputNullZeroNotNullOutputAssertException() throws AssertException {

    // Act
    thrown.expect(AssertException.class);
    com.alibaba.dragonfly.supernode.common.util.Assert.assertPositive(null, 0, "");

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void assertTrueInputFalseZeroNotNullOutputAssertException() throws AssertException {

    // Act
    thrown.expect(AssertException.class);
    com.alibaba.dragonfly.supernode.common.util.Assert.assertTrue(false, 0, "");

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void assertTrueInputTrueZeroNotNullOutputVoid() throws AssertException {

    // Act
    com.alibaba.dragonfly.supernode.common.util.Assert.assertTrue(true, 0, "");

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final com.alibaba.dragonfly.supernode.common.util.Assert actual =
        new com.alibaba.dragonfly.supernode.common.util.Assert();

    // Assert result
    Assert.assertNotNull(actual);
  }
}

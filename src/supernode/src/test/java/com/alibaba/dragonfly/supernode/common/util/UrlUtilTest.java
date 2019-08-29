package com.alibaba.dragonfly.supernode.common.util;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.alibaba.dragonfly.supernode.common.util.UrlUtil;
import com.diffblue.deeptestutils.Reflector;
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

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RunWith(PowerMockRunner.class)
public class UrlUtilTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final UrlUtil actual = new UrlUtil();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(StringUtils.class)
  @Test
  public void isValidIpInputNotNullOutputFalse() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final String ip = "GGGG\\ZZZ";
    final Method isNotBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isNotBlank", CharSequence.class);
    PowerMockito.doReturn(false)
        .when(StringUtils.class, isNotBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    final boolean actual = UrlUtil.isValidIp(ip);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StringUtils.class, String.class})
  @Test
  public void isValidUrlInputNotNullOutputFalse() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final String url = PowerMockito.mock(String.class);
    PowerMockito.when(url.matches(or(isA(String.class), isNull(String.class)))).thenReturn(false);
    final char[] myCharArray = {};
    Reflector.setField(url, "data", myCharArray);
    Reflector.setField(url, "length", 0);
    final Method isBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isBlank", CharSequence.class);
    PowerMockito.doReturn(false)
        .when(StringUtils.class, isBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    final boolean actual = UrlUtil.isValidUrl(url);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(StringUtils.class)
  @Test
  public void isValidUrlInputNotNullOutputFalse2() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final String url = "";
    final Method isBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isBlank", CharSequence.class);
    PowerMockito.doReturn(true)
        .when(StringUtils.class, isBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    final boolean actual = UrlUtil.isValidUrl(url);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void staticInitOutputVoid() throws InvocationTargetException {

    // Act, using constructor to test static initializer
    final Object constructed =
        Reflector.getInstance("com.alibaba.dragonfly.supernode.common.util.UrlUtil");

    // Assert side effects
    Assert.assertNotNull(Reflector.getInstanceField(UrlUtil.class, null, "logger"));
  }
}

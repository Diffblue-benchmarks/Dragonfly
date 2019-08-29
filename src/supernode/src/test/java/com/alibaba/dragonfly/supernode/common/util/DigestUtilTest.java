package com.alibaba.dragonfly.supernode.common.util;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.alibaba.dragonfly.supernode.common.util.DigestUtil;
import com.diffblue.deeptestutils.mock.DTUMemberMatcher;
import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.lang.reflect.Method;
import java.util.List;

@RunWith(PowerMockRunner.class)
public class DigestUtilTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final DigestUtil actual = new DigestUtil();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(DigestUtils.class)
  @Test
  public void sha1InputNullOutputNullPointerException() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(DigestUtils.class);

    // Arrange
    final List contents = null;
    PowerMockito.doReturn(null).when(DigestUtils.class);
    DigestUtils.getSha1Digest();

    // Act
    thrown.expect(NullPointerException.class);
    DigestUtil.sha1(contents);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(DigestUtils.class)
  @Test
  public void sha256InputNotNullOutputNotNull() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(DigestUtils.class);

    // Arrange
    final String target = "";
    final Method sha256HexMethod =
        DTUMemberMatcher.method(DigestUtils.class, "sha256Hex", String.class);
    PowerMockito.doReturn("")
        .when(DigestUtils.class, sha256HexMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));

    // Act
    final String actual = DigestUtil.sha256(target);

    // Assert result
    Assert.assertEquals("", actual);
  }
}

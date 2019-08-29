package com.alibaba.dragonfly.supernode.common.domain.dto;

import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.alibaba.dragonfly.supernode.common.domain.dto.CacheResult;
import com.diffblue.deeptestutils.Reflector;
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

import java.lang.reflect.InvocationTargetException;
import java.security.MessageDigest;

@RunWith(PowerMockRunner.class)
public class CacheResultTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @PrepareForTest(DigestUtils.class)
  @Test
  public void constructorOutputVoid() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(DigestUtils.class);

    // Arrange
    final MessageDigest messageDigest =
        (MessageDigest)Reflector.getInstance("java.security.MessageDigest");
    PowerMockito.doReturn(messageDigest).when(DigestUtils.class);
    DigestUtils.getMd5Digest();

    // Act, creating object to test constructor
    final CacheResult actual = new CacheResult();

    // Assert side effects
    Assert.assertNotNull(actual.getFileM5());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(DigestUtils.class)
  @Test
  public void getFileM5OutputNotNull() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(DigestUtils.class);

    // Arrange
    final CacheResult cacheResult = (CacheResult)Reflector.getInstance(
        "com.alibaba.dragonfly.supernode.common.domain.dto.CacheResult");
    cacheResult.setStartPieceNum(0);
    final MessageDigest messageDigest = PowerMockito.mock(MessageDigest.class);
    cacheResult.setFileM5(messageDigest);
    PowerMockito.doReturn(messageDigest).when(DigestUtils.class);
    DigestUtils.getMd5Digest();

    // Act
    final MessageDigest actual = cacheResult.getFileM5();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(DigestUtils.class)
  @Test
  public void getStartPieceNumOutputZero() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(DigestUtils.class);

    // Arrange
    final CacheResult cacheResult = (CacheResult)Reflector.getInstance(
        "com.alibaba.dragonfly.supernode.common.domain.dto.CacheResult");
    cacheResult.setStartPieceNum(0);
    final MessageDigest messageDigest = PowerMockito.mock(MessageDigest.class);
    cacheResult.setFileM5(messageDigest);
    PowerMockito.doReturn(messageDigest).when(DigestUtils.class);
    DigestUtils.getMd5Digest();

    // Act
    final int actual = cacheResult.getStartPieceNum();

    // Assert result
    Assert.assertEquals(0, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(DigestUtils.class)
  @Test
  public void setFileM5InputNullOutputVoid() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(DigestUtils.class);

    // Arrange
    final CacheResult cacheResult = (CacheResult)Reflector.getInstance(
        "com.alibaba.dragonfly.supernode.common.domain.dto.CacheResult");
    Reflector.setField(cacheResult, "startPieceNum", 0);
    cacheResult.setFileM5(null);
    final MessageDigest fileM5 = null;
    PowerMockito.doReturn(null).when(DigestUtils.class);
    DigestUtils.getMd5Digest();

    // Act
    cacheResult.setFileM5(fileM5);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(DigestUtils.class)
  @Test
  public void setStartPieceNumInputZeroOutputVoid() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(DigestUtils.class);

    // Arrange
    final CacheResult cacheResult = (CacheResult)Reflector.getInstance(
        "com.alibaba.dragonfly.supernode.common.domain.dto.CacheResult");
    cacheResult.setStartPieceNum(0);
    final MessageDigest messageDigest = PowerMockito.mock(MessageDigest.class);
    cacheResult.setFileM5(messageDigest);
    final int startPieceNum = 0;
    PowerMockito.doReturn(messageDigest).when(DigestUtils.class);
    DigestUtils.getMd5Digest();

    // Act
    cacheResult.setStartPieceNum(startPieceNum);

    // The method returns void, testing that no exception is thrown
  }
}

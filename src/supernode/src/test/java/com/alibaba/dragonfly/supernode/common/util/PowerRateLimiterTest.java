package com.alibaba.dragonfly.supernode.common.util;

import static org.mockito.Matchers.anyBoolean;

import com.alibaba.dragonfly.supernode.common.util.PowerRateLimiter;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@RunWith(PowerMockRunner.class)
@PowerMockIgnore({"javax.management.*"})
public class PowerRateLimiterTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @PrepareForTest(PowerRateLimiter.class)
  @Test
  public void acquireInputZeroFalseOutputNullPointerException()
      throws Exception, InvocationTargetException {

    // Arrange
    final PowerRateLimiter powerRateLimiter = (PowerRateLimiter)Reflector.getInstance(
        "com.alibaba.dragonfly.supernode.common.util.PowerRateLimiter");
    Reflector.setField(powerRateLimiter, "properties", null);
    Reflector.setField(powerRateLimiter, "rateLimiter", null);
    Reflector.setField(powerRateLimiter, "netConfigNotification", null);
    final ReentrantLock reentrantLock = PowerMockito.mock(ReentrantLock.class);
    Reflector.setField(powerRateLimiter, "lock", reentrantLock);
    Reflector.setField(powerRateLimiter, "monitorService", null);
    final int tokens = 0;
    final boolean fair = false;
    PowerMockito.whenNew(ReentrantLock.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(reentrantLock);

    // Act
    thrown.expect(NullPointerException.class);
    powerRateLimiter.acquire(tokens, fair);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Lock.class, PowerRateLimiter.class})
  @Test
  public void acquireInputZeroTrueOutputNullPointerException()
      throws Exception, InvocationTargetException {

    // Arrange
    final PowerRateLimiter powerRateLimiter = (PowerRateLimiter)Reflector.getInstance(
        "com.alibaba.dragonfly.supernode.common.util.PowerRateLimiter");
    Reflector.setField(powerRateLimiter, "properties", null);
    Reflector.setField(powerRateLimiter, "rateLimiter", null);
    Reflector.setField(powerRateLimiter, "netConfigNotification", null);
    final ReentrantLock reentrantLock = PowerMockito.mock(ReentrantLock.class);
    Reflector.setField(powerRateLimiter, "lock", reentrantLock);
    Reflector.setField(powerRateLimiter, "monitorService", null);
    final int tokens = 0;
    final boolean fair = true;
    PowerMockito.whenNew(ReentrantLock.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(reentrantLock);

    // Act
    thrown.expect(NullPointerException.class);
    powerRateLimiter.acquire(tokens, fair);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(PowerRateLimiter.class)
  @Test
  public void constructorOutputVoid() throws Exception {

    // Arrange
    final ReentrantLock reentrantLock = PowerMockito.mock(ReentrantLock.class);
    PowerMockito.whenNew(ReentrantLock.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(reentrantLock);

    // Act, creating object to test constructor
    final PowerRateLimiter actual = new PowerRateLimiter();
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(PowerRateLimiter.class)
  @Test
  public void initOutputNullPointerException() throws Exception, InvocationTargetException {

    // Arrange
    final PowerRateLimiter powerRateLimiter = (PowerRateLimiter)Reflector.getInstance(
        "com.alibaba.dragonfly.supernode.common.util.PowerRateLimiter");
    Reflector.setField(powerRateLimiter, "properties", null);
    Reflector.setField(powerRateLimiter, "rateLimiter", null);
    Reflector.setField(powerRateLimiter, "netConfigNotification", null);
    final ReentrantLock reentrantLock = PowerMockito.mock(ReentrantLock.class);
    Reflector.setField(powerRateLimiter, "lock", reentrantLock);
    Reflector.setField(powerRateLimiter, "monitorService", null);
    PowerMockito.whenNew(ReentrantLock.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(reentrantLock);

    // Act
    thrown.expect(NullPointerException.class);
    powerRateLimiter.init();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void staticInitOutputVoid() throws InvocationTargetException {

    // Act, using constructor to test static initializer
    final Object constructed =
        Reflector.getInstance("com.alibaba.dragonfly.supernode.common.util.PowerRateLimiter");

    // Assert side effects
    Assert.assertNotNull(Reflector.getInstanceField(PowerRateLimiter.class, null, "logger"));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(PowerRateLimiter.class)
  @Test
  public void tryAcquireInputZeroFalseOutputNullPointerException()
      throws Exception, InvocationTargetException {

    // Arrange
    final PowerRateLimiter powerRateLimiter = (PowerRateLimiter)Reflector.getInstance(
        "com.alibaba.dragonfly.supernode.common.util.PowerRateLimiter");
    Reflector.setField(powerRateLimiter, "properties", null);
    Reflector.setField(powerRateLimiter, "rateLimiter", null);
    Reflector.setField(powerRateLimiter, "netConfigNotification", null);
    final ReentrantLock reentrantLock = PowerMockito.mock(ReentrantLock.class);
    Reflector.setField(powerRateLimiter, "lock", reentrantLock);
    Reflector.setField(powerRateLimiter, "monitorService", null);
    final int tokens = 0;
    final boolean checkPressure = false;
    PowerMockito.whenNew(ReentrantLock.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(reentrantLock);

    // Act
    thrown.expect(NullPointerException.class);
    powerRateLimiter.tryAcquire(tokens, checkPressure);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(PowerRateLimiter.class)
  @Test
  public void tryAcquireInputZeroTrueOutputNullPointerException()
      throws Exception, InvocationTargetException {

    // Arrange
    final PowerRateLimiter powerRateLimiter = (PowerRateLimiter)Reflector.getInstance(
        "com.alibaba.dragonfly.supernode.common.util.PowerRateLimiter");
    Reflector.setField(powerRateLimiter, "properties", null);
    Reflector.setField(powerRateLimiter, "rateLimiter", null);
    Reflector.setField(powerRateLimiter, "netConfigNotification", null);
    final ReentrantLock reentrantLock = PowerMockito.mock(ReentrantLock.class);
    Reflector.setField(powerRateLimiter, "lock", reentrantLock);
    Reflector.setField(powerRateLimiter, "monitorService", null);
    final int tokens = 0;
    final boolean checkPressure = true;
    PowerMockito.whenNew(ReentrantLock.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(reentrantLock);

    // Act
    thrown.expect(NullPointerException.class);
    powerRateLimiter.tryAcquire(tokens, checkPressure);

    // The method is not expected to return due to exception thrown
  }
}

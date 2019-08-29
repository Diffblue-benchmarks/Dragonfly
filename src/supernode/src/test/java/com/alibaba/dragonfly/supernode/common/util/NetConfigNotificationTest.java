package com.alibaba.dragonfly.supernode.common.util;

import com.alibaba.dragonfly.supernode.common.util.NetConfigNotification;
import com.diffblue.deeptestutils.Reflector;
import com.google.common.util.concurrent.RateLimiter;
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
import org.slf4j.Logger;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@RunWith(PowerMockRunner.class)
@PowerMockIgnore({"javax.management.*"})
public class NetConfigNotificationTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @PrepareForTest({Logger.class, Lock.class, NetConfigNotification.class})
  @Test
  public void addRateLimiterInputNullOutputVoid() throws Exception {

    // Arrange
    final NetConfigNotification netConfigNotification = new NetConfigNotification();
    final ReentrantLock reentrantLock = PowerMockito.mock(ReentrantLock.class);
    Reflector.setField(netConfigNotification, "lock", reentrantLock);
    Reflector.setField(netConfigNotification, "properties", null);
    final ArrayList<RateLimiter> arrayList = new ArrayList<RateLimiter>();
    Reflector.setField(netConfigNotification, "rateLimiters", arrayList);
    final RateLimiter rateLimiter = null;
    PowerMockito.whenNew(ReentrantLock.class).withNoArguments().thenReturn(reentrantLock);

    // Act
    netConfigNotification.addRateLimiter(rateLimiter);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(NetConfigNotification.class)
  @Test
  public void constructorOutputVoid() throws Exception {

    // Arrange
    final ReentrantLock reentrantLock = PowerMockito.mock(ReentrantLock.class);
    PowerMockito.whenNew(ReentrantLock.class).withNoArguments().thenReturn(reentrantLock);

    // Act, creating object to test constructor
    final NetConfigNotification actual = new NetConfigNotification();
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(NetConfigNotification.class)
  @Test
  public void freshNetRateInputPositiveOutputNullPointerException()
      throws Exception, InvocationTargetException {

    // Arrange
    final NetConfigNotification netConfigNotification =
        (NetConfigNotification)Reflector.getInstance(
            "com.alibaba.dragonfly.supernode.common.util.NetConfigNotification");
    final ReentrantLock reentrantLock = PowerMockito.mock(ReentrantLock.class);
    Reflector.setField(netConfigNotification, "lock", reentrantLock);
    Reflector.setField(netConfigNotification, "properties", null);
    final ArrayList<RateLimiter> arrayList = new ArrayList<RateLimiter>();
    Reflector.setField(netConfigNotification, "rateLimiters", arrayList);
    final int rate = 1;
    PowerMockito.whenNew(ReentrantLock.class).withNoArguments().thenReturn(reentrantLock);

    // Act
    thrown.expect(NullPointerException.class);
    netConfigNotification.freshNetRate(rate);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Logger.class, NetConfigNotification.class})
  @Test
  public void freshNetRateInputZeroOutputVoid() throws Exception {

    // Arrange
    final NetConfigNotification netConfigNotification = new NetConfigNotification();
    final ReentrantLock reentrantLock = PowerMockito.mock(ReentrantLock.class);
    Reflector.setField(netConfigNotification, "lock", reentrantLock);
    Reflector.setField(netConfigNotification, "properties", null);
    final ArrayList<RateLimiter> arrayList = new ArrayList<RateLimiter>();
    Reflector.setField(netConfigNotification, "rateLimiters", arrayList);
    final int rate = 0;
    PowerMockito.whenNew(ReentrantLock.class).withNoArguments().thenReturn(reentrantLock);

    // Act
    netConfigNotification.freshNetRate(rate);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void staticInitOutputVoid() throws InvocationTargetException {

    // Act, using constructor to test static initializer
    final Object constructed =
        Reflector.getInstance("com.alibaba.dragonfly.supernode.common.util.NetConfigNotification");

    // Assert side effects
    Assert.assertNotNull(Reflector.getInstanceField(NetConfigNotification.class, null, "logger"));
  }
}

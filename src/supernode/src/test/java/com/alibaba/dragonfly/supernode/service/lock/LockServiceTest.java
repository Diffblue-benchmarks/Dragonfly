package com.alibaba.dragonfly.supernode.service.lock;

import static org.mockito.Matchers.anyBoolean;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.alibaba.dragonfly.supernode.service.lock.LockService;
import com.diffblue.deeptestutils.Reflector;
import com.diffblue.deeptestutils.mock.DTUMemberMatcher;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.slf4j.Logger;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

@RunWith(PowerMockRunner.class)
public class LockServiceTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @PrepareForTest({ConcurrentHashMap.class, Logger.class, System.class, LockService.class,
                   Lock.class, Thread.class, ReadWriteLock.class})
  @Test
  public void
  gcInputPositiveOutputVoid() throws Exception, InterruptedException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);
    PowerMockito.mockStatic(Thread.class);

    // Arrange
    final LockService lockService = new LockService();
    final long expire = 133_681_841_662L;
    PowerMockito.when(System.currentTimeMillis())
        .thenReturn(1_515_585_600_000L)
        .thenReturn(1_515_585_600_000L);

    // Act
    lockService.gc(expire);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LockService.class, ConcurrentHashMap.class, Logger.class})
  @Test
  public void gcInputZeroOutputVoid() throws InterruptedException, Exception {

    // Arrange
    final LockService lockService = new LockService();

    // Act
    lockService.gc(0L);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ConcurrentHashMap.class, Lock.class, LockService.class, Logger.class,
                   Thread.class, ReadWriteLock.class})
  @Test
  public void
  gcInputZeroOutputVoid2() throws Exception, InterruptedException {

    // Setup mocks
    PowerMockito.mockStatic(Thread.class);

    // Arrange
    final LockService lockService = new LockService();
    final long expire = 0L;

    // Act
    lockService.gc(expire);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ConcurrentHashMap.class, Logger.class, System.class, LockService.class,
                   Lock.class, Thread.class, ReadWriteLock.class})
  @Test
  public void
  gcInputZeroOutputVoid3() throws Exception, InterruptedException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);
    PowerMockito.mockStatic(Thread.class);

    // Arrange
    final LockService lockService = new LockService();
    final long expire = 0L;
    PowerMockito.when(System.currentTimeMillis()).thenReturn(1_515_585_600_000L);

    // Act
    lockService.gc(expire);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ConcurrentHashMap.class, Logger.class, System.class, LockService.class,
                   Lock.class, Thread.class, ReadWriteLock.class})
  @Test
  public void
  gcInputZeroOutputVoid4() throws Exception, InterruptedException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);
    PowerMockito.mockStatic(Thread.class);

    // Arrange
    final LockService lockService = new LockService();
    final long expire = 0L;
    PowerMockito.when(System.currentTimeMillis())
        .thenReturn(1_515_585_600_000L)
        .thenReturn(1_515_585_600_000L);

    // Act
    lockService.gc(expire);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLockNameInputNotNullNotNullOutputNotNull() {

    // Arrange
    final LockService lockService = new LockService();

    // Act and Assert result
    Assert.assertEquals("@@@@@@@@@@", lockService.getLockName("@@@@@", "@@@@@"));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ConcurrentHashMap.class, LockService.class, System.class})
  @Test
  public void isAccessWindowInputNotNullNegativeOutputTrue() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final LockService lockService = new LockService();
    final String lockName = "";
    final long windowTime = -6_628_740_088_443_306_001L;
    PowerMockito.when(System.currentTimeMillis()).thenReturn(1_515_585_600_000L);

    // Act
    final boolean actual = lockService.isAccessWindow(lockName, windowTime);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ConcurrentHashMap.class, LockService.class, System.class})
  @Test
  public void isAccessWindowInputNotNullZeroOutputFalse() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final LockService lockService = new LockService();
    final String lockName = "";
    final long windowTime = 0L;
    PowerMockito.when(System.currentTimeMillis()).thenReturn(1_515_585_600_000L);

    // Act
    final boolean actual = lockService.isAccessWindow(lockName, windowTime);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LockService.class, ConcurrentHashMap.class})
  @Test
  public void isAccessWindowInputNotNullZeroOutputTrue() throws Exception {

    // Arrange
    final LockService lockService = new LockService();

    // Act and Assert result
    Assert.assertTrue(lockService.isAccessWindow("", 0L));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ConcurrentHashMap.class, System.class, LockService.class, Lock.class,
                   ReadWriteLock.class})
  @Test
  public void
  lockInputNotNullOutputClassCastException() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final LockService lockService = (LockService)Reflector.getInstance(
        "com.alibaba.dragonfly.supernode.service.lock.LockService");
    final String lockName = "?";
    PowerMockito.when(System.currentTimeMillis())
        .thenReturn(1_515_585_600_000L)
        .thenReturn(1_515_585_600_000L);

    // Act
    thrown.expect(ClassCastException.class);
    lockService.lock(lockName);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ConcurrentHashMap.class, System.class, LockService.class, Lock.class,
                   ReadWriteLock.class})
  @Test
  public void
  lockInputNotNullOutputNullPointerException() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final LockService lockService = (LockService)Reflector.getInstance(
        "com.alibaba.dragonfly.supernode.service.lock.LockService");
    final String lockName = "?";
    PowerMockito.when(System.currentTimeMillis())
        .thenReturn(1_515_585_600_000L)
        .thenReturn(1_515_585_600_000L);

    // Act
    thrown.expect(NullPointerException.class);
    lockService.lock(lockName);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ConcurrentHashMap.class, System.class, LockService.class, Lock.class,
                   ReadWriteLock.class})
  @Test
  public void
  lockInputNotNullOutputVoid() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final LockService lockService = new LockService();
    final String lockName = "";
    PowerMockito.when(System.currentTimeMillis()).thenReturn(1_515_585_600_000L);

    // Act
    lockService.lock(lockName);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ConcurrentHashMap.class, System.class, LockService.class, Lock.class,
                   ReadWriteLock.class})
  @Test
  public void
  lockInputNotNullOutputVoid2() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final LockService lockService = new LockService();
    final String lockName = "";
    final ReentrantLock reentrantLock1 = PowerMockito.mock(ReentrantLock.class);
    final ReentrantLock reentrantLock = PowerMockito.mock(ReentrantLock.class);
    PowerMockito.whenNew(ReentrantLock.class)
        .withNoArguments()
        .thenReturn(reentrantLock)
        .thenReturn(reentrantLock1);
    PowerMockito.when(System.currentTimeMillis())
        .thenReturn(1_515_585_600_000L)
        .thenReturn(1_515_585_600_000L);

    // Act
    lockService.lock(lockName);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ConcurrentHashMap.class, System.class, LockService.class, Lock.class,
                   ReadWriteLock.class})
  @Test
  public void
  lockInputNotNullOutputVoid3() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final LockService lockService = new LockService();
    final String lockName = "";
    final ReentrantLock reentrantLock1 = PowerMockito.mock(ReentrantLock.class);
    final ReentrantLock reentrantLock = PowerMockito.mock(ReentrantLock.class);
    PowerMockito.whenNew(ReentrantLock.class)
        .withNoArguments()
        .thenReturn(reentrantLock)
        .thenReturn(reentrantLock1);
    PowerMockito.when(System.currentTimeMillis())
        .thenReturn(1_515_585_600_000L)
        .thenReturn(1_515_585_600_000L);

    // Act
    lockService.lock(lockName);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ConcurrentHashMap.class, System.class, LockService.class, Lock.class,
                   ReadWriteLock.class})
  @Test
  public void
  lockTaskOnReadInputNotNullOutputClassCastException() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final LockService lockService = (LockService)Reflector.getInstance(
        "com.alibaba.dragonfly.supernode.service.lock.LockService");
    final String taskId = "?";
    final ReentrantReadWriteLock reentrantReadWriteLock =
        PowerMockito.mock(ReentrantReadWriteLock.class);
    PowerMockito.whenNew(ReentrantReadWriteLock.class)
        .withNoArguments()
        .thenReturn(reentrantReadWriteLock);
    PowerMockito.when(System.currentTimeMillis())
        .thenReturn(1_515_585_600_000L)
        .thenReturn(1_515_585_600_000L);

    // Act
    thrown.expect(ClassCastException.class);
    lockService.lockTaskOnRead(taskId);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ConcurrentHashMap.class, System.class, LockService.class, Lock.class,
                   ReadWriteLock.class})
  @Test
  public void
  lockTaskOnReadInputNotNullOutputNullPointerException()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final LockService lockService = (LockService)Reflector.getInstance(
        "com.alibaba.dragonfly.supernode.service.lock.LockService");
    final String taskId = "?";
    final ReentrantReadWriteLock reentrantReadWriteLock =
        PowerMockito.mock(ReentrantReadWriteLock.class);
    PowerMockito.whenNew(ReentrantReadWriteLock.class)
        .withNoArguments()
        .thenReturn(reentrantReadWriteLock);
    PowerMockito.when(System.currentTimeMillis())
        .thenReturn(1_515_585_600_000L)
        .thenReturn(1_515_585_600_000L);

    // Act
    thrown.expect(NullPointerException.class);
    lockService.lockTaskOnRead(taskId);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ConcurrentHashMap.class, System.class, LockService.class, Lock.class,
                   ReadWriteLock.class})
  @Test
  public void
  lockTaskOnReadInputNotNullOutputVoid() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final LockService lockService = new LockService();
    final String taskId = "00000";
    PowerMockito.when(System.currentTimeMillis()).thenReturn(1_515_585_600_000L);

    // Act
    lockService.lockTaskOnRead(taskId);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ConcurrentHashMap.class, System.class, LockService.class, Lock.class,
                   ReadWriteLock.class})
  @Test
  public void
  lockTaskOnReadInputNotNullOutputVoid2() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final LockService lockService = new LockService();
    final String taskId = "@@@@@";
    final ReentrantReadWriteLock reentrantReadWriteLock =
        PowerMockito.mock(ReentrantReadWriteLock.class);
    final Lock lock = PowerMockito.mock(Lock.class);
    final Method readLockMethod = DTUMemberMatcher.method(ReadWriteLock.class, "readLock");
    PowerMockito.doReturn(lock).when(reentrantReadWriteLock, readLockMethod).withNoArguments();
    PowerMockito.whenNew(ReentrantReadWriteLock.class)
        .withNoArguments()
        .thenReturn(reentrantReadWriteLock);
    PowerMockito.when(System.currentTimeMillis()).thenReturn(1_515_585_600_000L);

    // Act
    lockService.lockTaskOnRead(taskId);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ConcurrentHashMap.class, System.class, LockService.class, Lock.class,
                   ReadWriteLock.class})
  @Test
  public void
  lockTaskOnReadInputNotNullOutputVoid3() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final LockService lockService = new LockService();
    final String taskId = "00000";
    final ReentrantReadWriteLock reentrantReadWriteLock1 =
        PowerMockito.mock(ReentrantReadWriteLock.class);
    final Lock lock = PowerMockito.mock(Lock.class);
    final Method readLockMethod = DTUMemberMatcher.method(ReadWriteLock.class, "readLock");
    PowerMockito.doReturn(lock).when(reentrantReadWriteLock1, readLockMethod).withNoArguments();
    final ReentrantReadWriteLock reentrantReadWriteLock =
        PowerMockito.mock(ReentrantReadWriteLock.class);
    PowerMockito.whenNew(ReentrantReadWriteLock.class)
        .withNoArguments()
        .thenReturn(reentrantReadWriteLock)
        .thenReturn(reentrantReadWriteLock1);
    PowerMockito.when(System.currentTimeMillis())
        .thenReturn(1_515_585_600_000L)
        .thenReturn(1_515_585_600_000L);

    // Act
    lockService.lockTaskOnRead(taskId);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ConcurrentHashMap.class, System.class, LockService.class, Lock.class,
                   ReadWriteLock.class})
  @Test
  public void
  lockTaskOnWriteInputNotNullOutputVoid() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final LockService lockService = new LockService();
    final String taskId = "00000";
    PowerMockito.when(System.currentTimeMillis()).thenReturn(1_515_585_600_000L);

    // Act
    lockService.lockTaskOnWrite(taskId);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(LockService.class)
  @Test
  public void staticInitOutputVoid() throws Exception, InvocationTargetException {

    // Arrange
    final ReentrantReadWriteLock reentrantReadWriteLock =
        PowerMockito.mock(ReentrantReadWriteLock.class);
    PowerMockito.whenNew(ReentrantReadWriteLock.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(reentrantReadWriteLock);
    final ConcurrentHashMap concurrentHashMap3 = PowerMockito.mock(ConcurrentHashMap.class);
    final ConcurrentHashMap concurrentHashMap2 = PowerMockito.mock(ConcurrentHashMap.class);
    final ConcurrentHashMap concurrentHashMap1 = PowerMockito.mock(ConcurrentHashMap.class);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    PowerMockito.whenNew(ConcurrentHashMap.class)
        .withNoArguments()
        .thenReturn(concurrentHashMap)
        .thenReturn(concurrentHashMap1)
        .thenReturn(concurrentHashMap2)
        .thenReturn(concurrentHashMap3);

    // Act, using constructor to test static initializer
    final Object constructed =
        Reflector.getInstance("com.alibaba.dragonfly.supernode.service.lock.LockService");

    // Assert side effects
    Assert.assertNotNull(Reflector.getInstanceField(LockService.class, null, "gcLogger"));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ConcurrentHashMap.class, System.class, LockService.class, Lock.class,
                   ReadWriteLock.class})
  @Test
  public void
  tryLockInputNotNullOutputFalse() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final LockService lockService = new LockService();
    final String lockKey = "";
    PowerMockito.when(System.currentTimeMillis()).thenReturn(1_515_585_600_000L);

    // Act
    final boolean actual = lockService.tryLock(lockKey);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ConcurrentHashMap.class, System.class, LockService.class, Lock.class,
                   ReadWriteLock.class})
  @Test
  public void
  unlockInputNotNullOutputVoid() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final LockService lockService = new LockService();
    final String lockName = "";
    PowerMockito.when(System.currentTimeMillis()).thenReturn(1_515_585_600_000L);

    // Act
    lockService.unlock(lockName);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ConcurrentHashMap.class, System.class, LockService.class, Lock.class,
                   ReadWriteLock.class})
  @Test
  public void
  unlockTaskOnReadInputNotNullOutputVoid() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final LockService lockService = new LockService();
    final String taskId = "00000";
    PowerMockito.when(System.currentTimeMillis()).thenReturn(1_515_585_600_000L);

    // Act
    lockService.unlockTaskOnRead(taskId);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ConcurrentHashMap.class, System.class, LockService.class, Lock.class,
                   ReadWriteLock.class})
  @Test
  public void
  unlockTaskOnWriteInputNotNullOutputVoid() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final LockService lockService = new LockService();
    final String taskId = "00000";
    PowerMockito.when(System.currentTimeMillis()).thenReturn(1_515_585_600_000L);

    // Act
    lockService.unlockTaskOnWrite(taskId);

    // The method returns void, testing that no exception is thrown
  }
}

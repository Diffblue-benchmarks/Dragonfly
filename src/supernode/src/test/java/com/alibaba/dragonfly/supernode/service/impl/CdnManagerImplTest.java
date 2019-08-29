package com.alibaba.dragonfly.supernode.service.impl;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.anyBoolean;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;

import com.alibaba.dragonfly.supernode.service.impl.CdnManagerImpl;
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
import java.lang.reflect.Method;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@RunWith(PowerMockRunner.class)
@PowerMockIgnore({"javax.management.*"})
public class CdnManagerImplTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @PrepareForTest(CdnManagerImpl.class)
  @Test
  public void constructorOutputVoid() throws Exception {

    // Arrange
    final ThreadPoolExecutor threadPoolExecutor = PowerMockito.mock(ThreadPoolExecutor.class);
    PowerMockito.whenNew(ThreadPoolExecutor.class)
        .withParameterTypes(int.class, int.class, long.class, TimeUnit.class, BlockingQueue.class)
        .withArguments(anyInt(), anyInt(), anyLong(),
                       or(isA(TimeUnit.class), isNull(TimeUnit.class)),
                       or(isA(BlockingQueue.class), isNull(BlockingQueue.class)))
        .thenReturn(threadPoolExecutor);
    final SynchronousQueue synchronousQueue = PowerMockito.mock(SynchronousQueue.class);
    PowerMockito.whenNew(SynchronousQueue.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(synchronousQueue);

    // Act, creating object to test constructor
    final CdnManagerImpl actual = new CdnManagerImpl();
  }

  // Test written by Diffblue Cover.
  @Test
  public void runOutputNullPointerException() throws Throwable {
    final Class<?> classUnderTest =
        Reflector.forName("com.alibaba.dragonfly.supernode.service.impl.CdnManagerImpl$Trigger");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod("run");
    methodUnderTest.setAccessible(true);
    try {
      thrown.expect(NullPointerException.class);

      // Act
      methodUnderTest.invoke(null);
    } catch (InvocationTargetException ex) {

      // The method is not expected to return due to exception thrown
      throw ex.getCause();
    }
  }

  // Test written by Diffblue Cover.

  @Test
  public void staticInitOutputVoid() throws InvocationTargetException {

    // Act, using constructor to test static initializer
    final Object constructed =
        Reflector.getInstance("com.alibaba.dragonfly.supernode.service.impl.CdnManagerImpl");

    // Assert side effects
    Assert.assertNotNull(Reflector.getInstanceField(CdnManagerImpl.class, null, "logger"));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(CdnManagerImpl.class)
  @Test
  public void triggerCdnSyncActionInputNotNullOutputNullPointerException()
      throws Exception, InvocationTargetException {

    // Arrange
    final CdnManagerImpl cdnManagerImpl = (CdnManagerImpl)Reflector.getInstance(
        "com.alibaba.dragonfly.supernode.service.impl.CdnManagerImpl");
    Reflector.setField(cdnManagerImpl, "peerRegistryService", null);
    final ThreadPoolExecutor threadPoolExecutor = PowerMockito.mock(ThreadPoolExecutor.class);
    Reflector.setField(cdnManagerImpl, "cdnExecutor", threadPoolExecutor);
    Reflector.setField(cdnManagerImpl, "lockService", null);
    Reflector.setField(cdnManagerImpl, "taskService", null);
    final String taskId = "?";
    PowerMockito.whenNew(ThreadPoolExecutor.class)
        .withParameterTypes(int.class, int.class, long.class, TimeUnit.class, BlockingQueue.class)
        .withArguments(anyInt(), anyInt(), anyLong(),
                       or(isA(TimeUnit.class), isNull(TimeUnit.class)),
                       or(isA(BlockingQueue.class), isNull(BlockingQueue.class)))
        .thenReturn(threadPoolExecutor);
    final SynchronousQueue synchronousQueue = PowerMockito.mock(SynchronousQueue.class);
    PowerMockito.whenNew(SynchronousQueue.class)
        .withParameterTypes(boolean.class)
        .withArguments(anyBoolean())
        .thenReturn(synchronousQueue);

    // Act
    thrown.expect(NullPointerException.class);
    cdnManagerImpl.triggerCdnSyncAction(taskId);

    // The method is not expected to return due to exception thrown
  }
}

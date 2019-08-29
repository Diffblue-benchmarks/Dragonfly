package com.alibaba.dragonfly.supernode.service.cdn;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.alibaba.dragonfly.supernode.common.domain.Task;
import com.alibaba.dragonfly.supernode.common.enumeration.CdnStatus;
import com.alibaba.dragonfly.supernode.common.util.BeanPoolUtil;
import com.alibaba.dragonfly.supernode.service.TaskService;
import com.alibaba.dragonfly.supernode.service.cdn.CdnReporter;
import com.alibaba.dragonfly.supernode.service.cdn.FileMetaDataService;
import com.alibaba.dragonfly.supernode.service.cdn.SuperWriter;
import com.diffblue.deeptestutils.Reflector;
import com.diffblue.deeptestutils.mock.DTUMemberMatcher;
import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.api.mockito.expectation.PowerMockitoStubber;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@RunWith(PowerMockRunner.class)
public class SuperWriterTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void constructorInputNullNullNullNullOutputNotNull() throws IOException {

    // Act, creating object to test constructor
    final SuperWriter actual = new SuperWriter(null, null, null, null);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Task.class)
  @Test
  public void runOutputNullPointerException() throws Exception, InvocationTargetException {

    // Arrange
    final SuperWriter superWriter = (SuperWriter)Reflector.getInstance(
        "com.alibaba.dragonfly.supernode.service.cdn.SuperWriter");
    Reflector.setField(superWriter, "reusedCache", null);
    final Task task =
        (Task)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.Task");
    Reflector.setField(task, "notReachable", false);
    Reflector.setField(task, "md5", "?");
    Reflector.setField(task, "authIps", null);
    Reflector.setField(task, "fileLength", null);
    Reflector.setField(task, "bizId", "?");
    Reflector.setField(task, "pieceSize", null);
    Reflector.setField(task, "httpFileLen", null);
    Reflector.setField(task, "dfdaemon", false);
    Reflector.setField(task, "headers", null);
    Reflector.setField(task, "realMd5", null);
    Reflector.setField(task, "taskUrl", "??");
    Reflector.setField(task, "pieceTotal", -1);
    Reflector.setField(task, "curIp", "?");
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    Reflector.setField(task, "pieceMd5Map", concurrentHashMap);
    Reflector.setField(task, "sourceUrl", "?");
    Reflector.setField(task, "cdnStatus", CdnStatus.WAIT);
    Reflector.setField(task, "taskId", null);
    Reflector.setField(superWriter, "task", task);
    Reflector.setField(superWriter, "future", null);
    Reflector.setField(superWriter, "contQu", null);
    Reflector.setField(superWriter, "fc", null);
    Reflector.setField(superWriter, "raf", null);
    Reflector.setField(superWriter, "downLatch", null);
    PowerMockito.whenNew(ConcurrentHashMap.class).withNoArguments().thenReturn(concurrentHashMap);

    // Act
    thrown.expect(NullPointerException.class);
    superWriter.run();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(DigestUtils.class)
  @Test
  public void runOutputNullPointerException2() throws Throwable {

    // Setup mocks
    PowerMockito.mockStatic(DigestUtils.class);

    // Arrange
    final Object superWriterWriter = null;
    PowerMockito.doReturn(null).when(DigestUtils.class);
    DigestUtils.getMd5Digest();

    // Act
    thrown.expect(NullPointerException.class);
    try {
      final Class<?> classUnderTest =
          Reflector.forName("com.alibaba.dragonfly.supernode.service.cdn.SuperWriter$Writer");
      final Method methodUnderTest = classUnderTest.getDeclaredMethod("run");
      methodUnderTest.setAccessible(true);
      methodUnderTest.invoke(superWriterWriter);
    } catch (InvocationTargetException ex) {
      throw ex.getCause();
    }

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({SuperWriter.class, DigestUtils.class})
  @Test
  public void runOutputNullPointerException3() throws Throwable {

    // Setup mocks
    PowerMockito.mockStatic(DigestUtils.class);
    PowerMockito.mockStatic(SuperWriter.class);

    // Arrange
    final Object superWriterWriter = null;
    PowerMockito.doReturn(null).when(DigestUtils.class);
    DigestUtils.getMd5Digest();

    // Act
    thrown.expect(NullPointerException.class);
    try {
      final Class<?> classUnderTest =
          Reflector.forName("com.alibaba.dragonfly.supernode.service.cdn.SuperWriter$Writer");
      final Method methodUnderTest = classUnderTest.getDeclaredMethod("run");
      methodUnderTest.setAccessible(true);
      methodUnderTest.invoke(superWriterWriter);
    } catch (InvocationTargetException ex) {
      throw ex.getCause();
    }

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({SuperWriter.class, BeanPoolUtil.class, LoggerFactory.class})
  @Test
  public void staticInitOutputVoid() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(LoggerFactory.class);
    PowerMockito.mockStatic(BeanPoolUtil.class);

    // Arrange
    final ThreadPoolExecutor threadPoolExecutor1 = PowerMockito.mock(ThreadPoolExecutor.class);
    final ThreadPoolExecutor threadPoolExecutor = PowerMockito.mock(ThreadPoolExecutor.class);
    PowerMockito.whenNew(ThreadPoolExecutor.class)
        .withParameterTypes(int.class, int.class, long.class, TimeUnit.class, BlockingQueue.class)
        .withArguments(anyInt(), anyInt(), anyLong(),
                       or(isA(TimeUnit.class), isNull(TimeUnit.class)),
                       or(isA(BlockingQueue.class), isNull(BlockingQueue.class)))
        .thenReturn(threadPoolExecutor)
        .thenReturn(threadPoolExecutor1);
    final SynchronousQueue synchronousQueue1 = PowerMockito.mock(SynchronousQueue.class);
    final SynchronousQueue synchronousQueue = PowerMockito.mock(SynchronousQueue.class);
    PowerMockito.whenNew(SynchronousQueue.class)
        .withNoArguments()
        .thenReturn(synchronousQueue)
        .thenReturn(synchronousQueue1);
    final TaskService taskService1 = PowerMockito.mock(TaskService.class);
    final FileMetaDataService fileMetaDataService1 = PowerMockito.mock(FileMetaDataService.class);
    final CdnReporter cdnReporter1 = PowerMockito.mock(CdnReporter.class);
    final TaskService taskService = PowerMockito.mock(TaskService.class);
    final FileMetaDataService fileMetaDataService = PowerMockito.mock(FileMetaDataService.class);
    final CdnReporter cdnReporter = PowerMockito.mock(CdnReporter.class);
    final Method getBeanMethod =
        DTUMemberMatcher.method(BeanPoolUtil.class, "getBean", Class.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(cdnReporter)
         .doReturn(fileMetaDataService)
         .doReturn(taskService)
         .doReturn(cdnReporter1)
         .doReturn(fileMetaDataService1)
         .doReturn(taskService1))
        .when(BeanPoolUtil.class, getBeanMethod)
        .withArguments(or(isA(Class.class), isNull(Class.class)));
    final Logger logger1 = PowerMockito.mock(Logger.class);
    final Logger logger = PowerMockito.mock(Logger.class);
    final Method getLoggerMethod =
        DTUMemberMatcher.method(LoggerFactory.class, "getLogger", Class.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(logger).doReturn(logger1))
        .when(LoggerFactory.class, getLoggerMethod)
        .withArguments(or(isA(Class.class), isNull(Class.class)));

    // Act, using constructor to test static initializer
    final Object constructed =
        Reflector.getInstance("com.alibaba.dragonfly.supernode.service.cdn.SuperWriter");

    // The method returns void, testing that no exception is thrown
  }
}

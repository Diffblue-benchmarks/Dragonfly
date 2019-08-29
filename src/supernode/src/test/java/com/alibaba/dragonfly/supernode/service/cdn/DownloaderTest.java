package com.alibaba.dragonfly.supernode.service.cdn;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.alibaba.dragonfly.supernode.common.domain.Task;
import com.alibaba.dragonfly.supernode.common.enumeration.CdnStatus;
import com.alibaba.dragonfly.supernode.common.util.BeanPoolUtil;
import com.alibaba.dragonfly.supernode.common.util.PowerRateLimiter;
import com.alibaba.dragonfly.supernode.service.cdn.CacheDetector;
import com.alibaba.dragonfly.supernode.service.cdn.CdnReporter;
import com.alibaba.dragonfly.supernode.service.cdn.Downloader;
import com.alibaba.dragonfly.supernode.service.cdn.FileMetaDataService;
import com.diffblue.deeptestutils.Reflector;
import com.diffblue.deeptestutils.mock.DTUMemberMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.api.mockito.expectation.PowerMockitoStubber;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

@RunWith(PowerMockRunner.class)
@PowerMockIgnore({"javax.management.*"})
public class DownloaderTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @PrepareForTest(Task.class)
  @Test
  public void callOutputNullPointerException() throws Exception, InvocationTargetException {

    // Arrange
    final Downloader downloader =
        (Downloader)Reflector.getInstance("com.alibaba.dragonfly.supernode.service.cdn.Downloader");
    Reflector.setField(downloader, "future", null);
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
    Reflector.setField(task, "taskUrl", "?");
    Reflector.setField(task, "pieceTotal", -1);
    Reflector.setField(task, "curIp", "?");
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    Reflector.setField(task, "pieceMd5Map", concurrentHashMap);
    Reflector.setField(task, "sourceUrl", "?");
    Reflector.setField(task, "cdnStatus", CdnStatus.WAIT);
    Reflector.setField(task, "taskId", null);
    Reflector.setField(downloader, "task", task);
    PowerMockito.whenNew(ConcurrentHashMap.class).withNoArguments().thenReturn(concurrentHashMap);

    // Act
    thrown.expect(NullPointerException.class);
    downloader.call();

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Task.class)
  @Test
  public void constructorInputNotNullOutputVoid() throws Exception, InvocationTargetException {

    // Arrange
    final Task task =
        (Task)Reflector.getInstance("com.alibaba.dragonfly.supernode.common.domain.Task");
    task.setNotReachable(false);
    Reflector.setField(task, "md5", null);
    Reflector.setField(task, "authIps", null);
    task.setFileLength(null);
    task.setBizId(null);
    task.setPieceSize(null);
    task.setHttpFileLen(null);
    Reflector.setField(task, "dfdaemon", false);
    task.setHeaders(null);
    task.setRealMd5(null);
    task.setTaskUrl(null);
    task.setPieceTotal(-1);
    task.setCurIp(null);
    final ConcurrentHashMap<Integer, String> concurrentHashMap =
        PowerMockito.mock(ConcurrentHashMap.class);
    Reflector.setField(task, "pieceMd5Map", concurrentHashMap);
    task.setSourceUrl(null);
    task.setCdnStatus(CdnStatus.WAIT);
    task.setTaskId(null);
    PowerMockito.whenNew(ConcurrentHashMap.class).withNoArguments().thenReturn(concurrentHashMap);

    // Act, creating object to test constructor
    final Downloader actual = new Downloader(task);
  }

  // Test written by Diffblue Cover.
  @Test
  public void setFutureInputNullOutputVoid() {

    // Arrange
    final Downloader downloader = new Downloader(null);

    // Act
    downloader.setFuture(null);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({BeanPoolUtil.class, LoggerFactory.class})
  @Test
  public void staticInitOutputVoid() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(LoggerFactory.class);
    PowerMockito.mockStatic(BeanPoolUtil.class);

    // Arrange
    final PowerRateLimiter powerRateLimiter1 = PowerMockito.mock(PowerRateLimiter.class);
    final FileMetaDataService fileMetaDataService1 = PowerMockito.mock(FileMetaDataService.class);
    final CdnReporter cdnReporter1 = PowerMockito.mock(CdnReporter.class);
    final CacheDetector cacheDetector1 = PowerMockito.mock(CacheDetector.class);
    final PowerRateLimiter powerRateLimiter = PowerMockito.mock(PowerRateLimiter.class);
    final FileMetaDataService fileMetaDataService = PowerMockito.mock(FileMetaDataService.class);
    final CdnReporter cdnReporter = PowerMockito.mock(CdnReporter.class);
    final CacheDetector cacheDetector = PowerMockito.mock(CacheDetector.class);
    final Method getBeanMethod =
        DTUMemberMatcher.method(BeanPoolUtil.class, "getBean", Class.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(cacheDetector)
         .doReturn(cdnReporter)
         .doReturn(fileMetaDataService)
         .doReturn(powerRateLimiter)
         .doReturn(cacheDetector1)
         .doReturn(cdnReporter1)
         .doReturn(fileMetaDataService1)
         .doReturn(powerRateLimiter1))
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
        Reflector.getInstance("com.alibaba.dragonfly.supernode.service.cdn.Downloader");

    // The method returns void, testing that no exception is thrown
  }
}

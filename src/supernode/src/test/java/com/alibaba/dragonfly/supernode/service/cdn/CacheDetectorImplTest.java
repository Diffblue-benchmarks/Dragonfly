package com.alibaba.dragonfly.supernode.service.cdn;

import com.alibaba.dragonfly.supernode.common.domain.FileMetaData;
import com.alibaba.dragonfly.supernode.common.domain.Task;
import com.alibaba.dragonfly.supernode.common.enumeration.CdnStatus;
import com.alibaba.dragonfly.supernode.service.cdn.CacheDetectorImpl;
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
import java.util.concurrent.ConcurrentHashMap;

@RunWith(PowerMockRunner.class)
@PowerMockIgnore({"javax.management.*"})
public class CacheDetectorImplTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @PrepareForTest(Task.class)
  @Test
  public void checkSameFileInputNotNullNotNullOutputNullPointerException()
      throws Exception, InvocationTargetException {

    // Arrange
    final CacheDetectorImpl cacheDetectorImpl = (CacheDetectorImpl)Reflector.getInstance(
        "com.alibaba.dragonfly.supernode.service.cdn.CacheDetectorImpl");
    Reflector.setField(cacheDetectorImpl, "taskService", null);
    Reflector.setField(cacheDetectorImpl, "lockService", null);
    Reflector.setField(cacheDetectorImpl, "cdnReporter", null);
    Reflector.setField(cacheDetectorImpl, "fileMetaDataService", null);
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
    Reflector.setField(task, "curIp", null);
    final ConcurrentHashMap<Integer, String> concurrentHashMap =
        PowerMockito.mock(ConcurrentHashMap.class);
    Reflector.setField(task, "pieceMd5Map", concurrentHashMap);
    Reflector.setField(task, "sourceUrl", null);
    Reflector.setField(task, "cdnStatus", CdnStatus.WAIT);
    Reflector.setField(task, "taskId", null);
    final FileMetaData fileMetaData = (FileMetaData)Reflector.getInstance(
        "com.alibaba.dragonfly.supernode.common.domain.FileMetaData");
    Reflector.setField(fileMetaData, "md5", null);
    Reflector.setField(fileMetaData, "accessTime", 0L);
    Reflector.setField(fileMetaData, "bizId", null);
    Reflector.setField(fileMetaData, "success", false);
    Reflector.setField(fileMetaData, "taskId", null);
    Reflector.setField(fileMetaData, "interval", 0L);
    Reflector.setField(fileMetaData, "realMd5", null);
    Reflector.setField(fileMetaData, "httpFileLen", null);
    Reflector.setField(fileMetaData, "fileLength", null);
    Reflector.setField(fileMetaData, "url", null);
    Reflector.setField(fileMetaData, "finish", false);
    Reflector.setField(fileMetaData, "lastModified", 0L);
    Reflector.setField(fileMetaData, "pieceSize", null);
    PowerMockito.whenNew(ConcurrentHashMap.class).withNoArguments().thenReturn(concurrentHashMap);

    // Act
    thrown.expect(NullPointerException.class);
    cacheDetectorImpl.checkSameFile(task, fileMetaData);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void checkSameFileInputNullNotNullOutputFalse() {

    // Arrange
    final CacheDetectorImpl cacheDetectorImpl = new CacheDetectorImpl();
    final FileMetaData fileMetaData = new FileMetaData();

    // Act and Assert result
    Assert.assertFalse(cacheDetectorImpl.checkSameFile(null, fileMetaData));
  }

  // Test written by Diffblue Cover.
  @Test
  public void checkSameFileInputNullNullOutputFalse() {

    // Arrange
    final CacheDetectorImpl cacheDetectorImpl = new CacheDetectorImpl();

    // Act and Assert result
    Assert.assertFalse(cacheDetectorImpl.checkSameFile(null, null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final CacheDetectorImpl actual = new CacheDetectorImpl();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Task.class)
  @Test
  public void detectCacheInputNotNullOutputNullPointerException()
      throws Exception, InvocationTargetException {

    // Arrange
    final CacheDetectorImpl cacheDetectorImpl = (CacheDetectorImpl)Reflector.getInstance(
        "com.alibaba.dragonfly.supernode.service.cdn.CacheDetectorImpl");
    Reflector.setField(cacheDetectorImpl, "taskService", null);
    Reflector.setField(cacheDetectorImpl, "lockService", null);
    Reflector.setField(cacheDetectorImpl, "cdnReporter", null);
    Reflector.setField(cacheDetectorImpl, "fileMetaDataService", null);
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
    Reflector.setField(task, "curIp", null);
    final ConcurrentHashMap<Integer, String> concurrentHashMap =
        PowerMockito.mock(ConcurrentHashMap.class);
    Reflector.setField(task, "pieceMd5Map", concurrentHashMap);
    Reflector.setField(task, "sourceUrl", null);
    Reflector.setField(task, "cdnStatus", CdnStatus.WAIT);
    Reflector.setField(task, "taskId", null);
    PowerMockito.whenNew(ConcurrentHashMap.class).withNoArguments().thenReturn(concurrentHashMap);

    // Act
    thrown.expect(NullPointerException.class);
    cacheDetectorImpl.detectCache(task);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void detectCacheInputNullOutputNullPointerException() {

    // Arrange
    final CacheDetectorImpl cacheDetectorImpl = new CacheDetectorImpl();

    // Act
    thrown.expect(NullPointerException.class);
    cacheDetectorImpl.detectCache(null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void staticInitOutputVoid() throws InvocationTargetException {

    // Act, using constructor to test static initializer
    final Object constructed =
        Reflector.getInstance("com.alibaba.dragonfly.supernode.service.cdn.CacheDetectorImpl");

    // Assert side effects
    Assert.assertNotNull(Reflector.getInstanceField(CacheDetectorImpl.class, null, "logger"));
  }
}

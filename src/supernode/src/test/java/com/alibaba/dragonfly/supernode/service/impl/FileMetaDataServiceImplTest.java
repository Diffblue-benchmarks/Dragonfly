package com.alibaba.dragonfly.supernode.service.impl;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.alibaba.dragonfly.supernode.common.domain.Task;
import com.alibaba.dragonfly.supernode.common.enumeration.CdnStatus;
import com.alibaba.dragonfly.supernode.service.impl.FileMetaDataServiceImpl;
import com.diffblue.deeptestutils.Reflector;
import com.diffblue.deeptestutils.mock.DTUMemberMatcher;
import org.apache.commons.collections.CollectionUtils;
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

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@RunWith(PowerMockRunner.class)
public class FileMetaDataServiceImplTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final FileMetaDataServiceImpl actual = new FileMetaDataServiceImpl();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Task.class)
  @Test
  public void createMetaDataInputNotNullOutputNullPointerException()
      throws Exception, InvocationTargetException, IOException {

    // Arrange
    final FileMetaDataServiceImpl fileMetaDataServiceImpl =
        (FileMetaDataServiceImpl)Reflector.getInstance(
            "com.alibaba.dragonfly.supernode.service.impl.FileMetaDataServiceImpl");
    Reflector.setField(fileMetaDataServiceImpl, "lockService", null);
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
    fileMetaDataServiceImpl.createMetaData(task);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void createMetaDataInputNullOutputNullPointerException() throws IOException {

    // Arrange
    final FileMetaDataServiceImpl fileMetaDataServiceImpl = new FileMetaDataServiceImpl();

    // Act
    thrown.expect(NullPointerException.class);
    fileMetaDataServiceImpl.createMetaData(null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readFileMetaDataInputNotNullOutputNullPointerException() {

    // Arrange
    final FileMetaDataServiceImpl fileMetaDataServiceImpl = new FileMetaDataServiceImpl();

    // Act
    thrown.expect(NullPointerException.class);
    fileMetaDataServiceImpl.readFileMetaData("?");

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readPieceMd5InputNotNullNotNullOutputNullPointerException() {

    // Arrange
    final FileMetaDataServiceImpl fileMetaDataServiceImpl = new FileMetaDataServiceImpl();

    // Act
    thrown.expect(NullPointerException.class);
    fileMetaDataServiceImpl.readPieceMd5("?", "?");

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void staticInitOutputVoid() throws InvocationTargetException {

    // Act, using constructor to test static initializer
    final Object constructed = Reflector.getInstance(
        "com.alibaba.dragonfly.supernode.service.impl.FileMetaDataServiceImpl");

    // Assert side effects
    Assert.assertNotNull(Reflector.getInstanceField(FileMetaDataServiceImpl.class, null, "logger"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void updateAccessTimeInputNotNullZeroOutputNullPointerException() {

    // Arrange
    final FileMetaDataServiceImpl fileMetaDataServiceImpl = new FileMetaDataServiceImpl();

    // Act
    thrown.expect(NullPointerException.class);
    fileMetaDataServiceImpl.updateAccessTime("?", 0L);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void updateLastModifiedInputNotNullZeroOutputNullPointerException() {

    // Arrange
    final FileMetaDataServiceImpl fileMetaDataServiceImpl = new FileMetaDataServiceImpl();

    // Act
    thrown.expect(NullPointerException.class);
    fileMetaDataServiceImpl.updateLastModified("?", 0L);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void updateStatusAndResultInputNotNullFalseFalseNotNullNullOutputNullPointerException() {

    // Arrange
    final FileMetaDataServiceImpl fileMetaDataServiceImpl = new FileMetaDataServiceImpl();

    // Act
    thrown.expect(NullPointerException.class);
    fileMetaDataServiceImpl.updateStatusAndResult("?", false, false, "?", null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(CollectionUtils.class)
  @Test
  public void writePieceMd5InputNotNullNotNullNullOutputNullPointerException()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(CollectionUtils.class);

    // Arrange
    final FileMetaDataServiceImpl fileMetaDataServiceImpl =
        (FileMetaDataServiceImpl)Reflector.getInstance(
            "com.alibaba.dragonfly.supernode.service.impl.FileMetaDataServiceImpl");
    Reflector.setField(fileMetaDataServiceImpl, "lockService", null);
    final String taskId = "?";
    final String fileMd5 = "?";
    final List pieceMd5s = null;
    final Method isEmptyMethod =
        DTUMemberMatcher.method(CollectionUtils.class, "isEmpty", Collection.class);
    PowerMockito.doReturn(false)
        .when(CollectionUtils.class, isEmptyMethod)
        .withArguments(or(isA(Collection.class), isNull(Collection.class)));

    // Act
    thrown.expect(NullPointerException.class);
    fileMetaDataServiceImpl.writePieceMd5(taskId, fileMd5, pieceMd5s);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Logger.class, CollectionUtils.class})
  @Test
  public void writePieceMd5InputNotNullNotNullNullOutputVoid() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(CollectionUtils.class);

    // Arrange
    final FileMetaDataServiceImpl fileMetaDataServiceImpl = new FileMetaDataServiceImpl();
    Reflector.setField(fileMetaDataServiceImpl, "lockService", null);
    final String taskId = "@@";
    final String fileMd5 = "";
    final List pieceMd5s = null;
    final Method isEmptyMethod =
        DTUMemberMatcher.method(CollectionUtils.class, "isEmpty", Collection.class);
    PowerMockito.doReturn(true)
        .when(CollectionUtils.class, isEmptyMethod)
        .withArguments(or(isA(Collection.class), isNull(Collection.class)));

    // Act
    fileMetaDataServiceImpl.writePieceMd5(taskId, fileMd5, pieceMd5s);

    // The method returns void, testing that no exception is thrown
  }
}

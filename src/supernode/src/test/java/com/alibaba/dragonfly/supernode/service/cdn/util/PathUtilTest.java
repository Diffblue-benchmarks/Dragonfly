package com.alibaba.dragonfly.supernode.service.cdn.util;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.alibaba.dragonfly.supernode.service.cdn.util.PathUtil;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.slf4j.Logger;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RunWith(PowerMockRunner.class)
public class PathUtilTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final PathUtil actual = new PathUtil();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Logger.class)
  @Test
  public void deleteTaskFilesInputNotNullTrueOutputVoid() throws Exception {

    // Act
    PathUtil.deleteTaskFiles("!!", true);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Paths.class, PathUtil.class, Files.class, File.class})
  @Test
  public void deleteTaskFilesInputNotNullTrueOutputVoid2()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Paths.class);
    PowerMockito.mockStatic(Files.class);

    // Arrange
    final String taskId = "!!!!!!!";
    final boolean deleteUploadPath = true;
    PowerMockito
        .when(Files.deleteIfExists(or(Matchers.isA(Path.class), Matchers.isNull(Path.class))))
        .thenReturn(false)
        .thenReturn(false)
        .thenReturn(false)
        .thenReturn(false);
    final Path path3 = (Path)Reflector.getInstance("java.nio.file.Path");
    final Path path2 = (Path)Reflector.getInstance("java.nio.file.Path");
    final Path path1 = (Path)Reflector.getInstance("java.nio.file.Path");
    final Path path = (Path)Reflector.getInstance("java.nio.file.Path");
    PowerMockito
        .when(Paths.get(or(Matchers.isA(String.class), Matchers.isNull(String.class)),
                        Matchers.<String>anyVararg()))
        .thenReturn(path)
        .thenReturn(path1)
        .thenReturn(path2)
        .thenReturn(path3);

    // Act
    PathUtil.deleteTaskFiles(taskId, deleteUploadPath);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Paths.class, PathUtil.class, File.class})
  @Test
  public void getDownloadPathInputNotNullOutputNotNull()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Paths.class);

    // Arrange
    final String taskId = "!!!!!!!!";
    final Path path = (Path)Reflector.getInstance("java.nio.file.Path");
    PowerMockito
        .when(Paths.get(or(Matchers.isA(String.class), Matchers.isNull(String.class)),
                        Matchers.<String>anyVararg()))
        .thenReturn(path);

    // Act
    final Path actual = PathUtil.getDownloadPath(taskId);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getDownloadPathInputNotNullOutputStringIndexOutOfBoundsException() {

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    PathUtil.getDownloadPath("!!");

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({PathUtil.class, File.class})
  @Test
  public void getDownloadPathStrInputNotNullOutputNotNull() throws Exception {

    // Arrange
    final String taskId = "!!!";

    // Act
    final String actual = PathUtil.getDownloadPathStr(taskId);

    // Assert result
    Assert.assertEquals("/home/admin/supernode/repo/download/!!!/!!!", actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getDownloadPathStrInputNotNullOutputStringIndexOutOfBoundsException() {

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    PathUtil.getDownloadPathStr("!");

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getHttpPathInputNotNullOutputNotNull() {

    // Act and Assert result
    Assert.assertEquals("/qtdown/\"\"\"/\"\"\"", PathUtil.getHttpPath("\"\"\""));
  }

  // Test written by Diffblue Cover.
  @Test
  public void getHttpPathInputNotNullOutputStringIndexOutOfBoundsException() {

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    PathUtil.getHttpPath("\"");

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Paths.class, PathUtil.class, File.class})
  @Test
  public void getMd5DataPathInputNotNullOutputNotNull()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Paths.class);

    // Arrange
    final String taskId = "!!!";
    final Path path = (Path)Reflector.getInstance("java.nio.file.Path");
    PowerMockito
        .when(Paths.get(or(Matchers.isA(String.class), Matchers.isNull(String.class)),
                        Matchers.<String>anyVararg()))
        .thenReturn(path);

    // Act
    final Path actual = PathUtil.getMd5DataPath(taskId);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getMd5DataPathInputNotNullOutputStringIndexOutOfBoundsException() {

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    PathUtil.getMd5DataPath("!");

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Paths.class, PathUtil.class, File.class})
  @Test
  public void getMetaDataPathInputNotNullOutputNotNull()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Paths.class);

    // Arrange
    final String taskId = "!!!!";
    final Path path = (Path)Reflector.getInstance("java.nio.file.Path");
    PowerMockito
        .when(Paths.get(or(Matchers.isA(String.class), Matchers.isNull(String.class)),
                        Matchers.<String>anyVararg()))
        .thenReturn(path);

    // Act
    final Path actual = PathUtil.getMetaDataPath(taskId);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getMetaDataPathInputNotNullOutputStringIndexOutOfBoundsException() {

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    PathUtil.getMetaDataPath("!!");

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Paths.class, PathUtil.class, File.class})
  @Test
  public void getUploadPathInputNotNullOutputNotNull() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Paths.class);

    // Arrange
    final String taskId = "\"\"\"##";
    final Path path = (Path)Reflector.getInstance("java.nio.file.Path");
    PowerMockito
        .when(Paths.get(or(Matchers.isA(String.class), Matchers.isNull(String.class)),
                        Matchers.<String>anyVararg()))
        .thenReturn(path);

    // Act
    final Path actual = PathUtil.getUploadPath(taskId);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void staticInitOutputVoid() throws InvocationTargetException {

    // Act, using constructor to test static initializer
    final Object constructed =
        Reflector.getInstance("com.alibaba.dragonfly.supernode.service.cdn.util.PathUtil");

    // Assert side effects
    Assert.assertNotNull(Reflector.getInstanceField(PathUtil.class, null, "logger"));
  }
}

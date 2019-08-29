package com.alibaba.dragonfly.supernode.service.timer;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.alibaba.dragonfly.supernode.service.timer.DownSpaceCleaner;
import com.diffblue.deeptestutils.Reflector;
import com.diffblue.deeptestutils.mock.DTUMemberMatcher;
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
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

@RunWith(PowerMockRunner.class)
public class DownSpaceCleanerTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void compareInputNotNullNotNullOutputNegative()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {

    // Arrange
    final Long o1 = new Long(4_611_686_018_427_387_904L);
    final Long o2 = new Long(0L);
    final Class<?> classUnderTest =
        Reflector.forName("com.alibaba.dragonfly.supernode.service.timer.DownSpaceCleaner$1");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "compare", Reflector.forName("java.lang.Long"), Reflector.forName("java.lang.Long"));
    methodUnderTest.setAccessible(true);

    // Act
    final int actual = (int)methodUnderTest.invoke(null, o1, o2);

    // Assert result
    Assert.assertEquals(-1, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareInputNotNullNotNullOutputNegative2()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {

    // Arrange
    final Long o1 = new Long(4_611_686_018_427_387_904L);
    final Long o2 = new Long(0L);
    final Class<?> classUnderTest =
        Reflector.forName("com.alibaba.dragonfly.supernode.service.timer.DownSpaceCleaner$2");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "compare", Reflector.forName("java.lang.Long"), Reflector.forName("java.lang.Long"));
    methodUnderTest.setAccessible(true);

    // Act
    final int actual = (int)methodUnderTest.invoke(null, o1, o2);

    // Assert result
    Assert.assertEquals(-1, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareInputNotNullNotNullOutputPositive()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {

    // Arrange
    final Long o1 = new Long(-4_611_686_018_427_387_904L);
    final Long o2 = new Long(-4_611_686_018_427_387_903L);
    final Class<?> classUnderTest =
        Reflector.forName("com.alibaba.dragonfly.supernode.service.timer.DownSpaceCleaner$1");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "compare", Reflector.forName("java.lang.Long"), Reflector.forName("java.lang.Long"));
    methodUnderTest.setAccessible(true);

    // Act
    final int actual = (int)methodUnderTest.invoke(null, o1, o2);

    // Assert result
    Assert.assertEquals(1, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareInputNotNullNotNullOutputPositive2()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {

    // Arrange
    final Long o1 = new Long(-4_611_686_018_427_387_904L);
    final Long o2 = new Long(-4_611_686_018_427_387_903L);
    final Class<?> classUnderTest =
        Reflector.forName("com.alibaba.dragonfly.supernode.service.timer.DownSpaceCleaner$2");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "compare", Reflector.forName("java.lang.Long"), Reflector.forName("java.lang.Long"));
    methodUnderTest.setAccessible(true);

    // Act
    final int actual = (int)methodUnderTest.invoke(null, o1, o2);

    // Assert result
    Assert.assertEquals(1, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareInputNotNullNotNullOutputZero()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {

    // Arrange
    final Long o1 = new Long(0L);
    final Long o2 = new Long(0L);
    final Class<?> classUnderTest =
        Reflector.forName("com.alibaba.dragonfly.supernode.service.timer.DownSpaceCleaner$1");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "compare", Reflector.forName("java.lang.Long"), Reflector.forName("java.lang.Long"));
    methodUnderTest.setAccessible(true);

    // Act
    final int actual = (int)methodUnderTest.invoke(null, o1, o2);

    // Assert result
    Assert.assertEquals(0, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void compareInputNotNullNotNullOutputZero2()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {

    // Arrange
    final Long o1 = new Long(0L);
    final Long o2 = new Long(0L);
    final Class<?> classUnderTest =
        Reflector.forName("com.alibaba.dragonfly.supernode.service.timer.DownSpaceCleaner$2");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "compare", Reflector.forName("java.lang.Long"), Reflector.forName("java.lang.Long"));
    methodUnderTest.setAccessible(true);

    // Act
    final int actual = (int)methodUnderTest.invoke(null, o1, o2);

    // Assert result
    Assert.assertEquals(0, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final DownSpaceCleaner actual = new DownSpaceCleaner();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void fillConfInputNotNullNotNullZeroZeroZeroZeroOutputVoid() {

    // Arrange
    final DownSpaceCleaner downSpaceCleaner = new DownSpaceCleaner();

    // Act
    downSpaceCleaner.fillConf("00000000", "", 0L, 0L, 0, 0L);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Files.class, AtomicInteger.class, DownSpaceCleaner.class, File.class,
                   Logger.class, Paths.class})
  @Test
  public void
  gcInputFalseOutputVoid() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Paths.class);
    PowerMockito.mockStatic(Files.class);

    // Arrange
    final DownSpaceCleaner downSpaceCleaner = new DownSpaceCleaner();
    Reflector.setField(downSpaceCleaner, "youngGcThreshold", 0L);
    Reflector.setField(downSpaceCleaner, "fileMetaDataService", null);
    Reflector.setField(downSpaceCleaner, "cleanRatio", 0);
    Reflector.setField(downSpaceCleaner, "type", null);
    Reflector.setField(downSpaceCleaner, "lockService", null);
    Reflector.setField(downSpaceCleaner, "fullGcThreshold", 0L);
    final TreeMap<Long, List<String>> treeMap = new TreeMap<Long, List<String>>();
    Reflector.setField(downSpaceCleaner, "intervalInert", treeMap);
    Reflector.setField(downSpaceCleaner, "path", null);
    final TreeMap<Long, List<String>> treeMap1 = new TreeMap<Long, List<String>>();
    Reflector.setField(downSpaceCleaner, "gapInert", treeMap1);
    Reflector.setField(downSpaceCleaner, "intervalThreshold", 0L);
    Reflector.setField(downSpaceCleaner, "taskService", null);
    final ArrayList<String> arrayList = new ArrayList<String>();
    Reflector.setField(downSpaceCleaner, "gcTasks", arrayList);
    final boolean force = false;
    final AtomicInteger atomicInteger = PowerMockito.mock(AtomicInteger.class);
    final Method getMethod = DTUMemberMatcher.method(AtomicInteger.class, "get");
    PowerMockito.doReturn(0).when(atomicInteger, getMethod).withNoArguments();
    PowerMockito.whenNew(AtomicInteger.class)
        .withParameterTypes(int.class)
        .withArguments(Matchers.anyInt())
        .thenReturn(atomicInteger);
    final NullPointerException nullPointerException2 = new NullPointerException();
    final NullPointerException nullPointerException3 = new NullPointerException();
    Reflector.setField(nullPointerException3, "cause", nullPointerException3);
    Reflector.setField(nullPointerException3, "detailMessage", null);
    Reflector.setField(nullPointerException2, "cause", nullPointerException3);
    Reflector.setField(nullPointerException2, "detailMessage", null);
    final NullPointerException nullPointerException = new NullPointerException();
    final NullPointerException nullPointerException1 = new NullPointerException();
    Reflector.setField(nullPointerException1, "cause", nullPointerException1);
    Reflector.setField(nullPointerException1, "detailMessage", null);
    Reflector.setField(nullPointerException, "cause", nullPointerException1);
    Reflector.setField(nullPointerException, "detailMessage", null);
    PowerMockito.whenNew(File.class)
        .withParameterTypes(String.class)
        .withArguments(or(Matchers.isA(String.class), Matchers.isNull(String.class)))
        .thenThrow(nullPointerException)
        .thenThrow(nullPointerException2);
    final Path path = (Path)Reflector.getInstance("java.nio.file.Path");
    PowerMockito
        .when(Files.walkFileTree(
            or(Matchers.isA(Path.class), Matchers.isNull(Path.class)),
            or(Matchers.isA(FileVisitor.class), Matchers.isNull(FileVisitor.class))))
        .thenReturn(path);
    final Path path1 = (Path)Reflector.getInstance("java.nio.file.Path");
    PowerMockito
        .when(Paths.get(or(Matchers.isA(String.class), Matchers.isNull(String.class)),
                        Matchers.<String>anyVararg()))
        .thenReturn(path1);

    // Act
    downSpaceCleaner.gc(force);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Files.class, AtomicInteger.class, DownSpaceCleaner.class, File.class,
                   Logger.class, Paths.class})
  @Test
  public void
  gcInputTrueOutputVoid() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Paths.class);
    PowerMockito.mockStatic(Files.class);

    // Arrange
    final DownSpaceCleaner downSpaceCleaner = new DownSpaceCleaner();
    Reflector.setField(downSpaceCleaner, "youngGcThreshold", 0L);
    Reflector.setField(downSpaceCleaner, "fileMetaDataService", null);
    Reflector.setField(downSpaceCleaner, "cleanRatio", 0);
    Reflector.setField(downSpaceCleaner, "type", null);
    Reflector.setField(downSpaceCleaner, "lockService", null);
    Reflector.setField(downSpaceCleaner, "fullGcThreshold", 0L);
    final TreeMap<Long, List<String>> treeMap = new TreeMap<Long, List<String>>();
    Reflector.setField(downSpaceCleaner, "intervalInert", treeMap);
    Reflector.setField(downSpaceCleaner, "path", null);
    final TreeMap<Long, List<String>> treeMap1 = new TreeMap<Long, List<String>>();
    Reflector.setField(downSpaceCleaner, "gapInert", treeMap1);
    Reflector.setField(downSpaceCleaner, "intervalThreshold", 0L);
    Reflector.setField(downSpaceCleaner, "taskService", null);
    final ArrayList<String> arrayList = new ArrayList<String>();
    Reflector.setField(downSpaceCleaner, "gcTasks", arrayList);
    final boolean force = true;
    final AtomicInteger atomicInteger = PowerMockito.mock(AtomicInteger.class);
    final Method getMethod = DTUMemberMatcher.method(AtomicInteger.class, "get");
    PowerMockito.doReturn(0).when(atomicInteger, getMethod).withNoArguments();
    PowerMockito.whenNew(AtomicInteger.class)
        .withParameterTypes(int.class)
        .withArguments(Matchers.anyInt())
        .thenReturn(atomicInteger);
    final NullPointerException nullPointerException2 = new NullPointerException();
    final NullPointerException nullPointerException3 = new NullPointerException();
    Reflector.setField(nullPointerException3, "cause", nullPointerException3);
    Reflector.setField(nullPointerException3, "detailMessage", null);
    Reflector.setField(nullPointerException2, "cause", nullPointerException3);
    Reflector.setField(nullPointerException2, "detailMessage", null);
    final NullPointerException nullPointerException = new NullPointerException();
    final NullPointerException nullPointerException1 = new NullPointerException();
    Reflector.setField(nullPointerException1, "cause", nullPointerException1);
    Reflector.setField(nullPointerException1, "detailMessage", null);
    Reflector.setField(nullPointerException, "cause", nullPointerException1);
    Reflector.setField(nullPointerException, "detailMessage", null);
    PowerMockito.whenNew(File.class)
        .withParameterTypes(String.class)
        .withArguments(or(Matchers.isA(String.class), Matchers.isNull(String.class)))
        .thenThrow(nullPointerException)
        .thenThrow(nullPointerException2);
    final Path path = (Path)Reflector.getInstance("java.nio.file.Path");
    PowerMockito
        .when(Files.walkFileTree(
            or(Matchers.isA(Path.class), Matchers.isNull(Path.class)),
            or(Matchers.isA(FileVisitor.class), Matchers.isNull(FileVisitor.class))))
        .thenReturn(path);
    final Path path1 = (Path)Reflector.getInstance("java.nio.file.Path");
    PowerMockito
        .when(Paths.get(or(Matchers.isA(String.class), Matchers.isNull(String.class)),
                        Matchers.<String>anyVararg()))
        .thenReturn(path1);

    // Act
    downSpaceCleaner.gc(force);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void postVisitDirectoryInputNullNullOutputNull()
      throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
    final Class<?> classUnderTest =
        Reflector.forName("com.alibaba.dragonfly.supernode.service.timer.DownSpaceCleaner$Cleaner");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "postVisitDirectory", Reflector.forName("java.nio.file.Path"),
        Reflector.forName("java.io.IOException"));
    methodUnderTest.setAccessible(true);

    // Act
    final FileVisitResult actual = (FileVisitResult)methodUnderTest.invoke(null, null, null);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void preVisitDirectoryInputNullNullOutputNull()
      throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
    final Class<?> classUnderTest =
        Reflector.forName("com.alibaba.dragonfly.supernode.service.timer.DownSpaceCleaner$Cleaner");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "preVisitDirectory", Reflector.forName("java.nio.file.Path"),
        Reflector.forName("java.nio.file.attribute.BasicFileAttributes"));
    methodUnderTest.setAccessible(true);

    // Act
    final FileVisitResult actual = (FileVisitResult)methodUnderTest.invoke(null, null, null);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void visitFileFailedInputNullNullOutputNull()
      throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
    final Class<?> classUnderTest =
        Reflector.forName("com.alibaba.dragonfly.supernode.service.timer.DownSpaceCleaner$Cleaner");
    final Method methodUnderTest =
        classUnderTest.getDeclaredMethod("visitFileFailed", Reflector.forName("java.nio.file.Path"),
                                         Reflector.forName("java.io.IOException"));
    methodUnderTest.setAccessible(true);

    // Act
    final FileVisitResult actual = (FileVisitResult)methodUnderTest.invoke(null, null, null);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames =
                      {"com.alibaba.dragonfly.supernode.service.timer.DownSpaceCleaner$Cleaner"},
                  value = Files.class)
  @Test
  public void
  visitFileInputNullNullOutputNull() throws Exception, IOException, NoSuchMethodException,
                                            IllegalAccessException, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Files.class);

    // Arrange
    final Object downSpaceCleanerCleaner = null;
    final Path file = null;
    final BasicFileAttributes attrs = null;
    PowerMockito
        .when(Files.exists(or(Matchers.isA(Path.class), Matchers.isNull(Path.class)),
                           Matchers.<LinkOption>anyVararg()))
        .thenReturn(false);
    PowerMockito
        .when(Files.isRegularFile(or(Matchers.isA(Path.class), Matchers.isNull(Path.class)),
                                  Matchers.<LinkOption>anyVararg()))
        .thenReturn(false);

    // Act
    final Class<?> classUnderTest =
        Reflector.forName("com.alibaba.dragonfly.supernode.service.timer.DownSpaceCleaner$Cleaner");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "visitFile", Reflector.forName("java.nio.file.Path"),
        Reflector.forName("java.nio.file.attribute.BasicFileAttributes"));
    methodUnderTest.setAccessible(true);
    final FileVisitResult actual =
        (FileVisitResult)methodUnderTest.invoke(downSpaceCleanerCleaner, file, attrs);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames =
                      {"com.alibaba.dragonfly.supernode.service.timer.DownSpaceCleaner$Cleaner"},
                  value = Files.class)
  @Test
  public void
  visitFileInputNullNullOutputNullPointerException() throws Throwable {

    // Setup mocks
    PowerMockito.mockStatic(Files.class);

    // Arrange
    final Object downSpaceCleanerCleaner = null;
    final Path file = null;
    final BasicFileAttributes attrs = null;
    PowerMockito
        .when(Files.exists(or(Matchers.isA(Path.class), Matchers.isNull(Path.class)),
                           Matchers.<LinkOption>anyVararg()))
        .thenReturn(true);
    PowerMockito
        .when(Files.isRegularFile(or(Matchers.isA(Path.class), Matchers.isNull(Path.class)),
                                  Matchers.<LinkOption>anyVararg()))
        .thenReturn(false);

    // Act
    thrown.expect(NullPointerException.class);
    try {
      final Class<?> classUnderTest = Reflector.forName(
          "com.alibaba.dragonfly.supernode.service.timer.DownSpaceCleaner$Cleaner");
      final Method methodUnderTest = classUnderTest.getDeclaredMethod(
          "visitFile", Reflector.forName("java.nio.file.Path"),
          Reflector.forName("java.nio.file.attribute.BasicFileAttributes"));
      methodUnderTest.setAccessible(true);
      methodUnderTest.invoke(downSpaceCleanerCleaner, file, attrs);
    } catch (InvocationTargetException ex) {
      throw ex.getCause();
    }

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(fullyQualifiedNames =
                      {"com.alibaba.dragonfly.supernode.service.timer.DownSpaceCleaner$Cleaner"},
                  value = Files.class)
  @Test
  public void
  visitFileInputNullNullOutputNullPointerException2() throws Throwable {

    // Setup mocks
    PowerMockito.mockStatic(Files.class);

    // Arrange
    final Object downSpaceCleanerCleaner = null;
    final Path file = null;
    final BasicFileAttributes attrs = null;
    PowerMockito
        .when(Files.isRegularFile(or(Matchers.isA(Path.class), Matchers.isNull(Path.class)),
                                  Matchers.<LinkOption>anyVararg()))
        .thenReturn(true);

    // Act
    thrown.expect(NullPointerException.class);
    try {
      final Class<?> classUnderTest = Reflector.forName(
          "com.alibaba.dragonfly.supernode.service.timer.DownSpaceCleaner$Cleaner");
      final Method methodUnderTest = classUnderTest.getDeclaredMethod(
          "visitFile", Reflector.forName("java.nio.file.Path"),
          Reflector.forName("java.nio.file.attribute.BasicFileAttributes"));
      methodUnderTest.setAccessible(true);
      methodUnderTest.invoke(downSpaceCleanerCleaner, file, attrs);
    } catch (InvocationTargetException ex) {
      throw ex.getCause();
    }

    // The method is not expected to return due to exception thrown
  }
}

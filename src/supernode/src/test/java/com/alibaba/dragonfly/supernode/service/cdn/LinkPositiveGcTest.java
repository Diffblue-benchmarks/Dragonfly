package com.alibaba.dragonfly.supernode.service.cdn;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.alibaba.dragonfly.supernode.service.cdn.LinkPositiveGc;
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
public class LinkPositiveGcTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final LinkPositiveGc actual = new LinkPositiveGc();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Paths.class, LinkPositiveGc.class, Files.class, File.class})
  @Test
  public void gcInputNotNullOutputTrue() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Paths.class);
    PowerMockito.mockStatic(Files.class);

    // Arrange
    final LinkPositiveGc linkPositiveGc = new LinkPositiveGc();
    final String taskId = "\"\"\"##";
    PowerMockito
        .when(Files.deleteIfExists(or(Matchers.isA(Path.class), Matchers.isNull(Path.class))))
        .thenReturn(false);
    final Path path = (Path)Reflector.getInstance("java.nio.file.Path");
    PowerMockito
        .when(Paths.get(or(Matchers.isA(String.class), Matchers.isNull(String.class)),
                        Matchers.<String>anyVararg()))
        .thenReturn(path);

    // Act
    final boolean actual = linkPositiveGc.gc(taskId);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Logger.class)
  @Test
  public void gcInputNotNullOutputTrue2() throws Exception {

    // Arrange
    final LinkPositiveGc linkPositiveGc = new LinkPositiveGc();

    // Act and Assert result
    Assert.assertTrue(linkPositiveGc.gc(""));
  }

  // Test written by Diffblue Cover.

  @Test
  public void staticInitOutputVoid() throws InvocationTargetException {

    // Act, using constructor to test static initializer
    final Object constructed =
        Reflector.getInstance("com.alibaba.dragonfly.supernode.service.cdn.LinkPositiveGc");

    // Assert side effects
    Assert.assertNotNull(Reflector.getInstanceField(LinkPositiveGc.class, null, "logger"));
  }
}

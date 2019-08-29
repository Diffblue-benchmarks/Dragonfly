package com.alibaba.dragonfly.supernode.common.util;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.alibaba.dragonfly.supernode.common.util.MonitorService;
import com.diffblue.deeptestutils.Reflector;
import com.diffblue.deeptestutils.mock.DTUMemberMatcher;
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

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RunWith(PowerMockRunner.class)
@PowerMockIgnore({"javax.management.*"})
public class MonitorServiceTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void constructorInputNullNullOutputNotNull()
      throws NoSuchMethodException, IllegalAccessException, InstantiationException,
             InvocationTargetException {
    final Class<?> classUnderTest =
        Reflector.forName("com.alibaba.dragonfly.supernode.common.util.MonitorService$1$1");
    final Constructor<?> ctor = classUnderTest.getDeclaredConstructor(
        Reflector.forName("com.alibaba.dragonfly.supernode.common.util.MonitorService$1"),
        Reflector.forName("java.lang.Process"));
    ctor.setAccessible(true);

    // Act
    final Object actual = (Object)ctor.newInstance(null, null);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final MonitorService actual = new MonitorService();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void highPressureOutputFalse() {

    // Arrange
    final MonitorService monitorService = new MonitorService();

    // Act and Assert result
    Assert.assertFalse(monitorService.highPressure());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(
      fullyQualifiedNames = {"com.alibaba.dragonfly.supernode.common.util.MonitorService$1"},
      value = Runtime.class)
  @Test
  public void
  runOutputNullPointerException() throws Throwable {

    // Setup mocks
    PowerMockito.mockStatic(Runtime.class);

    // Arrange
    final Object monitorService1 = null;
    PowerMockito.doReturn(null).when(Runtime.class);
    Runtime.getRuntime();

    // Act
    thrown.expect(NullPointerException.class);
    try {
      final Class<?> classUnderTest =
          Reflector.forName("com.alibaba.dragonfly.supernode.common.util.MonitorService$1");
      final Method methodUnderTest = classUnderTest.getDeclaredMethod("run");
      methodUnderTest.setAccessible(true);
      methodUnderTest.invoke(monitorService1);
    } catch (InvocationTargetException ex) {
      throw ex.getCause();
    }

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void runOutputNullPointerException2() throws Throwable {
    final Class<?> classUnderTest =
        Reflector.forName("com.alibaba.dragonfly.supernode.common.util.MonitorService$1$1");
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
  @PrepareForTest({Thread.class, MonitorService.class, Logger.class})
  @Test
  public void startMonitorOutputVoid() throws Exception {

    // Arrange
    final MonitorService monitorService = new MonitorService();
    Reflector.setField(monitorService, "ioLoad", 0.0f);
    Reflector.setField(monitorService, "cpuLoad", 0.0f);
    final Thread thread = PowerMockito.mock(Thread.class);
    PowerMockito.whenNew(Thread.class)
        .withParameterTypes(Runnable.class)
        .withArguments(or(isA(Runnable.class), isNull(Runnable.class)))
        .thenReturn(thread);

    // Act
    monitorService.startMonitor();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({MonitorService.class, Runtime.class})
  @Test
  public void staticInitOutputVoid() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Runtime.class);

    // Arrange
    final Runtime runtime = PowerMockito.mock(Runtime.class);
    final Method availableProcessorsMethod =
        DTUMemberMatcher.method(Runtime.class, "availableProcessors");
    PowerMockito.doReturn(0).when(runtime, availableProcessorsMethod).withNoArguments();
    PowerMockito.doReturn(runtime).when(Runtime.class);
    Runtime.getRuntime();

    // Act, using constructor to test static initializer
    final Object constructed =
        Reflector.getInstance("com.alibaba.dragonfly.supernode.common.util.MonitorService");

    // Assert side effects
    Assert.assertEquals(0, Reflector.getInstanceField(MonitorService.class, null, "cpuNum"));
    Assert.assertNotNull(Reflector.getInstanceField(MonitorService.class, null, "logger"));
  }
}

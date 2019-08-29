package com.alibaba.dragonfly.supernode.service.timer;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.alibaba.dragonfly.supernode.common.util.BeanPoolUtil;
import com.alibaba.dragonfly.supernode.service.timer.DataGcService;
import com.diffblue.deeptestutils.Reflector;
import com.diffblue.deeptestutils.mock.DTUMemberMatcher;
import org.apache.commons.lang3.StringUtils;
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

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@RunWith(PowerMockRunner.class)
@PowerMockIgnore({"javax.management.*"})
public class DataGcServiceTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final DataGcService actual = new DataGcService();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Logger.class)
  @Test
  public void dataGcOutputVoid() throws Exception {

    // Arrange
    final DataGcService dataGcService = new DataGcService();

    // Act
    dataGcService.dataGc();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({List.class, Logger.class, BeanPoolUtil.class, ConcurrentHashMap.class,
                   DataGcService.class})
  @Test
  public void
  dataGcOutputVoid2() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(BeanPoolUtil.class);

    // Arrange
    final DataGcService dataGcService = new DataGcService();
    Reflector.setField(dataGcService, "progressRepo", null);
    Reflector.setField(dataGcService, "linkPositiveGc", null);
    Reflector.setField(dataGcService, "peerTaskService", null);
    Reflector.setField(dataGcService, "lockService", null);
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    final Method getBeansMethod =
        DTUMemberMatcher.method(BeanPoolUtil.class, "getBeans", Class.class);
    PowerMockito.doReturn(arrayList)
        .when(BeanPoolUtil.class, getBeansMethod)
        .withArguments(or(isA(Class.class), isNull(Class.class)));

    // Act
    dataGcService.dataGc();

    // Assert side effects
    final ArrayList arrayList1 = new ArrayList();
    arrayList1.add(null);
    Assert.assertEquals(arrayList1,
                        Reflector.getInstanceField(DataGcService.class, null, "recyclableBeans"));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({List.class, Logger.class, BeanPoolUtil.class, ConcurrentHashMap.class,
                   DataGcService.class})
  @Test
  public void
  dataGcOutputVoid3() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(BeanPoolUtil.class);

    // Arrange
    final DataGcService dataGcService = new DataGcService();
    Reflector.setField(dataGcService, "progressRepo", null);
    Reflector.setField(dataGcService, "linkPositiveGc", null);
    Reflector.setField(dataGcService, "peerTaskService", null);
    Reflector.setField(dataGcService, "lockService", null);
    final ArrayList arrayList = new ArrayList();
    arrayList.add(null);
    final Method getBeansMethod =
        DTUMemberMatcher.method(BeanPoolUtil.class, "getBeans", Class.class);
    PowerMockito.doReturn(arrayList)
        .when(BeanPoolUtil.class, getBeansMethod)
        .withArguments(or(isA(Class.class), isNull(Class.class)));

    // Act
    dataGcService.dataGc();

    // Assert side effects
    final ArrayList arrayList1 = new ArrayList();
    arrayList1.add(null);
    Assert.assertEquals(arrayList1,
                        Reflector.getInstanceField(DataGcService.class, null, "recyclableBeans"));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({List.class, Logger.class, BeanPoolUtil.class, ConcurrentHashMap.class,
                   DataGcService.class})
  @Test
  public void
  dataGcOutputVoid4() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(BeanPoolUtil.class);

    // Arrange
    final DataGcService dataGcService = (DataGcService)Reflector.getInstance(
        "com.alibaba.dragonfly.supernode.service.timer.DataGcService");
    Reflector.setField(dataGcService, "progressRepo", null);
    Reflector.setField(dataGcService, "linkPositiveGc", null);
    Reflector.setField(dataGcService, "peerTaskService", null);
    Reflector.setField(dataGcService, "lockService", null);
    final Method getBeansMethod =
        DTUMemberMatcher.method(BeanPoolUtil.class, "getBeans", Class.class);
    PowerMockito.doReturn(null)
        .when(BeanPoolUtil.class, getBeansMethod)
        .withArguments(or(isA(Class.class), isNull(Class.class)));

    // Act
    dataGcService.dataGc();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({List.class, Logger.class, BeanPoolUtil.class, ConcurrentHashMap.class,
                   DataGcService.class})
  @Test
  public void
  dataGcOutputVoid5() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(BeanPoolUtil.class);

    // Arrange
    final DataGcService dataGcService = (DataGcService)Reflector.getInstance(
        "com.alibaba.dragonfly.supernode.service.timer.DataGcService");
    Reflector.setField(dataGcService, "progressRepo", null);
    Reflector.setField(dataGcService, "linkPositiveGc", null);
    Reflector.setField(dataGcService, "peerTaskService", null);
    Reflector.setField(dataGcService, "lockService", null);
    final Method getBeansMethod =
        DTUMemberMatcher.method(BeanPoolUtil.class, "getBeans", Class.class);
    PowerMockito.doReturn(null)
        .when(BeanPoolUtil.class, getBeansMethod)
        .withArguments(or(isA(Class.class), isNull(Class.class)));

    // Act
    dataGcService.dataGc();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({List.class, Logger.class, BeanPoolUtil.class, ConcurrentHashMap.class,
                   DataGcService.class})
  @Test
  public void
  dataGcOutputVoid6() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(BeanPoolUtil.class);

    // Arrange
    final DataGcService dataGcService = (DataGcService)Reflector.getInstance(
        "com.alibaba.dragonfly.supernode.service.timer.DataGcService");
    Reflector.setField(dataGcService, "progressRepo", null);
    Reflector.setField(dataGcService, "linkPositiveGc", null);
    Reflector.setField(dataGcService, "peerTaskService", null);
    Reflector.setField(dataGcService, "lockService", null);
    final Method getBeansMethod =
        DTUMemberMatcher.method(BeanPoolUtil.class, "getBeans", Class.class);
    PowerMockito.doReturn(null)
        .when(BeanPoolUtil.class, getBeansMethod)
        .withArguments(or(isA(Class.class), isNull(Class.class)));

    // Act
    dataGcService.dataGc();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({List.class, Logger.class, BeanPoolUtil.class, ConcurrentHashMap.class,
                   DataGcService.class})
  @Test
  public void
  dataGcOutputVoid7() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(BeanPoolUtil.class);

    // Arrange
    final DataGcService dataGcService = (DataGcService)Reflector.getInstance(
        "com.alibaba.dragonfly.supernode.service.timer.DataGcService");
    Reflector.setField(dataGcService, "progressRepo", null);
    Reflector.setField(dataGcService, "linkPositiveGc", null);
    Reflector.setField(dataGcService, "peerTaskService", null);
    Reflector.setField(dataGcService, "lockService", null);
    final Method getBeansMethod =
        DTUMemberMatcher.method(BeanPoolUtil.class, "getBeans", Class.class);
    PowerMockito.doReturn(null)
        .when(BeanPoolUtil.class, getBeansMethod)
        .withArguments(or(isA(Class.class), isNull(Class.class)));

    // Act
    dataGcService.dataGc();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(DataGcService.class)
  @Test
  public void staticInitOutputVoid() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    PowerMockito.whenNew(ConcurrentHashMap.class).withNoArguments().thenReturn(concurrentHashMap);

    // Act, using constructor to test static initializer
    final Object constructed =
        Reflector.getInstance("com.alibaba.dragonfly.supernode.service.timer.DataGcService");

    // Assert side effects
    Assert.assertNotNull(Reflector.getInstanceField(DataGcService.class, null, "logger"));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(StringUtils.class)
  @Test
  public void updateAccessTimeInputNotNullOutputVoid() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final DataGcService dataGcService = new DataGcService();
    Reflector.setField(dataGcService, "progressRepo", null);
    Reflector.setField(dataGcService, "linkPositiveGc", null);
    Reflector.setField(dataGcService, "peerTaskService", null);
    Reflector.setField(dataGcService, "lockService", null);
    final String taskId = "";
    final Method isNotBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isNotBlank", CharSequence.class);
    PowerMockito.doReturn(false)
        .when(StringUtils.class, isNotBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    dataGcService.updateAccessTime(taskId);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StringUtils.class, ConcurrentHashMap.class, DataGcService.class, System.class})
  @Test
  public void updateAccessTimeInputNotNullOutputVoid2() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(System.class);
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final DataGcService dataGcService = new DataGcService();
    Reflector.setField(dataGcService, "progressRepo", null);
    Reflector.setField(dataGcService, "linkPositiveGc", null);
    Reflector.setField(dataGcService, "peerTaskService", null);
    Reflector.setField(dataGcService, "lockService", null);
    final String taskId = "";
    final Method isNotBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isNotBlank", CharSequence.class);
    PowerMockito.doReturn(true)
        .when(StringUtils.class, isNotBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));
    PowerMockito.when(System.currentTimeMillis()).thenReturn(1_515_585_600_000L);

    // Act
    dataGcService.updateAccessTime(taskId);

    // The method returns void, testing that no exception is thrown
  }
}

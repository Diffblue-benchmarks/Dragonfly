package com.alibaba.dragonfly.supernode.repository;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.alibaba.dragonfly.supernode.common.util.BeanPoolUtil;
import com.alibaba.dragonfly.supernode.common.util.PowerRateLimiter;
import com.alibaba.dragonfly.supernode.repository.PieceState;
import com.alibaba.dragonfly.supernode.repository.ProgressRepository;
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
import org.powermock.api.mockito.expectation.PowerMockitoStubber;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

@RunWith(PowerMockRunner.class)
@PowerMockIgnore({"javax.management.*"})
public class PieceStateTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @PrepareForTest(PieceState.class)
  @Test
  public void constructorInputNullOutputVoid() throws Exception {

    // Arrange
    final Integer pieceSize = null;
    final ArrayBlockingQueue arrayBlockingQueue = PowerMockito.mock(ArrayBlockingQueue.class);
    PowerMockito.whenNew(ArrayBlockingQueue.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(arrayBlockingQueue);

    // Act, creating object to test constructor
    final PieceState actual = new PieceState(pieceSize);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(PieceState.class)
  @Test
  public void getDistributedCountOutputZero() throws Exception, InvocationTargetException {

    // Arrange
    final PieceState pieceState =
        (PieceState)Reflector.getInstance("com.alibaba.dragonfly.supernode.repository.PieceState");
    Reflector.setField(pieceState, "distributedCount", 0);
    final ArrayBlockingQueue<String> arrayBlockingQueue =
        PowerMockito.mock(ArrayBlockingQueue.class);
    Reflector.setField(pieceState, "pieceContainer", arrayBlockingQueue);
    Reflector.setField(pieceState, "pieceSize", null);
    Reflector.setField(pieceState, "superCid", null);
    PowerMockito.whenNew(ArrayBlockingQueue.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(arrayBlockingQueue);

    // Act
    final int actual = pieceState.getDistributedCount();

    // Assert result
    Assert.assertEquals(0, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({StringUtils.class, PieceState.class})
  @Test
  public void offerProducerInputNotNullOutputFalse() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final PieceState pieceState =
        (PieceState)Reflector.getInstance("com.alibaba.dragonfly.supernode.repository.PieceState");
    Reflector.setField(pieceState, "distributedCount", 0);
    final ArrayBlockingQueue<String> arrayBlockingQueue =
        PowerMockito.mock(ArrayBlockingQueue.class);
    Reflector.setField(pieceState, "pieceContainer", arrayBlockingQueue);
    Reflector.setField(pieceState, "pieceSize", null);
    Reflector.setField(pieceState, "superCid", null);
    final String cid = "                                ";
    PowerMockito.whenNew(ArrayBlockingQueue.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(arrayBlockingQueue);
    final Method isBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isBlank", CharSequence.class);
    PowerMockito.doReturn(true)
        .when(StringUtils.class, isBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    final boolean actual = pieceState.offerProducer(cid);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({BeanPoolUtil.class, LoggerFactory.class, PieceState.class,
                   ArrayBlockingQueue.class, ProgressRepository.class, AtomicInteger.class})
  @Test
  public void
  popProducerInputNotNullNotNullZeroOutputClassCastException()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(BeanPoolUtil.class);
    PowerMockito.mockStatic(LoggerFactory.class);

    // Arrange
    final PieceState pieceState =
        (PieceState)Reflector.getInstance("com.alibaba.dragonfly.supernode.repository.PieceState");
    Reflector.setField(pieceState, "distributedCount", 0);
    final ArrayBlockingQueue<String> arrayBlockingQueue =
        PowerMockito.mock(ArrayBlockingQueue.class);
    final Method sizeMethod = DTUMemberMatcher.method(ArrayBlockingQueue.class, "size");
    PowerMockito.doReturn(2).when(arrayBlockingQueue, sizeMethod).withNoArguments();
    final Method peekMethod = DTUMemberMatcher.method(ArrayBlockingQueue.class, "peek");
    PowerMockito.doReturn(0).when(arrayBlockingQueue, peekMethod).withNoArguments();
    Reflector.setField(pieceState, "pieceContainer", arrayBlockingQueue);
    Reflector.setField(pieceState, "pieceSize", null);
    Reflector.setField(pieceState, "superCid", null);
    final String taskId = "?";
    final String srcCid = "?";
    final int pieceLen = 0;
    PowerMockito.whenNew(ArrayBlockingQueue.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(arrayBlockingQueue);
    final Logger logger = PowerMockito.mock(Logger.class);
    final Method getLoggerMethod =
        DTUMemberMatcher.method(LoggerFactory.class, "getLogger", Class.class);
    PowerMockito.doReturn(logger)
        .when(LoggerFactory.class, getLoggerMethod)
        .withArguments(or(isA(Class.class), isNull(Class.class)));
    final ProgressRepository progressRepository = PowerMockito.mock(ProgressRepository.class);
    final Method getClientBlackInfoMethod =
        DTUMemberMatcher.method(ProgressRepository.class, "getClientBlackInfo", String.class);
    PowerMockito.doReturn(null)
        .when(progressRepository, getClientBlackInfoMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));
    final AtomicInteger atomicInteger = PowerMockito.mock(AtomicInteger.class);
    final Method getMethod = DTUMemberMatcher.method(AtomicInteger.class, "get");
    PowerMockito.doReturn(-2_147_483_641).when(atomicInteger, getMethod).withNoArguments();
    final Method getClientErrorInfoMethod =
        DTUMemberMatcher.method(ProgressRepository.class, "getClientErrorInfo", String.class);
    PowerMockito.doReturn(atomicInteger)
        .when(progressRepository, getClientErrorInfoMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));
    final Method getBeanMethod =
        DTUMemberMatcher.method(BeanPoolUtil.class, "getBean", Class.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(progressRepository).doReturn(null))
        .when(BeanPoolUtil.class, getBeanMethod)
        .withArguments(or(isA(Class.class), isNull(Class.class)));
    final Logger logger1 = PowerMockito.mock(Logger.class);
    final Method getLoggerMethod1 =
        DTUMemberMatcher.method(LoggerFactory.class, "getLogger", String.class);
    PowerMockito.doReturn(logger1)
        .when(LoggerFactory.class, getLoggerMethod1)
        .withArguments(or(isA(String.class), isNull(String.class)));

    // Act
    thrown.expect(ClassCastException.class);
    pieceState.popProducer(taskId, srcCid, pieceLen);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({BeanPoolUtil.class, PieceState.class, ArrayBlockingQueue.class,
                   ProgressRepository.class, LoggerFactory.class})
  @Test
  public void
  popProducerInputNotNullNotNullZeroOutputClassCastException2()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(BeanPoolUtil.class);
    PowerMockito.mockStatic(LoggerFactory.class);

    // Arrange
    final PieceState pieceState =
        (PieceState)Reflector.getInstance("com.alibaba.dragonfly.supernode.repository.PieceState");
    Reflector.setField(pieceState, "distributedCount", 0);
    final ArrayBlockingQueue<String> arrayBlockingQueue =
        PowerMockito.mock(ArrayBlockingQueue.class);
    final Method sizeMethod = DTUMemberMatcher.method(ArrayBlockingQueue.class, "size");
    PowerMockito.doReturn(2).when(arrayBlockingQueue, sizeMethod).withNoArguments();
    final Method peekMethod = DTUMemberMatcher.method(ArrayBlockingQueue.class, "peek");
    PowerMockito.doReturn(0).when(arrayBlockingQueue, peekMethod).withNoArguments();
    Reflector.setField(pieceState, "pieceContainer", arrayBlockingQueue);
    Reflector.setField(pieceState, "pieceSize", null);
    Reflector.setField(pieceState, "superCid", null);
    final String taskId = "?";
    final String srcCid = "?";
    final int pieceLen = 0;
    PowerMockito.whenNew(ArrayBlockingQueue.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(arrayBlockingQueue);
    final Logger logger = PowerMockito.mock(Logger.class);
    final Method getLoggerMethod =
        DTUMemberMatcher.method(LoggerFactory.class, "getLogger", Class.class);
    PowerMockito.doReturn(logger)
        .when(LoggerFactory.class, getLoggerMethod)
        .withArguments(or(isA(Class.class), isNull(Class.class)));
    final ProgressRepository progressRepository = PowerMockito.mock(ProgressRepository.class);
    final Method getClientBlackInfoMethod =
        DTUMemberMatcher.method(ProgressRepository.class, "getClientBlackInfo", String.class);
    PowerMockito.doReturn(null)
        .when(progressRepository, getClientBlackInfoMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));
    final Method getClientErrorInfoMethod =
        DTUMemberMatcher.method(ProgressRepository.class, "getClientErrorInfo", String.class);
    PowerMockito.doReturn(null)
        .when(progressRepository, getClientErrorInfoMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));
    final Method getBeanMethod =
        DTUMemberMatcher.method(BeanPoolUtil.class, "getBean", Class.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(progressRepository).doReturn(null))
        .when(BeanPoolUtil.class, getBeanMethod)
        .withArguments(or(isA(Class.class), isNull(Class.class)));
    final Logger logger1 = PowerMockito.mock(Logger.class);
    final Method getLoggerMethod1 =
        DTUMemberMatcher.method(LoggerFactory.class, "getLogger", String.class);
    PowerMockito.doReturn(logger1)
        .when(LoggerFactory.class, getLoggerMethod1)
        .withArguments(or(isA(String.class), isNull(String.class)));

    // Act
    thrown.expect(ClassCastException.class);
    pieceState.popProducer(taskId, srcCid, pieceLen);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({BeanPoolUtil.class, PieceState.class, ArrayBlockingQueue.class,
                   ProgressRepository.class, LoggerFactory.class})
  @Test
  public void
  popProducerInputNotNullNotNullZeroOutputClassCastException3()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(BeanPoolUtil.class);
    PowerMockito.mockStatic(LoggerFactory.class);

    // Arrange
    final PieceState pieceState =
        (PieceState)Reflector.getInstance("com.alibaba.dragonfly.supernode.repository.PieceState");
    Reflector.setField(pieceState, "distributedCount", 0);
    final ArrayBlockingQueue<String> arrayBlockingQueue =
        PowerMockito.mock(ArrayBlockingQueue.class);
    final Method sizeMethod = DTUMemberMatcher.method(ArrayBlockingQueue.class, "size");
    PowerMockito.doReturn(1).when(arrayBlockingQueue, sizeMethod).withNoArguments();
    final Method peekMethod = DTUMemberMatcher.method(ArrayBlockingQueue.class, "peek");
    ((PowerMockitoStubber)PowerMockito.doReturn("").doReturn(0))
        .when(arrayBlockingQueue, peekMethod)
        .withNoArguments();
    Reflector.setField(pieceState, "pieceContainer", arrayBlockingQueue);
    Reflector.setField(pieceState, "pieceSize", null);
    Reflector.setField(pieceState, "superCid", null);
    final String taskId = "?";
    final String srcCid = "?";
    final int pieceLen = 0;
    PowerMockito.whenNew(ArrayBlockingQueue.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(arrayBlockingQueue);
    final Logger logger = PowerMockito.mock(Logger.class);
    final Method getLoggerMethod =
        DTUMemberMatcher.method(LoggerFactory.class, "getLogger", Class.class);
    PowerMockito.doReturn(logger)
        .when(LoggerFactory.class, getLoggerMethod)
        .withArguments(or(isA(Class.class), isNull(Class.class)));
    final ProgressRepository progressRepository = PowerMockito.mock(ProgressRepository.class);
    final Method getClientBlackInfoMethod =
        DTUMemberMatcher.method(ProgressRepository.class, "getClientBlackInfo", String.class);
    PowerMockito.doReturn(null)
        .when(progressRepository, getClientBlackInfoMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));
    final Method getClientErrorInfoMethod =
        DTUMemberMatcher.method(ProgressRepository.class, "getClientErrorInfo", String.class);
    PowerMockito.doReturn(null)
        .when(progressRepository, getClientErrorInfoMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));
    final Method getServiceDownInfoMethod =
        DTUMemberMatcher.method(ProgressRepository.class, "getServiceDownInfo", String.class);
    PowerMockito.doReturn(true)
        .when(progressRepository, getServiceDownInfoMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));
    final Method getBeanMethod =
        DTUMemberMatcher.method(BeanPoolUtil.class, "getBean", Class.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(progressRepository).doReturn(null))
        .when(BeanPoolUtil.class, getBeanMethod)
        .withArguments(or(isA(Class.class), isNull(Class.class)));
    final Logger logger1 = PowerMockito.mock(Logger.class);
    final Method getLoggerMethod1 =
        DTUMemberMatcher.method(LoggerFactory.class, "getLogger", String.class);
    PowerMockito.doReturn(logger1)
        .when(LoggerFactory.class, getLoggerMethod1)
        .withArguments(or(isA(String.class), isNull(String.class)));

    // Act
    thrown.expect(ClassCastException.class);
    pieceState.popProducer(taskId, srcCid, pieceLen);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({BeanPoolUtil.class, LoggerFactory.class, PieceState.class,
                   ArrayBlockingQueue.class, ProgressRepository.class, AtomicInteger.class})
  @Test
  public void
  popProducerInputNotNullNotNullZeroOutputClassCastException4()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(BeanPoolUtil.class);
    PowerMockito.mockStatic(LoggerFactory.class);

    // Arrange
    final PieceState pieceState =
        (PieceState)Reflector.getInstance("com.alibaba.dragonfly.supernode.repository.PieceState");
    Reflector.setField(pieceState, "distributedCount", 0);
    final ArrayBlockingQueue<String> arrayBlockingQueue =
        PowerMockito.mock(ArrayBlockingQueue.class);
    final Method sizeMethod = DTUMemberMatcher.method(ArrayBlockingQueue.class, "size");
    PowerMockito.doReturn(1).when(arrayBlockingQueue, sizeMethod).withNoArguments();
    final Method peekMethod = DTUMemberMatcher.method(ArrayBlockingQueue.class, "peek");
    ((PowerMockitoStubber)PowerMockito.doReturn("").doReturn(0))
        .when(arrayBlockingQueue, peekMethod)
        .withNoArguments();
    Reflector.setField(pieceState, "pieceContainer", arrayBlockingQueue);
    Reflector.setField(pieceState, "pieceSize", null);
    Reflector.setField(pieceState, "superCid", null);
    final String taskId = "?";
    final String srcCid = "?";
    final int pieceLen = 0;
    PowerMockito.whenNew(ArrayBlockingQueue.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(arrayBlockingQueue);
    final Logger logger = PowerMockito.mock(Logger.class);
    final Method getLoggerMethod =
        DTUMemberMatcher.method(LoggerFactory.class, "getLogger", Class.class);
    PowerMockito.doReturn(logger)
        .when(LoggerFactory.class, getLoggerMethod)
        .withArguments(or(isA(Class.class), isNull(Class.class)));
    final ProgressRepository progressRepository = PowerMockito.mock(ProgressRepository.class);
    final Method getClientErrorInfoMethod =
        DTUMemberMatcher.method(ProgressRepository.class, "getClientErrorInfo", String.class);
    PowerMockito.doReturn(null)
        .when(progressRepository, getClientErrorInfoMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));
    final Method getServiceDownInfoMethod =
        DTUMemberMatcher.method(ProgressRepository.class, "getServiceDownInfo", String.class);
    PowerMockito.doReturn(false)
        .when(progressRepository, getServiceDownInfoMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));
    final Method getClientBlackInfoMethod =
        DTUMemberMatcher.method(ProgressRepository.class, "getClientBlackInfo", String.class);
    PowerMockito.doReturn(null)
        .when(progressRepository, getClientBlackInfoMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));
    final AtomicInteger atomicInteger = PowerMockito.mock(AtomicInteger.class);
    final Method getMethod = DTUMemberMatcher.method(AtomicInteger.class, "get");
    PowerMockito.doReturn(262_149).when(atomicInteger, getMethod).withNoArguments();
    final Method getServiceErrorInfoMethod =
        DTUMemberMatcher.method(ProgressRepository.class, "getServiceErrorInfo", String.class);
    PowerMockito.doReturn(atomicInteger)
        .when(progressRepository, getServiceErrorInfoMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));
    final Method getBeanMethod =
        DTUMemberMatcher.method(BeanPoolUtil.class, "getBean", Class.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(progressRepository).doReturn(null))
        .when(BeanPoolUtil.class, getBeanMethod)
        .withArguments(or(isA(Class.class), isNull(Class.class)));
    final Logger logger1 = PowerMockito.mock(Logger.class);
    final Method getLoggerMethod1 =
        DTUMemberMatcher.method(LoggerFactory.class, "getLogger", String.class);
    PowerMockito.doReturn(logger1)
        .when(LoggerFactory.class, getLoggerMethod1)
        .withArguments(or(isA(String.class), isNull(String.class)));

    // Act
    thrown.expect(ClassCastException.class);
    pieceState.popProducer(taskId, srcCid, pieceLen);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LoggerFactory.class, PieceState.class, ProgressRepository.class,
                   AtomicInteger.class, BeanPoolUtil.class, Logger.class})
  @Test
  public void
  popProducerInputNotNullNotNullZeroOutputNull() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(BeanPoolUtil.class);
    PowerMockito.mockStatic(LoggerFactory.class);

    // Arrange
    final PieceState pieceState =
        (PieceState)Reflector.getInstance("com.alibaba.dragonfly.supernode.repository.PieceState");
    Reflector.setField(pieceState, "distributedCount", 0);
    final ArrayBlockingQueue<String> arrayBlockingQueue =
        PowerMockito.mock(ArrayBlockingQueue.class);
    Reflector.setField(pieceState, "pieceContainer", arrayBlockingQueue);
    Reflector.setField(pieceState, "pieceSize", null);
    Reflector.setField(pieceState, "superCid", null);
    final String taskId = "?";
    final String srcCid = "?";
    final int pieceLen = 0;
    PowerMockito.whenNew(ArrayBlockingQueue.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(arrayBlockingQueue);
    final Logger logger = PowerMockito.mock(Logger.class);
    final Method getLoggerMethod =
        DTUMemberMatcher.method(LoggerFactory.class, "getLogger", Class.class);
    PowerMockito.doReturn(logger)
        .when(LoggerFactory.class, getLoggerMethod)
        .withArguments(or(isA(Class.class), isNull(Class.class)));
    final ProgressRepository progressRepository = PowerMockito.mock(ProgressRepository.class);
    final Method getClientBlackInfoMethod =
        DTUMemberMatcher.method(ProgressRepository.class, "getClientBlackInfo", String.class);
    PowerMockito.doReturn(null)
        .when(progressRepository, getClientBlackInfoMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));
    final AtomicInteger atomicInteger = PowerMockito.mock(AtomicInteger.class);
    final Method getMethod = DTUMemberMatcher.method(AtomicInteger.class, "get");
    PowerMockito.doReturn(7).when(atomicInteger, getMethod).withNoArguments();
    final Method getClientErrorInfoMethod =
        DTUMemberMatcher.method(ProgressRepository.class, "getClientErrorInfo", String.class);
    PowerMockito.doReturn(atomicInteger)
        .when(progressRepository, getClientErrorInfoMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));
    final Method getBeanMethod =
        DTUMemberMatcher.method(BeanPoolUtil.class, "getBean", Class.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(progressRepository).doReturn(null))
        .when(BeanPoolUtil.class, getBeanMethod)
        .withArguments(or(isA(Class.class), isNull(Class.class)));
    final Logger logger1 = PowerMockito.mock(Logger.class);
    final Method getLoggerMethod1 =
        DTUMemberMatcher.method(LoggerFactory.class, "getLogger", String.class);
    PowerMockito.doReturn(logger1)
        .when(LoggerFactory.class, getLoggerMethod1)
        .withArguments(or(isA(String.class), isNull(String.class)));

    // Act
    final String actual = pieceState.popProducer(taskId, srcCid, pieceLen);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({BeanPoolUtil.class, PieceState.class, ArrayBlockingQueue.class,
                   ProgressRepository.class, LoggerFactory.class})
  @Test
  public void
  popProducerInputNotNullNotNullZeroOutputNull2() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(BeanPoolUtil.class);
    PowerMockito.mockStatic(LoggerFactory.class);

    // Arrange
    final PieceState pieceState =
        (PieceState)Reflector.getInstance("com.alibaba.dragonfly.supernode.repository.PieceState");
    Reflector.setField(pieceState, "distributedCount", 0);
    final ArrayBlockingQueue<String> arrayBlockingQueue =
        PowerMockito.mock(ArrayBlockingQueue.class);
    final Method sizeMethod = DTUMemberMatcher.method(ArrayBlockingQueue.class, "size");
    PowerMockito.doReturn(0).when(arrayBlockingQueue, sizeMethod).withNoArguments();
    Reflector.setField(pieceState, "pieceContainer", arrayBlockingQueue);
    Reflector.setField(pieceState, "pieceSize", null);
    Reflector.setField(pieceState, "superCid", null);
    final String taskId = "?";
    final String srcCid = "?";
    final int pieceLen = 0;
    PowerMockito.whenNew(ArrayBlockingQueue.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(arrayBlockingQueue);
    final Logger logger = PowerMockito.mock(Logger.class);
    final Method getLoggerMethod =
        DTUMemberMatcher.method(LoggerFactory.class, "getLogger", Class.class);
    PowerMockito.doReturn(logger)
        .when(LoggerFactory.class, getLoggerMethod)
        .withArguments(or(isA(Class.class), isNull(Class.class)));
    final ProgressRepository progressRepository = PowerMockito.mock(ProgressRepository.class);
    final Method getClientBlackInfoMethod =
        DTUMemberMatcher.method(ProgressRepository.class, "getClientBlackInfo", String.class);
    PowerMockito.doReturn(null)
        .when(progressRepository, getClientBlackInfoMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));
    final Method getClientErrorInfoMethod =
        DTUMemberMatcher.method(ProgressRepository.class, "getClientErrorInfo", String.class);
    PowerMockito.doReturn(null)
        .when(progressRepository, getClientErrorInfoMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));
    final Method getBeanMethod =
        DTUMemberMatcher.method(BeanPoolUtil.class, "getBean", Class.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(progressRepository).doReturn(null))
        .when(BeanPoolUtil.class, getBeanMethod)
        .withArguments(or(isA(Class.class), isNull(Class.class)));
    final Logger logger1 = PowerMockito.mock(Logger.class);
    final Method getLoggerMethod1 =
        DTUMemberMatcher.method(LoggerFactory.class, "getLogger", String.class);
    PowerMockito.doReturn(logger1)
        .when(LoggerFactory.class, getLoggerMethod1)
        .withArguments(or(isA(String.class), isNull(String.class)));

    // Act
    final String actual = pieceState.popProducer(taskId, srcCid, pieceLen);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({LoggerFactory.class, PieceState.class, ArrayBlockingQueue.class,
                   ProgressRepository.class, BeanPoolUtil.class, Logger.class})
  @Test
  public void
  popProducerInputNotNullNotNullZeroOutputNull3() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(BeanPoolUtil.class);
    PowerMockito.mockStatic(LoggerFactory.class);

    // Arrange
    final PieceState pieceState =
        (PieceState)Reflector.getInstance("com.alibaba.dragonfly.supernode.repository.PieceState");
    Reflector.setField(pieceState, "distributedCount", 0);
    final ArrayBlockingQueue<String> arrayBlockingQueue =
        PowerMockito.mock(ArrayBlockingQueue.class);
    final Method sizeMethod = DTUMemberMatcher.method(ArrayBlockingQueue.class, "size");
    PowerMockito.doReturn(1).when(arrayBlockingQueue, sizeMethod).withNoArguments();
    final Method peekMethod = DTUMemberMatcher.method(ArrayBlockingQueue.class, "peek");
    PowerMockito.doReturn(null).when(arrayBlockingQueue, peekMethod).withNoArguments();
    Reflector.setField(pieceState, "pieceContainer", arrayBlockingQueue);
    Reflector.setField(pieceState, "pieceSize", null);
    Reflector.setField(pieceState, "superCid", null);
    final String taskId = "?";
    final String srcCid = "?";
    final int pieceLen = 0;
    PowerMockito.whenNew(ArrayBlockingQueue.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(arrayBlockingQueue);
    final Logger logger = PowerMockito.mock(Logger.class);
    final Method getLoggerMethod =
        DTUMemberMatcher.method(LoggerFactory.class, "getLogger", Class.class);
    PowerMockito.doReturn(logger)
        .when(LoggerFactory.class, getLoggerMethod)
        .withArguments(or(isA(Class.class), isNull(Class.class)));
    final ProgressRepository progressRepository = PowerMockito.mock(ProgressRepository.class);
    final Method getClientBlackInfoMethod =
        DTUMemberMatcher.method(ProgressRepository.class, "getClientBlackInfo", String.class);
    PowerMockito.doReturn(null)
        .when(progressRepository, getClientBlackInfoMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));
    final Method getClientErrorInfoMethod =
        DTUMemberMatcher.method(ProgressRepository.class, "getClientErrorInfo", String.class);
    PowerMockito.doReturn(null)
        .when(progressRepository, getClientErrorInfoMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));
    final Method getBeanMethod =
        DTUMemberMatcher.method(BeanPoolUtil.class, "getBean", Class.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(progressRepository).doReturn(null))
        .when(BeanPoolUtil.class, getBeanMethod)
        .withArguments(or(isA(Class.class), isNull(Class.class)));
    final Logger logger1 = PowerMockito.mock(Logger.class);
    final Method getLoggerMethod1 =
        DTUMemberMatcher.method(LoggerFactory.class, "getLogger", String.class);
    PowerMockito.doReturn(logger1)
        .when(LoggerFactory.class, getLoggerMethod1)
        .withArguments(or(isA(String.class), isNull(String.class)));

    // Act
    final String actual = pieceState.popProducer(taskId, srcCid, pieceLen);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(PieceState.class)
  @Test
  public void popProducerInputNotNullNotNullZeroOutputNullPointerException()
      throws Exception, InvocationTargetException {

    // Arrange
    final PieceState pieceState =
        (PieceState)Reflector.getInstance("com.alibaba.dragonfly.supernode.repository.PieceState");
    Reflector.setField(pieceState, "distributedCount", 0);
    final ArrayBlockingQueue<String> arrayBlockingQueue =
        PowerMockito.mock(ArrayBlockingQueue.class);
    Reflector.setField(pieceState, "pieceContainer", arrayBlockingQueue);
    Reflector.setField(pieceState, "pieceSize", null);
    Reflector.setField(pieceState, "superCid", null);
    final String taskId = "?";
    final String srcCid = "?";
    final int pieceLen = 0;
    PowerMockito.whenNew(ArrayBlockingQueue.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(arrayBlockingQueue);

    // Act
    thrown.expect(NullPointerException.class);
    pieceState.popProducer(taskId, srcCid, pieceLen);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({BeanPoolUtil.class, PieceState.class, ProgressRepository.class,
                   AtomicInteger.class, LoggerFactory.class})
  @Test
  public void
  popProducerInputNotNullNotNullZeroOutputNullPointerException2()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(BeanPoolUtil.class);
    PowerMockito.mockStatic(LoggerFactory.class);

    // Arrange
    final PieceState pieceState =
        (PieceState)Reflector.getInstance("com.alibaba.dragonfly.supernode.repository.PieceState");
    Reflector.setField(pieceState, "distributedCount", 0);
    final ArrayBlockingQueue<String> arrayBlockingQueue =
        PowerMockito.mock(ArrayBlockingQueue.class);
    Reflector.setField(pieceState, "pieceContainer", arrayBlockingQueue);
    Reflector.setField(pieceState, "pieceSize", null);
    Reflector.setField(pieceState, "superCid", null);
    final String taskId = "?";
    final String srcCid = "?";
    final int pieceLen = 0;
    PowerMockito.whenNew(ArrayBlockingQueue.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(arrayBlockingQueue);
    final Logger logger = PowerMockito.mock(Logger.class);
    final Method getLoggerMethod =
        DTUMemberMatcher.method(LoggerFactory.class, "getLogger", Class.class);
    PowerMockito.doReturn(logger)
        .when(LoggerFactory.class, getLoggerMethod)
        .withArguments(or(isA(Class.class), isNull(Class.class)));
    final ProgressRepository progressRepository = PowerMockito.mock(ProgressRepository.class);
    final Method getClientBlackInfoMethod =
        DTUMemberMatcher.method(ProgressRepository.class, "getClientBlackInfo", String.class);
    PowerMockito.doReturn(null)
        .when(progressRepository, getClientBlackInfoMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));
    final AtomicInteger atomicInteger = PowerMockito.mock(AtomicInteger.class);
    final Method getMethod = DTUMemberMatcher.method(AtomicInteger.class, "get");
    PowerMockito.doReturn(7).when(atomicInteger, getMethod).withNoArguments();
    final Method getClientErrorInfoMethod =
        DTUMemberMatcher.method(ProgressRepository.class, "getClientErrorInfo", String.class);
    PowerMockito.doReturn(atomicInteger)
        .when(progressRepository, getClientErrorInfoMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));
    final Method getBeanMethod =
        DTUMemberMatcher.method(BeanPoolUtil.class, "getBean", Class.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(progressRepository).doReturn(null))
        .when(BeanPoolUtil.class, getBeanMethod)
        .withArguments(or(isA(Class.class), isNull(Class.class)));
    final Method getLoggerMethod1 =
        DTUMemberMatcher.method(LoggerFactory.class, "getLogger", String.class);
    PowerMockito.doReturn(null)
        .when(LoggerFactory.class, getLoggerMethod1)
        .withArguments(or(isA(String.class), isNull(String.class)));

    // Act
    thrown.expect(NullPointerException.class);
    pieceState.popProducer(taskId, srcCid, pieceLen);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({BeanPoolUtil.class, PieceState.class, ArrayBlockingQueue.class,
                   ProgressRepository.class, LoggerFactory.class})
  @Test
  public void
  popProducerInputNotNullNotNullZeroOutputNullPointerException3()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(BeanPoolUtil.class);
    PowerMockito.mockStatic(LoggerFactory.class);

    // Arrange
    final PieceState pieceState =
        (PieceState)Reflector.getInstance("com.alibaba.dragonfly.supernode.repository.PieceState");
    Reflector.setField(pieceState, "distributedCount", 0);
    final ArrayBlockingQueue<String> arrayBlockingQueue =
        PowerMockito.mock(ArrayBlockingQueue.class);
    final Method sizeMethod = DTUMemberMatcher.method(ArrayBlockingQueue.class, "size");
    PowerMockito.doReturn(1).when(arrayBlockingQueue, sizeMethod).withNoArguments();
    final Method peekMethod = DTUMemberMatcher.method(ArrayBlockingQueue.class, "peek");
    PowerMockito.doReturn(null).when(arrayBlockingQueue, peekMethod).withNoArguments();
    Reflector.setField(pieceState, "pieceContainer", arrayBlockingQueue);
    Reflector.setField(pieceState, "pieceSize", null);
    Reflector.setField(pieceState, "superCid", null);
    final String taskId = "?";
    final String srcCid = "?";
    final int pieceLen = 0;
    PowerMockito.whenNew(ArrayBlockingQueue.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(arrayBlockingQueue);
    final Logger logger = PowerMockito.mock(Logger.class);
    final Method getLoggerMethod =
        DTUMemberMatcher.method(LoggerFactory.class, "getLogger", Class.class);
    PowerMockito.doReturn(logger)
        .when(LoggerFactory.class, getLoggerMethod)
        .withArguments(or(isA(Class.class), isNull(Class.class)));
    final ProgressRepository progressRepository = PowerMockito.mock(ProgressRepository.class);
    final Method getClientBlackInfoMethod =
        DTUMemberMatcher.method(ProgressRepository.class, "getClientBlackInfo", String.class);
    PowerMockito.doReturn(null)
        .when(progressRepository, getClientBlackInfoMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));
    final Method getClientErrorInfoMethod =
        DTUMemberMatcher.method(ProgressRepository.class, "getClientErrorInfo", String.class);
    PowerMockito.doReturn(null)
        .when(progressRepository, getClientErrorInfoMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));
    final Method getBeanMethod =
        DTUMemberMatcher.method(BeanPoolUtil.class, "getBean", Class.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(progressRepository).doReturn(null))
        .when(BeanPoolUtil.class, getBeanMethod)
        .withArguments(or(isA(Class.class), isNull(Class.class)));
    final Method getLoggerMethod1 =
        DTUMemberMatcher.method(LoggerFactory.class, "getLogger", String.class);
    PowerMockito.doReturn(null)
        .when(LoggerFactory.class, getLoggerMethod1)
        .withArguments(or(isA(String.class), isNull(String.class)));

    // Act
    thrown.expect(NullPointerException.class);
    pieceState.popProducer(taskId, srcCid, pieceLen);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({BeanPoolUtil.class, PieceState.class, ArrayBlockingQueue.class,
                   ProgressRepository.class, LoggerFactory.class})
  @Test
  public void
  popProducerInputNotNullNotNullZeroOutputNullPointerException4()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(BeanPoolUtil.class);
    PowerMockito.mockStatic(LoggerFactory.class);

    // Arrange
    final PieceState pieceState =
        (PieceState)Reflector.getInstance("com.alibaba.dragonfly.supernode.repository.PieceState");
    Reflector.setField(pieceState, "distributedCount", 0);
    final ArrayBlockingQueue<String> arrayBlockingQueue =
        PowerMockito.mock(ArrayBlockingQueue.class);
    final Method sizeMethod = DTUMemberMatcher.method(ArrayBlockingQueue.class, "size");
    PowerMockito.doReturn(1).when(arrayBlockingQueue, sizeMethod).withNoArguments();
    final Method peekMethod = DTUMemberMatcher.method(ArrayBlockingQueue.class, "peek");
    PowerMockito.doReturn("").when(arrayBlockingQueue, peekMethod).withNoArguments();
    Reflector.setField(pieceState, "pieceContainer", arrayBlockingQueue);
    Reflector.setField(pieceState, "pieceSize", null);
    Reflector.setField(pieceState, "superCid", null);
    final String taskId = "?";
    final String srcCid = "?";
    final int pieceLen = 0;
    PowerMockito.whenNew(ArrayBlockingQueue.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(arrayBlockingQueue);
    final Logger logger = PowerMockito.mock(Logger.class);
    final Method getLoggerMethod =
        DTUMemberMatcher.method(LoggerFactory.class, "getLogger", Class.class);
    PowerMockito.doReturn(logger)
        .when(LoggerFactory.class, getLoggerMethod)
        .withArguments(or(isA(Class.class), isNull(Class.class)));
    final ProgressRepository progressRepository = PowerMockito.mock(ProgressRepository.class);
    final Method getClientBlackInfoMethod =
        DTUMemberMatcher.method(ProgressRepository.class, "getClientBlackInfo", String.class);
    PowerMockito.doReturn(null)
        .when(progressRepository, getClientBlackInfoMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));
    final Method getClientErrorInfoMethod =
        DTUMemberMatcher.method(ProgressRepository.class, "getClientErrorInfo", String.class);
    PowerMockito.doReturn(null)
        .when(progressRepository, getClientErrorInfoMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));
    final Method getServiceDownInfoMethod =
        DTUMemberMatcher.method(ProgressRepository.class, "getServiceDownInfo", String.class);
    PowerMockito.doReturn(null)
        .when(progressRepository, getServiceDownInfoMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));
    final Method getBeanMethod =
        DTUMemberMatcher.method(BeanPoolUtil.class, "getBean", Class.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(progressRepository).doReturn(null))
        .when(BeanPoolUtil.class, getBeanMethod)
        .withArguments(or(isA(Class.class), isNull(Class.class)));
    final Logger logger1 = PowerMockito.mock(Logger.class);
    final Method getLoggerMethod1 =
        DTUMemberMatcher.method(LoggerFactory.class, "getLogger", String.class);
    PowerMockito.doReturn(logger1)
        .when(LoggerFactory.class, getLoggerMethod1)
        .withArguments(or(isA(String.class), isNull(String.class)));

    // Act
    thrown.expect(NullPointerException.class);
    pieceState.popProducer(taskId, srcCid, pieceLen);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({BeanPoolUtil.class, LoggerFactory.class, StringUtils.class, PieceState.class,
                   ArrayBlockingQueue.class, ProgressRepository.class, AtomicInteger.class})
  @Test
  public void
  popProducerInputNotNullNotNullZeroOutputNullPointerException5()
      throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);
    PowerMockito.mockStatic(LoggerFactory.class);
    PowerMockito.mockStatic(BeanPoolUtil.class);

    // Arrange
    final PieceState pieceState =
        (PieceState)Reflector.getInstance("com.alibaba.dragonfly.supernode.repository.PieceState");
    Reflector.setField(pieceState, "distributedCount", 0);
    final ArrayBlockingQueue<String> arrayBlockingQueue =
        PowerMockito.mock(ArrayBlockingQueue.class);
    final Method sizeMethod = DTUMemberMatcher.method(ArrayBlockingQueue.class, "size");
    PowerMockito.doReturn(3).when(arrayBlockingQueue, sizeMethod).withNoArguments();
    final Method peekMethod = DTUMemberMatcher.method(ArrayBlockingQueue.class, "peek");
    ((PowerMockitoStubber)PowerMockito.doReturn("").doReturn(null).doReturn(null))
        .when(arrayBlockingQueue, peekMethod)
        .withNoArguments();
    Reflector.setField(pieceState, "pieceContainer", arrayBlockingQueue);
    Reflector.setField(pieceState, "pieceSize", null);
    Reflector.setField(pieceState, "superCid", null);
    final String taskId = "?";
    final String srcCid = "?";
    final int pieceLen = 0;
    PowerMockito.whenNew(ArrayBlockingQueue.class)
        .withParameterTypes(int.class)
        .withArguments(anyInt())
        .thenReturn(arrayBlockingQueue);
    final ProgressRepository progressRepository = PowerMockito.mock(ProgressRepository.class);
    final Method getClientErrorInfoMethod =
        DTUMemberMatcher.method(ProgressRepository.class, "getClientErrorInfo", String.class);
    PowerMockito.doReturn(null)
        .when(progressRepository, getClientErrorInfoMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));
    final Method getServiceDownInfoMethod =
        DTUMemberMatcher.method(ProgressRepository.class, "getServiceDownInfo", String.class);
    PowerMockito.doReturn(false)
        .when(progressRepository, getServiceDownInfoMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));
    final Method getClientBlackInfoMethod =
        DTUMemberMatcher.method(ProgressRepository.class, "getClientBlackInfo", String.class);
    PowerMockito.doReturn(null)
        .when(progressRepository, getClientBlackInfoMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));
    final AtomicInteger atomicInteger = PowerMockito.mock(AtomicInteger.class);
    final Method getMethod = DTUMemberMatcher.method(AtomicInteger.class, "get");
    PowerMockito.doReturn(262_149).when(atomicInteger, getMethod).withNoArguments();
    final Method getServiceErrorInfoMethod =
        DTUMemberMatcher.method(ProgressRepository.class, "getServiceErrorInfo", String.class);
    PowerMockito.doReturn(atomicInteger)
        .when(progressRepository, getServiceErrorInfoMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));
    final Method getBeanMethod =
        DTUMemberMatcher.method(BeanPoolUtil.class, "getBean", Class.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(progressRepository).doReturn(null))
        .when(BeanPoolUtil.class, getBeanMethod)
        .withArguments(or(isA(Class.class), isNull(Class.class)));
    final Method getLoggerMethod =
        DTUMemberMatcher.method(LoggerFactory.class, "getLogger", String.class);
    PowerMockito.doReturn(null)
        .when(LoggerFactory.class, getLoggerMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));
    final Logger logger = PowerMockito.mock(Logger.class);
    final Method getLoggerMethod1 =
        DTUMemberMatcher.method(LoggerFactory.class, "getLogger", Class.class);
    PowerMockito.doReturn(logger)
        .when(LoggerFactory.class, getLoggerMethod1)
        .withArguments(or(isA(Class.class), isNull(Class.class)));
    final Method equalsMethod = DTUMemberMatcher.method(StringUtils.class, "equals",
                                                        CharSequence.class, CharSequence.class);
    PowerMockito.doReturn(false)
        .when(StringUtils.class, equalsMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)),
                       or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    thrown.expect(NullPointerException.class);
    pieceState.popProducer(taskId, srcCid, pieceLen);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({BeanPoolUtil.class, LoggerFactory.class})
  @Test
  public void staticInitOutputVoid() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(BeanPoolUtil.class);
    PowerMockito.mockStatic(LoggerFactory.class);

    // Arrange
    final Logger logger1 = PowerMockito.mock(Logger.class);
    final Logger logger = PowerMockito.mock(Logger.class);
    final Method getLoggerMethod =
        DTUMemberMatcher.method(LoggerFactory.class, "getLogger", Class.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(logger).doReturn(logger1))
        .when(LoggerFactory.class, getLoggerMethod)
        .withArguments(or(isA(Class.class), isNull(Class.class)));
    final PowerRateLimiter powerRateLimiter1 = PowerMockito.mock(PowerRateLimiter.class);
    final ProgressRepository progressRepository1 = PowerMockito.mock(ProgressRepository.class);
    final PowerRateLimiter powerRateLimiter = PowerMockito.mock(PowerRateLimiter.class);
    final ProgressRepository progressRepository = PowerMockito.mock(ProgressRepository.class);
    final Method getBeanMethod =
        DTUMemberMatcher.method(BeanPoolUtil.class, "getBean", Class.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(progressRepository)
         .doReturn(powerRateLimiter)
         .doReturn(progressRepository1)
         .doReturn(powerRateLimiter1))
        .when(BeanPoolUtil.class, getBeanMethod)
        .withArguments(or(isA(Class.class), isNull(Class.class)));
    final Logger logger3 = PowerMockito.mock(Logger.class);
    final Logger logger2 = PowerMockito.mock(Logger.class);
    final Method getLoggerMethod1 =
        DTUMemberMatcher.method(LoggerFactory.class, "getLogger", String.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(logger2).doReturn(logger3))
        .when(LoggerFactory.class, getLoggerMethod1)
        .withArguments(or(isA(String.class), isNull(String.class)));

    // Act, using constructor to test static initializer
    final Object constructed =
        Reflector.getInstance("com.alibaba.dragonfly.supernode.repository.PieceState");

    // The method returns void, testing that no exception is thrown
  }
}

package com.alibaba.dragonfly.supernode.repository;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.alibaba.dragonfly.supernode.common.domain.PeerInfo;
import com.alibaba.dragonfly.supernode.repository.PeerRepository;
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
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

@RunWith(PowerMockRunner.class)
public class PeerRepositoryTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @PrepareForTest(StringUtils.class)
  @Test
  public void addInputNotNullOutputFalse() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final PeerRepository peerRepository = new PeerRepository();
    final PeerInfo peerInfo = new PeerInfo();
    peerInfo.setCid(null);
    peerInfo.setHostName(null);
    peerInfo.setIp(null);
    final Method isNotBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isNotBlank", CharSequence.class);
    PowerMockito.doReturn(false)
        .when(StringUtils.class, isNotBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    final boolean actual = peerRepository.add(peerInfo);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({PeerRepository.class, ConcurrentHashMap.class, StringUtils.class})
  @Test
  public void addInputNotNullOutputTrue() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final PeerRepository peerRepository = new PeerRepository();
    final PeerInfo peerInfo = new PeerInfo();
    peerInfo.setCid(null);
    peerInfo.setHostName(null);
    peerInfo.setIp(null);
    final Method isNotBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isNotBlank", CharSequence.class);
    PowerMockito.doReturn(true)
        .when(StringUtils.class, isNotBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    final boolean actual = peerRepository.add(peerInfo);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final PeerRepository actual = new PeerRepository();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({PeerRepository.class, ConcurrentHashMap.class})
  @Test
  public void getInputNotNullOutputNotNull() throws Exception {

    // Arrange
    final PeerRepository peerRepository = new PeerRepository();

    // Act
    final PeerInfo actual = peerRepository.get("");

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getCid());
    Assert.assertNull(actual.getHostName());
    Assert.assertNull(actual.getIp());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({PeerRepository.class, ConcurrentHashMap.class})
  @Test
  public void removeInputNotNullOutputFalse() throws Exception {

    // Arrange
    final PeerRepository peerRepository = new PeerRepository();

    // Act and Assert result
    Assert.assertFalse(peerRepository.remove(""));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({PeerRepository.class, ConcurrentHashMap.class})
  @Test
  public void removeInputNotNullOutputTrue() throws Exception {

    // Arrange
    final PeerRepository peerRepository = new PeerRepository();

    // Act and Assert result
    Assert.assertTrue(peerRepository.remove(""));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(PeerRepository.class)
  @Test
  public void staticInitOutputVoid() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    PowerMockito.whenNew(ConcurrentHashMap.class).withNoArguments().thenReturn(concurrentHashMap);

    // Act, using constructor to test static initializer
    final Object constructed =
        Reflector.getInstance("com.alibaba.dragonfly.supernode.repository.PeerRepository");
  }
}

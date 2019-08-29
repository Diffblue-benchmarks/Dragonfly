package com.alibaba.dragonfly.supernode.repository;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

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
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@RunWith(PowerMockRunner.class)
@PowerMockIgnore({"javax.management.*"})
public class ProgressRepositoryTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @PrepareForTest(StringUtils.class)
  @Test
  public void addCdnProgressInputNotNullNullOutputFalse() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final ProgressRepository progressRepository = new ProgressRepository();
    final String taskId = "";
    final BitSet bitSet = null;
    final Method isBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isBlank", CharSequence.class);
    PowerMockito.doReturn(true)
        .when(StringUtils.class, isBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    final boolean actual = progressRepository.addCdnProgress(taskId, bitSet);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ProgressRepository.class, ConcurrentHashMap.class, StringUtils.class})
  @Test
  public void addCdnProgressInputNotNullNullOutputTrue() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final ProgressRepository progressRepository = new ProgressRepository();
    final String taskId = "";
    final BitSet bitSet = null;
    final Method isBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isBlank", CharSequence.class);
    PowerMockito.doReturn(false)
        .when(StringUtils.class, isBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    final boolean actual = progressRepository.addCdnProgress(taskId, bitSet);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(StringUtils.class)
  @Test
  public void addClientBlackInfoInputNotNullNullOutputFalse() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final ProgressRepository progressRepository = new ProgressRepository();
    final String cid = "";
    final Set blackCids = null;
    final Method isBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isBlank", CharSequence.class);
    PowerMockito.doReturn(true)
        .when(StringUtils.class, isBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    final boolean actual = progressRepository.addClientBlackInfo(cid, blackCids);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ProgressRepository.class, ConcurrentHashMap.class, StringUtils.class})
  @Test
  public void addClientBlackInfoInputNotNullNullOutputTrue() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final ProgressRepository progressRepository = new ProgressRepository();
    final String cid = "";
    final Set blackCids = null;
    final Method isBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isBlank", CharSequence.class);
    PowerMockito.doReturn(false)
        .when(StringUtils.class, isBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    final boolean actual = progressRepository.addClientBlackInfo(cid, blackCids);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(StringUtils.class)
  @Test
  public void addClientErrorInfoInputNotNullNullOutputFalse() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final ProgressRepository progressRepository = new ProgressRepository();
    final String cid = "";
    final AtomicInteger atomicInteger = null;
    final Method isBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isBlank", CharSequence.class);
    PowerMockito.doReturn(true)
        .when(StringUtils.class, isBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    final boolean actual = progressRepository.addClientErrorInfo(cid, atomicInteger);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ProgressRepository.class, ConcurrentHashMap.class, StringUtils.class})
  @Test
  public void addClientErrorInfoInputNotNullNullOutputTrue() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final ProgressRepository progressRepository = new ProgressRepository();
    final String cid = "";
    final AtomicInteger atomicInteger = null;
    final Method isBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isBlank", CharSequence.class);
    PowerMockito.doReturn(false)
        .when(StringUtils.class, isBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    final boolean actual = progressRepository.addClientErrorInfo(cid, atomicInteger);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(StringUtils.class)
  @Test
  public void addClientProgressInputNotNullNullOutputFalse() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final ProgressRepository progressRepository = new ProgressRepository();
    final String cid = "";
    final BitSet bitSet = null;
    final Method isBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isBlank", CharSequence.class);
    PowerMockito.doReturn(true)
        .when(StringUtils.class, isBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    final boolean actual = progressRepository.addClientProgress(cid, bitSet);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ProgressRepository.class, ConcurrentHashMap.class, StringUtils.class})
  @Test
  public void addClientProgressInputNotNullNullOutputTrue() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final ProgressRepository progressRepository = new ProgressRepository();
    final String cid = "";
    final BitSet bitSet = null;
    final Method isBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isBlank", CharSequence.class);
    PowerMockito.doReturn(false)
        .when(StringUtils.class, isBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    final boolean actual = progressRepository.addClientProgress(cid, bitSet);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(StringUtils.class)
  @Test
  public void addPieceProgressInputNotNullPositiveNullOutputFalse() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final ProgressRepository progressRepository = new ProgressRepository();
    final String taskId = "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!";
    final int pieceNum = 1;
    final PieceState pieceState = null;
    final Method isBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isBlank", CharSequence.class);
    PowerMockito.doReturn(true)
        .when(StringUtils.class, isBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    final boolean actual = progressRepository.addPieceProgress(taskId, pieceNum, pieceState);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ProgressRepository.class, ConcurrentHashMap.class, StringUtils.class})
  @Test
  public void addPieceProgressInputNotNullPositiveNullOutputTrue() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final ProgressRepository progressRepository = new ProgressRepository();
    final String taskId = "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!";
    final int pieceNum = 1;
    final PieceState pieceState = null;
    final Method isBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isBlank", CharSequence.class);
    PowerMockito.doReturn(false)
        .when(StringUtils.class, isBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    final boolean actual = progressRepository.addPieceProgress(taskId, pieceNum, pieceState);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(StringUtils.class)
  @Test
  public void addProducerLoadInputNotNullNullOutputFalse() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final ProgressRepository progressRepository = new ProgressRepository();
    final String cid = "";
    final AtomicInteger atomicInteger = null;
    final Method isBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isBlank", CharSequence.class);
    PowerMockito.doReturn(true)
        .when(StringUtils.class, isBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    final boolean actual = progressRepository.addProducerLoad(cid, atomicInteger);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ProgressRepository.class, ConcurrentHashMap.class, StringUtils.class})
  @Test
  public void addProducerLoadInputNotNullNullOutputTrue() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final ProgressRepository progressRepository = new ProgressRepository();
    final String cid = "";
    final AtomicInteger atomicInteger = null;
    final Method isBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isBlank", CharSequence.class);
    PowerMockito.doReturn(false)
        .when(StringUtils.class, isBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    final boolean actual = progressRepository.addProducerLoad(cid, atomicInteger);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(StringUtils.class)
  @Test
  public void addRunningPieceInputNotNullNullOutputFalse() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final ProgressRepository progressRepository = new ProgressRepository();
    final String cid = "";
    final Map runningPieces = null;
    final Method isBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isBlank", CharSequence.class);
    PowerMockito.doReturn(true)
        .when(StringUtils.class, isBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    final boolean actual = progressRepository.addRunningPiece(cid, runningPieces);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ProgressRepository.class, ConcurrentHashMap.class, StringUtils.class})
  @Test
  public void addRunningPieceInputNotNullNullOutputTrue() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final ProgressRepository progressRepository = new ProgressRepository();
    final String cid = "";
    final Map runningPieces = null;
    final Method isBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isBlank", CharSequence.class);
    PowerMockito.doReturn(false)
        .when(StringUtils.class, isBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    final boolean actual = progressRepository.addRunningPiece(cid, runningPieces);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(StringUtils.class)
  @Test
  public void addServiceDownInfoInputNotNullZeroOutputFalse() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final ProgressRepository progressRepository = new ProgressRepository();
    final String cid = "";
    final long time = 0L;
    final Method isBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isBlank", CharSequence.class);
    PowerMockito.doReturn(true)
        .when(StringUtils.class, isBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    final boolean actual = progressRepository.addServiceDownInfo(cid, time);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ProgressRepository.class, ConcurrentHashMap.class, StringUtils.class})
  @Test
  public void addServiceDownInfoInputNotNullZeroOutputTrue() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final ProgressRepository progressRepository = new ProgressRepository();
    final String cid = "";
    final long time = 0L;
    final Method isBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isBlank", CharSequence.class);
    PowerMockito.doReturn(false)
        .when(StringUtils.class, isBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    final boolean actual = progressRepository.addServiceDownInfo(cid, time);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(StringUtils.class)
  @Test
  public void addServiceErrorInfoInputNotNullNullOutputFalse() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final ProgressRepository progressRepository = new ProgressRepository();
    final String cid = "";
    final AtomicInteger atomicInteger = null;
    final Method isBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isBlank", CharSequence.class);
    PowerMockito.doReturn(true)
        .when(StringUtils.class, isBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    final boolean actual = progressRepository.addServiceErrorInfo(cid, atomicInteger);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ProgressRepository.class, ConcurrentHashMap.class, StringUtils.class})
  @Test
  public void addServiceErrorInfoInputNotNullNullOutputTrue() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final ProgressRepository progressRepository = new ProgressRepository();
    final String cid = "";
    final AtomicInteger atomicInteger = null;
    final Method isBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isBlank", CharSequence.class);
    PowerMockito.doReturn(false)
        .when(StringUtils.class, isBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    final boolean actual = progressRepository.addServiceErrorInfo(cid, atomicInteger);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final ProgressRepository actual = new ProgressRepository();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ProgressRepository.class, ConcurrentHashMap.class})
  @Test
  public void getCdnProgressInputNotNullOutput1() throws Exception {

    // Arrange
    final ProgressRepository progressRepository = new ProgressRepository();

    // Act
    final BitSet actual = progressRepository.getCdnProgress("");

    // Assert result
    final BitSet bitSet = new BitSet();
    bitSet.set(0);
    Assert.assertEquals(bitSet, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ProgressRepository.class, ConcurrentHashMap.class})
  @Test
  public void getClientBlackInfoInputNotNullOutput1() throws Exception {

    // Arrange
    final ProgressRepository progressRepository = new ProgressRepository();

    // Act
    final Set<String> actual = progressRepository.getClientBlackInfo("");

    // Assert result
    final HashSet hashSet = new HashSet();
    hashSet.add(null);
    Assert.assertEquals(hashSet, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ProgressRepository.class, ConcurrentHashMap.class})
  @Test
  public void getClientErrorInfoInputNotNullOutputNotNull() throws Exception {

    // Arrange
    final ProgressRepository progressRepository = new ProgressRepository();

    // Act
    final AtomicInteger actual = progressRepository.getClientErrorInfo("00");

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ProgressRepository.class, ConcurrentHashMap.class})
  @Test
  public void getClientProgressInputNotNullOutput1() throws Exception {

    // Arrange
    final ProgressRepository progressRepository = new ProgressRepository();

    // Act
    final BitSet actual = progressRepository.getClientProgress("");

    // Assert result
    final BitSet bitSet = new BitSet();
    bitSet.set(0);
    Assert.assertEquals(bitSet, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(StringUtils.class)
  @Test
  public void getPieceProgressInputNotNullNegativeOutputNull() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final ProgressRepository progressRepository = new ProgressRepository();
    final String taskId = "        ";
    final int pieceNum = -2_147_483_648;
    final Method isBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isBlank", CharSequence.class);
    PowerMockito.doReturn(false)
        .when(StringUtils.class, isBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    final PieceState actual = progressRepository.getPieceProgress(taskId, pieceNum);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ProgressRepository.class, ConcurrentHashMap.class, StringUtils.class})
  @Test
  public void getPieceProgressInputNotNullPositiveOutputNotNull() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final ProgressRepository progressRepository = new ProgressRepository();
    final String taskId = "        ";
    final int pieceNum = 1_073_741_824;
    final Method isBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isBlank", CharSequence.class);
    PowerMockito.doReturn(false)
        .when(StringUtils.class, isBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    final PieceState actual = progressRepository.getPieceProgress(taskId, pieceNum);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getDistributedCount());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(StringUtils.class)
  @Test
  public void getPieceProgressInputNotNullPositiveOutputNull() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(StringUtils.class);

    // Arrange
    final ProgressRepository progressRepository = new ProgressRepository();
    final String taskId = "     ";
    final int pieceNum = 3;
    final Method isBlankMethod =
        DTUMemberMatcher.method(StringUtils.class, "isBlank", CharSequence.class);
    PowerMockito.doReturn(true)
        .when(StringUtils.class, isBlankMethod)
        .withArguments(or(isA(CharSequence.class), isNull(CharSequence.class)));

    // Act
    final PieceState actual = progressRepository.getPieceProgress(taskId, pieceNum);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPieceProgressOutputNotNull() {

    // Arrange
    final ProgressRepository progressRepository = new ProgressRepository();

    // Act
    final ConcurrentHashMap<String, PieceState> actual = progressRepository.getPieceProgress();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ProgressRepository.class, ConcurrentHashMap.class})
  @Test
  public void getProducerLoadInputNotNullOutputNotNull() throws Exception {

    // Arrange
    final ProgressRepository progressRepository = new ProgressRepository();

    // Act
    final AtomicInteger actual = progressRepository.getProducerLoad("00");

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ProgressRepository.class, ConcurrentHashMap.class})
  @Test
  public void getRunningPieceInputNotNullOutput1() throws Exception {

    // Arrange
    final ProgressRepository progressRepository = new ProgressRepository();

    // Act
    final Map<Integer, String> actual = progressRepository.getRunningPiece("");

    // Assert result
    final HashMap hashMap = new HashMap();
    hashMap.put(null, null);
    Assert.assertEquals(hashMap, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ProgressRepository.class, ConcurrentHashMap.class})
  @Test
  public void getServiceDownInfoInputNotNullOutputFalse() throws Exception {

    // Arrange
    final ProgressRepository progressRepository = new ProgressRepository();

    // Act and Assert result
    Assert.assertFalse(progressRepository.getServiceDownInfo(""));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ProgressRepository.class, ConcurrentHashMap.class})
  @Test
  public void getServiceDownInfoInputNotNullOutputTrue0009d067e9fe2a1231c() throws Exception {

    // Arrange
    final ProgressRepository progressRepository = new ProgressRepository();

    // Act and Assert result
    Assert.assertTrue(progressRepository.getServiceDownInfo(""));
  }

  // Test written by Diffblue Cover.
  @Test
  public void getServiceDownInfoOutputNotNull() {

    // Arrange
    final ProgressRepository progressRepository = new ProgressRepository();

    // Act
    final ConcurrentHashMap<String, Long> actual = progressRepository.getServiceDownInfo();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ProgressRepository.class, ConcurrentHashMap.class})
  @Test
  public void getServiceErrorInfoInputNotNullOutputNotNull() throws Exception {

    // Arrange
    final ProgressRepository progressRepository = new ProgressRepository();

    // Act
    final AtomicInteger actual = progressRepository.getServiceErrorInfo("00");

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getServiceErrorInfoOutputNotNull() {

    // Arrange
    final ProgressRepository progressRepository = new ProgressRepository();

    // Act
    final ConcurrentHashMap<String, AtomicInteger> actual =
        progressRepository.getServiceErrorInfo();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ProgressRepository.class, ConcurrentHashMap.class})
  @Test
  public void removeCdnProgressInputNotNullOutputFalse() throws Exception {

    // Arrange
    final ProgressRepository progressRepository = new ProgressRepository();

    // Act and Assert result
    Assert.assertFalse(progressRepository.removeCdnProgress(""));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ProgressRepository.class, ConcurrentHashMap.class})
  @Test
  public void removeCdnProgressInputNotNullOutputTrue() throws Exception {

    // Arrange
    final ProgressRepository progressRepository = new ProgressRepository();

    // Act and Assert result
    Assert.assertTrue(progressRepository.removeCdnProgress(""));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ProgressRepository.class, ConcurrentHashMap.class})
  @Test
  public void removeClientBlackInfoInputNotNullOutputFalse() throws Exception {

    // Arrange
    final ProgressRepository progressRepository = new ProgressRepository();

    // Act and Assert result
    Assert.assertFalse(progressRepository.removeClientBlackInfo(""));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ProgressRepository.class, ConcurrentHashMap.class})
  @Test
  public void removeClientBlackInfoInputNotNullOutputTrue() throws Exception {

    // Arrange
    final ProgressRepository progressRepository = new ProgressRepository();

    // Act and Assert result
    Assert.assertTrue(progressRepository.removeClientBlackInfo(""));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ProgressRepository.class, ConcurrentHashMap.class})
  @Test
  public void removeClientErrorInfoInputNotNullOutputFalse() throws Exception {

    // Arrange
    final ProgressRepository progressRepository = new ProgressRepository();

    // Act and Assert result
    Assert.assertFalse(progressRepository.removeClientErrorInfo(""));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ProgressRepository.class, ConcurrentHashMap.class})
  @Test
  public void removeClientErrorInfoInputNotNullOutputTrue() throws Exception {

    // Arrange
    final ProgressRepository progressRepository = new ProgressRepository();

    // Act and Assert result
    Assert.assertTrue(progressRepository.removeClientErrorInfo(""));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ProgressRepository.class, ConcurrentHashMap.class})
  @Test
  public void removeClientProgressInputNotNullOutputFalse() throws Exception {

    // Arrange
    final ProgressRepository progressRepository = new ProgressRepository();

    // Act and Assert result
    Assert.assertFalse(progressRepository.removeClientProgress(""));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ProgressRepository.class, ConcurrentHashMap.class})
  @Test
  public void removeClientProgressInputNotNullOutputTrue() throws Exception {

    // Arrange
    final ProgressRepository progressRepository = new ProgressRepository();

    // Act and Assert result
    Assert.assertTrue(progressRepository.removeClientProgress(""));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ProgressRepository.class, ConcurrentHashMap.class})
  @Test
  public void removePieceProgressInputNotNullOutputFalse() throws Exception {

    // Arrange
    final ProgressRepository progressRepository = new ProgressRepository();

    // Act and Assert result
    Assert.assertFalse(progressRepository.removePieceProgress(""));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ProgressRepository.class, ConcurrentHashMap.class})
  @Test
  public void removePieceProgressInputNotNullOutputTrue() throws Exception {

    // Arrange
    final ProgressRepository progressRepository = new ProgressRepository();

    // Act and Assert result
    Assert.assertTrue(progressRepository.removePieceProgress(""));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ProgressRepository.class, ConcurrentHashMap.class})
  @Test
  public void removeProducerLoadInputNotNullOutputFalse() throws Exception {

    // Arrange
    final ProgressRepository progressRepository = new ProgressRepository();

    // Act and Assert result
    Assert.assertFalse(progressRepository.removeProducerLoad(""));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ProgressRepository.class, ConcurrentHashMap.class})
  @Test
  public void removeProducerLoadInputNotNullOutputTrue() throws Exception {

    // Arrange
    final ProgressRepository progressRepository = new ProgressRepository();

    // Act and Assert result
    Assert.assertTrue(progressRepository.removeProducerLoad(""));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ProgressRepository.class, ConcurrentHashMap.class})
  @Test
  public void removeRunningPieceInputNotNullOutputFalse() throws Exception {

    // Arrange
    final ProgressRepository progressRepository = new ProgressRepository();

    // Act and Assert result
    Assert.assertFalse(progressRepository.removeRunningPiece(""));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ProgressRepository.class, ConcurrentHashMap.class})
  @Test
  public void removeRunningPieceInputNotNullOutputTrue() throws Exception {

    // Arrange
    final ProgressRepository progressRepository = new ProgressRepository();

    // Act and Assert result
    Assert.assertTrue(progressRepository.removeRunningPiece(""));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ProgressRepository.class, ConcurrentHashMap.class})
  @Test
  public void removeServiceDownInfoInputNotNullOutputFalse() throws Exception {

    // Arrange
    final ProgressRepository progressRepository = new ProgressRepository();

    // Act and Assert result
    Assert.assertFalse(progressRepository.removeServiceDownInfo(""));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ProgressRepository.class, ConcurrentHashMap.class})
  @Test
  public void removeServiceDownInfoInputNotNullOutputTrue() throws Exception {

    // Arrange
    final ProgressRepository progressRepository = new ProgressRepository();

    // Act and Assert result
    Assert.assertTrue(progressRepository.removeServiceDownInfo(""));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ProgressRepository.class, ConcurrentHashMap.class})
  @Test
  public void removeServiceErrorInfoInputNotNullOutputFalse() throws Exception {

    // Arrange
    final ProgressRepository progressRepository = new ProgressRepository();

    // Act and Assert result
    Assert.assertFalse(progressRepository.removeServiceErrorInfo(""));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ProgressRepository.class, ConcurrentHashMap.class})
  @Test
  public void removeServiceErrorInfoInputNotNullOutputTrue() throws Exception {

    // Arrange
    final ProgressRepository progressRepository = new ProgressRepository();

    // Act and Assert result
    Assert.assertTrue(progressRepository.removeServiceErrorInfo(""));
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(ProgressRepository.class)
  @Test
  public void staticInitOutputVoid() throws Exception, InvocationTargetException {

    // Arrange
    final ConcurrentHashMap concurrentHashMap8 = PowerMockito.mock(ConcurrentHashMap.class);
    final ConcurrentHashMap concurrentHashMap7 = PowerMockito.mock(ConcurrentHashMap.class);
    final ConcurrentHashMap concurrentHashMap6 = PowerMockito.mock(ConcurrentHashMap.class);
    final ConcurrentHashMap concurrentHashMap5 = PowerMockito.mock(ConcurrentHashMap.class);
    final ConcurrentHashMap concurrentHashMap4 = PowerMockito.mock(ConcurrentHashMap.class);
    final ConcurrentHashMap concurrentHashMap3 = PowerMockito.mock(ConcurrentHashMap.class);
    final ConcurrentHashMap concurrentHashMap2 = PowerMockito.mock(ConcurrentHashMap.class);
    final ConcurrentHashMap concurrentHashMap1 = PowerMockito.mock(ConcurrentHashMap.class);
    final ConcurrentHashMap concurrentHashMap = PowerMockito.mock(ConcurrentHashMap.class);
    PowerMockito.whenNew(ConcurrentHashMap.class)
        .withNoArguments()
        .thenReturn(concurrentHashMap)
        .thenReturn(concurrentHashMap1)
        .thenReturn(concurrentHashMap2)
        .thenReturn(concurrentHashMap3)
        .thenReturn(concurrentHashMap4)
        .thenReturn(concurrentHashMap5)
        .thenReturn(concurrentHashMap6)
        .thenReturn(concurrentHashMap7)
        .thenReturn(concurrentHashMap8);

    // Act, using constructor to test static initializer
    final Object constructed =
        Reflector.getInstance("com.alibaba.dragonfly.supernode.repository.ProgressRepository");
  }
}

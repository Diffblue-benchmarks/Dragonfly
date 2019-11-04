package com.alibaba.dragonfly.supernode.repository;

import com.alibaba.dragonfly.supernode.repository.PieceState;
import com.alibaba.dragonfly.supernode.repository.ProgressRepository;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.InvocationTargetException;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;



public class ProgressRepositoryTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void addCdnProgressInputNotNullNotNullOutputTrue999c8f5f3803845e9ce() {

    // Arrange
    final ProgressRepository thisObj = new ProgressRepository();
    final String arg0 = "aaaaa";
    final BitSet arg1 = new BitSet();

    // Act
    final boolean actual = thisObj.addCdnProgress(arg0, arg1);

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void addClientBlackInfoInputNotNullNotNullOutputTrue9992379fb29bd1db0ad() {

    // Arrange
    final ProgressRepository thisObj = new ProgressRepository();
    final String arg0 = "aaaaa";
    final HashSet<String> arg1 = new HashSet<String>();
    arg1.add("aaaaa");

    // Act
    final boolean actual = thisObj.addClientBlackInfo(arg0, arg1);

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void addClientErrorInfoInputNotNullNotNullOutputTrue99975a5453b8c6f73c9() {

    // Arrange
    final ProgressRepository thisObj = new ProgressRepository();
    final String arg0 = "aaaaa";
    final AtomicInteger arg1 = new AtomicInteger();

    // Act
    final boolean actual = thisObj.addClientErrorInfo(arg0, arg1);

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void addClientProgressInputNotNullNotNullOutputTrue999d2e4258e8d9a7ed1() {

    // Arrange
    final ProgressRepository thisObj = new ProgressRepository();
    final String arg0 = "aaaaa";
    final BitSet arg1 = new BitSet();

    // Act
    final boolean actual = thisObj.addClientProgress(arg0, arg1);

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void addProducerLoadInputNotNullNotNullOutputTrue999f28d1e1c9295d7f1() {

    // Arrange
    final ProgressRepository thisObj = new ProgressRepository();
    final String arg0 = "aaaaa";
    final AtomicInteger arg1 = new AtomicInteger();

    // Act
    final boolean actual = thisObj.addProducerLoad(arg0, arg1);

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void addRunningPieceInputNotNullNotNullOutputTrue99907c32a3c463cb4ac() {

    // Arrange
    final ProgressRepository thisObj = new ProgressRepository();
    final String arg0 = "aaaaa";
    final HashMap<Integer, String> arg1 = new HashMap<Integer, String>();
    final Integer integer = new Integer(1);
    arg1.put(integer, "aaaaa");

    // Act
    final boolean actual = thisObj.addRunningPiece(arg0, arg1);

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void addServiceDownInfoInputNotNullPositiveOutputTrue999e8077c6a4d04ccc4() {

    // Arrange
    final ProgressRepository thisObj = new ProgressRepository();
    final String arg0 = "aaaaa";
    final long arg1 = 1L;

    // Act
    final boolean actual = thisObj.addServiceDownInfo(arg0, arg1);

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void addServiceErrorInfoInputNotNullNotNullOutputTrue999458f563b2ea8e1c5() {

    // Arrange
    final ProgressRepository thisObj = new ProgressRepository();
    final String arg0 = "aaaaa";
    final AtomicInteger arg1 = new AtomicInteger();

    // Act
    final boolean actual = thisObj.addServiceErrorInfo(arg0, arg1);

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999a9dbb5230a16f40b() {

    // Act, creating object to test constructor
    final ProgressRepository actual = new ProgressRepository();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getClientBlackInfoInputNotNullOutputVoid999ca5f023f07b53608() {

    // Arrange
    final ProgressRepository thisObj = new ProgressRepository();
    final String arg0 = "aaaaa";

    // Act
    final Set<String> actual = thisObj.getClientBlackInfo(arg0);

    // The method returns void, testing that no exception is thrown

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void getClientErrorInfoInputNotNullOutputNotNull9993104f49a15c43c9a() {
//
//    // Arrange
//    final ProgressRepository thisObj = new ProgressRepository();
//    final String arg0 = "aaaaa";
//
//    // Act
//    final AtomicInteger actual = thisObj.getClientErrorInfo(arg0);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertEquals(0, actual.get());
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void getClientProgressInputNotNullOutputVoid999c1402ea9d274225c() {

    // Arrange
    final ProgressRepository thisObj = new ProgressRepository();
    final String arg0 = "aaaaa";

    // Act
    final BitSet actual = thisObj.getClientProgress(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getPieceProgressOutputNotNull999a2a2bf8d11345875() {

    // Arrange
    final ProgressRepository thisObj = new ProgressRepository();

    // Act
    final ConcurrentHashMap<String, PieceState> actual = thisObj.getPieceProgress();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getPieceProgressInputNotNullPositiveOutputVoid9998c5da234f6241068() {

    // Arrange
    final ProgressRepository thisObj = new ProgressRepository();
    final String arg0 = "aaaaa";
    final int arg1 = 1;

    // Act
    final PieceState actual = thisObj.getPieceProgress(arg0, arg1);

    // The method returns void, testing that no exception is thrown

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void getProducerLoadInputNotNullOutputNotNull9990a1617f8a14fd2ca() {
//
//    // Arrange
//    final ProgressRepository thisObj = new ProgressRepository();
//    final String arg0 = "aaaaa";
//
//    // Act
//    final AtomicInteger actual = thisObj.getProducerLoad(arg0);
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertEquals(0, actual.get());
//
//  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void getRunningPieceInputNotNullOutput1999ce2ecf5a83c5185b() throws InvocationTargetException {
//
//    // Arrange
//    final ProgressRepository thisObj = new ProgressRepository();
//    final String arg0 = "aaaaa";
//
//    // Act
//    final Map<Integer, String> actual = thisObj.getRunningPiece(arg0);
//
//    // Assert result
//    final HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
//    final Integer integer = (Integer) Reflector.getInstance("java.lang.Integer");
//    hashMap.put(integer, "aaaaa");
//    Assert.assertEquals(hashMap, actual);
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void getServiceDownInfoOutputNotNull9992ce12255f9b74a46() {

    // Arrange
    final ProgressRepository thisObj = new ProgressRepository();

    // Act
    final ConcurrentHashMap<String, Long> actual = thisObj.getServiceDownInfo();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getServiceDownInfoInputNotNullOutputNotNull99974fc295468fb64a3() {

    // Arrange
    final ProgressRepository thisObj = new ProgressRepository();
    final String arg0 = "aaaaa";

    // Act
    final Boolean actual = thisObj.getServiceDownInfo(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getServiceErrorInfoOutputNotNull99931eb33a27696428e() {

    // Arrange
    final ProgressRepository thisObj = new ProgressRepository();

    // Act
    final ConcurrentHashMap<String, AtomicInteger> actual = thisObj.getServiceErrorInfo();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getServiceErrorInfoInputNotNullOutputVoid99956bfc5be4a89dea0() {

    // Arrange
    final ProgressRepository thisObj = new ProgressRepository();
    final String arg0 = "aaaaa";

    // Act
    final AtomicInteger actual = thisObj.getServiceErrorInfo(arg0);

    // The method returns void, testing that no exception is thrown

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void removeCdnProgressInputNotNullOutputTrue999743d9a75ad265b12() {
//
//    // Arrange
//    final ProgressRepository thisObj = new ProgressRepository();
//    final String arg0 = "aaaaa";
//
//    // Act
//    final boolean actual = thisObj.removeCdnProgress(arg0);
//
//    // Assert result
//    Assert.assertTrue(actual);
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void removeClientBlackInfoInputNotNullOutputTrue999e9886684fc6361f6() {

    // Arrange
    final ProgressRepository thisObj = new ProgressRepository();
    final String arg0 = "aaaaa";

    // Act
    final boolean actual = thisObj.removeClientBlackInfo(arg0);

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void removeClientErrorInfoInputNotNullOutputFalse999472119a7eb177f6f() {

    // Arrange
    final ProgressRepository thisObj = new ProgressRepository();
    final String arg0 = "aaaaa";

    // Act
    final boolean actual = thisObj.removeClientErrorInfo(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void removeClientProgressInputNotNullOutputTrue999a3f0eb5b475f3da8() {
//
//    // Arrange
//    final ProgressRepository thisObj = new ProgressRepository();
//    final String arg0 = "aaaaa";
//
//    // Act
//    final boolean actual = thisObj.removeClientProgress(arg0);
//
//    // Assert result
//    Assert.assertTrue(actual);
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void removePieceProgressInputNotNullOutputFalse9995e751c3ae6204e72() {

    // Arrange
    final ProgressRepository thisObj = new ProgressRepository();
    final String arg0 = "aaaaa";

    // Act
    final boolean actual = thisObj.removePieceProgress(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void removeProducerLoadInputNotNullOutputFalse9998ab81cd4bc18f6c5() {

    // Arrange
    final ProgressRepository thisObj = new ProgressRepository();
    final String arg0 = "aaaaa";

    // Act
    final boolean actual = thisObj.removeProducerLoad(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void removeRunningPieceInputNotNullOutputTrue999e9ddc5d862723ba1() {
//
//    // Arrange
//    final ProgressRepository thisObj = new ProgressRepository();
//    final String arg0 = "aaaaa";
//
//    // Act
//    final boolean actual = thisObj.removeRunningPiece(arg0);
//
//    // Assert result
//    Assert.assertTrue(actual);
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void removeServiceDownInfoInputNotNullOutputTrue999cc7b7a9c1423a294() {

    // Arrange
    final ProgressRepository thisObj = new ProgressRepository();
    final String arg0 = "aaaaa";

    // Act
    final boolean actual = thisObj.removeServiceDownInfo(arg0);

    // Assert result
    Assert.assertTrue(actual);

  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void removeServiceErrorInfoInputNotNullOutputTrue99995c26d5d94442d54() {
//
//    // Arrange
//    final ProgressRepository thisObj = new ProgressRepository();
//    final String arg0 = "aaaaa";
//
//    // Act
//    final boolean actual = thisObj.removeServiceErrorInfo(arg0);
//
//    // Assert result
//    Assert.assertTrue(actual);
//
//  }
}

package com.alibaba.dragonfly.supernode.common.domain;

import com.alibaba.dragonfly.supernode.common.domain.Task;
import com.alibaba.dragonfly.supernode.common.enumeration.CdnStatus;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.concurrent.ConcurrentHashMap;



public class TaskTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void addAuthIpsInputNotNullOutputVoid99911159016b0a76569() {

    // Arrange
    final Task thisObj = new Task();
    final String arg0 = "aaaaa";

    // Act
    thisObj.addAuthIps(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999befd7c4c0ad24a23() {

    // Act, creating object to test constructor
    final Task actual = new Task();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getHeaders());
    Assert.assertNull(actual.getCurIp());
    Assert.assertNull(actual.getBizId());
    Assert.assertNull(actual.getFileLength());
    Assert.assertFalse(actual.isDfdaemon());
    Assert.assertEquals(CdnStatus.WAIT, actual.getCdnStatus());
    Assert.assertNull(actual.getHttpFileLen());
    Assert.assertNull(actual.getMd5());
    Assert.assertFalse(actual.isNotReachable());
    Assert.assertNotNull(actual.getPieceMd5Map());
    Assert.assertNull(actual.getSourceUrl());
    Assert.assertNull(actual.getTaskId());
    Assert.assertNull(actual.getPieceSize());
    Assert.assertNotNull(actual.getPieceTotal());
    Assert.assertNull(actual.getRealMd5());
    Assert.assertNull(actual.getTaskUrl());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullNotNullNotNull3TrueNotNullOutputNotNull99959d954e4aecc1f6a() {

    // Arrange
    final String arg0 = "aaaaa";
    final String arg1 = "aaaaa";
    final String arg2 = "aaaaa";
    final String arg3 = "aaaaa";
    final String[] arg4 = { "aaaaa", "aaaaa", "aaaaa" };
    final boolean arg5 = true;
    final String arg6 = "aaaaa";

    // Act, creating object to test constructor
    final Task actual = new Task(arg0, arg1, arg2, arg3, arg4, arg5, arg6);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertArrayEquals(new String[]{ "aaaaa", "aaaaa", "aaaaa" }, actual.getHeaders());
    Assert.assertEquals("aaaaa", actual.getCurIp());
    Assert.assertEquals("aaaaa", actual.getBizId());
    Assert.assertNull(actual.getFileLength());
    Assert.assertTrue(actual.isDfdaemon());
    Assert.assertEquals(CdnStatus.WAIT, actual.getCdnStatus());
    Assert.assertNull(actual.getHttpFileLen());
    Assert.assertEquals("aaaaa", actual.getMd5());
    Assert.assertFalse(actual.isNotReachable());
    Assert.assertNotNull(actual.getPieceMd5Map());
    Assert.assertEquals("aaaaa", actual.getSourceUrl());
    Assert.assertNull(actual.getTaskId());
    Assert.assertNull(actual.getPieceSize());
    Assert.assertNotNull(actual.getPieceTotal());
    Assert.assertNull(actual.getRealMd5());
    Assert.assertEquals("aaaaa", actual.getTaskUrl());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullNotNullOutputNotNull999f700ce06e8fbd4cd() {

    // Arrange
    final String arg0 = "aaaaa";
    final String arg1 = "aaaaa";
    final String arg2 = "aaaaa";

    // Act, creating object to test constructor
    final Task actual = new Task(arg0, arg1, arg2);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getHeaders());
    Assert.assertNull(actual.getCurIp());
    Assert.assertEquals("aaaaa", actual.getBizId());
    Assert.assertNull(actual.getFileLength());
    Assert.assertFalse(actual.isDfdaemon());
    Assert.assertEquals(CdnStatus.WAIT, actual.getCdnStatus());
    Assert.assertNull(actual.getHttpFileLen());
    Assert.assertEquals("aaaaa", actual.getMd5());
    Assert.assertFalse(actual.isNotReachable());
    Assert.assertNotNull(actual.getPieceMd5Map());
    Assert.assertNull(actual.getSourceUrl());
    Assert.assertNull(actual.getTaskId());
    Assert.assertNull(actual.getPieceSize());
    Assert.assertNotNull(actual.getPieceTotal());
    Assert.assertNull(actual.getRealMd5());
    Assert.assertEquals("aaaaa", actual.getTaskUrl());

  }

  // Test written by Diffblue Cover
  @Test
  public void equalsInputNotNullOutputFalse9996bb4c50be1b3c40c() {

    // Arrange
    final Task thisObj = new Task();
    final Object arg0 = "aaaaa";

    // Act
    final boolean actual = thisObj.equals(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getBizIdOutputVoid99962de26f3703ed2b3() {

    // Arrange
    final Task thisObj = new Task();

    // Act
    final String actual = thisObj.getBizId();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getCdnStatusOutputWait999c51125b01684f914() {

    // Arrange
    final Task thisObj = new Task();

    // Act
    final CdnStatus actual = thisObj.getCdnStatus();

    // Assert result
    Assert.assertEquals(CdnStatus.WAIT, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getCurIpOutputVoid999da20c1fec2beeadd() {

    // Arrange
    final Task thisObj = new Task();

    // Act
    final String actual = thisObj.getCurIp();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getFileLengthOutputVoid999c5e0863421c89079() {

    // Arrange
    final Task thisObj = new Task();

    // Act
    final Long actual = thisObj.getFileLength();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getHeadersOutputVoid9995e85be9794c1c06e() {

    // Arrange
    final Task thisObj = new Task();

    // Act
    final String[] actual = thisObj.getHeaders();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getHttpFileLenOutputVoid999f903c2bfaf9a0923() {

    // Arrange
    final Task thisObj = new Task();

    // Act
    final Long actual = thisObj.getHttpFileLen();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getMd5OutputVoid999e9a6fb96c1980c3a() {

    // Arrange
    final Task thisObj = new Task();

    // Act
    final String actual = thisObj.getMd5();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getPieceMd5MapOutputNotNull99971e531d8b2b274a6() {

    // Arrange
    final Task thisObj = new Task();

    // Act
    final ConcurrentHashMap<Integer, String> actual = thisObj.getPieceMd5Map();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getPieceMd5InputPositiveOutputNotNull999ff71e2bc1869eedc() {

    // Arrange
    final Task thisObj = new Task();
    final int arg0 = 1;

    // Act
    final String actual = thisObj.getPieceMd5(arg0);

    // Assert result
    Assert.assertEquals("", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getPieceSizeOutputVoid9998fa1428ac767ca21() {

    // Arrange
    final Task thisObj = new Task();

    // Act
    final Integer actual = thisObj.getPieceSize();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getPieceTotalOutputNotNull999b30a1ab8fe15a9dc() {

    // Arrange
    final Task thisObj = new Task();

    // Act
    final Integer actual = thisObj.getPieceTotal();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getRealMd5OutputVoid999158e82a7f266b604() {

    // Arrange
    final Task thisObj = new Task();

    // Act
    final String actual = thisObj.getRealMd5();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getSourceUrlOutputVoid999124ed7374f91ffdd() {

    // Arrange
    final Task thisObj = new Task();

    // Act
    final String actual = thisObj.getSourceUrl();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getTaskIdOutputVoid999d1391bca7a968be9() {

    // Arrange
    final Task thisObj = new Task();

    // Act
    final String actual = thisObj.getTaskId();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getTaskUrlOutputVoid9999db8cb3418c302ea() {

    // Arrange
    final Task thisObj = new Task();

    // Act
    final String actual = thisObj.getTaskUrl();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void hashCodeOutputPositive999a056c506ae022d9e() {

    // Arrange
    final Task thisObj = new Task();

    // Act
    final int actual = thisObj.hashCode();

    // Assert result
    Assert.assertEquals(17, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void inAuthIpsInputNotNullOutputNullPointerException9993ad89ed59dd63f2b() {

    // Arrange
    final Task thisObj = new Task();
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.inAuthIps(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void isDfdaemonOutputFalse999ee44451b6b4d6375() {

    // Arrange
    final Task thisObj = new Task();

    // Act
    final boolean actual = thisObj.isDfdaemon();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isFailOutputFalse999e038d0c7b541d40f() {

    // Arrange
    final Task thisObj = new Task();

    // Act
    final boolean actual = thisObj.isFail();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isFrozenOutputTrue999024952d23f9e6d3b() {

    // Arrange
    final Task thisObj = new Task();

    // Act
    final boolean actual = thisObj.isFrozen();

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isNotReachableOutputFalse999622b733cf6b9fc15() {

    // Arrange
    final Task thisObj = new Task();

    // Act
    final boolean actual = thisObj.isNotReachable();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isSuccessOutputFalse9999f81e2dbcd88c507() {

    // Arrange
    final Task thisObj = new Task();

    // Act
    final boolean actual = thisObj.isSuccess();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isWaitOutputTrue999643850d443cb94fd() {

    // Arrange
    final Task thisObj = new Task();

    // Act
    final boolean actual = thisObj.isWait();

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void setBizIdInputNotNullOutputVoid9996becb12aeb7c6c00() {

    // Arrange
    final Task thisObj = new Task();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setBizId(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getBizId());

  }

  // Test written by Diffblue Cover
  @Test
  public void setCdnStatusInputWaitOutputVoid999cd3b53b5bde64f51() {

    // Arrange
    final Task thisObj = new Task();
    final CdnStatus arg0 = CdnStatus.WAIT;

    // Act
    thisObj.setCdnStatus(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setCurIpInputNotNullOutputVoid99923060e7f80aef96a() {

    // Arrange
    final Task thisObj = new Task();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setCurIp(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getCurIp());

  }

  // Test written by Diffblue Cover
  @Test
  public void setFileLengthInputNotNullOutputVoid999c81a234156bddc12() {

    // Arrange
    final Task thisObj = new Task();
    final Long arg0 = new Long(1L);

    // Act
    thisObj.setFileLength(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getFileLength());

  }

  // Test written by Diffblue Cover
  @Test
  public void setHeadersInput3OutputVoid9999af1bde34e5fe07a() {

    // Arrange
    final Task thisObj = new Task();
    final String[] arg0 = { "aaaaa", "aaaaa", "aaaaa" };

    // Act
    thisObj.setHeaders(arg0);

    // Assert side effects
    Assert.assertArrayEquals(new String[]{ "aaaaa", "aaaaa", "aaaaa" }, thisObj.getHeaders());

  }

  // Test written by Diffblue Cover
  @Test
  public void setHttpFileLenInputNotNullOutputVoid999bca9f14814739c87() {

    // Arrange
    final Task thisObj = new Task();
    final Long arg0 = new Long(1L);

    // Act
    thisObj.setHttpFileLen(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getHttpFileLen());

  }

  // Test written by Diffblue Cover
  @Test
  public void setNotReachableInputTrueOutputVoid999d833095cd6f361a0() {

    // Arrange
    final Task thisObj = new Task();
    final boolean arg0 = true;

    // Act
    thisObj.setNotReachable(arg0);

    // Assert side effects
    Assert.assertTrue(thisObj.isNotReachable());

  }

  // Test written by Diffblue Cover
  @Test
  public void setPieceMd5InputPositiveNotNullOutputTrue99952770222030aafd2() {

    // Arrange
    final Task thisObj = new Task();
    final int arg0 = 1;
    final String arg1 = "aaaaa";

    // Act
    final boolean actual = thisObj.setPieceMd5(arg0, arg1);

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void setPieceSizeInputNotNullOutputVoid99973cb7069fca0ff5c() {

    // Arrange
    final Task thisObj = new Task();
    final Integer arg0 = new Integer(1);

    // Act
    thisObj.setPieceSize(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getPieceSize());

  }

  // Test written by Diffblue Cover
  @Test
  public void setPieceTotalInputNotNullOutputVoid999aaef3525bce13c6d() {

    // Arrange
    final Task thisObj = new Task();
    final Integer arg0 = new Integer(1);

    // Act
    thisObj.setPieceTotal(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setRealMd5InputNotNullOutputVoid99980a9da64911d40f7() {

    // Arrange
    final Task thisObj = new Task();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setRealMd5(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getRealMd5());

  }

  // Test written by Diffblue Cover
  @Test
  public void setSourceUrlInputNotNullOutputVoid99950d4b988ef6fb869() {

    // Arrange
    final Task thisObj = new Task();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setSourceUrl(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getSourceUrl());

  }

  // Test written by Diffblue Cover
  @Test
  public void setTaskIdInputNotNullOutputVoid999c9c6600a1eee2715() {

    // Arrange
    final Task thisObj = new Task();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setTaskId(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getTaskId());

  }

  // Test written by Diffblue Cover
  @Test
  public void setTaskUrlInputNotNullOutputVoid999fbd20204b30ede19() {

    // Arrange
    final Task thisObj = new Task();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setTaskUrl(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getTaskUrl());

  }
}

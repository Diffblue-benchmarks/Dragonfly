package com.alibaba.dragonfly.supernode.common.view;

import com.alibaba.dragonfly.supernode.common.view.PieceTask;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class PieceTaskTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99990e9d4f14f02fb0e() {

    // Act, creating object to test constructor
    final PieceTask actual = new PieceTask();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getPieceMd5());
    Assert.assertEquals(0, actual.getPeerPort());
    Assert.assertNull(actual.getPath());
    Assert.assertEquals(0, actual.getPieceSize());
    Assert.assertEquals(0, actual.getDownLink());
    Assert.assertEquals(0, actual.getPieceNum());
    Assert.assertNull(actual.getPeerIp());
    Assert.assertNull(actual.getCid());
    Assert.assertNull(actual.getRange());

  }

  // Test written by Diffblue Cover
  @Test
  public void getCidOutputVoid999895dbe6a425a4c3a() {

    // Arrange
    final PieceTask thisObj = new PieceTask();

    // Act
    final String actual = thisObj.getCid();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getDownLinkOutputZero999c8d6dc0469aac84c() {

    // Arrange
    final PieceTask thisObj = new PieceTask();

    // Act
    final int actual = thisObj.getDownLink();

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getPathOutputVoid999fa74a1faf4cba1cc() {

    // Arrange
    final PieceTask thisObj = new PieceTask();

    // Act
    final String actual = thisObj.getPath();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getPeerIpOutputVoid999c4bb6af1d15e807c() {

    // Arrange
    final PieceTask thisObj = new PieceTask();

    // Act
    final String actual = thisObj.getPeerIp();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getPeerPortOutputZero9994ae3c8e46a3b4c38() {

    // Arrange
    final PieceTask thisObj = new PieceTask();

    // Act
    final int actual = thisObj.getPeerPort();

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getPieceMd5OutputVoid999ec36087e70b00ea9() {

    // Arrange
    final PieceTask thisObj = new PieceTask();

    // Act
    final String actual = thisObj.getPieceMd5();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getPieceNumOutputZero9995bf5696b229f8c49() {

    // Arrange
    final PieceTask thisObj = new PieceTask();

    // Act
    final int actual = thisObj.getPieceNum();

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getPieceSizeOutputZero99902305c2c33a13bb4() {

    // Arrange
    final PieceTask thisObj = new PieceTask();

    // Act
    final int actual = thisObj.getPieceSize();

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getRangeOutputVoid999d74f71be618a4f6f() {

    // Arrange
    final PieceTask thisObj = new PieceTask();

    // Act
    final String actual = thisObj.getRange();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setCidInputNotNullOutputVoid9993de0d2b4b58e3d77() {

    // Arrange
    final PieceTask thisObj = new PieceTask();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setCid(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getCid());

  }

  // Test written by Diffblue Cover
  @Test
  public void setDownLinkInputPositiveOutputVoid99916c6047183a1100b() {

    // Arrange
    final PieceTask thisObj = new PieceTask();
    final int arg0 = 1;

    // Act
    thisObj.setDownLink(arg0);

    // Assert side effects
    Assert.assertEquals(1, thisObj.getDownLink());

  }

  // Test written by Diffblue Cover
  @Test
  public void setPathInputNotNullOutputVoid99905d1539d0ebaa6e5() {

    // Arrange
    final PieceTask thisObj = new PieceTask();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setPath(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getPath());

  }

  // Test written by Diffblue Cover
  @Test
  public void setPeerIpInputNotNullOutputVoid999da2b9e1c67ea3f33() {

    // Arrange
    final PieceTask thisObj = new PieceTask();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setPeerIp(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getPeerIp());

  }

  // Test written by Diffblue Cover
  @Test
  public void setPeerPortInputPositiveOutputVoid9997dd50fa154e20480() {

    // Arrange
    final PieceTask thisObj = new PieceTask();
    final int arg0 = 1;

    // Act
    thisObj.setPeerPort(arg0);

    // Assert side effects
    Assert.assertEquals(1, thisObj.getPeerPort());

  }

  // Test written by Diffblue Cover
  @Test
  public void setPieceMd5InputNotNullOutputVoid999c010592a13fd3f03() {

    // Arrange
    final PieceTask thisObj = new PieceTask();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setPieceMd5(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getPieceMd5());

  }

  // Test written by Diffblue Cover
  @Test
  public void setPieceNumInputPositiveOutputVoid999850ec77f67bc27b6() {

    // Arrange
    final PieceTask thisObj = new PieceTask();
    final int arg0 = 1;

    // Act
    thisObj.setPieceNum(arg0);

    // Assert side effects
    Assert.assertEquals(1, thisObj.getPieceNum());

  }

  // Test written by Diffblue Cover
  @Test
  public void setPieceSizeInputPositiveOutputVoid999058d27bc5a1200fa() {

    // Arrange
    final PieceTask thisObj = new PieceTask();
    final int arg0 = 1;

    // Act
    thisObj.setPieceSize(arg0);

    // Assert side effects
    Assert.assertEquals(1, thisObj.getPieceSize());

  }

  // Test written by Diffblue Cover
  @Test
  public void setRangeInputNotNullOutputVoid999a65c9a870c5a6f61() {

    // Arrange
    final PieceTask thisObj = new PieceTask();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setRange(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getRange());

  }
}

package com.alibaba.dragonfly.supernode.common.view;

import com.alibaba.dragonfly.supernode.common.view.PieceTask;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class PieceTaskTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final PieceTask actual = new PieceTask();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getCid());
    Assert.assertNull(actual.getPeerIp());
    Assert.assertNull(actual.getRange());
    Assert.assertNull(actual.getPath());
    Assert.assertEquals(0, actual.getDownLink());
    Assert.assertEquals(0, actual.getPieceNum());
    Assert.assertEquals(0, actual.getPieceSize());
    Assert.assertEquals(0, actual.getPeerPort());
    Assert.assertNull(actual.getPieceMd5());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getCidOutputNull() {

    // Arrange
    final PieceTask pieceTask = new PieceTask();

    // Act and Assert result
    Assert.assertNull(pieceTask.getCid());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getDownLinkOutputZero() {

    // Arrange
    final PieceTask pieceTask = new PieceTask();

    // Act and Assert result
    Assert.assertEquals(0, pieceTask.getDownLink());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPathOutputNull() {

    // Arrange
    final PieceTask pieceTask = new PieceTask();

    // Act and Assert result
    Assert.assertNull(pieceTask.getPath());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPeerIpOutputNull() {

    // Arrange
    final PieceTask pieceTask = new PieceTask();

    // Act and Assert result
    Assert.assertNull(pieceTask.getPeerIp());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPeerPortOutputZero() {

    // Arrange
    final PieceTask pieceTask = new PieceTask();

    // Act and Assert result
    Assert.assertEquals(0, pieceTask.getPeerPort());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPieceMd5OutputNull() {

    // Arrange
    final PieceTask pieceTask = new PieceTask();

    // Act and Assert result
    Assert.assertNull(pieceTask.getPieceMd5());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPieceNumOutputZero() {

    // Arrange
    final PieceTask pieceTask = new PieceTask();

    // Act and Assert result
    Assert.assertEquals(0, pieceTask.getPieceNum());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPieceSizeOutputZero() {

    // Arrange
    final PieceTask pieceTask = new PieceTask();

    // Act and Assert result
    Assert.assertEquals(0, pieceTask.getPieceSize());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getRangeOutputNull() {

    // Arrange
    final PieceTask pieceTask = new PieceTask();

    // Act and Assert result
    Assert.assertNull(pieceTask.getRange());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setCidInputNotNullOutputVoid() {

    // Arrange
    final PieceTask pieceTask = new PieceTask();

    // Act
    pieceTask.setCid("");

    // Assert side effects
    Assert.assertEquals("", pieceTask.getCid());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setDownLinkInputZeroOutputVoid() {

    // Arrange
    final PieceTask pieceTask = new PieceTask();

    // Act
    pieceTask.setDownLink(0);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void setPathInputNotNullOutputVoid() {

    // Arrange
    final PieceTask pieceTask = new PieceTask();

    // Act
    pieceTask.setPath("");

    // Assert side effects
    Assert.assertEquals("", pieceTask.getPath());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setPeerIpInputNotNullOutputVoid() {

    // Arrange
    final PieceTask pieceTask = new PieceTask();

    // Act
    pieceTask.setPeerIp("");

    // Assert side effects
    Assert.assertEquals("", pieceTask.getPeerIp());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setPeerPortInputZeroOutputVoid() {

    // Arrange
    final PieceTask pieceTask = new PieceTask();

    // Act
    pieceTask.setPeerPort(0);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void setPieceMd5InputNotNullOutputVoid() {

    // Arrange
    final PieceTask pieceTask = new PieceTask();

    // Act
    pieceTask.setPieceMd5("");

    // Assert side effects
    Assert.assertEquals("", pieceTask.getPieceMd5());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setPieceNumInputZeroOutputVoid() {

    // Arrange
    final PieceTask pieceTask = new PieceTask();

    // Act
    pieceTask.setPieceNum(0);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void setPieceSizeInputZeroOutputVoid() {

    // Arrange
    final PieceTask pieceTask = new PieceTask();

    // Act
    pieceTask.setPieceSize(0);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void setRangeInputNotNullOutputVoid() {

    // Arrange
    final PieceTask pieceTask = new PieceTask();

    // Act
    pieceTask.setRange("");

    // Assert side effects
    Assert.assertEquals("", pieceTask.getRange());
  }
}

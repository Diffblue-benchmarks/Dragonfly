package com.alibaba.dragonfly.supernode.rest.request;

import com.alibaba.dragonfly.supernode.rest.request.ReportPieceRequest;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ReportPieceRequestTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void canEqualInputNotNullOutputFalse999e093fc435ac4f1f4() {

    // Arrange
    final ReportPieceRequest thisObj = new ReportPieceRequest();
    final Object arg0 = "aaaaa";

    // Act
    final boolean actual = thisObj.canEqual(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9993d5993b8d48da330() {

    // Act, creating object to test constructor
    final ReportPieceRequest actual = new ReportPieceRequest();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getDstCid());
    Assert.assertNull(actual.getCid());
    Assert.assertNull(actual.getPieceRange());
    Assert.assertNull(actual.getTaskId());

  }

  // Test written by Diffblue Cover
  @Test
  public void equalsInputNotNullOutputFalse9992bbe76d3bc4e73af() {

    // Arrange
    final ReportPieceRequest thisObj = new ReportPieceRequest();
    final Object arg0 = "aaaaa";

    // Act
    final boolean actual = thisObj.equals(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getCidOutputVoid9997b3605022ef90d7c() {

    // Arrange
    final ReportPieceRequest thisObj = new ReportPieceRequest();

    // Act
    final String actual = thisObj.getCid();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getDstCidOutputVoid9991077dd7b9c5b67f9() {

    // Arrange
    final ReportPieceRequest thisObj = new ReportPieceRequest();

    // Act
    final String actual = thisObj.getDstCid();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getPieceRangeOutputVoid999bc727070198930f8() {

    // Arrange
    final ReportPieceRequest thisObj = new ReportPieceRequest();

    // Act
    final String actual = thisObj.getPieceRange();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getTaskIdOutputVoid999074fad3407399e49() {

    // Arrange
    final ReportPieceRequest thisObj = new ReportPieceRequest();

    // Act
    final String actual = thisObj.getTaskId();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void hashCodeOutputPositive999bea54ae696fe8940() {

    // Arrange
    final ReportPieceRequest thisObj = new ReportPieceRequest();

    // Act
    final int actual = thisObj.hashCode();

    // Assert result
    Assert.assertEquals(21_100_921, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void setCidInputNotNullOutputVoid99978d7f07b891da586() {

    // Arrange
    final ReportPieceRequest thisObj = new ReportPieceRequest();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setCid(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getCid());

  }

  // Test written by Diffblue Cover
  @Test
  public void setDstCidInputNotNullOutputVoid99918731b0429d49a03() {

    // Arrange
    final ReportPieceRequest thisObj = new ReportPieceRequest();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setDstCid(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getDstCid());

  }

  // Test written by Diffblue Cover
  @Test
  public void setPieceRangeInputNotNullOutputVoid999e396587f74fb2a80() {

    // Arrange
    final ReportPieceRequest thisObj = new ReportPieceRequest();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setPieceRange(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getPieceRange());

  }

  // Test written by Diffblue Cover
  @Test
  public void setTaskIdInputNotNullOutputVoid9996194834ea57b7c36() {

    // Arrange
    final ReportPieceRequest thisObj = new ReportPieceRequest();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setTaskId(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getTaskId());

  }

  // Test written by Diffblue Cover
  @Test
  public void toStringOutputNotNull99997d162c4d4730fbf() {

    // Arrange
    final ReportPieceRequest thisObj = new ReportPieceRequest();

    // Act
    final String actual = thisObj.toString();

    // Assert result
    Assert.assertEquals("ReportPieceRequest(taskId=null, cid=null, dstCid=null, pieceRange=null)", actual);

  }
}

package com.alibaba.dragonfly.supernode.rest.request;

import com.alibaba.dragonfly.supernode.rest.request.PullPieceTaskRequest;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class PullPieceTaskRequestTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void canEqualInputNotNullOutputFalse99992d50eb310a421d2() {

    // Arrange
    final PullPieceTaskRequest thisObj = new PullPieceTaskRequest();
    final Object arg0 = "aaaaa";

    // Act
    final boolean actual = thisObj.canEqual(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999f7ed05527e554f5e() {

    // Act, creating object to test constructor
    final PullPieceTaskRequest actual = new PullPieceTaskRequest();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getRange());
    Assert.assertNull(actual.getTaskId());
    Assert.assertNull(actual.getDstCid());
    Assert.assertNull(actual.getResult());
    Assert.assertNull(actual.getSrcCid());
    Assert.assertNull(actual.getStatus());

  }

  // Test written by Diffblue Cover
  @Test
  public void equalsInputNotNullOutputFalse999a98469be701f4ae9() {

    // Arrange
    final PullPieceTaskRequest thisObj = new PullPieceTaskRequest();
    final Object arg0 = "aaaaa";

    // Act
    final boolean actual = thisObj.equals(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getDstCidOutputVoid9995e42c9865f2fb2ef() {

    // Arrange
    final PullPieceTaskRequest thisObj = new PullPieceTaskRequest();

    // Act
    final String actual = thisObj.getDstCid();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getRangeOutputVoid99932b5dcb8936afa20() {

    // Arrange
    final PullPieceTaskRequest thisObj = new PullPieceTaskRequest();

    // Act
    final String actual = thisObj.getRange();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getResultOutputVoid99974b053e01b7a6d25() {

    // Arrange
    final PullPieceTaskRequest thisObj = new PullPieceTaskRequest();

    // Act
    final String actual = thisObj.getResult();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getSrcCidOutputVoid999c3828cbbe4818b0c() {

    // Arrange
    final PullPieceTaskRequest thisObj = new PullPieceTaskRequest();

    // Act
    final String actual = thisObj.getSrcCid();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getStatusOutputVoid99932d891f14effcb4e() {

    // Arrange
    final PullPieceTaskRequest thisObj = new PullPieceTaskRequest();

    // Act
    final String actual = thisObj.getStatus();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getTaskIdOutputVoid99912139f8951351ef6() {

    // Arrange
    final PullPieceTaskRequest thisObj = new PullPieceTaskRequest();

    // Act
    final String actual = thisObj.getTaskId();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void hashCodeOutputPositive999257c8564726843cb() {

    // Arrange
    final PullPieceTaskRequest thisObj = new PullPieceTaskRequest();

    // Act
    final int actual = thisObj.hashCode();

    // Assert result
    Assert.assertEquals(437_864_549, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void setDstCidInputNotNullOutputVoid9990383aeccde021f66() {

    // Arrange
    final PullPieceTaskRequest thisObj = new PullPieceTaskRequest();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setDstCid(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getDstCid());

  }

  // Test written by Diffblue Cover
  @Test
  public void setRangeInputNotNullOutputVoid999fbaa4100788e8735() {

    // Arrange
    final PullPieceTaskRequest thisObj = new PullPieceTaskRequest();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setRange(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getRange());

  }

  // Test written by Diffblue Cover
  @Test
  public void setResultInputNotNullOutputVoid9990bee71963dc0c815() {

    // Arrange
    final PullPieceTaskRequest thisObj = new PullPieceTaskRequest();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setResult(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getResult());

  }

  // Test written by Diffblue Cover
  @Test
  public void setSrcCidInputNotNullOutputVoid999ac2d1d6af678bc26() {

    // Arrange
    final PullPieceTaskRequest thisObj = new PullPieceTaskRequest();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setSrcCid(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getSrcCid());

  }

  // Test written by Diffblue Cover
  @Test
  public void setStatusInputNotNullOutputVoid9992125af541cf81322() {

    // Arrange
    final PullPieceTaskRequest thisObj = new PullPieceTaskRequest();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setStatus(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getStatus());

  }

  // Test written by Diffblue Cover
  @Test
  public void setTaskIdInputNotNullOutputVoid9991f51bceaec4d3771() {

    // Arrange
    final PullPieceTaskRequest thisObj = new PullPieceTaskRequest();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setTaskId(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getTaskId());

  }

  // Test written by Diffblue Cover
  @Test
  public void toStringOutputNotNull999b1d8d129df6dbbcd() {

    // Arrange
    final PullPieceTaskRequest thisObj = new PullPieceTaskRequest();

    // Act
    final String actual = thisObj.toString();

    // Assert result
    Assert.assertEquals("PullPieceTaskRequest(srcCid=null, dstCid=null, range=null, result=null, status=null, taskId=null)", actual);

  }
}

package com.alibaba.dragonfly.supernode.service.cdn;

import com.alibaba.dragonfly.supernode.common.domain.DownloadMetaData;
import com.alibaba.dragonfly.supernode.service.cdn.ProtocolContent;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.nio.ByteBuffer;



public class ProtocolContentTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void buildPieceContentInputNullNotNullOutputNotNull99926cd94a2b1f0f0e6() {

    // Arrange
    final ByteBuffer arg0 = null;
    final Integer arg1 = new Integer(1);

    // Act
    final ProtocolContent actual = ProtocolContent.buildPieceContent(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getDownloadMetaData());
    Assert.assertNull(actual.getContent());
    Assert.assertNotNull(actual.getPieceNum());
    Assert.assertFalse(actual.isSuccess());
    Assert.assertFalse(actual.isFinish());
    Assert.assertEquals("piece", actual.getType());

  }

  // Test written by Diffblue Cover
  @Test
  public void buildTaskResultInputTrueTrueNotNullOutputNotNull99995e37f8ccc7b91e9() {

    // Arrange
    final boolean arg0 = true;
    final boolean arg1 = true;
    final DownloadMetaData arg2 = new DownloadMetaData("aaaaa", 1L, 1L, 1L);

    // Act
    final ProtocolContent actual = ProtocolContent.buildTaskResult(arg0, arg1, arg2);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getDownloadMetaData());
    Assert.assertEquals("aaaaa", actual.getDownloadMetaData().getMd5());
    Assert.assertEquals(1L, actual.getDownloadMetaData().getReadCost());
    Assert.assertEquals(1L, actual.getDownloadMetaData().getFileLength());
    Assert.assertEquals(1L, actual.getDownloadMetaData().getStartTime());
    Assert.assertNull(actual.getContent());
    Assert.assertNull(actual.getPieceNum());
    Assert.assertTrue(actual.isSuccess());
    Assert.assertTrue(actual.isFinish());
    Assert.assertEquals("task", actual.getType());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999bc716096d1f9b66d() {

    // Act, creating object to test constructor
    final ProtocolContent actual = new ProtocolContent();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getDownloadMetaData());
    Assert.assertNull(actual.getContent());
    Assert.assertNull(actual.getPieceNum());
    Assert.assertFalse(actual.isSuccess());
    Assert.assertFalse(actual.isFinish());
    Assert.assertNull(actual.getType());

  }

  // Test written by Diffblue Cover
  @Test
  public void getContentOutputVoid999765f0bbb4246a342() {

    // Arrange
    final ProtocolContent thisObj = new ProtocolContent();

    // Act
    final ByteBuffer actual = thisObj.getContent();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getDownloadMetaDataOutputVoid999aef60c336dda4c38() {

    // Arrange
    final ProtocolContent thisObj = new ProtocolContent();

    // Act
    final DownloadMetaData actual = thisObj.getDownloadMetaData();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getPieceNumOutputVoid999dab92ca553b633c1() {

    // Arrange
    final ProtocolContent thisObj = new ProtocolContent();

    // Act
    final Integer actual = thisObj.getPieceNum();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getTypeOutputVoid99976e903fa32ea1bc0() {

    // Arrange
    final ProtocolContent thisObj = new ProtocolContent();

    // Act
    final String actual = thisObj.getType();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void isFinishOutputFalse999536212fd075ae25e() {

    // Arrange
    final ProtocolContent thisObj = new ProtocolContent();

    // Act
    final boolean actual = thisObj.isFinish();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isPieceTypeOutputFalse999de226a3bdea6908f() {

    // Arrange
    final ProtocolContent thisObj = new ProtocolContent();

    // Act
    final boolean actual = thisObj.isPieceType();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isSuccessOutputFalse9992f5e5373377edd07() {

    // Arrange
    final ProtocolContent thisObj = new ProtocolContent();

    // Act
    final boolean actual = thisObj.isSuccess();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isTaskTypeOutputFalse99998083130a2e5d2fb() {

    // Arrange
    final ProtocolContent thisObj = new ProtocolContent();

    // Act
    final boolean actual = thisObj.isTaskType();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void setContentInputNullOutputVoid99997153ac98f16cf13() {

    // Arrange
    final ProtocolContent thisObj = new ProtocolContent();
    final ByteBuffer arg0 = null;

    // Act
    thisObj.setContent(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setDownloadMetaDataInputNotNullOutputVoid9991551d2c7c8a07b5c() {

    // Arrange
    final ProtocolContent thisObj = new ProtocolContent();
    final DownloadMetaData arg0 = new DownloadMetaData("aaaaa", 1L, 1L, 1L);

    // Act
    thisObj.setDownloadMetaData(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getDownloadMetaData());
    Assert.assertEquals("aaaaa", thisObj.getDownloadMetaData().getMd5());
    Assert.assertEquals(1L, thisObj.getDownloadMetaData().getReadCost());
    Assert.assertEquals(1L, thisObj.getDownloadMetaData().getFileLength());
    Assert.assertEquals(1L, thisObj.getDownloadMetaData().getStartTime());

  }

  // Test written by Diffblue Cover
  @Test
  public void setFinishInputTrueOutputVoid999195b3bd9df817a5e() {

    // Arrange
    final ProtocolContent thisObj = new ProtocolContent();
    final boolean arg0 = true;

    // Act
    thisObj.setFinish(arg0);

    // Assert side effects
    Assert.assertTrue(thisObj.isFinish());

  }

  // Test written by Diffblue Cover
  @Test
  public void setPieceNumInputNotNullOutputVoid999f0510b7499469a7b() {

    // Arrange
    final ProtocolContent thisObj = new ProtocolContent();
    final Integer arg0 = new Integer(1);

    // Act
    thisObj.setPieceNum(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getPieceNum());

  }

  // Test written by Diffblue Cover
  @Test
  public void setSuccessInputTrueOutputVoid999b19612ab4273358d() {

    // Arrange
    final ProtocolContent thisObj = new ProtocolContent();
    final boolean arg0 = true;

    // Act
    thisObj.setSuccess(arg0);

    // Assert side effects
    Assert.assertTrue(thisObj.isSuccess());

  }

  // Test written by Diffblue Cover
  @Test
  public void setTypeInputNotNullOutputVoid9995744d11458f78436() {

    // Arrange
    final ProtocolContent thisObj = new ProtocolContent();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setType(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getType());

  }
}

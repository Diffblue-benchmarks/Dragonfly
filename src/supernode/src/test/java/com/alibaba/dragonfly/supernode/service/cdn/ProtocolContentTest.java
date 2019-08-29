package com.alibaba.dragonfly.supernode.service.cdn;

import com.alibaba.dragonfly.supernode.common.domain.DownloadMetaData;
import com.alibaba.dragonfly.supernode.service.cdn.ProtocolContent;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ProtocolContentTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void buildPieceContentInputNullNullOutputNotNull() {

    // Act
    final ProtocolContent actual = ProtocolContent.buildPieceContent(null, null);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("piece", actual.getType());
    Assert.assertNull(actual.getDownloadMetaData());
    Assert.assertNull(actual.getContent());
    Assert.assertNull(actual.getPieceNum());
  }

  // Test written by Diffblue Cover.
  @Test
  public void buildTaskResultInputFalseFalseNotNullOutputNotNull() {

    // Arrange
    final DownloadMetaData downloadMetaData = new DownloadMetaData("@@", 0L, 0L, 0L);

    // Act
    final ProtocolContent actual = ProtocolContent.buildTaskResult(false, false, downloadMetaData);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("task", actual.getType());
    Assert.assertNotNull(actual.getDownloadMetaData());
    Assert.assertEquals(0L, actual.getDownloadMetaData().getReadCost());
    Assert.assertEquals(0L, actual.getDownloadMetaData().getStartTime());
    Assert.assertEquals(0L, actual.getDownloadMetaData().getFileLength());
    Assert.assertEquals("@@", actual.getDownloadMetaData().getMd5());
    Assert.assertNull(actual.getContent());
    Assert.assertNull(actual.getPieceNum());
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final ProtocolContent actual = new ProtocolContent();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getType());
    Assert.assertNull(actual.getDownloadMetaData());
    Assert.assertNull(actual.getContent());
    Assert.assertNull(actual.getPieceNum());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getContentOutputNull() {

    // Arrange
    final ProtocolContent protocolContent = new ProtocolContent();

    // Act and Assert result
    Assert.assertNull(protocolContent.getContent());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getDownloadMetaDataOutputNull() {

    // Arrange
    final ProtocolContent protocolContent = new ProtocolContent();

    // Act and Assert result
    Assert.assertNull(protocolContent.getDownloadMetaData());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPieceNumOutputNull() {

    // Arrange
    final ProtocolContent protocolContent = new ProtocolContent();

    // Act and Assert result
    Assert.assertNull(protocolContent.getPieceNum());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getTypeOutputNull() {

    // Arrange
    final ProtocolContent protocolContent = new ProtocolContent();

    // Act and Assert result
    Assert.assertNull(protocolContent.getType());
  }

  // Test written by Diffblue Cover.
  @Test
  public void isFinishOutputFalse() {

    // Arrange
    final ProtocolContent protocolContent = new ProtocolContent();

    // Act and Assert result
    Assert.assertFalse(protocolContent.isFinish());
  }

  // Test written by Diffblue Cover.
  @Test
  public void isPieceTypeOutputFalse() {

    // Arrange
    final ProtocolContent protocolContent = new ProtocolContent();

    // Act and Assert result
    Assert.assertFalse(protocolContent.isPieceType());
  }

  // Test written by Diffblue Cover.
  @Test
  public void isSuccessOutputFalse() {

    // Arrange
    final ProtocolContent protocolContent = new ProtocolContent();

    // Act and Assert result
    Assert.assertFalse(protocolContent.isSuccess());
  }

  // Test written by Diffblue Cover.
  @Test
  public void isTaskTypeOutputFalse() {

    // Arrange
    final ProtocolContent protocolContent = new ProtocolContent();

    // Act and Assert result
    Assert.assertFalse(protocolContent.isTaskType());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setContentInputNullOutputVoid() {

    // Arrange
    final ProtocolContent protocolContent = new ProtocolContent();

    // Act
    protocolContent.setContent(null);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void setDownloadMetaDataInputNotNullOutputVoid() {

    // Arrange
    final ProtocolContent protocolContent = new ProtocolContent();
    final DownloadMetaData downloadMetaData = new DownloadMetaData("@@", 0L, 0L, 0L);

    // Act
    protocolContent.setDownloadMetaData(downloadMetaData);

    // Assert side effects
    Assert.assertNotNull(protocolContent.getDownloadMetaData());
    Assert.assertEquals(0L, protocolContent.getDownloadMetaData().getReadCost());
    Assert.assertEquals(0L, protocolContent.getDownloadMetaData().getStartTime());
    Assert.assertEquals(0L, protocolContent.getDownloadMetaData().getFileLength());
    Assert.assertEquals("@@", protocolContent.getDownloadMetaData().getMd5());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setFinishInputFalseOutputVoid() {

    // Arrange
    final ProtocolContent protocolContent = new ProtocolContent();

    // Act
    protocolContent.setFinish(false);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void setPieceNumInputNullOutputVoid() {

    // Arrange
    final ProtocolContent protocolContent = new ProtocolContent();

    // Act
    protocolContent.setPieceNum(null);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void setSuccessInputFalseOutputVoid() {

    // Arrange
    final ProtocolContent protocolContent = new ProtocolContent();

    // Act
    protocolContent.setSuccess(false);

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void setTypeInputNotNullOutputVoid() {

    // Arrange
    final ProtocolContent protocolContent = new ProtocolContent();

    // Act
    protocolContent.setType("");

    // Assert side effects
    Assert.assertEquals("", protocolContent.getType());
  }
}

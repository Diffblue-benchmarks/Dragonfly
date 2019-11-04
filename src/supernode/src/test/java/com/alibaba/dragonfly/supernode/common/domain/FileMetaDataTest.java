package com.alibaba.dragonfly.supernode.common.domain;

import com.alibaba.dragonfly.supernode.common.domain.FileMetaData;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class FileMetaDataTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9990c48e081034cdf1f() {

    // Act, creating object to test constructor
    final FileMetaData actual = new FileMetaData();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0L, actual.getInterval());
    Assert.assertFalse(actual.isFinish());
    Assert.assertNull(actual.getHttpFileLen());
    Assert.assertNull(actual.getFileLength());
    Assert.assertNull(actual.getBizId());
    Assert.assertEquals(0L, actual.getAccessTime());
    Assert.assertEquals(0L, actual.getLastModified());
    Assert.assertNull(actual.getTaskId());
    Assert.assertNull(actual.getMd5());
    Assert.assertNull(actual.getPieceSize());
    Assert.assertNull(actual.getRealMd5());
    Assert.assertFalse(actual.isSuccess());
    Assert.assertNull(actual.getUrl());

  }

  // Test written by Diffblue Cover
  @Test
  public void getAccessTimeOutputZero9992a01878f876243c9() {

    // Arrange
    final FileMetaData thisObj = new FileMetaData();

    // Act
    final long actual = thisObj.getAccessTime();

    // Assert result
    Assert.assertEquals(0L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getBizIdOutputVoid999b3265f9b5a4c615d() {

    // Arrange
    final FileMetaData thisObj = new FileMetaData();

    // Act
    final String actual = thisObj.getBizId();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getFileLengthOutputVoid999a0d7054f274eb014() {

    // Arrange
    final FileMetaData thisObj = new FileMetaData();

    // Act
    final Long actual = thisObj.getFileLength();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getHttpFileLenOutputVoid9996401924ef9eeff40() {

    // Arrange
    final FileMetaData thisObj = new FileMetaData();

    // Act
    final Long actual = thisObj.getHttpFileLen();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getIntervalOutputZero9999e3042a36be648e5() {

    // Arrange
    final FileMetaData thisObj = new FileMetaData();

    // Act
    final long actual = thisObj.getInterval();

    // Assert result
    Assert.assertEquals(0L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getLastModifiedOutputZero999e4d7d52a9b6358db() {

    // Arrange
    final FileMetaData thisObj = new FileMetaData();

    // Act
    final long actual = thisObj.getLastModified();

    // Assert result
    Assert.assertEquals(0L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getMd5OutputVoid9991e0fdcff5faffbd4() {

    // Arrange
    final FileMetaData thisObj = new FileMetaData();

    // Act
    final String actual = thisObj.getMd5();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getPieceSizeOutputVoid999c7640c35538c529a() {

    // Arrange
    final FileMetaData thisObj = new FileMetaData();

    // Act
    final Integer actual = thisObj.getPieceSize();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getRealMd5OutputVoid999c70e53a0d28c4613() {

    // Arrange
    final FileMetaData thisObj = new FileMetaData();

    // Act
    final String actual = thisObj.getRealMd5();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getTaskIdOutputVoid9990fbfec8f6405acec() {

    // Arrange
    final FileMetaData thisObj = new FileMetaData();

    // Act
    final String actual = thisObj.getTaskId();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getUrlOutputVoid9999157a6b8bb91bc98() {

    // Arrange
    final FileMetaData thisObj = new FileMetaData();

    // Act
    final String actual = thisObj.getUrl();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void isFinishOutputFalse999e03443e8dc799044() {

    // Arrange
    final FileMetaData thisObj = new FileMetaData();

    // Act
    final boolean actual = thisObj.isFinish();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isSuccessOutputFalse99965764714e1451e0b() {

    // Arrange
    final FileMetaData thisObj = new FileMetaData();

    // Act
    final boolean actual = thisObj.isSuccess();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void setAccessTimeInputPositiveOutputVoid999a9c09dc5bf538bf8() {

    // Arrange
    final FileMetaData thisObj = new FileMetaData();
    final long arg0 = 1L;

    // Act
    thisObj.setAccessTime(arg0);

    // Assert side effects
    Assert.assertEquals(1L, thisObj.getAccessTime());

  }

  // Test written by Diffblue Cover
  @Test
  public void setBizIdInputNotNullOutputVoid999c28e3018878de662() {

    // Arrange
    final FileMetaData thisObj = new FileMetaData();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setBizId(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getBizId());

  }

  // Test written by Diffblue Cover
  @Test
  public void setFileLengthInputNotNullOutputVoid999d298b388348b5fec() {

    // Arrange
    final FileMetaData thisObj = new FileMetaData();
    final Long arg0 = new Long(1L);

    // Act
    thisObj.setFileLength(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getFileLength());

  }

  // Test written by Diffblue Cover
  @Test
  public void setFinishInputTrueOutputVoid99937959e6ad3cbb04e() {

    // Arrange
    final FileMetaData thisObj = new FileMetaData();
    final boolean arg0 = true;

    // Act
    thisObj.setFinish(arg0);

    // Assert side effects
    Assert.assertTrue(thisObj.isFinish());

  }

  // Test written by Diffblue Cover
  @Test
  public void setHttpFileLenInputNotNullOutputVoid99981465c34e224a923() {

    // Arrange
    final FileMetaData thisObj = new FileMetaData();
    final Long arg0 = new Long(1L);

    // Act
    thisObj.setHttpFileLen(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getHttpFileLen());

  }

  // Test written by Diffblue Cover
  @Test
  public void setIntervalInputPositiveOutputVoid9994239ac97a50edbce() {

    // Arrange
    final FileMetaData thisObj = new FileMetaData();
    final long arg0 = 1L;

    // Act
    thisObj.setInterval(arg0);

    // Assert side effects
    Assert.assertEquals(1L, thisObj.getInterval());

  }

  // Test written by Diffblue Cover
  @Test
  public void setLastModifiedInputPositiveOutputVoid999a547c0b568786f85() {

    // Arrange
    final FileMetaData thisObj = new FileMetaData();
    final long arg0 = 1L;

    // Act
    thisObj.setLastModified(arg0);

    // Assert side effects
    Assert.assertEquals(1L, thisObj.getLastModified());

  }

  // Test written by Diffblue Cover
  @Test
  public void setMd5InputNotNullOutputVoid999a107132a98d150bb() {

    // Arrange
    final FileMetaData thisObj = new FileMetaData();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setMd5(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getMd5());

  }

  // Test written by Diffblue Cover
  @Test
  public void setPieceSizeInputNotNullOutputVoid999dfcd3e0a33dbcac3() {

    // Arrange
    final FileMetaData thisObj = new FileMetaData();
    final Integer arg0 = new Integer(1);

    // Act
    thisObj.setPieceSize(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getPieceSize());

  }

  // Test written by Diffblue Cover
  @Test
  public void setRealMd5InputNotNullOutputVoid999fd329b76b8ba4a69() {

    // Arrange
    final FileMetaData thisObj = new FileMetaData();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setRealMd5(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getRealMd5());

  }

  // Test written by Diffblue Cover
  @Test
  public void setSuccessInputTrueOutputVoid999e78313529ffe2356() {

    // Arrange
    final FileMetaData thisObj = new FileMetaData();
    final boolean arg0 = true;

    // Act
    thisObj.setSuccess(arg0);

    // Assert side effects
    Assert.assertTrue(thisObj.isSuccess());

  }

  // Test written by Diffblue Cover
  @Test
  public void setTaskIdInputNotNullOutputVoid999383e94c7dfa413ea() {

    // Arrange
    final FileMetaData thisObj = new FileMetaData();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setTaskId(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getTaskId());

  }

  // Test written by Diffblue Cover
  @Test
  public void setUrlInputNotNullOutputVoid999f5a503f7f5c078aa() {

    // Arrange
    final FileMetaData thisObj = new FileMetaData();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setUrl(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getUrl());

  }
}

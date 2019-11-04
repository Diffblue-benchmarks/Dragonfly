package com.alibaba.dragonfly.supernode.service.lock;

import com.alibaba.dragonfly.supernode.service.lock.LockService;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class LockServiceTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999a72d4c820162f268() {

    // Act, creating object to test constructor
    final LockService actual = new LockService();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void gcInputPositiveOutputVoid99961370300124ce373() throws InterruptedException {

    // Arrange
    final LockService thisObj = new LockService();
    final long arg0 = 1L;

    // Act
    thisObj.gc(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getLockNameInputNotNullNotNullOutputNotNull999303e2a00e1b18c7f() {

    // Arrange
    final LockService thisObj = new LockService();
    final String arg0 = "aaaaa";
    final String arg1 = "aaaaa";

    // Act
    final String actual = thisObj.getLockName(arg0, arg1);

    // Assert result
    Assert.assertEquals("aaaaaaaaaa", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isAccessWindowInputNotNullPositiveOutputTrue99932767eb39c6a584b() {

    // Arrange
    final LockService thisObj = new LockService();
    final String arg0 = "aaaaa";
    final long arg1 = 1L;

    // Act
    final boolean actual = thisObj.isAccessWindow(arg0, arg1);

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void lockTaskOnReadInputNotNullOutputVoid999b27c541801144902() {

    // Arrange
    final LockService thisObj = new LockService();
    final String arg0 = "aaaaa";

    // Act
    thisObj.lockTaskOnRead(arg0);

    // The method returns void, testing that no exception is thrown

  }

//failed_run   // Test written by Diffblue Cover
//  @Test
//  public void lockTaskOnWriteInputNotNullOutputVoid999bfca5ee0793611b7() {
//
//    // Arrange
//    final LockService thisObj = new LockService();
//    final String arg0 = "aaaaa";
//
//    // Act
//    thisObj.lockTaskOnWrite(arg0);
//
//    // The method returns void, testing that no exception is thrown
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void lockInputNotNullOutputVoid999430d79609a59156a() {

    // Arrange
    final LockService thisObj = new LockService();
    final String arg0 = "aaaaa";

    // Act
    thisObj.lock(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void tryLockInputNotNullOutputTrue99972dd617971073bec() {

    // Arrange
    final LockService thisObj = new LockService();
    final String arg0 = "aaaaa";

    // Act
    final boolean actual = thisObj.tryLock(arg0);

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void unlockTaskOnReadInputNotNullOutputIllegalMonitorStateException999694800cc170d426a() {

    // Arrange
    final LockService thisObj = new LockService();
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(IllegalMonitorStateException.class);
    thisObj.unlockTaskOnRead(arg0);

    // The method is not expected to return due to exception thrown

  }

//failed_run   // Test written by Diffblue Cover
//  @Test
//  public void unlockTaskOnWriteInputNotNullOutputVoid99950522464dc6f3ecb() {
//
//    // Arrange
//    final LockService thisObj = new LockService();
//    final String arg0 = "aaaaa";
//
//    // Act
//    thisObj.unlockTaskOnWrite(arg0);
//
//    // The method returns void, testing that no exception is thrown
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void unlockInputNotNullOutputIllegalMonitorStateException9993aec39cbad7be530() {

    // Arrange
    final LockService thisObj = new LockService();
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(IllegalMonitorStateException.class);
    thisObj.unlock(arg0);

    // The method is not expected to return due to exception thrown

  }
}

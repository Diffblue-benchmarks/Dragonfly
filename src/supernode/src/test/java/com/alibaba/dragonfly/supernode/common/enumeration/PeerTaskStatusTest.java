package com.alibaba.dragonfly.supernode.common.enumeration;

import com.alibaba.dragonfly.supernode.common.enumeration.PeerTaskStatus;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class PeerTaskStatusTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void getStatusOutputZero999f99af09fc8ac24ff() {

    // Arrange
    final PeerTaskStatus thisObj = PeerTaskStatus.WAIT;

    // Act
    final int actual = thisObj.getStatus();

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isFailOutputFalse999098825669865dbb3() {

    // Arrange
    final PeerTaskStatus thisObj = PeerTaskStatus.WAIT;

    // Act
    final boolean actual = thisObj.isFail();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isRunningOutputFalse999dce10b81f1884d4d() {

    // Arrange
    final PeerTaskStatus thisObj = PeerTaskStatus.WAIT;

    // Act
    final boolean actual = thisObj.isRunning();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isSuccessOutputFalse999d79b68436d0ef447() {

    // Arrange
    final PeerTaskStatus thisObj = PeerTaskStatus.WAIT;

    // Act
    final boolean actual = thisObj.isSuccess();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isWaitOutputTrue999847fabc5b2df7f91() {

    // Arrange
    final PeerTaskStatus thisObj = PeerTaskStatus.WAIT;

    // Act
    final boolean actual = thisObj.isWait();

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void valueOfInputNotNullOutputIllegalArgumentException999652aba7432d8ed8c() {

    // Arrange
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(IllegalArgumentException.class);
    PeerTaskStatus.valueOf(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void valuesOutput49991483db1c216fc257() {

    // Act
    final PeerTaskStatus[] actual = PeerTaskStatus.values();

    // Assert result
    Assert.assertArrayEquals(new PeerTaskStatus[]{ PeerTaskStatus.WAIT, PeerTaskStatus.RUNNING, PeerTaskStatus.FAIL, PeerTaskStatus.SUCCESS }, actual);

  }
}

package com.alibaba.dragonfly.supernode.common.enumeration;

import com.alibaba.dragonfly.supernode.common.enumeration.CdnStatus;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class CdnStatusTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void getStatusOutputZero999d01dc25a99fda3aa() {

    // Arrange
    final CdnStatus thisObj = CdnStatus.WAIT;

    // Act
    final int actual = thisObj.getStatus();

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void valueOfInputNotNullOutputIllegalArgumentException999ac73c939f6b1e2e2() {

    // Arrange
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(IllegalArgumentException.class);
    CdnStatus.valueOf(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void valuesOutput59998188bbc07afb691b() {

    // Act
    final CdnStatus[] actual = CdnStatus.values();

    // Assert result
    Assert.assertArrayEquals(new CdnStatus[]{ CdnStatus.WAIT, CdnStatus.RUNNING, CdnStatus.FAIL, CdnStatus.SUCCESS, CdnStatus.SOURCE_ERROR }, actual);

  }
}

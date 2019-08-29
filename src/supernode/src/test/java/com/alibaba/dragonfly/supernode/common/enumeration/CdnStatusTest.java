package com.alibaba.dragonfly.supernode.common.enumeration;

import com.alibaba.dragonfly.supernode.common.enumeration.CdnStatus;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;

public class CdnStatusTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void getStatusOutputPositive() {

    // Arrange
    final CdnStatus cdnStatus = CdnStatus.RUNNING;

    // Act and Assert result
    Assert.assertEquals(1, cdnStatus.getStatus());
  }

  // Test written by Diffblue Cover.

  @Test
  public void staticInitOutputVoid() throws InvocationTargetException {

    // Act, using constructor to test static initializer
    final Object constructed =
        Reflector.getInstance("com.alibaba.dragonfly.supernode.common.enumeration.CdnStatus");

    // Assert side effects
    Assert.assertArrayEquals(
        new Object[] {CdnStatus.WAIT, CdnStatus.RUNNING, CdnStatus.FAIL, CdnStatus.SUCCESS,
                      CdnStatus.SOURCE_ERROR},
        ((Object[])Reflector.getInstanceField(CdnStatus.class, null, "$VALUES")));
  }

  // Test written by Diffblue Cover.
  @Test
  public void valueOfInputNotNullOutputIllegalArgumentException() {

    // Act
    thrown.expect(IllegalArgumentException.class);
    CdnStatus.valueOf("         !");

    // The method is not expected to return due to exception thrown
  }
}

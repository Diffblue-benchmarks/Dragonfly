package com.alibaba.dragonfly.supernode.service.impl;

import com.alibaba.dragonfly.supernode.common.enumeration.CdnStatus;
import com.alibaba.dragonfly.supernode.common.enumeration.PeerPieceStatus;
import com.alibaba.dragonfly.supernode.service.impl.CdnReporterImpl;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.InvocationTargetException;

public class CdnReporterImplTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final CdnReporterImpl actual = new CdnReporterImpl();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void reportPieceStatusInputNotNullZeroNotNullSuccessNotNullOutputNullPointerException() {

    // Arrange
    final CdnReporterImpl cdnReporterImpl = new CdnReporterImpl();
    final PeerPieceStatus status = PeerPieceStatus.SUCCESS;

    // Act
    thrown.expect(NullPointerException.class);
    cdnReporterImpl.reportPieceStatus("?", 0, "?", status, "?");

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void
  reportTaskStatusInputNotNullSource_errorNotNullNullNotNullOutputNullPointerException() {

    // Arrange
    final CdnReporterImpl cdnReporterImpl = new CdnReporterImpl();
    final CdnStatus cdnStatus = CdnStatus.SOURCE_ERROR;

    // Act
    thrown.expect(NullPointerException.class);
    cdnReporterImpl.reportTaskStatus("?", cdnStatus, "?", null, "?");

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void staticInitOutputVoid() throws InvocationTargetException {

    // Act, using constructor to test static initializer
    final Object constructed =
        Reflector.getInstance("com.alibaba.dragonfly.supernode.service.impl.CdnReporterImpl");

    // Assert side effects
    Assert.assertNotNull(Reflector.getInstanceField(CdnReporterImpl.class, null, "downLogger"));
    Assert.assertEquals(Reflector.getInstanceField(CdnReporterImpl.class, null, "downLogger"),
                        Reflector.getInstanceField(CdnReporterImpl.class, null, "logger"));
  }
}

package com.alibaba.dragonfly.supernode.service.impl;

import com.alibaba.dragonfly.supernode.common.enumeration.CdnStatus;
import com.alibaba.dragonfly.supernode.common.enumeration.PeerPieceStatus;
import com.alibaba.dragonfly.supernode.service.impl.CdnReporterImpl;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class CdnReporterImplTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99968c86db3d7db0439() {

    // Act, creating object to test constructor
    final CdnReporterImpl actual = new CdnReporterImpl();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void reportPieceStatusInputNotNullPositiveNotNullWaitNotNullOutputNullPointerException9999057d357bed051b6() {

    // Arrange
    final CdnReporterImpl thisObj = new CdnReporterImpl();
    final String arg0 = "aaaaa";
    final int arg1 = 1;
    final String arg2 = "aaaaa";
    final PeerPieceStatus arg3 = PeerPieceStatus.WAIT;
    final String arg4 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.reportPieceStatus(arg0, arg1, arg2, arg3, arg4);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void reportTaskStatusInputNotNullWaitNotNullNotNullNotNullOutputNullPointerException999393572537b1d3a95() {

    // Arrange
    final CdnReporterImpl thisObj = new CdnReporterImpl();
    final String arg0 = "aaaaa";
    final CdnStatus arg1 = CdnStatus.WAIT;
    final String arg2 = "aaaaa";
    final Long arg3 = new Long(1L);
    final String arg4 = "aaaak";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.reportTaskStatus(arg0, arg1, arg2, arg3, arg4);

    // The method is not expected to return due to exception thrown

  }
}

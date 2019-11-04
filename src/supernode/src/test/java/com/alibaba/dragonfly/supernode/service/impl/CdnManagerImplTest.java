package com.alibaba.dragonfly.supernode.service.impl;

import com.alibaba.dragonfly.supernode.service.impl.CdnManagerImpl;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class CdnManagerImplTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9999d2b54d14e462530() {

    // Act, creating object to test constructor
    final CdnManagerImpl actual = new CdnManagerImpl();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void triggerCdnSyncActionInputNotNullOutputNullPointerException999396e4b05891055fa() {

    // Arrange
    final CdnManagerImpl thisObj = new CdnManagerImpl();
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.triggerCdnSyncAction(arg0);

    // The method is not expected to return due to exception thrown

  }
}

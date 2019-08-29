package com.alibaba.dragonfly.supernode.service;

import com.alibaba.dragonfly.supernode.service.PeerDispatcherService;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class PeerDispatcherServiceTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final PeerDispatcherService actual = new PeerDispatcherService();

    // Assert result
    Assert.assertNotNull(actual);
  }
}

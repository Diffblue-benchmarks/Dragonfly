package com.alibaba.dragonfly.supernode.repository;

import com.alibaba.dragonfly.supernode.common.domain.PeerInfo;
import com.alibaba.dragonfly.supernode.repository.PeerRepository;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class PeerRepositoryTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void addInputNotNullOutputFalse999adbac0517f9d2860() {

    // Arrange
    final PeerRepository thisObj = new PeerRepository();
    final PeerInfo arg0 = new PeerInfo();

    // Act
    final boolean actual = thisObj.add(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999d67bd2ae61b7f478() {

    // Act, creating object to test constructor
    final PeerRepository actual = new PeerRepository();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getInputNotNullOutputVoid9994619c5bae76626a1() {

    // Arrange
    final PeerRepository thisObj = new PeerRepository();
    final String arg0 = "aaaaa";

    // Act
    final PeerInfo actual = thisObj.get(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void removeInputNotNullOutputFalse999f2ebbd075d9ecafc() {

    // Arrange
    final PeerRepository thisObj = new PeerRepository();
    final String arg0 = "aaaaa";

    // Act
    final boolean actual = thisObj.remove(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }
}

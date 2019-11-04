package com.alibaba.dragonfly.supernode;

import com.alibaba.dragonfly.supernode.SuperNodeStarter;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class SuperNodeStarterTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999f80078869568546e() {

    // Act, creating object to test constructor
    final SuperNodeStarter actual = new SuperNodeStarter();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void mainInput3OutputIllegalStateException9998867919aa95fff46() {

    // Arrange
    final String[] arg0 = { "aaaaa", "aaaaa", "aaaaa" };

    // Act
    thrown.expect(IllegalStateException.class);
    SuperNodeStarter.main(arg0);

    // The method is not expected to return due to exception thrown

  }
}

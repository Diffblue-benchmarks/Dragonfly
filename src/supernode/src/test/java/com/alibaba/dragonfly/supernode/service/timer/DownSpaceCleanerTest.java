package com.alibaba.dragonfly.supernode.service.timer;

import com.alibaba.dragonfly.supernode.service.timer.DownSpaceCleaner;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class DownSpaceCleanerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999daa9e5633b91e88a() {

    // Act, creating object to test constructor
    final DownSpaceCleaner actual = new DownSpaceCleaner();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void fillConfInputNotNullNotNullPositivePositivePositivePositiveOutputVoid999aa48b731866b0592() {

    // Arrange
    final DownSpaceCleaner thisObj = new DownSpaceCleaner();
    final String arg0 = "aaaaa";
    final String arg1 = "aaaaa";
    final long arg2 = 1L;
    final long arg3 = 1L;
    final int arg4 = 1;
    final long arg5 = 167_772_161L;

    // Act
    thisObj.fillConf(arg0, arg1, arg2, arg3, arg4, arg5);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void gcInputTrueOutputVoid9993b67afb8eeaeeeec() {

    // Arrange
    final DownSpaceCleaner thisObj = new DownSpaceCleaner();
    final boolean arg0 = true;

    // Act
    thisObj.gc(arg0);

    // The method returns void, testing that no exception is thrown

  }
}

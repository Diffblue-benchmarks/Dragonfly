package com.alibaba.dragonfly.supernode.service.timer;

import com.alibaba.dragonfly.supernode.service.timer.DataGcService;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class DataGcServiceTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9997749587089d10ab4() {

    // Act, creating object to test constructor
    final DataGcService actual = new DataGcService();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void dataGcOutputVoid9994cf07da953732b9b() {

    // Arrange
    final DataGcService thisObj = new DataGcService();

    // Act
    thisObj.dataGc();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateAccessTimeInputNotNullOutputVoid99987763fbbdaca79a0() {

    // Arrange
    final DataGcService thisObj = new DataGcService();
    final String arg0 = "aaaaa";

    // Act
    thisObj.updateAccessTime(arg0);

    // The method returns void, testing that no exception is thrown

  }
}

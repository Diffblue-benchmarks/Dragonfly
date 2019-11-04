package com.alibaba.dragonfly.supernode.config;

import com.alibaba.dragonfly.supernode.config.SupernodeProperties;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class SupernodePropertiesTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void canEqualInputNotNullOutputFalse999126c7ebd4beda379() {

    // Arrange
    final SupernodeProperties thisObj = new SupernodeProperties();
    final Object arg0 = "aaaaa";

    // Act
    final boolean actual = thisObj.canEqual(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9995efa5ed4a94f91bd() {

    // Act, creating object to test constructor
    final SupernodeProperties actual = new SupernodeProperties();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(10, actual.getSchedulerCorePoolSize());
    Assert.assertEquals(200, actual.getTotalLimit());
    Assert.assertEquals("/home/admin/supernode", actual.getBaseHome());
    Assert.assertEquals(20, actual.getSystemNeedRate());

  }

  // Test written by Diffblue Cover
  @Test
  public void equalsInputNotNullOutputFalse999c340526be25b1d09() {

    // Arrange
    final SupernodeProperties thisObj = new SupernodeProperties();
    final Object arg0 = "aaaaa";

    // Act
    final boolean actual = thisObj.equals(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getBaseHomeOutputNotNull999e4de81d907a2291d() {

    // Arrange
    final SupernodeProperties thisObj = new SupernodeProperties();

    // Act
    final String actual = thisObj.getBaseHome();

    // Assert result
    Assert.assertEquals("/home/admin/supernode", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getSchedulerCorePoolSizeOutputPositive9994ab3f49fcb32f0ca() {

    // Arrange
    final SupernodeProperties thisObj = new SupernodeProperties();

    // Act
    final int actual = thisObj.getSchedulerCorePoolSize();

    // Assert result
    Assert.assertEquals(10, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getSystemNeedRateOutputPositive99974545a35b013d4ce() {

    // Arrange
    final SupernodeProperties thisObj = new SupernodeProperties();

    // Act
    final int actual = thisObj.getSystemNeedRate();

    // Assert result
    Assert.assertEquals(20, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getTotalLimitOutputPositive999da2818629a403c11() {

    // Arrange
    final SupernodeProperties thisObj = new SupernodeProperties();

    // Act
    final int actual = thisObj.getTotalLimit();

    // Assert result
    Assert.assertEquals(200, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void hashCodeOutputPositive999ba5e9b742e53d0c2() {

    // Arrange
    final SupernodeProperties thisObj = new SupernodeProperties();

    // Act
    final int actual = thisObj.hashCode();

    // Assert result
    Assert.assertEquals(190_023_355, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void initOutputSecurityException999c65a0cfb84b6fb42() {

    // Arrange
    final SupernodeProperties thisObj = new SupernodeProperties();

    // Act
    thrown.expect(SecurityException.class);
    thisObj.init();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setBaseHomeInputNotNullOutputVoid9994893db55348286ff() {

    // Arrange
    final SupernodeProperties thisObj = new SupernodeProperties();
    final String arg0 = "aaaaa";

    // Act
    thisObj.setBaseHome(arg0);

    // Assert side effects
    Assert.assertEquals("aaaaa", thisObj.getBaseHome());

  }

  // Test written by Diffblue Cover
  @Test
  public void setSchedulerCorePoolSizeInputPositiveOutputVoid9991e715714203f371a() {

    // Arrange
    final SupernodeProperties thisObj = new SupernodeProperties();
    final int arg0 = 1;

    // Act
    thisObj.setSchedulerCorePoolSize(arg0);

    // Assert side effects
    Assert.assertEquals(1, thisObj.getSchedulerCorePoolSize());

  }

  // Test written by Diffblue Cover
  @Test
  public void setSystemNeedRateInputPositiveOutputVoid99901c64f81967e4610() {

    // Arrange
    final SupernodeProperties thisObj = new SupernodeProperties();
    final int arg0 = 1;

    // Act
    thisObj.setSystemNeedRate(arg0);

    // Assert side effects
    Assert.assertEquals(1, thisObj.getSystemNeedRate());

  }

  // Test written by Diffblue Cover
  @Test
  public void setTotalLimitInputPositiveOutputVoid99961f19cc104cc4319() {

    // Arrange
    final SupernodeProperties thisObj = new SupernodeProperties();
    final int arg0 = 1;

    // Act
    thisObj.setTotalLimit(arg0);

    // Assert side effects
    Assert.assertEquals(1, thisObj.getTotalLimit());

  }

  // Test written by Diffblue Cover
  @Test
  public void toStringOutputNotNull999f70bbe1ab48c94f0() {

    // Arrange
    final SupernodeProperties thisObj = new SupernodeProperties();

    // Act
    final String actual = thisObj.toString();

    // Assert result
    Assert.assertEquals("SupernodeProperties(baseHome=/home/admin/supernode, systemNeedRate=20, totalLimit=200, schedulerCorePoolSize=10)", actual);

  }
}

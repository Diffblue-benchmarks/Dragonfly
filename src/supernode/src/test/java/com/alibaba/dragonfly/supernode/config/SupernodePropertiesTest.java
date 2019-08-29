package com.alibaba.dragonfly.supernode.config;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.alibaba.dragonfly.supernode.config.SupernodeProperties;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;

@RunWith(PowerMockRunner.class)
@PowerMockIgnore({"javax.management.*"})
public class SupernodePropertiesTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputTrue() {

    // Arrange
    final SupernodeProperties supernodeProperties = new SupernodeProperties();
    final SupernodeProperties o = new SupernodeProperties();

    // Act and Assert result
    Assert.assertTrue(supernodeProperties.equals(o));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNullOutputFalse() {

    // Arrange
    final SupernodeProperties supernodeProperties = new SupernodeProperties();

    // Act and Assert result
    Assert.assertFalse(supernodeProperties.equals(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void getBaseHomeOutputNotNull() {

    // Arrange
    final SupernodeProperties supernodeProperties = new SupernodeProperties();

    // Act and Assert result
    Assert.assertEquals("/home/admin/supernode", supernodeProperties.getBaseHome());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getSchedulerCorePoolSizeOutputPositive() {

    // Arrange
    final SupernodeProperties supernodeProperties = new SupernodeProperties();

    // Act and Assert result
    Assert.assertEquals(10, supernodeProperties.getSchedulerCorePoolSize());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getSystemNeedRateOutputPositive() {

    // Arrange
    final SupernodeProperties supernodeProperties = new SupernodeProperties();

    // Act and Assert result
    Assert.assertEquals(20, supernodeProperties.getSystemNeedRate());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getTotalLimitOutputPositive() {

    // Arrange
    final SupernodeProperties supernodeProperties = new SupernodeProperties();

    // Act and Assert result
    Assert.assertEquals(200, supernodeProperties.getTotalLimit());
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashCodeOutputPositive() {

    // Arrange
    final SupernodeProperties supernodeProperties = new SupernodeProperties();

    // Act and Assert result
    Assert.assertEquals(190_023_355, supernodeProperties.hashCode());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Files.class, SupernodeProperties.class, Paths.class})
  @Test
  public void initOutputVoid() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(Paths.class);
    PowerMockito.mockStatic(Files.class);

    // Arrange
    final SupernodeProperties supernodeProperties = new SupernodeProperties();
    supernodeProperties.setSchedulerCorePoolSize(10);
    supernodeProperties.setTotalLimit(200);
    supernodeProperties.setSystemNeedRate(20);
    supernodeProperties.setBaseHome("/home/admin/supernode");
    final Path path1 = (Path)Reflector.getInstance("java.nio.file.Path");
    final Path path = (Path)Reflector.getInstance("java.nio.file.Path");
    PowerMockito
        .when(Files.createDirectories(or(Matchers.isA(Path.class), Matchers.isNull(Path.class)),
                                      Matchers.<FileAttribute>anyVararg()))
        .thenReturn(path)
        .thenReturn(path1);
    final Path path3 = (Path)Reflector.getInstance("java.nio.file.Path");
    final Path path2 = (Path)Reflector.getInstance("java.nio.file.Path");
    PowerMockito
        .when(Paths.get(or(Matchers.isA(String.class), Matchers.isNull(String.class)),
                        Matchers.<String>anyVararg()))
        .thenReturn(path2)
        .thenReturn(path3);

    // Act
    supernodeProperties.init();

    // The method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void setBaseHomeInputNotNullOutputVoid() {

    // Arrange
    final SupernodeProperties supernodeProperties = new SupernodeProperties();

    // Act
    supernodeProperties.setBaseHome("");

    // Assert side effects
    Assert.assertEquals("", supernodeProperties.getBaseHome());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setSchedulerCorePoolSizeInputZeroOutputVoid() {

    // Arrange
    final SupernodeProperties supernodeProperties = new SupernodeProperties();

    // Act
    supernodeProperties.setSchedulerCorePoolSize(0);

    // Assert side effects
    Assert.assertEquals(0, supernodeProperties.getSchedulerCorePoolSize());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setSystemNeedRateInputZeroOutputVoid() {

    // Arrange
    final SupernodeProperties supernodeProperties = new SupernodeProperties();

    // Act
    supernodeProperties.setSystemNeedRate(0);

    // Assert side effects
    Assert.assertEquals(0, supernodeProperties.getSystemNeedRate());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setTotalLimitInputZeroOutputVoid() {

    // Arrange
    final SupernodeProperties supernodeProperties = new SupernodeProperties();

    // Act
    supernodeProperties.setTotalLimit(0);

    // Assert side effects
    Assert.assertEquals(0, supernodeProperties.getTotalLimit());
  }

  // Test written by Diffblue Cover.

  @Test
  public void staticInitOutputVoid() throws InvocationTargetException {

    // Act, using constructor to test static initializer
    final Object constructed =
        Reflector.getInstance("com.alibaba.dragonfly.supernode.config.SupernodeProperties");

    // Assert side effects
    Assert.assertNotNull(Reflector.getInstanceField(SupernodeProperties.class, null, "log"));
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull() {

    // Arrange
    final SupernodeProperties supernodeProperties = new SupernodeProperties();

    // Act and Assert result
    Assert.assertEquals(
        "SupernodeProperties(baseHome=/home/admin/supernode, systemNeedRate=20, totalLimit=200, schedulerCorePoolSize=10)",
        supernodeProperties.toString());
  }
}

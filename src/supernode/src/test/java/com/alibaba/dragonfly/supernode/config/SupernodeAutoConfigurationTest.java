package com.alibaba.dragonfly.supernode.config;

import com.alibaba.dragonfly.supernode.config.SupernodeAutoConfiguration.SpringSchedulerConfig;
import com.alibaba.dragonfly.supernode.config.SupernodeAutoConfiguration;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class SupernodeAutoConfigurationTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void configureTasksInputNullOutputNullPointerException() {

    // Arrange
    final SpringSchedulerConfig supernodeAutoConfigurationSpringSchedulerConfig =
        new SpringSchedulerConfig();

    // Act
    thrown.expect(NullPointerException.class);
    supernodeAutoConfigurationSpringSchedulerConfig.configureTasks(null);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final SupernodeAutoConfiguration actual = new SupernodeAutoConfiguration();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull2() {

    // Act, creating object to test constructor
    final SpringSchedulerConfig actual = new SpringSchedulerConfig();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void taskExecutorOutputNullPointerException() {

    // Arrange
    final SpringSchedulerConfig supernodeAutoConfigurationSpringSchedulerConfig =
        new SpringSchedulerConfig();

    // Act
    thrown.expect(NullPointerException.class);
    supernodeAutoConfigurationSpringSchedulerConfig.taskExecutor();

    // The method is not expected to return due to exception thrown
  }
}

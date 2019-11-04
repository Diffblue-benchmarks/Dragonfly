package com.alibaba.dragonfly.supernode.config;

import com.alibaba.dragonfly.supernode.config.SupernodeAutoConfiguration.SpringSchedulerConfig;
import com.alibaba.dragonfly.supernode.config.SupernodeAutoConfiguration;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;



public class SupernodeAutoConfigurationTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void configureTasksInputNotNullOutputNullPointerException9992a4858425fc7c5dd() {

    // Arrange
    final SpringSchedulerConfig thisObj = new SpringSchedulerConfig();
    final ScheduledTaskRegistrar arg0 = new ScheduledTaskRegistrar();

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.configureTasks(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99909404b282faa8b94() {

    // Act, creating object to test constructor
    final SpringSchedulerConfig actual = new SpringSchedulerConfig();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void taskExecutorOutputNullPointerException999f3760ea9414f3c52() {

    // Arrange
    final SpringSchedulerConfig thisObj = new SpringSchedulerConfig();

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.taskExecutor();

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999f89df1f05d2ee10d() {

    // Act, creating object to test constructor
    final SupernodeAutoConfiguration actual = new SupernodeAutoConfiguration();

    // Assert result
    Assert.assertNotNull(actual);

  }
}

package com.alibaba.dragonfly.supernode;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.alibaba.dragonfly.supernode.SuperNodeStarter;
import com.diffblue.deeptestutils.Reflector;
import com.diffblue.deeptestutils.mock.DTUMemberMatcher;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RunWith(PowerMockRunner.class)
public class SuperNodeStarterTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final SuperNodeStarter actual = new SuperNodeStarter();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(SpringApplication.class)
  @Test
  public void mainInput0OutputVoid() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(SpringApplication.class);

    // Arrange
    final String[] args = {};
    final ConfigurableApplicationContext configurableApplicationContext =
        (ConfigurableApplicationContext)Reflector.getInstance(
            "org.springframework.context.ConfigurableApplicationContext");
    final Method runMethod = DTUMemberMatcher.method(SpringApplication.class, "run", Class.class,
                                                     java.lang.String[].class);
    PowerMockito.doReturn(configurableApplicationContext)
        .when(SpringApplication.class, runMethod)
        .withArguments(
            or(isA(Class.class), isNull(Class.class)),
            new Object[] {or(isA(java.lang.String[].class), isNull(java.lang.String[].class))});

    // Act
    SuperNodeStarter.main(args);

    // The method returns void, testing that no exception is thrown
  }
}

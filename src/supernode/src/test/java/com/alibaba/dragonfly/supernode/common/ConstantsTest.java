package com.alibaba.dragonfly.supernode.common;

import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.alibaba.dragonfly.supernode.common.Constants;
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

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RunWith(PowerMockRunner.class)
public class ConstantsTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void constructorOutputNotNull() {

    // Act, creating object to test constructor
    final Constants actual = new Constants();

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(Constants.class)
  @Test
  public void generateNodeCidOutputVoid() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(Constants.class);

    // Arrange
    final Method getSuperNodeCidPrefixMethod =
        DTUMemberMatcher.method(Constants.class, "getSuperNodeCidPrefix");
    PowerMockito.when(Constants.class, getSuperNodeCidPrefixMethod)
        .withNoArguments()
        .thenReturn("");

    // Act
    Constants.generateNodeCid();

    // Assert side effects
    Assert.assertEquals("", Constants.SUPER_NODE_CID);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isDebugEnabledOutputFalse() {

    // Act and Assert result
    Assert.assertFalse(Constants.isDebugEnabled());
  }

  // Test written by Diffblue Cover.

  @Test
  public void staticInitOutputVoid() throws InvocationTargetException {

    // Act, using constructor to test static initializer
    final Object constructed =
        Reflector.getInstance("com.alibaba.dragonfly.supernode.common.Constants");

    // The method returns void, testing that no exception is thrown
  }
}

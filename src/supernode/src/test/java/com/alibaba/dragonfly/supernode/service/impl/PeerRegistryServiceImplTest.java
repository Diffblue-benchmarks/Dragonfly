package com.alibaba.dragonfly.supernode.service.impl;

import com.alibaba.dragonfly.supernode.common.domain.PeerInfo;
import com.alibaba.dragonfly.supernode.common.domain.Task;
import com.alibaba.dragonfly.supernode.common.exception.ValidateException;
import com.alibaba.dragonfly.supernode.service.impl.PeerRegistryServiceImpl;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class PeerRegistryServiceImplTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999dd93a54445ff225c() {

    // Act, creating object to test constructor
    final PeerRegistryServiceImpl actual = new PeerRegistryServiceImpl();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void registryCdnNodeInputNotNullOutputNullPointerException9996834b71cc449cb4f() {

    // Arrange
    final PeerRegistryServiceImpl thisObj = new PeerRegistryServiceImpl();
    final Task arg0 = new Task();

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.registryCdnNode(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void registryTaskInputNotNullNotNullNotNullNotNullNotNullNotNullNotNullNotNullNotNull3TrueOutputValidateException999956ae4e355162035() throws ValidateException {

    // Arrange
    final PeerRegistryServiceImpl thisObj = new PeerRegistryServiceImpl();
    final String arg0 = "aaaaa";
    final String arg1 = "aaaaa";
    final String arg2 = "aaaaa";
    final String arg3 = "aaaaa";
    final String arg4 = "aaaaaaaaaaaaaaa";
    final PeerInfo arg5 = new PeerInfo();
    final String arg6 = "aaaaa";
    final String arg7 = "aaaaa";
    final String arg8 = "aaaaa";
    final String[] arg9 = { "aaaaa", "aaaaa", "aaaaa" };
    final boolean arg10 = true;

    // Act
    thrown.expect(ValidateException.class);
    thisObj.registryTask(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);

    // The method is not expected to return due to exception thrown

  }
}

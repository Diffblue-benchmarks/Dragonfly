package com.alibaba.dragonfly.supernode.service.impl;

import com.alibaba.dragonfly.supernode.common.domain.PeerTask;
import com.alibaba.dragonfly.supernode.common.domain.gc.GcMeta;
import com.alibaba.dragonfly.supernode.common.enumeration.PeerTaskStatus;
import com.alibaba.dragonfly.supernode.service.impl.PeerTaskServiceImpl;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;



public class PeerTaskServiceImplTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void addInputNotNullOutputNullPointerException999e3152db90667e823() {

    // Arrange
    final PeerTaskServiceImpl thisObj = new PeerTaskServiceImpl();
    final PeerTask arg0 = new PeerTask();

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.add(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999c85038059f645cf9() {

    // Act, creating object to test constructor
    final PeerTaskServiceImpl actual = new PeerTaskServiceImpl();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void gcInputNotNullOutputNullPointerException999653e3a0e815496ca() {

    // Arrange
    final PeerTaskServiceImpl thisObj = new PeerTaskServiceImpl();
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("aaaaa");
    final GcMeta arg0 = new GcMeta("aaaaa", arrayList, true);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.gc(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getCidsByTaskIdInputNotNullOutputNullPointerException99914fcae8adbdf21f6() {

    // Arrange
    final PeerTaskServiceImpl thisObj = new PeerTaskServiceImpl();
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getCidsByTaskId(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getInputNotNullNotNullOutputNullPointerException9998a581ef9050b6804() {

    // Arrange
    final PeerTaskServiceImpl thisObj = new PeerTaskServiceImpl();
    final String arg0 = "aaaaa";
    final String arg1 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.get(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updatePeerTaskStatusInputNotNullNotNullWaitOutputNullPointerException999dd68bcaf85a2e218() {

    // Arrange
    final PeerTaskServiceImpl thisObj = new PeerTaskServiceImpl();
    final String arg0 = "aaaaa";
    final String arg1 = "aaaaa";
    final PeerTaskStatus arg2 = PeerTaskStatus.WAIT;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updatePeerTaskStatus(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }
}

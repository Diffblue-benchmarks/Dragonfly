package com.alibaba.dragonfly.supernode.service.impl;

import com.alibaba.dragonfly.supernode.common.domain.PeerInfo;
import com.alibaba.dragonfly.supernode.common.domain.gc.GcMeta;
import com.alibaba.dragonfly.supernode.service.impl.PeerServiceImpl;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;



public class PeerServiceImplTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void addInputNotNullOutputNullPointerException99913ba2eef4a350c8a() {

    // Arrange
    final PeerServiceImpl thisObj = new PeerServiceImpl();
    final PeerInfo arg0 = new PeerInfo();

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.add(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999109d37080fb0f358() {

    // Act, creating object to test constructor
    final PeerServiceImpl actual = new PeerServiceImpl();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void gcInputNotNullOutputNullPointerException9998b5ec5b9f34ae6d3() {

    // Arrange
    final PeerServiceImpl thisObj = new PeerServiceImpl();
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
  public void getInputNotNullOutputNullPointerException9994622f6f8da97de19() {

    // Arrange
    final PeerServiceImpl thisObj = new PeerServiceImpl();
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.get(arg0);

    // The method is not expected to return due to exception thrown

  }
}

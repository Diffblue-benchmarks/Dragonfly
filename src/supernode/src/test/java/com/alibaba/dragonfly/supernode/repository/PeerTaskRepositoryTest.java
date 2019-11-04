package com.alibaba.dragonfly.supernode.repository;

import com.alibaba.dragonfly.supernode.common.domain.PeerTask;
import com.alibaba.dragonfly.supernode.common.enumeration.PeerTaskStatus;
import com.alibaba.dragonfly.supernode.repository.PeerTaskRepository;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;



public class PeerTaskRepositoryTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void addInputNotNullOutputFalse9995c9724620ae9a007() {

    // Arrange
    final PeerTaskRepository thisObj = new PeerTaskRepository();
    final PeerTask arg0 = new PeerTask();

    // Act
    final boolean actual = thisObj.add(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999714a2df346d07d79() {

    // Act, creating object to test constructor
    final PeerTaskRepository actual = new PeerTaskRepository();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getCidsByTaskIdInputNotNullOutput099958d0618d8ada70eb() {

    // Arrange
    final PeerTaskRepository thisObj = new PeerTaskRepository();
    final String arg0 = "aaaaa";

    // Act
    final List<String> actual = thisObj.getCidsByTaskId(arg0);

    // Assert result
    final ArrayList<String> arrayList = new ArrayList<String>();
    Assert.assertEquals(arrayList, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getInputNotNullNotNullOutputVoid999a5d06adf049b6d20() {

    // Arrange
    final PeerTaskRepository thisObj = new PeerTaskRepository();
    final String arg0 = "aaaaa";
    final String arg1 = "aaaaa";

    // Act
    final PeerTask actual = thisObj.get(arg0, arg1);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void removeInputNotNullNotNullOutputFalse999a6e04389e7b0b88d() {

    // Arrange
    final PeerTaskRepository thisObj = new PeerTaskRepository();
    final String arg0 = "aaaaa";
    final String arg1 = "aaaaa";

    // Act
    final boolean actual = thisObj.remove(arg0, arg1);

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void updateStatusInputNotNullNotNullWaitOutputFalse999f80cad427f5917bc() {

    // Arrange
    final PeerTaskRepository thisObj = new PeerTaskRepository();
    final String arg0 = "aaaaa";
    final String arg1 = "aaaaa";
    final PeerTaskStatus arg2 = PeerTaskStatus.WAIT;

    // Act
    final boolean actual = thisObj.updateStatus(arg0, arg1, arg2);

    // Assert result
    Assert.assertFalse(actual);

  }
}

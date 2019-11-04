package com.alibaba.dragonfly.supernode.service.impl;

import com.alibaba.dragonfly.supernode.common.domain.gc.GcMeta;
import com.alibaba.dragonfly.supernode.common.enumeration.PeerPieceStatus;
import com.alibaba.dragonfly.supernode.service.impl.ProgressServiceImpl;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;



public class ProgressServiceImplTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9991b08cf6c198ce0f6() {

    // Act, creating object to test constructor
    final ProgressServiceImpl actual = new ProgressServiceImpl();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void gcInputNotNullOutputNullPointerException999966716f74ff9e7f7() {

    // Arrange
    final ProgressServiceImpl thisObj = new ProgressServiceImpl();
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
  public void initProgressInputNotNullNotNullOutputNullPointerException99937d0e4e4d8d2c0d1() {

    // Arrange
    final ProgressServiceImpl thisObj = new ProgressServiceImpl();
    final String arg0 = "aaaaa";
    final String arg1 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.initProgress(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void parseAvaliablePeerTasksInputNotNullNotNullOutputNullPointerException9996b579bdb1cc73469() {

    // Arrange
    final ProgressServiceImpl thisObj = new ProgressServiceImpl();
    final String arg0 = "aaaaa";
    final String arg1 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.parseAvaliablePeerTasks(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void processPieceSucInputNotNullNotNullPositiveOutputNullPointerException9999859ff042b3f731c() {

    // Arrange
    final ProgressServiceImpl thisObj = new ProgressServiceImpl();
    final String arg0 = "aaaaa";
    final String arg1 = "aaaaa";
    final int arg2 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.processPieceSuc(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateDownInfoInputNotNullOutputNullPointerException9995ea490e04ce7bb6c() {

    // Arrange
    final ProgressServiceImpl thisObj = new ProgressServiceImpl();
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateDownInfo(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateProgressInputNotNullNotNullNotNullPositiveWaitOutputNullPointerException9991c1bf5cee23c5b7c() {

    // Arrange
    final ProgressServiceImpl thisObj = new ProgressServiceImpl();
    final String arg0 = "aaaaa";
    final String arg1 = "aaaaa";
    final String arg2 = "aaaaa";
    final int arg3 = 1;
    final PeerPieceStatus arg4 = PeerPieceStatus.WAIT;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateProgress(arg0, arg1, arg2, arg3, arg4);

    // The method is not expected to return due to exception thrown

  }
}

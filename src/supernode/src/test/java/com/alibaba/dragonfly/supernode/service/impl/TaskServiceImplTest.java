package com.alibaba.dragonfly.supernode.service.impl;

import com.alibaba.dragonfly.supernode.common.domain.Task;
import com.alibaba.dragonfly.supernode.common.domain.gc.GcMeta;
import com.alibaba.dragonfly.supernode.common.enumeration.CdnStatus;
import com.alibaba.dragonfly.supernode.common.exception.AuthenticationRequiredException;
import com.alibaba.dragonfly.supernode.common.exception.AuthenticationWaitedException;
import com.alibaba.dragonfly.supernode.common.exception.TaskIdDuplicateException;
import com.alibaba.dragonfly.supernode.common.exception.UrlNotReachableException;
import com.alibaba.dragonfly.supernode.service.impl.TaskServiceImpl;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;



public class TaskServiceImplTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void addInputNotNullOutputNullPointerException99911904cffad8d1877() throws UrlNotReachableException, AuthenticationWaitedException, TaskIdDuplicateException, AuthenticationRequiredException {

    // Arrange
    final TaskServiceImpl thisObj = new TaskServiceImpl();
    final Task arg0 = new Task();

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.add(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999317c491681e927c3() {

    // Act, creating object to test constructor
    final TaskServiceImpl actual = new TaskServiceImpl();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void createTaskIdInputNotNullNotNullNotNullOutputNotNull99959a4e764afa0acbe() {

    // Arrange
    final TaskServiceImpl thisObj = new TaskServiceImpl();
    final String arg0 = "aaaaa";
    final String arg1 = "aaaaa";
    final String arg2 = "aaaaa";

    // Act
    final String actual = thisObj.createTaskId(arg0, arg1, arg2);

    // Assert result
    Assert.assertEquals("ec7bb9b291dafaa15d467d7983430011bb2eaa38c218e6932113f343e4a73fde", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void gcInputNotNullOutputNullPointerException99950b426f848e4b90b() {

    // Arrange
    final TaskServiceImpl thisObj = new TaskServiceImpl();
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
  public void getFullPieceMd5sByTaskInputNotNullOutput0999be43d4a447920290() {

    // Arrange
    final TaskServiceImpl thisObj = new TaskServiceImpl();
    final Task arg0 = new Task();

    // Act
    final List<String> actual = thisObj.getFullPieceMd5sByTask(arg0);

    // Assert result
    final ArrayList<String> arrayList = new ArrayList<String>();
    Assert.assertEquals(arrayList, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getPieceMd5InputNotNullPositiveOutputNullPointerException9997f32df1e1f4b1fcb() {

    // Arrange
    final TaskServiceImpl thisObj = new TaskServiceImpl();
    final String arg0 = "aaaaa";
    final int arg1 = 1;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.getPieceMd5(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getInputNotNullOutputNullPointerException999ee9fc180cead3470() {

    // Arrange
    final TaskServiceImpl thisObj = new TaskServiceImpl();
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.get(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void setPieceMd5InputNotNullPositiveNotNullOutputNullPointerException999838c700239926a02() {

    // Arrange
    final TaskServiceImpl thisObj = new TaskServiceImpl();
    final String arg0 = "aaaaa";
    final int arg1 = 1;
    final String arg2 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.setPieceMd5(arg0, arg1, arg2);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateCdnStatusInputNotNullWaitOutputNullPointerException999a37c228673fdaad4() {

    // Arrange
    final TaskServiceImpl thisObj = new TaskServiceImpl();
    final String arg0 = "aaaaa";
    final CdnStatus arg1 = CdnStatus.WAIT;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateCdnStatus(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateTaskInfoInputNotNullNotNullNotNullNotNullWaitOutputNullPointerException9990cd0b677686b796a() {

    // Arrange
    final TaskServiceImpl thisObj = new TaskServiceImpl();
    final String arg0 = "aaaaa";
    final String arg1 = "aaaaa";
    final Long arg2 = new Long(1L);
    final Integer arg3 = new Integer(1);
    final CdnStatus arg4 = CdnStatus.WAIT;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateTaskInfo(arg0, arg1, arg2, arg3, arg4);

    // The method is not expected to return due to exception thrown

  }
}

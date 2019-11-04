package com.alibaba.dragonfly.supernode.repository;

import com.alibaba.dragonfly.supernode.common.domain.Task;
import com.alibaba.dragonfly.supernode.common.enumeration.CdnStatus;
import com.alibaba.dragonfly.supernode.common.exception.AuthenticationRequiredException;
import com.alibaba.dragonfly.supernode.common.exception.AuthenticationWaitedException;
import com.alibaba.dragonfly.supernode.common.exception.TaskIdDuplicateException;
import com.alibaba.dragonfly.supernode.common.exception.UrlNotReachableException;
import com.alibaba.dragonfly.supernode.repository.TaskRepository;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class TaskRepositoryTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void addInputNotNullOutputNullPointerException999fe4b32f37426c040() throws AuthenticationRequiredException, UrlNotReachableException, AuthenticationWaitedException, TaskIdDuplicateException {

    // Arrange
    final TaskRepository thisObj = new TaskRepository();
    final Task arg0 = new Task();

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.add(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999fdca598f0068dfaf() {

    // Act, creating object to test constructor
    final TaskRepository actual = new TaskRepository();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getInputNotNullOutputVoid999ce9cff655088f113() {

    // Arrange
    final TaskRepository thisObj = new TaskRepository();
    final String arg0 = "aaaaa";

    // Act
    final Task actual = thisObj.get(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void removeInputNotNullOutputFalse9991398d5a727f8742e() {

    // Arrange
    final TaskRepository thisObj = new TaskRepository();
    final String arg0 = "aaaaa";

    // Act
    final boolean actual = thisObj.remove(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void updateTaskInfoInputNotNullNotNullNotNullNotNullWaitOutputFalse99982ac5be47f125bc7() {

    // Arrange
    final TaskRepository thisObj = new TaskRepository();
    final String arg0 = "aaaaa";
    final String arg1 = "aaaaa";
    final Long arg2 = new Long(1L);
    final Integer arg3 = new Integer(1);
    final CdnStatus arg4 = CdnStatus.WAIT;

    // Act
    final boolean actual = thisObj.updateTaskInfo(arg0, arg1, arg2, arg3, arg4);

    // Assert result
    Assert.assertFalse(actual);

  }
}

package com.alibaba.dragonfly.supernode.repository;

import com.alibaba.dragonfly.supernode.common.domain.Task;
import com.alibaba.dragonfly.supernode.common.enumeration.CdnStatus;
import com.alibaba.dragonfly.supernode.repository.TaskRepository;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TaskRepositoryTest {

  @Rule public ExpectedException thrown = ExpectedException.none();

  /* testedClasses: TaskRepository */

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers:
   *  - conditional line 90 branch to line 90
   *  - conditional line 90 branch to line 91
   */

  @Test
  public void computePieceSizeInputNegativeOutputPositive()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {

    // Arrange
    final TaskRepository objectUnderTest = new TaskRepository();
    final Long httpFileLen = -209_715_200L;

    // Act
    final Class<?> classUnderTest =
        Reflector.forName("com.alibaba.dragonfly.supernode.repository.TaskRepository");
    final Method methodUnderTest =
        classUnderTest.getDeclaredMethod("computePieceSize", Reflector.forName("java.lang.Long"));
    methodUnderTest.setAccessible(true);
    final Integer retval = (Integer)methodUnderTest.invoke(objectUnderTest, httpFileLen);

    // Assert result
    Assert.assertEquals(new Integer(4_194_304), retval);
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers:
   *  - conditional line 90 branch to line 90
   *  - conditional line 90 branch to line 93
   *  - conditional line 95 branch to line 95
   */

  @Test
  public void computePieceSizeInputPositiveOutputPositive()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {

    // Arrange
    final TaskRepository objectUnderTest = new TaskRepository();
    final Long httpFileLen = 209_715_201L;

    // Act
    final Class<?> classUnderTest =
        Reflector.forName("com.alibaba.dragonfly.supernode.repository.TaskRepository");
    final Method methodUnderTest =
        classUnderTest.getDeclaredMethod("computePieceSize", Reflector.forName("java.lang.Long"));
    methodUnderTest.setAccessible(true);
    final Integer retval = (Integer)methodUnderTest.invoke(objectUnderTest, httpFileLen);

    // Assert result
    Assert.assertEquals(new Integer(4_194_304), retval);
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers:
   *  - conditional line 90 branch to line 90
   *  - conditional line 90 branch to line 93
   *  - conditional line 95 branch to line 95
   */

  @Test
  public void computePieceSizeInputPositiveOutputPositive2()
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {

    // Arrange
    final TaskRepository objectUnderTest = new TaskRepository();
    final Long httpFileLen = 7_205_759_404_002_508_801L;

    // Act
    final Class<?> classUnderTest =
        Reflector.forName("com.alibaba.dragonfly.supernode.repository.TaskRepository");
    final Method methodUnderTest =
        classUnderTest.getDeclaredMethod("computePieceSize", Reflector.forName("java.lang.Long"));
    methodUnderTest.setAccessible(true);
    final Integer retval = (Integer)methodUnderTest.invoke(objectUnderTest, httpFileLen);

    // Assert result
    Assert.assertEquals(new Integer(15_728_640), retval);
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers:
   *  - conditional line 104 branch to line 104
   */

  @Test
  public void removeInputNullOutputFalse() {

    // Arrange
    final TaskRepository objectUnderTest = new TaskRepository();
    final String taskId = null;

    // Act
    final boolean retval = objectUnderTest.remove(taskId);

    // Assert result
    Assert.assertEquals(false, retval);
  }

  /*
   * Test generated by Diffblue Deeptest.
   * This test case covers:
   *  - conditional line 109 branch to line 128
   */

  @Test
  public void updateTaskInfoInputNullNullNullNullNullOutputFalse() {

    // Arrange
    final TaskRepository objectUnderTest = new TaskRepository();
    final String taskId = null;
    final String md5 = null;
    final Long fileLength = null;
    final Integer pieceTotal = null;
    final CdnStatus cdnStatus = null;

    // Act
    final boolean retval =
        objectUnderTest.updateTaskInfo(taskId, md5, fileLength, pieceTotal, cdnStatus);

    // Assert result
    Assert.assertEquals(false, retval);
  }
}

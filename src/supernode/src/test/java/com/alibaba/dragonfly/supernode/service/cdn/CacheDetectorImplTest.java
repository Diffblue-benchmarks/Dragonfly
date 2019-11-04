package com.alibaba.dragonfly.supernode.service.cdn;

import com.alibaba.dragonfly.supernode.common.domain.FileMetaData;
import com.alibaba.dragonfly.supernode.common.domain.Task;
import com.alibaba.dragonfly.supernode.service.cdn.CacheDetectorImpl;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class CacheDetectorImplTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void checkSameFileInputNotNullNotNullOutputNullPointerException999ae90eb5e44d481c3() {

    // Arrange
    final CacheDetectorImpl thisObj = new CacheDetectorImpl();
    final Task arg0 = new Task();
    final FileMetaData arg1 = new FileMetaData();

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.checkSameFile(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999c006f8757475cb9c() {

    // Act, creating object to test constructor
    final CacheDetectorImpl actual = new CacheDetectorImpl();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void detectCacheInputNotNullOutputNullPointerException9993483d20fc62115e8() {

    // Arrange
    final CacheDetectorImpl thisObj = new CacheDetectorImpl();
    final Task arg0 = new Task();

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.detectCache(arg0);

    // The method is not expected to return due to exception thrown

  }
}

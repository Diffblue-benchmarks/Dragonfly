package com.alibaba.dragonfly.supernode.service.impl;

import com.alibaba.dragonfly.supernode.common.domain.Task;
import com.alibaba.dragonfly.supernode.service.impl.FileMetaDataServiceImpl;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;



public class FileMetaDataServiceImplTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99938c9c29091c0a068() {

    // Act, creating object to test constructor
    final FileMetaDataServiceImpl actual = new FileMetaDataServiceImpl();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void createMetaDataInputNotNullOutputNullPointerException999d07fc497a6452ad4() throws IOException {

    // Arrange
    final FileMetaDataServiceImpl thisObj = new FileMetaDataServiceImpl();
    final Task arg0 = new Task();

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.createMetaData(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void readFileMetaDataInputNotNullOutputNullPointerException9993727a96e6c52752f() {

    // Arrange
    final FileMetaDataServiceImpl thisObj = new FileMetaDataServiceImpl();
    final String arg0 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.readFileMetaData(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void readPieceMd5InputNotNullNotNullOutputNullPointerException999d8bad457b5cf169a() {

    // Arrange
    final FileMetaDataServiceImpl thisObj = new FileMetaDataServiceImpl();
    final String arg0 = "aaaaa";
    final String arg1 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.readPieceMd5(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateAccessTimeInputNotNullPositiveOutputNullPointerException999000cee4f968c72d8() {

    // Arrange
    final FileMetaDataServiceImpl thisObj = new FileMetaDataServiceImpl();
    final String arg0 = "aaaaa";
    final long arg1 = 1L;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateAccessTime(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateLastModifiedInputNotNullPositiveOutputNullPointerException999a4032d2dbfea37ff() {

    // Arrange
    final FileMetaDataServiceImpl thisObj = new FileMetaDataServiceImpl();
    final String arg0 = "aaaaa";
    final long arg1 = 1L;

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateLastModified(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void updateStatusAndResultInputNotNullTrueTrueNotNullNotNullOutputNullPointerException99916988b6ca7c38603() {

    // Arrange
    final FileMetaDataServiceImpl thisObj = new FileMetaDataServiceImpl();
    final String arg0 = "aaaaa";
    final boolean arg1 = true;
    final boolean arg2 = true;
    final String arg3 = "aaaaa";
    final Long arg4 = new Long(1L);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.updateStatusAndResult(arg0, arg1, arg2, arg3, arg4);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void writePieceMd5InputNotNullNotNullNotNullOutputNullPointerException9996dafbcf2ad655919() {

    // Arrange
    final FileMetaDataServiceImpl thisObj = new FileMetaDataServiceImpl();
    final String arg0 = "aaaaa";
    final String arg1 = "aaaaa";
    final ArrayList<String> arg2 = new ArrayList<String>();
    arg2.add("aaaaa");
    try {

      // Act
      thrown.expect(NullPointerException.class);
      thisObj.writePieceMd5(arg0, arg1, arg2);
    } catch (NullPointerException ex) {

      // Assert side effects
      final ArrayList<String> arrayList = new ArrayList<String>();
      arrayList.add("aaaaa");
      arrayList.add("aaaaa");
      arrayList.add("3495ff69d34671d1e15b33a63c1379fdedd3a32a");
      Assert.assertEquals(arrayList, arg2);
      throw ex;
    }

  }
}

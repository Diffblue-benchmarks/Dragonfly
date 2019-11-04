package com.alibaba.dragonfly.supernode.service.cdn.util;

import com.alibaba.dragonfly.supernode.service.cdn.util.PathUtil;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.nio.file.Path;



public class PathUtilTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99991e3adf1cd10f2ab() {

    // Act, creating object to test constructor
    final PathUtil actual = new PathUtil();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void deleteTaskFilesInputNotNullTrueOutputVoid9994e294b5b54967cb9() {

    // Arrange
    final String arg0 = "aaaaa";
    final boolean arg1 = true;

    // Act
    PathUtil.deleteTaskFiles(arg0, arg1);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getDownloadPathStrInputNotNullOutputNotNull9995e8a2c5ef056ac5e() {

    // Arrange
    final String arg0 = "aaaaa";

    // Act
    final String actual = PathUtil.getDownloadPathStr(arg0);

    // Assert result
    Assert.assertEquals("/home/admin/supernode/repo/download/aaa/aaaaa", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getDownloadPathInputNotNullOutputNotNull999d15822232c632808() {

    // Arrange
    final String arg0 = "aaaaa";

    // Act
    final Path actual = PathUtil.getDownloadPath(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(Reflector.getInstanceField(actual, "fs"));

  }

  // Test written by Diffblue Cover
  @Test
  public void getHttpPathInputNotNullOutputNotNull999c41628c7ab1ef46c() {

    // Arrange
    final String arg0 = "aaaaa";

    // Act
    final String actual = PathUtil.getHttpPath(arg0);

    // Assert result
    Assert.assertEquals("/qtdown/aaa/aaaaa", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getMd5DataPathInputNotNullOutputNotNull99914ce1b247806f9eb() {

    // Arrange
    final String arg0 = "aaaaa";

    // Act
    final Path actual = PathUtil.getMd5DataPath(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(Reflector.getInstanceField(actual, "fs"));

  }

  // Test written by Diffblue Cover
  @Test
  public void getMetaDataPathInputNotNullOutputNotNull999142fab1251f89b1a() {

    // Arrange
    final String arg0 = "aaaaa";

    // Act
    final Path actual = PathUtil.getMetaDataPath(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(Reflector.getInstanceField(actual, "fs"));

  }

  // Test written by Diffblue Cover
  @Test
  public void getUploadPathInputNotNullOutputNotNull999b8753c86fff891f2() {

    // Arrange
    final String arg0 = "aaaaa";

    // Act
    final Path actual = PathUtil.getUploadPath(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(Reflector.getInstanceField(actual, "fs"));

  }
}

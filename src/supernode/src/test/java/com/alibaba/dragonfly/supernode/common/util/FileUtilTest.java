package com.alibaba.dragonfly.supernode.common.util;

import com.alibaba.dragonfly.supernode.common.util.FileUtil;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.nio.file.Path;



public class FileUtilTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99963a49b90641ddad9() {

    // Act, creating object to test constructor
    final FileUtil actual = new FileUtil();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void createSymbolicLinkInputNullNullOutputFalse9992bcc61e3f76153ca() {

    // Arrange
    final Path arg0 = null;
    final Path arg1 = null;

    // Act
    final boolean actual = FileUtil.createSymbolicLink(arg0, arg1);

    // Assert result
    Assert.assertFalse(actual);

  }
}

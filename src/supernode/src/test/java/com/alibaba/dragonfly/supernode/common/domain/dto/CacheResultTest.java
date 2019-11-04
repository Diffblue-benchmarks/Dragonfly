package com.alibaba.dragonfly.supernode.common.domain.dto;

import com.alibaba.dragonfly.supernode.common.domain.dto.CacheResult;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.security.MessageDigest;



public class CacheResultTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputNotNull999237a801a1d75b422() {
//
//    // Act, creating object to test constructor
//    final CacheResult actual = new CacheResult();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertNotNull(actual.getFileM5());
//    Assert.assertEquals("MD5", ((MessageDigest) actual.getFileM5()).getAlgorithm());
//    Assert.assertNotNull(((MessageDigest) actual.getFileM5()).getProvider());
//    Assert.assertEquals(100, ((MessageDigest) actual.getFileM5()).getProvider().size());
//    Assert.assertNotNull(Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"));
//    Assert.assertEquals(100, ((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table")).length);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[0]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[1]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[2]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[3]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[4]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[5]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[6]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[7]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[8]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[9]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[10]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[11]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[12]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[13]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[14]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[15]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[16]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[17]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[18]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[19]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[20]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[21]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[22]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[23]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[24]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[25]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[26]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[27]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[28]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[29]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[30]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[31]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[32]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[33]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[34]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[35]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[36]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[37]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[38]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[39]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[40]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[41]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[42]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[43]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[44]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[45]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[46]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[47]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[48]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[49]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[50]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[51]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[52]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[53]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[54]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[55]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[56]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[57]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[58]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[59]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[60]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[61]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[62]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[63]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[64]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[65]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[66]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[67]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[68]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[69]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[70]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[71]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[72]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[73]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[74]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[75]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[76]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[77]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[78]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[79]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[80]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[81]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[82]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[83]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[84]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[85]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[86]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[87]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[88]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[89]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[90]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[91]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[92]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[93]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[94]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[95]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[96]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[97]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[98]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual.getFileM5()).getProvider(), "table"))[99]);
//    Assert.assertEquals(0, actual.getStartPieceNum());
//
//  }

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void getFileM5OutputNotNull9995500d1372273dfac() {
//
//    // Arrange
//    final CacheResult thisObj = new CacheResult();
//
//    // Act
//    final MessageDigest actual = thisObj.getFileM5();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertEquals("MD5", ((MessageDigest) actual).getAlgorithm());
//    Assert.assertNotNull(((MessageDigest) actual).getProvider());
//    Assert.assertEquals(100, ((MessageDigest) actual).getProvider().size());
//    Assert.assertNotNull(Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"));
//    Assert.assertEquals(100, ((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table")).length);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[0]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[1]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[2]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[3]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[4]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[5]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[6]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[7]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[8]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[9]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[10]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[11]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[12]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[13]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[14]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[15]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[16]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[17]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[18]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[19]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[20]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[21]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[22]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[23]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[24]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[25]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[26]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[27]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[28]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[29]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[30]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[31]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[32]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[33]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[34]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[35]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[36]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[37]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[38]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[39]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[40]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[41]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[42]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[43]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[44]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[45]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[46]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[47]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[48]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[49]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[50]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[51]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[52]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[53]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[54]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[55]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[56]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[57]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[58]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[59]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[60]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[61]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[62]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[63]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[64]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[65]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[66]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[67]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[68]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[69]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[70]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[71]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[72]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[73]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[74]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[75]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[76]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[77]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[78]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[79]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[80]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[81]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[82]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[83]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[84]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[85]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[86]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[87]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[88]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[89]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[90]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[91]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[92]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[93]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[94]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[95]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[96]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[97]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[98]);
//    Assert.assertNotNull(((Object[]) Reflector.getInstanceField(((MessageDigest) actual).getProvider(), "table"))[99]);
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void getStartPieceNumOutputZero9997ca0af1b74f25b92() {

    // Arrange
    final CacheResult thisObj = new CacheResult();

    // Act
    final int actual = thisObj.getStartPieceNum();

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void setFileM5InputNullOutputVoid999ff01a1befb8df4e1() {

    // Arrange
    final CacheResult thisObj = new CacheResult();
    final MessageDigest arg0 = null;

    // Act
    thisObj.setFileM5(arg0);

    // Assert side effects
    Assert.assertNull(thisObj.getFileM5());

  }

  // Test written by Diffblue Cover
  @Test
  public void setStartPieceNumInputPositiveOutputVoid99962e986ab6aa7bc75() {

    // Arrange
    final CacheResult thisObj = new CacheResult();
    final int arg0 = 1;

    // Act
    thisObj.setStartPieceNum(arg0);

    // Assert side effects
    Assert.assertEquals(1, thisObj.getStartPieceNum());

  }
}

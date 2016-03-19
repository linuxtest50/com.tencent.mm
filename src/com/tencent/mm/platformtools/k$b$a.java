package com.tencent.mm.platformtools;

import android.graphics.Bitmap;
import com.tencent.mm.model.z.a;
import com.tencent.mm.model.z.e;
import com.tencent.mm.sdk.platformtools.am.a;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.u;

final class k$b$a
  implements am.a
{
  private Bitmap bDT = null;
  private int cmg = 0;
  private j cmh;
  
  public k$b$a(j paramj)
  {
    if (!k.c(paramj)) {
      throw new IllegalArgumentException("from net, picture strategy here must be validity");
    }
    cmh = paramj;
  }
  
  /* Error */
  public final boolean vd()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aconst_null
    //   4: astore 5
    //   6: aload_0
    //   7: getfield 40	com/tencent/mm/platformtools/k$b$a:cmh	Lcom/tencent/mm/platformtools/j;
    //   10: ifnonnull +12 -> 22
    //   13: ldc 49
    //   15: ldc 51
    //   17: invokestatic 57	com/tencent/mm/sdk/platformtools/u:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   20: iconst_1
    //   21: ireturn
    //   22: aload_0
    //   23: getfield 40	com/tencent/mm/platformtools/k$b$a:cmh	Lcom/tencent/mm/platformtools/j;
    //   26: invokeinterface 62 1 0
    //   31: new 64	java/io/File
    //   34: dup
    //   35: aload_0
    //   36: getfield 40	com/tencent/mm/platformtools/k$b$a:cmh	Lcom/tencent/mm/platformtools/j;
    //   39: invokeinterface 68 1 0
    //   44: invokespecial 69	java/io/File:<init>	(Ljava/lang/String;)V
    //   47: astore 6
    //   49: new 71	java/io/FileOutputStream
    //   52: dup
    //   53: new 73	java/lang/StringBuilder
    //   56: dup
    //   57: invokespecial 74	java/lang/StringBuilder:<init>	()V
    //   60: aload 6
    //   62: invokevirtual 77	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   65: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   68: ldc 83
    //   70: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   73: invokevirtual 86	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   76: invokespecial 87	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   79: astore_3
    //   80: aload_0
    //   81: getfield 40	com/tencent/mm/platformtools/k$b$a:cmh	Lcom/tencent/mm/platformtools/j;
    //   84: invokeinterface 90 1 0
    //   89: aconst_null
    //   90: invokestatic 95	com/tencent/mm/network/b:a	(Ljava/lang/String;Lcom/tencent/mm/network/b$b;)Lcom/tencent/mm/network/s;
    //   93: astore 7
    //   95: invokestatic 100	com/tencent/mm/ab/p:Aw	()Z
    //   98: ifeq +46 -> 144
    //   101: aload_0
    //   102: getfield 40	com/tencent/mm/platformtools/k$b$a:cmh	Lcom/tencent/mm/platformtools/j;
    //   105: invokeinterface 90 1 0
    //   110: invokestatic 104	com/tencent/mm/ab/p:hV	(Ljava/lang/String;)Z
    //   113: ifeq +31 -> 144
    //   116: getstatic 109	com/tencent/mm/protocal/b:iUf	I
    //   119: invokestatic 113	com/tencent/mm/ab/p:dy	(I)Ljava/lang/String;
    //   122: astore_2
    //   123: ldc 49
    //   125: ldc 115
    //   127: iconst_1
    //   128: anewarray 4	java/lang/Object
    //   131: dup
    //   132: iconst_0
    //   133: aload_2
    //   134: aastore
    //   135: invokestatic 119	com/tencent/mm/sdk/platformtools/u:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   138: aload 7
    //   140: aload_2
    //   141: invokevirtual 124	com/tencent/mm/network/s:kk	(Ljava/lang/String;)V
    //   144: aload 7
    //   146: sipush 10000
    //   149: invokevirtual 128	com/tencent/mm/network/s:setConnectTimeout	(I)V
    //   152: aload 7
    //   154: sipush 20000
    //   157: invokevirtual 131	com/tencent/mm/network/s:setReadTimeout	(I)V
    //   160: aload 7
    //   162: ldc -123
    //   164: invokevirtual 136	com/tencent/mm/network/s:setRequestMethod	(Ljava/lang/String;)V
    //   167: aload 7
    //   169: invokestatic 139	com/tencent/mm/network/b:a	(Lcom/tencent/mm/network/s;)I
    //   172: ifne +710 -> 882
    //   175: aload 7
    //   177: invokevirtual 143	com/tencent/mm/network/s:getInputStream	()Ljava/io/InputStream;
    //   180: astore_2
    //   181: aload 7
    //   183: getfield 147	com/tencent/mm/network/s:cjv	Ljava/net/HttpURLConnection;
    //   186: invokevirtual 152	java/net/HttpURLConnection:getContentType	()Ljava/lang/String;
    //   189: astore 4
    //   191: ldc 49
    //   193: ldc -102
    //   195: iconst_1
    //   196: anewarray 4	java/lang/Object
    //   199: dup
    //   200: iconst_0
    //   201: aload 4
    //   203: aastore
    //   204: invokestatic 119	com/tencent/mm/sdk/platformtools/u:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   207: aload_2
    //   208: ifnonnull +95 -> 303
    //   211: ldc 49
    //   213: ldc -100
    //   215: iconst_1
    //   216: anewarray 4	java/lang/Object
    //   219: dup
    //   220: iconst_0
    //   221: aload_0
    //   222: getfield 40	com/tencent/mm/platformtools/k$b$a:cmh	Lcom/tencent/mm/platformtools/j;
    //   225: invokeinterface 90 1 0
    //   230: aastore
    //   231: invokestatic 159	com/tencent/mm/sdk/platformtools/u:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   234: aload_0
    //   235: getfield 40	com/tencent/mm/platformtools/k$b$a:cmh	Lcom/tencent/mm/platformtools/j;
    //   238: aload 4
    //   240: iconst_0
    //   241: invokeinterface 163 3 0
    //   246: aload_2
    //   247: ifnull +7 -> 254
    //   250: aload_2
    //   251: invokevirtual 168	java/io/InputStream:close	()V
    //   254: aload_3
    //   255: invokevirtual 169	java/io/FileOutputStream:close	()V
    //   258: iconst_1
    //   259: ireturn
    //   260: astore_2
    //   261: ldc 49
    //   263: ldc -85
    //   265: iconst_1
    //   266: anewarray 4	java/lang/Object
    //   269: dup
    //   270: iconst_0
    //   271: aload_2
    //   272: invokestatic 176	com/tencent/mm/sdk/platformtools/ay:b	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   275: aastore
    //   276: invokestatic 178	com/tencent/mm/sdk/platformtools/u:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   279: iconst_1
    //   280: ireturn
    //   281: astore_2
    //   282: ldc 49
    //   284: ldc -85
    //   286: iconst_1
    //   287: anewarray 4	java/lang/Object
    //   290: dup
    //   291: iconst_0
    //   292: aload_2
    //   293: invokestatic 176	com/tencent/mm/sdk/platformtools/ay:b	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   296: aastore
    //   297: invokestatic 178	com/tencent/mm/sdk/platformtools/u:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   300: goto -46 -> 254
    //   303: sipush 1024
    //   306: newarray <illegal type>
    //   308: astore 5
    //   310: aload_2
    //   311: aload 5
    //   313: invokevirtual 182	java/io/InputStream:read	([B)I
    //   316: istore_1
    //   317: iload_1
    //   318: iconst_m1
    //   319: if_icmpeq +127 -> 446
    //   322: aload_0
    //   323: aload_0
    //   324: getfield 25	com/tencent/mm/platformtools/k$b$a:cmg	I
    //   327: iload_1
    //   328: iadd
    //   329: putfield 25	com/tencent/mm/platformtools/k$b$a:cmg	I
    //   332: aload_3
    //   333: aload 5
    //   335: iconst_0
    //   336: iload_1
    //   337: invokevirtual 186	java/io/FileOutputStream:write	([BII)V
    //   340: goto -30 -> 310
    //   343: astore 6
    //   345: aload 4
    //   347: astore 5
    //   349: aload 6
    //   351: astore 4
    //   353: ldc 49
    //   355: ldc -85
    //   357: iconst_1
    //   358: anewarray 4	java/lang/Object
    //   361: dup
    //   362: iconst_0
    //   363: aload 4
    //   365: invokestatic 176	com/tencent/mm/sdk/platformtools/ay:b	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   368: aastore
    //   369: invokestatic 178	com/tencent/mm/sdk/platformtools/u:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   372: ldc 49
    //   374: ldc -68
    //   376: iconst_1
    //   377: anewarray 4	java/lang/Object
    //   380: dup
    //   381: iconst_0
    //   382: aload_0
    //   383: getfield 40	com/tencent/mm/platformtools/k$b$a:cmh	Lcom/tencent/mm/platformtools/j;
    //   386: invokeinterface 90 1 0
    //   391: aastore
    //   392: invokestatic 159	com/tencent/mm/sdk/platformtools/u:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   395: aload_0
    //   396: getfield 40	com/tencent/mm/platformtools/k$b$a:cmh	Lcom/tencent/mm/platformtools/j;
    //   399: aload 5
    //   401: iconst_0
    //   402: invokeinterface 163 3 0
    //   407: aload_2
    //   408: ifnull +7 -> 415
    //   411: aload_2
    //   412: invokevirtual 168	java/io/InputStream:close	()V
    //   415: aload_3
    //   416: ifnull -396 -> 20
    //   419: aload_3
    //   420: invokevirtual 169	java/io/FileOutputStream:close	()V
    //   423: iconst_1
    //   424: ireturn
    //   425: astore_2
    //   426: ldc 49
    //   428: ldc -85
    //   430: iconst_1
    //   431: anewarray 4	java/lang/Object
    //   434: dup
    //   435: iconst_0
    //   436: aload_2
    //   437: invokestatic 176	com/tencent/mm/sdk/platformtools/ay:b	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   440: aastore
    //   441: invokestatic 178	com/tencent/mm/sdk/platformtools/u:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   444: iconst_1
    //   445: ireturn
    //   446: ldc 49
    //   448: ldc -66
    //   450: iconst_2
    //   451: anewarray 4	java/lang/Object
    //   454: dup
    //   455: iconst_0
    //   456: aload_0
    //   457: getfield 40	com/tencent/mm/platformtools/k$b$a:cmh	Lcom/tencent/mm/platformtools/j;
    //   460: invokeinterface 90 1 0
    //   465: aastore
    //   466: dup
    //   467: iconst_1
    //   468: aload_0
    //   469: getfield 25	com/tencent/mm/platformtools/k$b$a:cmg	I
    //   472: invokestatic 196	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   475: aastore
    //   476: invokestatic 199	com/tencent/mm/sdk/platformtools/u:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   479: aload_0
    //   480: getfield 40	com/tencent/mm/platformtools/k$b$a:cmh	Lcom/tencent/mm/platformtools/j;
    //   483: aload 4
    //   485: iconst_1
    //   486: invokeinterface 163 3 0
    //   491: aload_2
    //   492: ifnull +7 -> 499
    //   495: aload_2
    //   496: invokevirtual 168	java/io/InputStream:close	()V
    //   499: aload_3
    //   500: invokevirtual 169	java/io/FileOutputStream:close	()V
    //   503: new 73	java/lang/StringBuilder
    //   506: dup
    //   507: invokespecial 74	java/lang/StringBuilder:<init>	()V
    //   510: aload 6
    //   512: invokevirtual 77	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   515: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   518: ldc 83
    //   520: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   523: invokevirtual 86	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   526: invokestatic 203	com/tencent/mm/platformtools/k$b:ku	(Ljava/lang/String;)Landroid/graphics/Bitmap;
    //   529: astore_3
    //   530: aload_3
    //   531: ifnull +238 -> 769
    //   534: aload_0
    //   535: getfield 40	com/tencent/mm/platformtools/k$b$a:cmh	Lcom/tencent/mm/platformtools/j;
    //   538: aload_3
    //   539: getstatic 209	com/tencent/mm/platformtools/j$a:clV	Lcom/tencent/mm/platformtools/j$a;
    //   542: invokeinterface 212 3 0
    //   547: astore_2
    //   548: aload_2
    //   549: aload_3
    //   550: if_acmpeq +32 -> 582
    //   553: aload_3
    //   554: invokevirtual 217	android/graphics/Bitmap:isRecycled	()Z
    //   557: ifne +25 -> 582
    //   560: ldc 49
    //   562: ldc -37
    //   564: iconst_1
    //   565: anewarray 4	java/lang/Object
    //   568: dup
    //   569: iconst_0
    //   570: aload_3
    //   571: invokevirtual 220	java/lang/Object:toString	()Ljava/lang/String;
    //   574: aastore
    //   575: invokestatic 199	com/tencent/mm/sdk/platformtools/u:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   578: aload_3
    //   579: invokevirtual 223	android/graphics/Bitmap:recycle	()V
    //   582: getstatic 227	com/tencent/mm/platformtools/k$b:clZ	Lcom/tencent/mm/platformtools/k$b;
    //   585: aload_0
    //   586: getfield 40	com/tencent/mm/platformtools/k$b$a:cmh	Lcom/tencent/mm/platformtools/j;
    //   589: aload_2
    //   590: invokestatic 230	com/tencent/mm/platformtools/k$b:a	(Lcom/tencent/mm/platformtools/k$b;Lcom/tencent/mm/platformtools/j;Landroid/graphics/Bitmap;)V
    //   593: new 64	java/io/File
    //   596: dup
    //   597: new 73	java/lang/StringBuilder
    //   600: dup
    //   601: invokespecial 74	java/lang/StringBuilder:<init>	()V
    //   604: aload 6
    //   606: invokevirtual 77	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   609: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   612: ldc 83
    //   614: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   617: invokevirtual 86	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   620: invokespecial 69	java/io/File:<init>	(Ljava/lang/String;)V
    //   623: invokevirtual 233	java/io/File:delete	()Z
    //   626: pop
    //   627: aload_0
    //   628: aload_2
    //   629: putfield 27	com/tencent/mm/platformtools/k$b$a:bDT	Landroid/graphics/Bitmap;
    //   632: iconst_1
    //   633: ireturn
    //   634: astore_2
    //   635: ldc 49
    //   637: ldc -85
    //   639: iconst_1
    //   640: anewarray 4	java/lang/Object
    //   643: dup
    //   644: iconst_0
    //   645: aload_2
    //   646: invokestatic 176	com/tencent/mm/sdk/platformtools/ay:b	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   649: aastore
    //   650: invokestatic 178	com/tencent/mm/sdk/platformtools/u:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   653: goto -154 -> 499
    //   656: astore_2
    //   657: ldc 49
    //   659: ldc -85
    //   661: iconst_1
    //   662: anewarray 4	java/lang/Object
    //   665: dup
    //   666: iconst_0
    //   667: aload_2
    //   668: invokestatic 176	com/tencent/mm/sdk/platformtools/ay:b	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   671: aastore
    //   672: invokestatic 178	com/tencent/mm/sdk/platformtools/u:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   675: goto -172 -> 503
    //   678: astore_2
    //   679: ldc 49
    //   681: ldc -85
    //   683: iconst_1
    //   684: anewarray 4	java/lang/Object
    //   687: dup
    //   688: iconst_0
    //   689: aload_2
    //   690: invokestatic 176	com/tencent/mm/sdk/platformtools/ay:b	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   693: aastore
    //   694: invokestatic 178	com/tencent/mm/sdk/platformtools/u:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   697: goto -282 -> 415
    //   700: astore_2
    //   701: aconst_null
    //   702: astore_3
    //   703: aload 4
    //   705: ifnull +8 -> 713
    //   708: aload 4
    //   710: invokevirtual 168	java/io/InputStream:close	()V
    //   713: aload_3
    //   714: ifnull +7 -> 721
    //   717: aload_3
    //   718: invokevirtual 169	java/io/FileOutputStream:close	()V
    //   721: aload_2
    //   722: athrow
    //   723: astore 4
    //   725: ldc 49
    //   727: ldc -85
    //   729: iconst_1
    //   730: anewarray 4	java/lang/Object
    //   733: dup
    //   734: iconst_0
    //   735: aload 4
    //   737: invokestatic 176	com/tencent/mm/sdk/platformtools/ay:b	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   740: aastore
    //   741: invokestatic 178	com/tencent/mm/sdk/platformtools/u:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   744: goto -31 -> 713
    //   747: astore_3
    //   748: ldc 49
    //   750: ldc -85
    //   752: iconst_1
    //   753: anewarray 4	java/lang/Object
    //   756: dup
    //   757: iconst_0
    //   758: aload_3
    //   759: invokestatic 176	com/tencent/mm/sdk/platformtools/ay:b	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   762: aastore
    //   763: invokestatic 178	com/tencent/mm/sdk/platformtools/u:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   766: goto -45 -> 721
    //   769: aload_0
    //   770: getfield 40	com/tencent/mm/platformtools/k$b$a:cmh	Lcom/tencent/mm/platformtools/j;
    //   773: getstatic 209	com/tencent/mm/platformtools/j$a:clV	Lcom/tencent/mm/platformtools/j$a;
    //   776: aload 4
    //   778: invokeinterface 236 3 0
    //   783: aconst_null
    //   784: astore_2
    //   785: goto -237 -> 548
    //   788: astore_2
    //   789: ldc 49
    //   791: ldc -18
    //   793: iconst_1
    //   794: anewarray 4	java/lang/Object
    //   797: dup
    //   798: iconst_0
    //   799: aload_0
    //   800: getfield 40	com/tencent/mm/platformtools/k$b$a:cmh	Lcom/tencent/mm/platformtools/j;
    //   803: invokeinterface 90 1 0
    //   808: aastore
    //   809: invokestatic 159	com/tencent/mm/sdk/platformtools/u:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   812: ldc 49
    //   814: ldc -85
    //   816: iconst_1
    //   817: anewarray 4	java/lang/Object
    //   820: dup
    //   821: iconst_0
    //   822: aload_2
    //   823: invokestatic 176	com/tencent/mm/sdk/platformtools/ay:b	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   826: aastore
    //   827: invokestatic 178	com/tencent/mm/sdk/platformtools/u:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   830: aconst_null
    //   831: astore_2
    //   832: goto -205 -> 627
    //   835: astore_2
    //   836: goto -133 -> 703
    //   839: astore 5
    //   841: aload_2
    //   842: astore 4
    //   844: aload 5
    //   846: astore_2
    //   847: goto -144 -> 703
    //   850: astore 5
    //   852: aload_2
    //   853: astore 4
    //   855: aload 5
    //   857: astore_2
    //   858: goto -155 -> 703
    //   861: astore 4
    //   863: aconst_null
    //   864: astore_2
    //   865: aconst_null
    //   866: astore_3
    //   867: goto -514 -> 353
    //   870: astore 4
    //   872: aconst_null
    //   873: astore_2
    //   874: goto -521 -> 353
    //   877: astore 4
    //   879: goto -526 -> 353
    //   882: aconst_null
    //   883: astore_2
    //   884: goto -703 -> 181
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	887	0	this	a
    //   316	21	1	i	int
    //   122	129	2	localObject1	Object
    //   260	12	2	localIOException1	java.io.IOException
    //   281	131	2	localIOException2	java.io.IOException
    //   425	71	2	localIOException3	java.io.IOException
    //   547	82	2	localBitmap	Bitmap
    //   634	12	2	localIOException4	java.io.IOException
    //   656	12	2	localIOException5	java.io.IOException
    //   678	12	2	localIOException6	java.io.IOException
    //   700	22	2	localObject2	Object
    //   784	1	2	localObject3	Object
    //   788	35	2	localException1	Exception
    //   831	1	2	localObject4	Object
    //   835	7	2	localObject5	Object
    //   846	38	2	localObject6	Object
    //   79	639	3	localObject7	Object
    //   747	12	3	localIOException7	java.io.IOException
    //   866	1	3	localObject8	Object
    //   1	708	4	localObject9	Object
    //   723	54	4	localIOException8	java.io.IOException
    //   842	12	4	localObject10	Object
    //   861	1	4	localException2	Exception
    //   870	1	4	localException3	Exception
    //   877	1	4	localException4	Exception
    //   4	396	5	localObject11	Object
    //   839	6	5	localObject12	Object
    //   850	6	5	localObject13	Object
    //   47	14	6	localFile	java.io.File
    //   343	262	6	localException5	Exception
    //   93	89	7	locals	com.tencent.mm.network.s
    // Exception table:
    //   from	to	target	type
    //   254	258	260	java/io/IOException
    //   250	254	281	java/io/IOException
    //   191	207	343	java/lang/Exception
    //   211	246	343	java/lang/Exception
    //   303	310	343	java/lang/Exception
    //   310	317	343	java/lang/Exception
    //   322	340	343	java/lang/Exception
    //   446	491	343	java/lang/Exception
    //   419	423	425	java/io/IOException
    //   495	499	634	java/io/IOException
    //   499	503	656	java/io/IOException
    //   411	415	678	java/io/IOException
    //   22	80	700	finally
    //   708	713	723	java/io/IOException
    //   717	721	747	java/io/IOException
    //   503	530	788	java/lang/Exception
    //   534	548	788	java/lang/Exception
    //   553	582	788	java/lang/Exception
    //   582	627	788	java/lang/Exception
    //   769	783	788	java/lang/Exception
    //   80	144	835	finally
    //   144	181	835	finally
    //   181	191	839	finally
    //   191	207	839	finally
    //   211	246	839	finally
    //   303	310	839	finally
    //   310	317	839	finally
    //   322	340	839	finally
    //   446	491	839	finally
    //   353	407	850	finally
    //   22	80	861	java/lang/Exception
    //   80	144	870	java/lang/Exception
    //   144	181	870	java/lang/Exception
    //   181	191	877	java/lang/Exception
  }
  
  public final boolean ve()
  {
    try
    {
      z.a.bAt.K(cmg, 0);
      k.b.a(k.b.clZ, cmh.FG(), cmh.FH(), bDT);
      bDT = null;
      return false;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        u.e("!32@/B4Tb64lLpI9x0Y3l+KjNcgr8YiEJ3lN", "exception:%s", new Object[] { ay.b(localException) });
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.platformtools.k.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
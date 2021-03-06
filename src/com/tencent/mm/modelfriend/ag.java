package com.tencent.mm.modelfriend;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.bc.g;
import com.tencent.mm.sdk.h.j;
import com.tencent.mm.sdk.platformtools.v;

public final class ag
  extends j
{
  public static final String[] bkN = { "CREATE TABLE IF NOT EXISTS qqlist ( qq long  PRIMARY KEY , wexinstatus int  , groupid int  , username text  , nickname text  , pyinitial text  , quanpin text  , qqnickname text  , qqpyinitial text  , qqquanpin text  , qqremark text  , qqremarkpyinitial text  , qqremarkquanpin text  , reserved1 text  , reserved2 text  , reserved3 int  , reserved4 int  ) ", "CREATE INDEX IF NOT EXISTS groupid_index ON qqlist ( groupid ) ", "CREATE INDEX IF NOT EXISTS qq_index ON qqlist ( qq ) " };
  public final g bvG;
  
  public ag(g paramg)
  {
    bvG = paramg;
  }
  
  public final int a(long paramLong, af paramaf)
  {
    int i = 0;
    paramaf = paramaf.zt();
    if (paramaf.size() > 0) {
      i = bvG.update("qqlist", paramaf, "qq=?", new String[] { String.valueOf(paramLong) });
    }
    if (i > 0) {
      b(3, this, String.valueOf(paramLong));
    }
    return i;
  }
  
  public final boolean a(af paramaf)
  {
    if (paramaf == null) {}
    ContentValues localContentValues;
    do
    {
      return false;
      v.d("MicroMsg.QQListStorage", "insert: name:" + paramaf.zv());
      aqQ = -1;
      localContentValues = paramaf.zt();
    } while ((int)bvG.insert("qqlist", "qq", localContentValues) == -1);
    b(2, this, bGE);
    return true;
  }
  
  public final af aa(long paramLong)
  {
    af localaf = null;
    Object localObject = "select qqlist.qq,qqlist.wexinstatus,qqlist.groupid,qqlist.username,qqlist.nickname,qqlist.pyinitial,qqlist.quanpin,qqlist.qqnickname,qqlist.qqpyinitial,qqlist.qqquanpin,qqlist.qqremark,qqlist.qqremarkpyinitial,qqlist.qqremarkquanpin,qqlist.reserved1,qqlist.reserved2,qqlist.reserved3,qqlist.reserved4 from qqlist  where qqlist.qq = \"" + paramLong + "\"";
    localObject = bvG.rawQuery((String)localObject, null);
    if (localObject == null) {
      return null;
    }
    if (((Cursor)localObject).moveToFirst())
    {
      localaf = new af();
      localaf.b((Cursor)localObject);
    }
    ((Cursor)localObject).close();
    return localaf;
  }
  
  public final Cursor b(int paramInt, String paramString, boolean paramBoolean)
  {
    v.d("MicroMsg.QQListStorage", "getByGroupID: GroupID:" + paramInt + ", searchby:" + paramString);
    StringBuilder localStringBuilder = new StringBuilder();
    if (paramBoolean) {
      localStringBuilder.append("select qqlist.qq,qqlist.wexinstatus,qqlist.groupid,qqlist.username,qqlist.nickname,qqlist.pyinitial,qqlist.quanpin,qqlist.qqnickname,qqlist.qqpyinitial,qqlist.qqquanpin,qqlist.qqremark,qqlist.qqremarkpyinitial,qqlist.qqremarkquanpin,qqlist.reserved1,qqlist.reserved2,qqlist.reserved3,qqlist.reserved4 from qqlist  where qqlist.groupid = \"" + paramInt + "\" and ( ");
    }
    for (;;)
    {
      localStringBuilder.append("qqlist.qq like '%" + paramString + "%' or ");
      localStringBuilder.append("qqlist.username like '%" + paramString + "%' or ");
      localStringBuilder.append("qqlist.nickname like '%" + paramString + "%' or ");
      localStringBuilder.append("qqlist.pyinitial like '%" + paramString + "%' or ");
      localStringBuilder.append("qqlist.quanpin like '%" + paramString + "%' or ");
      localStringBuilder.append("qqlist.qqnickname like '%" + paramString + "%' or ");
      localStringBuilder.append("qqlist.qqpyinitial like '%" + paramString + "%' or ");
      localStringBuilder.append("qqlist.qqquanpin like '%" + paramString + "%' or ");
      localStringBuilder.append("qqlist.qqremark like '%" + paramString + "%' )");
      localStringBuilder.append(" order by reserved3");
      return bvG.rawQuery(localStringBuilder.toString(), null);
      localStringBuilder.append("select qqlist.qq,qqlist.wexinstatus,qqlist.groupid,qqlist.username,qqlist.nickname,qqlist.pyinitial,qqlist.quanpin,qqlist.qqnickname,qqlist.qqpyinitial,qqlist.qqquanpin,qqlist.qqremark,qqlist.qqremarkpyinitial,qqlist.qqremarkquanpin,qqlist.reserved1,qqlist.reserved2,qqlist.reserved3,qqlist.reserved4 from qqlist  where qqlist.groupid = \"" + paramInt + "\" and (wexinstatus =\"1" + "\" or wexinstatus =\"2" + "\") and ( ");
    }
  }
  
  public final boolean dN(int paramInt)
  {
    bool3 = false;
    bool2 = false;
    localObject3 = null;
    localObject1 = null;
    try
    {
      Cursor localCursor = bvG.rawQuery("select reserved3 from qqlist where groupid=? and reserved3=?  limit 1", new String[] { String.valueOf(paramInt), "0" });
      boolean bool1 = bool2;
      if (localCursor != null)
      {
        localObject1 = localCursor;
        localObject3 = localCursor;
        boolean bool4 = localCursor.moveToFirst();
        bool1 = bool2;
        if (bool4) {
          bool1 = true;
        }
      }
      bool2 = bool1;
      if (localCursor != null)
      {
        localCursor.close();
        bool2 = bool1;
      }
    }
    catch (Exception localException)
    {
      localObject3 = localObject1;
      v.e("MicroMsg.QQListStorage", "[cpan] check qq list show head faild.:%s", new Object[] { localException.toString() });
      bool2 = bool3;
      return false;
    }
    finally
    {
      if (localObject3 == null) {
        break label145;
      }
      ((Cursor)localObject3).close();
    }
    return bool2;
  }
  
  public final af hU(String paramString)
  {
    Object localObject = null;
    paramString = "select qqlist.qq,qqlist.wexinstatus,qqlist.groupid,qqlist.username,qqlist.nickname,qqlist.pyinitial,qqlist.quanpin,qqlist.qqnickname,qqlist.qqpyinitial,qqlist.qqquanpin,qqlist.qqremark,qqlist.qqremarkpyinitial,qqlist.qqremarkquanpin,qqlist.reserved1,qqlist.reserved2,qqlist.reserved3,qqlist.reserved4 from qqlist  where qqlist.username = \"" + paramString + "\"";
    Cursor localCursor = bvG.rawQuery(paramString, null);
    if (localCursor == null) {
      return null;
    }
    paramString = (String)localObject;
    if (localCursor.moveToFirst())
    {
      paramString = new af();
      paramString.b(localCursor);
    }
    localCursor.close();
    return paramString;
  }
  
  public final Cursor q(int paramInt, boolean paramBoolean)
  {
    String str;
    String[] arrayOfString;
    if (paramBoolean)
    {
      str = "select qqlist.qq,qqlist.wexinstatus,qqlist.groupid,qqlist.username,qqlist.nickname,qqlist.pyinitial,qqlist.quanpin,qqlist.qqnickname,qqlist.qqpyinitial,qqlist.qqquanpin,qqlist.qqremark,qqlist.qqremarkpyinitial,qqlist.qqremarkquanpin,qqlist.reserved1,qqlist.reserved2,qqlist.reserved3,qqlist.reserved4 from qqlist  where qqlist.groupid=?  order by reserved3";
      arrayOfString = new String[1];
      arrayOfString[0] = String.valueOf(paramInt);
    }
    for (;;)
    {
      return bvG.rawQuery(str, arrayOfString);
      str = "select qqlist.qq,qqlist.wexinstatus,qqlist.groupid,qqlist.username,qqlist.nickname,qqlist.pyinitial,qqlist.quanpin,qqlist.qqnickname,qqlist.qqpyinitial,qqlist.qqquanpin,qqlist.qqremark,qqlist.qqremarkpyinitial,qqlist.qqremarkquanpin,qqlist.reserved1,qqlist.reserved2,qqlist.reserved3,qqlist.reserved4 from qqlist  where qqlist.groupid=? and (wexinstatus=? or wexinstatus=?) order by reserved3";
      arrayOfString = new String[3];
      arrayOfString[0] = String.valueOf(paramInt);
      arrayOfString[1] = "1";
      arrayOfString[2] = "2";
    }
  }
  
  protected final boolean yH()
  {
    boolean bool = true;
    if ((bvG == null) || (bvG.bbc())) {
      if (bvG != null) {
        break label48;
      }
    }
    label48:
    for (Object localObject = "null";; localObject = Boolean.valueOf(bvG.bbc()))
    {
      v.w("MicroMsg.QQListStorage", "shouldProcessEvent db is close :%s", new Object[] { localObject });
      bool = false;
      return bool;
    }
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.modelfriend.ag
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */
package com.example.asus.news.util;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.example.asus.news.topic.model.WbTopBean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "WB_TOP_BEAN".
*/
public class WbTopBeanDao extends AbstractDao<WbTopBean, Void> {

    public static final String TABLENAME = "WB_TOP_BEAN";

    /**
     * Properties of entity WbTopBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, String.class, "id", false, "ID");
        public final static Property Name = new Property(1, String.class, "name", false, "NAME");
        public final static Property Icon = new Property(2, String.class, "icon", false, "ICON");
        public final static Property Picurl = new Property(3, String.class, "picurl", false, "PICURL");
        public final static Property CreateTime = new Property(4, int.class, "createTime", false, "CREATE_TIME");
        public final static Property UpdateTime = new Property(5, int.class, "updateTime", false, "UPDATE_TIME");
    }


    public WbTopBeanDao(DaoConfig config) {
        super(config);
    }
    
    public WbTopBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"WB_TOP_BEAN\" (" + //
                "\"ID\" TEXT," + // 0: id
                "\"NAME\" TEXT," + // 1: name
                "\"ICON\" TEXT," + // 2: icon
                "\"PICURL\" TEXT," + // 3: picurl
                "\"CREATE_TIME\" INTEGER NOT NULL ," + // 4: createTime
                "\"UPDATE_TIME\" INTEGER NOT NULL );"); // 5: updateTime
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"WB_TOP_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, WbTopBean entity) {
        stmt.clearBindings();
 
        String id = entity.getId();
        if (id != null) {
            stmt.bindString(1, id);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
 
        String icon = entity.getIcon();
        if (icon != null) {
            stmt.bindString(3, icon);
        }
 
        String picurl = entity.getPicurl();
        if (picurl != null) {
            stmt.bindString(4, picurl);
        }
        stmt.bindLong(5, entity.getCreateTime());
        stmt.bindLong(6, entity.getUpdateTime());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, WbTopBean entity) {
        stmt.clearBindings();
 
        String id = entity.getId();
        if (id != null) {
            stmt.bindString(1, id);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
 
        String icon = entity.getIcon();
        if (icon != null) {
            stmt.bindString(3, icon);
        }
 
        String picurl = entity.getPicurl();
        if (picurl != null) {
            stmt.bindString(4, picurl);
        }
        stmt.bindLong(5, entity.getCreateTime());
        stmt.bindLong(6, entity.getUpdateTime());
    }

    @Override
    public Void readKey(Cursor cursor, int offset) {
        return null;
    }    

    @Override
    public WbTopBean readEntity(Cursor cursor, int offset) {
        WbTopBean entity = new WbTopBean( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // name
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // icon
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // picurl
            cursor.getInt(offset + 4), // createTime
            cursor.getInt(offset + 5) // updateTime
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, WbTopBean entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setIcon(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setPicurl(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setCreateTime(cursor.getInt(offset + 4));
        entity.setUpdateTime(cursor.getInt(offset + 5));
     }
    
    @Override
    protected final Void updateKeyAfterInsert(WbTopBean entity, long rowId) {
        // Unsupported or missing PK type
        return null;
    }
    
    @Override
    public Void getKey(WbTopBean entity) {
        return null;
    }

    @Override
    public boolean hasKey(WbTopBean entity) {
        // TODO
        return false;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}

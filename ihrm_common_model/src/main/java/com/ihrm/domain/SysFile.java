package com.ihrm.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @author qinshiji
 * @date 2020/1/9 15:54
 */
@Entity
@Table(name = "sys_file")
public class SysFile {
    private String id;
    private String fileName;
    private String path;
    private String uuidName;
    private Byte type;
    private Timestamp createTime;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "file_name")
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Basic
    @Column(name = "path")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Basic
    @Column(name = "uuid_name")
    public String getUuidName() {
        return uuidName;
    }

    public void setUuidName(String uuidName) {
        this.uuidName = uuidName;
    }

    @Basic
    @Column(name = "type")
    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    @Basic
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysFile sysFile = (SysFile) o;
        return Objects.equals(id, sysFile.id) &&
                Objects.equals(fileName, sysFile.fileName) &&
                Objects.equals(path, sysFile.path) &&
                Objects.equals(uuidName, sysFile.uuidName) &&
                Objects.equals(type, sysFile.type) &&
                Objects.equals(createTime, sysFile.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fileName, path, uuidName, type, createTime);
    }
}

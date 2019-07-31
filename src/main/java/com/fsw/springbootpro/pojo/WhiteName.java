package com.fsw.springbootpro.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class WhiteName implements Serializable {
    private Integer index;

    private String companyName;

    private String name;

    private String sex;

    private Date birthday;

    private String idType;

    private String idNo;

    private static final long serialVersionUID = 1L;

    public WhiteName(Integer index, String companyName, String name, String sex, Date birthday, String idType, String idNo) {
        this.index = index;
        this.companyName = companyName;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.idType = idType;
        this.idNo = idNo;
    }

    public WhiteName() {
        super();
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType == null ? null : idType.trim();
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo == null ? null : idNo.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", index=").append(index);
        sb.append(", companyName=").append(companyName);
        sb.append(", name=").append(name);
        sb.append(", sex=").append(sex);
        sb.append(", birthday=").append(birthday);
        sb.append(", idType=").append(idType);
        sb.append(", idNo=").append(idNo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WhiteName whiteName = (WhiteName) o;
        return Objects.equals(index, whiteName.index) &&
                Objects.equals(companyName, whiteName.companyName) &&
                Objects.equals(name, whiteName.name) &&
                Objects.equals(sex, whiteName.sex) &&
                Objects.equals(birthday, whiteName.birthday) &&
                Objects.equals(idType, whiteName.idType) &&
                Objects.equals(idNo, whiteName.idNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, companyName, name, sex, birthday, idType, idNo);
    }
}
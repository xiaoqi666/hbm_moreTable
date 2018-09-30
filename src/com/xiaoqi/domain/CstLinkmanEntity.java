package com.xiaoqi.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "cst_linkman", schema = "xiaoqi")
public class CstLinkmanEntity {
    private long lkmId;
    private String lkmName;
    private String lkmGender;
    private String lkmPhone;
    private String lkmMobile;
    private String lkmEmail;
    private String lkmQq;
    private String lkmPosition;
    private String lkmMemo;

    //    表达多对一配置
    private CustomerEntity customerEntity;

    public CustomerEntity getCustomerEntity() {
        return customerEntity;
    }

    public void setCustomerEntity(CustomerEntity customerEntity) {
        this.customerEntity = customerEntity;
    }

    @Id
    @Column(name = "lkm_id", nullable = false)
    public long getLkmId() {
        return lkmId;
    }

    public void setLkmId(long lkmId) {
        this.lkmId = lkmId;
    }

    @Basic
    @Column(name = "lkm_name", nullable = true, length = 16)
    public String getLkmName() {
        return lkmName;
    }

    public void setLkmName(String lkmName) {
        this.lkmName = lkmName;
    }

    @Basic
    @Column(name = "lkm_gender", nullable = true, length = 1)
    public String getLkmGender() {
        return lkmGender;
    }

    public void setLkmGender(String lkmGender) {
        this.lkmGender = lkmGender;
    }

    @Basic
    @Column(name = "lkm_phone", nullable = true, length = 16)
    public String getLkmPhone() {
        return lkmPhone;
    }

    public void setLkmPhone(String lkmPhone) {
        this.lkmPhone = lkmPhone;
    }

    @Basic
    @Column(name = "lkm_mobile", nullable = true, length = 16)
    public String getLkmMobile() {
        return lkmMobile;
    }

    public void setLkmMobile(String lkmMobile) {
        this.lkmMobile = lkmMobile;
    }

    @Basic
    @Column(name = "lkm_email", nullable = true, length = 64)
    public String getLkmEmail() {
        return lkmEmail;
    }

    public void setLkmEmail(String lkmEmail) {
        this.lkmEmail = lkmEmail;
    }

    @Basic
    @Column(name = "lkm_qq", nullable = true, length = 16)
    public String getLkmQq() {
        return lkmQq;
    }

    public void setLkmQq(String lkmQq) {
        this.lkmQq = lkmQq;
    }

    @Basic
    @Column(name = "lkm_position", nullable = true, length = 16)
    public String getLkmPosition() {
        return lkmPosition;
    }

    public void setLkmPosition(String lkmPosition) {
        this.lkmPosition = lkmPosition;
    }

    @Basic
    @Column(name = "lkm_memo", nullable = true, length = 512)
    public String getLkmMemo() {
        return lkmMemo;
    }

    public void setLkmMemo(String lkmMemo) {
        this.lkmMemo = lkmMemo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CstLinkmanEntity that = (CstLinkmanEntity) o;
        return lkmId == that.lkmId &&
                Objects.equals(lkmName, that.lkmName) &&
                Objects.equals(lkmGender, that.lkmGender) &&
                Objects.equals(lkmPhone, that.lkmPhone) &&
                Objects.equals(lkmMobile, that.lkmMobile) &&
                Objects.equals(lkmEmail, that.lkmEmail) &&
                Objects.equals(lkmQq, that.lkmQq) &&
                Objects.equals(lkmPosition, that.lkmPosition) &&
                Objects.equals(lkmMemo, that.lkmMemo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lkmId, lkmName, lkmGender, lkmPhone, lkmMobile, lkmEmail, lkmQq, lkmPosition, lkmMemo);
    }
}

package com.clt.intel.bean;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column intel_user.user_id
     *
     * @mbggenerated Wed Jun 15 14:32:14 CST 2016
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column intel_user.account
     *
     * @mbggenerated Wed Jun 15 14:32:14 CST 2016
     */
    private String account;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column intel_user.accountfrom
     *
     * @mbggenerated Wed Jun 15 14:32:14 CST 2016
     */
    private Long accountfrom;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column intel_user.accountName
     *
     * @mbggenerated Wed Jun 15 14:32:14 CST 2016
     */
    private String accountname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column intel_user.pasw
     *
     * @mbggenerated Wed Jun 15 14:32:14 CST 2016
     */
    private String pasw;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column intel_user.tel
     *
     * @mbggenerated Wed Jun 15 14:32:14 CST 2016
     */
    private String tel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column intel_user.c_date
     *
     * @mbggenerated Wed Jun 15 14:32:14 CST 2016
     */
    private Date cDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column intel_user.c_accout
     *
     * @mbggenerated Wed Jun 15 14:32:14 CST 2016
     */
    private String cAccout;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column intel_user.u_date
     *
     * @mbggenerated Wed Jun 15 14:32:14 CST 2016
     */
    private Date uDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column intel_user.u_account
     *
     * @mbggenerated Wed Jun 15 14:32:14 CST 2016
     */
    private String uAccount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column intel_user.status
     *
     * @mbggenerated Wed Jun 15 14:32:14 CST 2016
     */
    private Long status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table intel_user
     *
     * @mbggenerated Wed Jun 15 14:32:14 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column intel_user.user_id
     *
     * @return the value of intel_user.user_id
     *
     * @mbggenerated Wed Jun 15 14:32:14 CST 2016
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column intel_user.user_id
     *
     * @param userId the value for intel_user.user_id
     *
     * @mbggenerated Wed Jun 15 14:32:14 CST 2016
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column intel_user.account
     *
     * @return the value of intel_user.account
     *
     * @mbggenerated Wed Jun 15 14:32:14 CST 2016
     */
    public String getAccount() {
        return account;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column intel_user.account
     *
     * @param account the value for intel_user.account
     *
     * @mbggenerated Wed Jun 15 14:32:14 CST 2016
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column intel_user.accountfrom
     *
     * @return the value of intel_user.accountfrom
     *
     * @mbggenerated Wed Jun 15 14:32:14 CST 2016
     */
    public Long getAccountfrom() {
        return accountfrom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column intel_user.accountfrom
     *
     * @param accountfrom the value for intel_user.accountfrom
     *
     * @mbggenerated Wed Jun 15 14:32:14 CST 2016
     */
    public void setAccountfrom(Long accountfrom) {
        this.accountfrom = accountfrom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column intel_user.accountName
     *
     * @return the value of intel_user.accountName
     *
     * @mbggenerated Wed Jun 15 14:32:14 CST 2016
     */
    public String getAccountname() {
        return accountname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column intel_user.accountName
     *
     * @param accountname the value for intel_user.accountName
     *
     * @mbggenerated Wed Jun 15 14:32:14 CST 2016
     */
    public void setAccountname(String accountname) {
        this.accountname = accountname == null ? null : accountname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column intel_user.pasw
     *
     * @return the value of intel_user.pasw
     *
     * @mbggenerated Wed Jun 15 14:32:14 CST 2016
     */
    public String getPasw() {
        return pasw;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column intel_user.pasw
     *
     * @param pasw the value for intel_user.pasw
     *
     * @mbggenerated Wed Jun 15 14:32:14 CST 2016
     */
    public void setPasw(String pasw) {
        this.pasw = pasw == null ? null : pasw.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column intel_user.tel
     *
     * @return the value of intel_user.tel
     *
     * @mbggenerated Wed Jun 15 14:32:14 CST 2016
     */
    public String getTel() {
        return tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column intel_user.tel
     *
     * @param tel the value for intel_user.tel
     *
     * @mbggenerated Wed Jun 15 14:32:14 CST 2016
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column intel_user.c_date
     *
     * @return the value of intel_user.c_date
     *
     * @mbggenerated Wed Jun 15 14:32:14 CST 2016
     */
    public Date getcDate() {
        return cDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column intel_user.c_date
     *
     * @param cDate the value for intel_user.c_date
     *
     * @mbggenerated Wed Jun 15 14:32:14 CST 2016
     */
    public void setcDate(Date cDate) {
        this.cDate = cDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column intel_user.c_accout
     *
     * @return the value of intel_user.c_accout
     *
     * @mbggenerated Wed Jun 15 14:32:14 CST 2016
     */
    public String getcAccout() {
        return cAccout;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column intel_user.c_accout
     *
     * @param cAccout the value for intel_user.c_accout
     *
     * @mbggenerated Wed Jun 15 14:32:14 CST 2016
     */
    public void setcAccout(String cAccout) {
        this.cAccout = cAccout == null ? null : cAccout.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column intel_user.u_date
     *
     * @return the value of intel_user.u_date
     *
     * @mbggenerated Wed Jun 15 14:32:14 CST 2016
     */
    public Date getuDate() {
        return uDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column intel_user.u_date
     *
     * @param uDate the value for intel_user.u_date
     *
     * @mbggenerated Wed Jun 15 14:32:14 CST 2016
     */
    public void setuDate(Date uDate) {
        this.uDate = uDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column intel_user.u_account
     *
     * @return the value of intel_user.u_account
     *
     * @mbggenerated Wed Jun 15 14:32:14 CST 2016
     */
    public String getuAccount() {
        return uAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column intel_user.u_account
     *
     * @param uAccount the value for intel_user.u_account
     *
     * @mbggenerated Wed Jun 15 14:32:14 CST 2016
     */
    public void setuAccount(String uAccount) {
        this.uAccount = uAccount == null ? null : uAccount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column intel_user.status
     *
     * @return the value of intel_user.status
     *
     * @mbggenerated Wed Jun 15 14:32:14 CST 2016
     */
    public Long getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column intel_user.status
     *
     * @param status the value for intel_user.status
     *
     * @mbggenerated Wed Jun 15 14:32:14 CST 2016
     */
    public void setStatus(Long status) {
        this.status = status;
    }
}
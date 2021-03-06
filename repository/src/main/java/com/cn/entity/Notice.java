package com.cn.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 公告表
 *
 * @author chen
 * @date 2017-12-30 17:36
 */
@Data
@Entity
@Table(name = "notice")
public class Notice extends UserDateAudit{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id")
    private Long id;
    private String title;     //公告标题
    private String content;   //公告内容
    private String noticeType;//公告类型 暂不用
    private Date beginTime;   //展示开始时间
    private Date endTime;     //展示结束时间

}

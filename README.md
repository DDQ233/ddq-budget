# 工程简介

这是一个简单的记账Web应用。

<br>

---

# 数据库设计

## 数据库配置

- 数据库选型：MongoDB v4.4.5
- 绑定IP地址：0.0.0.0
- 绑定端口号：27099
- 部署方式：本地部署

## 数据库结构设计

数据库名：**ddq-budget**。

集合1：**record**

|字段|类型|说明|
|:---:|:---:|:---:|
|item|String|项目|
|amount|Decimal128|金额|
|type|String|金额类型|
|account|String|账户|
|classify|String|分类|
|tag|Array|标签|
|date|Date|记录日期|
|remark|String|备注|

<br>

集合2：**account**

|字段|类型|备注|
|:---:|:---:|:---:|
|account|String|账户|
|balance|Decimal128|余额|
|remark|String|备注|

<br>

---

# 方法设计




<br>

---

# 接口设计



<br>

---


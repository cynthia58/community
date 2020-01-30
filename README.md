## 码匠社区

## 资料
[Spring文档](https://spring.io/guides) <br/>
[Spring Web](https://spring.io/guides/gs/serving-web-content/) <br/>
[ES](https://elasticsearch.cn/explore) <br/>
[Github deploy key](https://developer.github.com/v3/guides/managing-deploy-keys) <br/>
[项目演示](http://www.mawen.co/) <br/>
[Github OAuth](https://developer.github.com/apps/building-oauth-apps/creating-an-oauth-app/) <br/>
[Bootstrap](https://v3.bootcss.com/getting-started/) <br/>
[Spring](https://docs.spring.io/spring-boot/docs/2.0.0.RC1/reference/htmlsingle/#boot-features-embedded-database-support) <br/>
[菜鸟教程](https://www.runoob.com/mysql/mysql-insert-query.html) <br/>
[Thymeleaf](https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html#setting-attribute-values)

## 工具
[Git](https://git-scm.com/download) <br/>
[Visual Paradigm](https://www.visual-paradigm.com/cn/) <br/>
[OkHttp](https://square.github.io/okhttp/) <br/>
[Flyway](https://flywaydb.org/getstarted/firststeps/maven) <br/>
[Lombok](https://projectlombok.org)

## 脚本
```sql
create table USER
(
	ID INTEGER AUTO_INCREMENT PRIMARY KEY NOT NULL,
	ACCOUNT_ID VARCHAR(100),
	NAME VARCHAR(50),
	TOKEN CHAR(36),
	GMT_CREATE BIGINT,
	GMT_MODIFIED BIGINT
);
```

```bash
mvn flyway:migrate
```

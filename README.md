Hackpad Converter
==============

##主旨
解析 hackpad 內容，自動轉發到各平台上(ex. tumblr)。

##功能
可以設置 padIds 讀取 hackpad 上的 pads ，自動轉發到 tumblr上。

##使用方式

* 增加 api_keys.txt
	* 第一行為讀取 hackpad 所必需，需要 Client ID 與 Secret，在 setting 可以找到。
	* 第二行為使用 tumblr 所必需，為 Cunsumer Key 與 Cunsumer Secret。
	* 第三行為使用 tumblr 所必需，為 Token Key 與 Token Secret。
* 增加 pads.txt，為想要轉發 pad 的 padid 。

##使用的jar

* [jdk 1.6](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
* [jersey-1.17.1](http://jersey.java.net/index.html)
* [oauth-client-1.17.1](http://mvnrepository.com/artifact/com.sun.jersey.contribs.jersey-oauth/oauth-client)
* [oauth-signature-1.17.1](http://mvnrepository.com/artifact/com.sun.jersey.contribs.jersey-oauth/oauth-signature)
* [jumblr-0.0.6](https://github.com/tumblr/jumblr)
* [gson-2.2.4](https://code.google.com/p/google-gson/downloads/detail?name=google-gson-2.2.4-release.zip&can=2&q=)
* [scribe-1.3.5](http://mvnrepository.com/artifact/org.scribe/scribe/1.3.5)


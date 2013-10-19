Hackpad Converter
==============

#主旨
解析 hackpad 內容，自動轉發到各平台上(ex. tumblr)。

#功能
可以設置 padIds 讀取 hackpad 上的 pads ，自動轉發到 tumblr上。

#使用方式

* 增加 api_keys.txt
	* 第一行為讀取 hackpad 所必需，需要 Client ID 與 Secret，在 setting 可以找到。
	* 第二行為使用 tumblr 所必需，為 Cunsumer Key 與 Cunsumer Secret。
	* 第三行為使用 tumblr 所必需，為 Token Key 與 Token Secret。
* 增加 pads.txt，為想要轉發 pad 的 padid 。

#Maven

* Using Hackpad Java API - [Jackpad](https://github.com/jessy1092/jackpad)

#License

The code is available at github project under [MIT License](https://github.com/jessy1092/Hackpad-Converter/blob/master/LICENSE)

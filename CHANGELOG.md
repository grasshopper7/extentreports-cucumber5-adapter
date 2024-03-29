# Changelog
All notable changes to this project will be documented in this file.

# 2.17.0 (2023-8-10)

* Updated extent report version
* Updated java version to 11
* Updated dependencies version

# 2.15.0 (2022-11-14)

* Add support for status filter for html report
* Updated pdf report data collector version to 2.9.1

# 2.14.3 (2022-11-11)

* Add support for status filter for pdf report [Issue 37](https://github.com/grasshopper7/extentreports-cucumber5-adapter/issues/37)

# 2.14.2 (2022-11-10)

* Add support for status filter for Spark report [Issue 36](https://github.com/grasshopper7/extentreports-cucumber5-adapter/issues/36)

# 2.14.1 (2022-11-07)

* Updated pdf report data collector version to 2.8.0

# 2.14.0 (2022-11-05)

* Add device and author information as tags
* Base folder report name custom delimiter setting

# 2.13.1 (2022-11-02)

* Fixed tag count & test display for scenario outline [Issue 35](https://github.com/grasshopper7/extentreports-cucumber5-adapter/issues/35)

# 2.12.1 (2022-6-19)

* Updated pdf report data collector version to 2.7.0

# 2.12.0 (2022-6-11)

* Updated pdf report data collector version to 2.6.0

# 2.11.1 (2022-05-11)

* Updated pdf report data collector version to 2.5.1

# 2.11.0 (2022-05-09)

* Updated pdf report data collector version to 2.5.0

# 2.10.5 (2022-04-26)

* Updated pdf report data collector version to 2.4.1

# 2.10.4 (2022-04-23)

* Updated pdf report data collector version to 2.4.0

# 2.10.3 (2022-04-12)

* Updated pdf report data collector version to 2.3.0

# 2.10.2 (2022-04-09)
* Updated HTML extent report version

# 2.10.1 (2022-03-06)

* Updated version for maven replication issues

# 2.10.0 (2022-03-06)

* Updated pdf report data collector version to 2.1.0

# 2.9.0 (2022-01-16)

* Add HTMLExtentReporter to adapter [Issue 32](https://github.com/grasshopper7/extentreports-cucumber5-adapter/issues/32)

# 2.8.4 (2021-09-14)

* Updated pdf report data collector version to 1.7.4

# 2.8.3 (2021-08-3)

* Remove temporary base64 images for pdf [Issue 31](https://github.com/grasshopper7/extentreports-cucumber5-adapter/issues/31)
* Updated pdf reporter version to 2.2.4

# 2.8.2 (2021-06-12)

* Updated pdf reporter version to 2.2.3

# 2.8.1 (2021-04-20)

* Updated pdf reporter version to 2.2.1

# 2.8.0 (2021-04-16)

* Store step pending status exception stacktrace [Issue 29](https://github.com/grasshopper7/extentreports-cucumber6-adapter/issues/29)
* Updated extentreport version to 5.0.6
* Updated pdf reporter version to 2.2.0

# 2.7.0 (2021-03-10)

* Incorrect scenario count for tags\categories [Issue 33](https://github.com/grasshopper7/extentreports-cucumber6-adapter/issues/33)

# 2.6.0 (2020-12-13)

* Support to attach base64 images [Issue 27](https://github.com/grasshopper7/extentreports-cucumber5-adapter/issues/27)

# 2.5.0 (2020-11-19)

* Support dialect in adapter [Issue 26](https://github.com/grasshopper7/extentreports-cucumber5-adapter/issues/26)
* Upgrade extentreport version
* Upgrade pdf reporter version

# 2.4.0 (2020-11-05)

* Klov reporter initialization fails with NPE [Issue 24](https://github.com/grasshopper7/extentreports-cucumber5-adapter/issues/24)
* Parallel execution does not work for junit runner [Issue 23](https://github.com/grasshopper7/extentreports-cucumber5-adapter/issues/23)
* Fail pending step in strict mode [Issue 17](https://github.com/grasshopper7/extentreports-cucumber5-adapter/issues/17)
* Upgrade pdf reporter version

## 2.3.0 (2020-10-24)

* "Passed" Step duration not correct when multiple logs are attached [Issue 22](https://github.com/grasshopper7/extentreports-cucumber5-adapter/issues/22)

## 2.1.0 (2020-10-21)

* Option to customize opening tab of spark report [Issue 21](https://github.com/grasshopper7/extentreports-cucumber5-adapter/issues/21)
* Add support for pdf reporter [Issue 20](https://github.com/grasshopper7/extentreports-cucumber5-adapter/issues/20)
* Ability to determine hook type [Issue 19](https://github.com/grasshopper7/extentreports-cucumber5-adapter/issues/19)
* Add support for parametrized scenario outline names [Issue 18](https://github.com/grasshopper7/extentreports-cucumber5-adapter/issues/18)

## 2.0.0 (2020-09-06)

* Upgrade adapter to support extent version 5 [Issue 11](https://github.com/grasshopper7/extentreports-cucumber5-adapter/issues/11)

## 1.5.1 (2020-08-11)

* Refactor exception to fine grained in URLOutputSteam [Issue 14](https://github.com/grasshopper7/extentreports-cucumber5-adapter/issues/14)

## 1.5.0 (2020-08-10)

* Add date and time to report folders [Issue 12](https://github.com/grasshopper7/extentreports-cucumber5-adapter/issues/12)
* Fix report folder name issue [Issue 13](https://github.com/grasshopper7/extentreports-cucumber5-adapter/issues/13)

## 1.4.0 (2020-07-21)

* Support for Json formatter [Issue 7](https://github.com/grasshopper7/extentreports-cucumber5-adapter/issues/7)
* Fixed docstring display [Issue 8](https://github.com/grasshopper7/extentreports-cucumber5-adapter/issues/8)

## 1.3.2 (2020-06-03)

* Bug fix for missing screenshot 

## 1.3.1 (2020-05-14)

* Minor bug fix used String.value

## 1.3.0 (2020-05-12)

* Support for reading system info from extent.properties & maven cmd [Issue 4](https://github.com/grasshopper7/extentreports-cucumber5-adapter/issues/4)

## 1.2.0 (2020-04-22)

* Added support for strict=true option [Issue 3](https://github.com/grasshopper7/extentreports-cucumber5-adapter/issues/3)

## 1.1.0 (2020-04-21)

* Updated extentreports version to 4.1.5
* Fixed issue with undefined steps displayed as passed [Issue 1](https://github.com/grasshopper7/extentreports-cucumber5-adapter/issues/1)
* Partly fixed issue with hooks getting displayed [Issue 2](https://github.com/grasshopper7/extentreports-cucumber5-adapter/issues/2)

## 1.0.0 (2020-03-22)

* Released based on extentreports-cucumber4-adapter

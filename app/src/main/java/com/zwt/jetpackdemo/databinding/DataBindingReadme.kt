package com.zwt.jetpackdemo.databinding

/**
 *
 * @Author:         wentaozhang
 * @CreateDate:     2022/1/25 10:21 上午
 * @Email：zhangwentao01@tojoy.com
 */
class DataBindingReadme {
    /**
     * 使用databinding 需在module中 build.gradle 中添加
     * dataBinding {enabled = true}
     *
     * 如果在kotlin工程中使用须做如下配置
     *
     * 1.现在项目中的gradle中添加
     *  classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version"
     *
     * 2.在module中的gradle中添加
     *  plugins {id 'kotlin-kapt'}
     *
     *  kapt {generateStubs = true}
     *
     *  dependencies {kapt "com.android.databinding:compiler:$android_plugin_version"}
     *
     *
     *
     *
     *
     *
     */
}
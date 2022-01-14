/**一定要导入包，否则会报错*/
package com.jingju.plugin
import org.gradle.api.Plugin
import org.gradle.api.Project
class TestPlugin implements  Plugin<Project>{


    @Override
    void apply(Project project) {

        println("tst plugin ")

    }
}
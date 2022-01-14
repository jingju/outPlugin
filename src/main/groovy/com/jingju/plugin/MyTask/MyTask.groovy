/**一定要导入包，否则会报错*/
package com.jingju.plugin.MyTask
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class MyTask extends DefaultTask{
    private Integer a;

    @TaskAction
    void justPrint(){
        println("just a print Action")
    }


}
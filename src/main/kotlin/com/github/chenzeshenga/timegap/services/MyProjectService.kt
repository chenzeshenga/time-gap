package com.github.chenzeshenga.timegap.services

import com.github.chenzeshenga.timegap.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

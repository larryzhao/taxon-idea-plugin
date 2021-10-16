package com.github.larryzhao.taxonideaplugin.services

import com.intellij.openapi.project.Project
import com.github.larryzhao.taxonideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

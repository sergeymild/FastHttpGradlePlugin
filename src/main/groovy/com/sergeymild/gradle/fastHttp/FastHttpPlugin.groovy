package com.sergeymild.gradle.fastHttp

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Created by user on 19/08/16.
 */
class FastHttpPlugin implements Plugin<Project> {
    FastHttpPluginExtension mExtension
    StringBuilder mTaskLogBuilder

    void apply(Project project) {

        mTaskLogBuilder = new StringBuilder()
        mExtension = project.extensions.create('fastHttp', FastHttpPluginExtension)

        project.dependencies {
            compile fileTree(dir: 'libs', include: ['fasthttplibrary.jar'])
        }
    }
}

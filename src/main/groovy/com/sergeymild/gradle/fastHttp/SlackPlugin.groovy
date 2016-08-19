package com.sergeymild.gradle.fastHttp

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Created by user on 19/08/16.
 */
class SlackPlugin implements Plugin<Project> {
    SlackPluginExtension mExtension
    StringBuilder mTaskLogBuilder

    void apply(Project project) {

        mTaskLogBuilder = new StringBuilder()
        mExtension = project.extensions.create('fastHttp', SlackPluginExtension)

        project.dependencies {
            compile fileTree(dir: 'libs', include: ['fasthttplibrary.jar'])
        }
    }
}

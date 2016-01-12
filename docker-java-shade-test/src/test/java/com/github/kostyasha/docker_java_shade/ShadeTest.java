package com.github.kostyasha.docker_java_shade;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Kanstantsin Shautsou
 */
public class ShadeTest {
    private static final Logger LOG = LoggerFactory.getLogger(ShadeTest.class);

    @Test
    public void testShading() {
        final shade1.com.github.dockerjava.api.DockerClient dockerClient1 = shade1.com.github.dockerjava.core.DockerClientBuilder.getInstance().build();
        final shade2.com.github.dockerjava.api.DockerClient dockerClient2 = shade2.com.github.dockerjava.core.DockerClientBuilder.getInstance().build();

        final shade1.com.github.dockerjava.api.model.Info exec1 = dockerClient1.infoCmd().exec();

        final shade2.com.github.dockerjava.api.model.Info exec2 = dockerClient2.infoCmd().exec();

    }
}

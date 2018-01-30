package com.github.ompc.greys.core;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.net.InetSocketAddress;

import static com.google.common.truth.Truth.assertThat;

@RunWith(JUnit4.class)
public class GreysLauncherTest {

    @Test
    public void greysLauncherMainTest() throws Exception {
        GreysLauncher greysLauncher = new GreysLauncher(new String[]{"-p=10062",
                "-t=127.0.0.1:3658",
                "-c=/Users/lilizhao/.greys/lib/1.7.6.6/greys/greys-core.jar",
                "-a=/Users/lilizhao/.greys/lib/1.7.6.6/greys/greys-agent.jar"});
        assertThat(greysLauncher).isNotEqualTo(null);
        GreysConsole greysConsole = new GreysConsole(new InetSocketAddress("127.0.0.1", 3658));
//        assertThat(greysConsole).isNotEqualTo(null);
    }
}

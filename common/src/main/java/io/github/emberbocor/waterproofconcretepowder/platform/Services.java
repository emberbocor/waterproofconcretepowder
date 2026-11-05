package io.github.emberbocor.waterproofconcretepowder.platform;

import java.util.ServiceLoader;

public final class Services {
    public static final PlatformHelper PLATFORM = ServiceLoader.load(PlatformHelper.class)
            .findFirst().orElseThrow(() -> new IllegalStateException("Missing platform helper"));

    private Services() {
    }
}

package io.graversen.wire.hcloud;

import io.graversen.wire.util.BaseTarget;
import io.graversen.wire.util.SetApplicationJsonInterceptor;
import io.graversen.wire.util.SetBearerTokenInterceptor;

import java.util.List;

public class HetznerCloudTarget extends BaseTarget<HetznerCloud> {
    private static final Class<HetznerCloud> TARGET_CLASS = HetznerCloud.class;
    private static final String TARGET_URL = "https://api.hetzner.cloud/v1/";

    public HetznerCloudTarget(String authorizationKey) {
        super(
                TARGET_CLASS,
                TARGET_URL,
                List.of(
                        new SetBearerTokenInterceptor(authorizationKey),
                        new SetApplicationJsonInterceptor()
                )
        );
    }
}

plugins {
    base
    alias(libs.plugins.fleet.plugin)
}

version = "0.0.1"

fleetPlugin {
     id = "com.asboy2035.TokyoPurple-Fleet"

     metadata {
         readableName = "Tokyo Purple"
         description = "Tokyo Purple theme for Fleet"
     }

    fleetRuntime {
        version = libs.versions.fleet.runtime
    }
}

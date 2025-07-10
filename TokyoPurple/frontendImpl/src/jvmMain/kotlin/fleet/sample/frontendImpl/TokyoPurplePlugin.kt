package fleet.sample.frontendImpl

import fleet.dock.api.ThemeId
import fleet.frontend.theme.registerTheme
import fleet.kernel.plugins.ContributionScope
import fleet.kernel.plugins.Plugin
import fleet.kernel.plugins.PluginScope

class TokyoPurplePlugin : Plugin<Unit> {
  companion object : Plugin.Key<Unit>

  override val key: Plugin.Key<Unit> = TokyoPurplePlugin

  override fun ContributionScope.load(pluginScope: PluginScope) {
    registerTheme(ThemeId(id = "com.asboy2035.TokyoPurple-Dark"))
    registerTheme(ThemeId(id = "com.asboy2035.TokyoPurple-Light"))
  }
}
